package grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: Check.proto")
public final class HealthCheckServiceGrpc {

  private HealthCheckServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.HealthCheckService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.Check.Request,
      grpc.Check.Response> getGetStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStatus",
      requestType = grpc.Check.Request.class,
      responseType = grpc.Check.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Check.Request,
      grpc.Check.Response> getGetStatusMethod() {
    io.grpc.MethodDescriptor<grpc.Check.Request, grpc.Check.Response> getGetStatusMethod;
    if ((getGetStatusMethod = HealthCheckServiceGrpc.getGetStatusMethod) == null) {
      synchronized (HealthCheckServiceGrpc.class) {
        if ((getGetStatusMethod = HealthCheckServiceGrpc.getGetStatusMethod) == null) {
          HealthCheckServiceGrpc.getGetStatusMethod = getGetStatusMethod =
              io.grpc.MethodDescriptor.<grpc.Check.Request, grpc.Check.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Check.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Check.Response.getDefaultInstance()))
              .setSchemaDescriptor(new HealthCheckServiceMethodDescriptorSupplier("getStatus"))
              .build();
        }
      }
    }
    return getGetStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HealthCheckServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HealthCheckServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HealthCheckServiceStub>() {
        @java.lang.Override
        public HealthCheckServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HealthCheckServiceStub(channel, callOptions);
        }
      };
    return HealthCheckServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HealthCheckServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HealthCheckServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HealthCheckServiceBlockingStub>() {
        @java.lang.Override
        public HealthCheckServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HealthCheckServiceBlockingStub(channel, callOptions);
        }
      };
    return HealthCheckServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HealthCheckServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HealthCheckServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HealthCheckServiceFutureStub>() {
        @java.lang.Override
        public HealthCheckServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HealthCheckServiceFutureStub(channel, callOptions);
        }
      };
    return HealthCheckServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HealthCheckServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getStatus(grpc.Check.Request request,
        io.grpc.stub.StreamObserver<grpc.Check.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.Check.Request,
                grpc.Check.Response>(
                  this, METHODID_GET_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class HealthCheckServiceStub extends io.grpc.stub.AbstractAsyncStub<HealthCheckServiceStub> {
    private HealthCheckServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthCheckServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HealthCheckServiceStub(channel, callOptions);
    }

    /**
     */
    public void getStatus(grpc.Check.Request request,
        io.grpc.stub.StreamObserver<grpc.Check.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HealthCheckServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HealthCheckServiceBlockingStub> {
    private HealthCheckServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthCheckServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HealthCheckServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.Check.Response getStatus(grpc.Check.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HealthCheckServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HealthCheckServiceFutureStub> {
    private HealthCheckServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthCheckServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HealthCheckServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Check.Response> getStatus(
        grpc.Check.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STATUS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HealthCheckServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HealthCheckServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((grpc.Check.Request) request,
              (io.grpc.stub.StreamObserver<grpc.Check.Response>) responseObserver);
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

  private static abstract class HealthCheckServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HealthCheckServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.Check.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HealthCheckService");
    }
  }

  private static final class HealthCheckServiceFileDescriptorSupplier
      extends HealthCheckServiceBaseDescriptorSupplier {
    HealthCheckServiceFileDescriptorSupplier() {}
  }

  private static final class HealthCheckServiceMethodDescriptorSupplier
      extends HealthCheckServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HealthCheckServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HealthCheckServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HealthCheckServiceFileDescriptorSupplier())
              .addMethod(getGetStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
