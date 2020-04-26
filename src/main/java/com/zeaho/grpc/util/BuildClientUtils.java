package com.zeaho.grpc.util;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class BuildClientUtils {
    private String[] args;
    private float price;
    private ManagedChannel channel;

    public BuildClientUtils(float price, String... args) {
        this.price = price;
        this.args = args;
    }


    public float getPrice() {
        return price;
    }

    public ManagedChannel getChannel() {
        return channel;
    }

    public BuildClientUtils invoke() {
        // Access a service running on the local machine on port 50051
        String target = "localhost:50051";
        // Allow passing in the price and target strings as command line arguments
        if (args.length > 0) {
            if ("--help".equals(args[0])) {
                System.err.println("Usage: [name [target]]");
                System.err.println();
                System.err.println("price The price you wish to be buy. Defaults to " + price);
                System.err.println("target  The server to connect to. Defaults to " + target);
                System.exit(1);
            }
            price = Float.parseFloat(args[0]);
        }
        if (args.length > 1) {
            target = args[1];
        }

        // Create a communication channel to the server, known as a Channel. Channels are thread-safe
        // and reusable. It is common to create channels at the beginning of your application and reuse
        // them until the application shuts down.
        channel = ManagedChannelBuilder.forTarget(target)
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                // needing certificates.
                .usePlaintext()
                .build();
        return this;
    }
}