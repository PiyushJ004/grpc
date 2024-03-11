package com.example.grpc.test;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: grpc.proto")
public final class GrpcServicePjGrpc {

  private GrpcServicePjGrpc() {}

  public static final String SERVICE_NAME = "grpcTest.GrpcServicePj";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.test.GrpcRequest,
      com.example.grpc.test.GrpcResponse> getGrpcTestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcTest",
      requestType = com.example.grpc.test.GrpcRequest.class,
      responseType = com.example.grpc.test.GrpcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.test.GrpcRequest,
      com.example.grpc.test.GrpcResponse> getGrpcTestMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.test.GrpcRequest, com.example.grpc.test.GrpcResponse> getGrpcTestMethod;
    if ((getGrpcTestMethod = GrpcServicePjGrpc.getGrpcTestMethod) == null) {
      synchronized (GrpcServicePjGrpc.class) {
        if ((getGrpcTestMethod = GrpcServicePjGrpc.getGrpcTestMethod) == null) {
          GrpcServicePjGrpc.getGrpcTestMethod = getGrpcTestMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.test.GrpcRequest, com.example.grpc.test.GrpcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GrpcTest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.test.GrpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.test.GrpcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicePjMethodDescriptorSupplier("GrpcTest"))
              .build();
        }
      }
    }
    return getGrpcTestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GrpcServicePjStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcServicePjStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcServicePjStub>() {
        @java.lang.Override
        public GrpcServicePjStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcServicePjStub(channel, callOptions);
        }
      };
    return GrpcServicePjStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GrpcServicePjBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcServicePjBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcServicePjBlockingStub>() {
        @java.lang.Override
        public GrpcServicePjBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcServicePjBlockingStub(channel, callOptions);
        }
      };
    return GrpcServicePjBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GrpcServicePjFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcServicePjFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcServicePjFutureStub>() {
        @java.lang.Override
        public GrpcServicePjFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcServicePjFutureStub(channel, callOptions);
        }
      };
    return GrpcServicePjFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GrpcServicePjImplBase implements io.grpc.BindableService {

    /**
     */
    public void grpcTest(com.example.grpc.test.GrpcRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.test.GrpcResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGrpcTestMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGrpcTestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.test.GrpcRequest,
                com.example.grpc.test.GrpcResponse>(
                  this, METHODID_GRPC_TEST)))
          .build();
    }
  }

  /**
   */
  public static final class GrpcServicePjStub extends io.grpc.stub.AbstractAsyncStub<GrpcServicePjStub> {
    private GrpcServicePjStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServicePjStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcServicePjStub(channel, callOptions);
    }

    /**
     */
    public void grpcTest(com.example.grpc.test.GrpcRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.test.GrpcResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGrpcTestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GrpcServicePjBlockingStub extends io.grpc.stub.AbstractBlockingStub<GrpcServicePjBlockingStub> {
    private GrpcServicePjBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServicePjBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcServicePjBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.test.GrpcResponse grpcTest(com.example.grpc.test.GrpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGrpcTestMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GrpcServicePjFutureStub extends io.grpc.stub.AbstractFutureStub<GrpcServicePjFutureStub> {
    private GrpcServicePjFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServicePjFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcServicePjFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.test.GrpcResponse> grpcTest(
        com.example.grpc.test.GrpcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGrpcTestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GRPC_TEST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GrpcServicePjImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GrpcServicePjImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GRPC_TEST:
          serviceImpl.grpcTest((com.example.grpc.test.GrpcRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.test.GrpcResponse>) responseObserver);
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

  private static abstract class GrpcServicePjBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GrpcServicePjBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.test.GrpcProtoTest.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GrpcServicePj");
    }
  }

  private static final class GrpcServicePjFileDescriptorSupplier
      extends GrpcServicePjBaseDescriptorSupplier {
    GrpcServicePjFileDescriptorSupplier() {}
  }

  private static final class GrpcServicePjMethodDescriptorSupplier
      extends GrpcServicePjBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GrpcServicePjMethodDescriptorSupplier(String methodName) {
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
      synchronized (GrpcServicePjGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GrpcServicePjFileDescriptorSupplier())
              .addMethod(getGrpcTestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
