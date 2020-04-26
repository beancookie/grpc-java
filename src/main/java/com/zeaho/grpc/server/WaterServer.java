package com.zeaho.grpc.server;

import com.zeaho.proto.water.WaterCompanyGrpc;
import com.zeaho.proto.water.WaterReply;
import com.zeaho.proto.water.WaterRequest;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * @author lzzz
 * @since 2020-04-25 17:17
 */
public class WaterServer {
    private static final Logger logger = Logger.getLogger(WaterServer.class.getName());

    private Server server;

    private void start() throws IOException {
        /* The port on which the server should run */
        int port = 50051;
        server = ServerBuilder.forPort(port)
                .addService(new WaterServer.WaterCompanyImpl())
                .build()
                .start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                try {
                    WaterServer.this.stop();
                } catch (InterruptedException e) {
                    e.printStackTrace(System.err);
                }
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    /**
     * Main launches the server from the command line.
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        final WaterServer server = new WaterServer();
        server.start();
        server.blockUntilShutdown();
    }

    static class WaterCompanyImpl extends WaterCompanyGrpc.WaterCompanyImplBase {

        @Override
        public void buyWater(WaterRequest req, StreamObserver<WaterReply> responseObserver) {
            WaterReply reply = WaterReply.newBuilder().setMessage("Gave your water " + req.getPrice()).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }

        @Override
        public void buyStreamWater(WaterRequest request, StreamObserver<WaterReply> responseObserver) {
            for (int i = 0; i < 100; i++) {
                WaterReply reply = WaterReply.newBuilder().setMessage("Gave your water " + i).build();
                responseObserver.onNext(reply);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            responseObserver.onCompleted();
        }
    }
}