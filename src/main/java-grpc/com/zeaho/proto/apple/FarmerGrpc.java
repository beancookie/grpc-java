package com.zeaho.proto.apple;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.0)",
    comments = "Source: apple.proto")
public final class FarmerGrpc {

  private FarmerGrpc() {}

  public static final String SERVICE_NAME = "apple.Farmer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zeaho.proto.apple.AppleRequest,
      com.zeaho.proto.apple.AppleReply> getGetAppleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetApple",
      requestType = com.zeaho.proto.apple.AppleRequest.class,
      responseType = com.zeaho.proto.apple.AppleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zeaho.proto.apple.AppleRequest,
      com.zeaho.proto.apple.AppleReply> getGetAppleMethod() {
    io.grpc.MethodDescriptor<com.zeaho.proto.apple.AppleRequest, com.zeaho.proto.apple.AppleReply> getGetAppleMethod;
    if ((getGetAppleMethod = FarmerGrpc.getGetAppleMethod) == null) {
      synchronized (FarmerGrpc.class) {
        if ((getGetAppleMethod = FarmerGrpc.getGetAppleMethod) == null) {
          FarmerGrpc.getGetAppleMethod = getGetAppleMethod =
              io.grpc.MethodDescriptor.<com.zeaho.proto.apple.AppleRequest, com.zeaho.proto.apple.AppleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetApple"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zeaho.proto.apple.AppleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zeaho.proto.apple.AppleReply.getDefaultInstance()))
              .setSchemaDescriptor(new FarmerMethodDescriptorSupplier("GetApple"))
              .build();
        }
      }
    }
    return getGetAppleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FarmerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FarmerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FarmerStub>() {
        @java.lang.Override
        public FarmerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FarmerStub(channel, callOptions);
        }
      };
    return FarmerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FarmerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FarmerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FarmerBlockingStub>() {
        @java.lang.Override
        public FarmerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FarmerBlockingStub(channel, callOptions);
        }
      };
    return FarmerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FarmerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FarmerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FarmerFutureStub>() {
        @java.lang.Override
        public FarmerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FarmerFutureStub(channel, callOptions);
        }
      };
    return FarmerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class FarmerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void getApple(com.zeaho.proto.apple.AppleRequest request,
        io.grpc.stub.StreamObserver<com.zeaho.proto.apple.AppleReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAppleMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAppleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.zeaho.proto.apple.AppleRequest,
                com.zeaho.proto.apple.AppleReply>(
                  this, METHODID_GET_APPLE)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class FarmerStub extends io.grpc.stub.AbstractAsyncStub<FarmerStub> {
    private FarmerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FarmerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FarmerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void getApple(com.zeaho.proto.apple.AppleRequest request,
        io.grpc.stub.StreamObserver<com.zeaho.proto.apple.AppleReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAppleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class FarmerBlockingStub extends io.grpc.stub.AbstractBlockingStub<FarmerBlockingStub> {
    private FarmerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FarmerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FarmerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.zeaho.proto.apple.AppleReply getApple(com.zeaho.proto.apple.AppleRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAppleMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class FarmerFutureStub extends io.grpc.stub.AbstractFutureStub<FarmerFutureStub> {
    private FarmerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FarmerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FarmerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zeaho.proto.apple.AppleReply> getApple(
        com.zeaho.proto.apple.AppleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAppleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_APPLE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FarmerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FarmerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_APPLE:
          serviceImpl.getApple((com.zeaho.proto.apple.AppleRequest) request,
              (io.grpc.stub.StreamObserver<com.zeaho.proto.apple.AppleReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FarmerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FarmerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zeaho.proto.apple.AppleProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Farmer");
    }
  }

  private static final class FarmerFileDescriptorSupplier
      extends FarmerBaseDescriptorSupplier {
    FarmerFileDescriptorSupplier() {}
  }

  private static final class FarmerMethodDescriptorSupplier
      extends FarmerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FarmerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FarmerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FarmerFileDescriptorSupplier())
              .addMethod(getGetAppleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
