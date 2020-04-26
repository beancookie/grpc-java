package com.zeaho.proto.water;

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
    comments = "Source: water.proto")
public final class WaterCompanyGrpc {

  private WaterCompanyGrpc() {}

  public static final String SERVICE_NAME = "water.WaterCompany";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zeaho.proto.water.WaterRequest,
      com.zeaho.proto.water.WaterReply> getBuyStreamWaterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuyStreamWater",
      requestType = com.zeaho.proto.water.WaterRequest.class,
      responseType = com.zeaho.proto.water.WaterReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.zeaho.proto.water.WaterRequest,
      com.zeaho.proto.water.WaterReply> getBuyStreamWaterMethod() {
    io.grpc.MethodDescriptor<com.zeaho.proto.water.WaterRequest, com.zeaho.proto.water.WaterReply> getBuyStreamWaterMethod;
    if ((getBuyStreamWaterMethod = WaterCompanyGrpc.getBuyStreamWaterMethod) == null) {
      synchronized (WaterCompanyGrpc.class) {
        if ((getBuyStreamWaterMethod = WaterCompanyGrpc.getBuyStreamWaterMethod) == null) {
          WaterCompanyGrpc.getBuyStreamWaterMethod = getBuyStreamWaterMethod =
              io.grpc.MethodDescriptor.<com.zeaho.proto.water.WaterRequest, com.zeaho.proto.water.WaterReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuyStreamWater"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zeaho.proto.water.WaterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zeaho.proto.water.WaterReply.getDefaultInstance()))
              .setSchemaDescriptor(new WaterCompanyMethodDescriptorSupplier("BuyStreamWater"))
              .build();
        }
      }
    }
    return getBuyStreamWaterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zeaho.proto.water.WaterRequest,
      com.zeaho.proto.water.WaterReply> getBuyWaterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuyWater",
      requestType = com.zeaho.proto.water.WaterRequest.class,
      responseType = com.zeaho.proto.water.WaterReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zeaho.proto.water.WaterRequest,
      com.zeaho.proto.water.WaterReply> getBuyWaterMethod() {
    io.grpc.MethodDescriptor<com.zeaho.proto.water.WaterRequest, com.zeaho.proto.water.WaterReply> getBuyWaterMethod;
    if ((getBuyWaterMethod = WaterCompanyGrpc.getBuyWaterMethod) == null) {
      synchronized (WaterCompanyGrpc.class) {
        if ((getBuyWaterMethod = WaterCompanyGrpc.getBuyWaterMethod) == null) {
          WaterCompanyGrpc.getBuyWaterMethod = getBuyWaterMethod =
              io.grpc.MethodDescriptor.<com.zeaho.proto.water.WaterRequest, com.zeaho.proto.water.WaterReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuyWater"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zeaho.proto.water.WaterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zeaho.proto.water.WaterReply.getDefaultInstance()))
              .setSchemaDescriptor(new WaterCompanyMethodDescriptorSupplier("BuyWater"))
              .build();
        }
      }
    }
    return getBuyWaterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WaterCompanyStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WaterCompanyStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WaterCompanyStub>() {
        @java.lang.Override
        public WaterCompanyStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WaterCompanyStub(channel, callOptions);
        }
      };
    return WaterCompanyStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WaterCompanyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WaterCompanyBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WaterCompanyBlockingStub>() {
        @java.lang.Override
        public WaterCompanyBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WaterCompanyBlockingStub(channel, callOptions);
        }
      };
    return WaterCompanyBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WaterCompanyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WaterCompanyFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WaterCompanyFutureStub>() {
        @java.lang.Override
        public WaterCompanyFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WaterCompanyFutureStub(channel, callOptions);
        }
      };
    return WaterCompanyFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class WaterCompanyImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void buyStreamWater(com.zeaho.proto.water.WaterRequest request,
        io.grpc.stub.StreamObserver<com.zeaho.proto.water.WaterReply> responseObserver) {
      asyncUnimplementedUnaryCall(getBuyStreamWaterMethod(), responseObserver);
    }

    /**
     */
    public void buyWater(com.zeaho.proto.water.WaterRequest request,
        io.grpc.stub.StreamObserver<com.zeaho.proto.water.WaterReply> responseObserver) {
      asyncUnimplementedUnaryCall(getBuyWaterMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBuyStreamWaterMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.zeaho.proto.water.WaterRequest,
                com.zeaho.proto.water.WaterReply>(
                  this, METHODID_BUY_STREAM_WATER)))
          .addMethod(
            getBuyWaterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.zeaho.proto.water.WaterRequest,
                com.zeaho.proto.water.WaterReply>(
                  this, METHODID_BUY_WATER)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class WaterCompanyStub extends io.grpc.stub.AbstractAsyncStub<WaterCompanyStub> {
    private WaterCompanyStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterCompanyStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WaterCompanyStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void buyStreamWater(com.zeaho.proto.water.WaterRequest request,
        io.grpc.stub.StreamObserver<com.zeaho.proto.water.WaterReply> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getBuyStreamWaterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void buyWater(com.zeaho.proto.water.WaterRequest request,
        io.grpc.stub.StreamObserver<com.zeaho.proto.water.WaterReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBuyWaterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class WaterCompanyBlockingStub extends io.grpc.stub.AbstractBlockingStub<WaterCompanyBlockingStub> {
    private WaterCompanyBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterCompanyBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WaterCompanyBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public java.util.Iterator<com.zeaho.proto.water.WaterReply> buyStreamWater(
        com.zeaho.proto.water.WaterRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getBuyStreamWaterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zeaho.proto.water.WaterReply buyWater(com.zeaho.proto.water.WaterRequest request) {
      return blockingUnaryCall(
          getChannel(), getBuyWaterMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class WaterCompanyFutureStub extends io.grpc.stub.AbstractFutureStub<WaterCompanyFutureStub> {
    private WaterCompanyFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterCompanyFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WaterCompanyFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zeaho.proto.water.WaterReply> buyWater(
        com.zeaho.proto.water.WaterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBuyWaterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BUY_STREAM_WATER = 0;
  private static final int METHODID_BUY_WATER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WaterCompanyImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WaterCompanyImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BUY_STREAM_WATER:
          serviceImpl.buyStreamWater((com.zeaho.proto.water.WaterRequest) request,
              (io.grpc.stub.StreamObserver<com.zeaho.proto.water.WaterReply>) responseObserver);
          break;
        case METHODID_BUY_WATER:
          serviceImpl.buyWater((com.zeaho.proto.water.WaterRequest) request,
              (io.grpc.stub.StreamObserver<com.zeaho.proto.water.WaterReply>) responseObserver);
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

  private static abstract class WaterCompanyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WaterCompanyBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zeaho.proto.water.WaterProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WaterCompany");
    }
  }

  private static final class WaterCompanyFileDescriptorSupplier
      extends WaterCompanyBaseDescriptorSupplier {
    WaterCompanyFileDescriptorSupplier() {}
  }

  private static final class WaterCompanyMethodDescriptorSupplier
      extends WaterCompanyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WaterCompanyMethodDescriptorSupplier(String methodName) {
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
      synchronized (WaterCompanyGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WaterCompanyFileDescriptorSupplier())
              .addMethod(getBuyStreamWaterMethod())
              .addMethod(getBuyWaterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
