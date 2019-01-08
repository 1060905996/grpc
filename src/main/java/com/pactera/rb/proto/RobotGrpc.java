package com.pactera.rb.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: grpc_message.proto")
public final class RobotGrpc {

  private RobotGrpc() {}

  public static final String SERVICE_NAME = "Robot.Robot";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.pactera.rb.proto.RbRequest,
      com.pactera.rb.proto.RbResponse> getGetResponseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getResponse",
      requestType = com.pactera.rb.proto.RbRequest.class,
      responseType = com.pactera.rb.proto.RbResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pactera.rb.proto.RbRequest,
      com.pactera.rb.proto.RbResponse> getGetResponseMethod() {
    io.grpc.MethodDescriptor<com.pactera.rb.proto.RbRequest, com.pactera.rb.proto.RbResponse> getGetResponseMethod;
    if ((getGetResponseMethod = RobotGrpc.getGetResponseMethod) == null) {
      synchronized (RobotGrpc.class) {
        if ((getGetResponseMethod = RobotGrpc.getGetResponseMethod) == null) {
          RobotGrpc.getGetResponseMethod = getGetResponseMethod = 
              io.grpc.MethodDescriptor.<com.pactera.rb.proto.RbRequest, com.pactera.rb.proto.RbResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Robot.Robot", "getResponse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pactera.rb.proto.RbRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pactera.rb.proto.RbResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RobotMethodDescriptorSupplier("getResponse"))
                  .build();
          }
        }
     }
     return getGetResponseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RobotStub newStub(io.grpc.Channel channel) {
    return new RobotStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RobotBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RobotBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RobotFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RobotFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class RobotImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a question
     * </pre>
     */
    public void getResponse(com.pactera.rb.proto.RbRequest request,
        io.grpc.stub.StreamObserver<com.pactera.rb.proto.RbResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetResponseMethod(), responseObserver);
    }

    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetResponseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.pactera.rb.proto.RbRequest,
                com.pactera.rb.proto.RbResponse>(
                  this, METHODID_GET_RESPONSE)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class RobotStub extends io.grpc.stub.AbstractStub<RobotStub> {
    private RobotStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RobotStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RobotStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RobotStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a question
     * </pre>
     */
    public void getResponse(com.pactera.rb.proto.RbRequest request,
        io.grpc.stub.StreamObserver<com.pactera.rb.proto.RbResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetResponseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class RobotBlockingStub extends io.grpc.stub.AbstractStub<RobotBlockingStub> {
    private RobotBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RobotBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RobotBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RobotBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a question
     * </pre>
     */
    public com.pactera.rb.proto.RbResponse getResponse(com.pactera.rb.proto.RbRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetResponseMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class RobotFutureStub extends io.grpc.stub.AbstractStub<RobotFutureStub> {
    private RobotFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RobotFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RobotFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RobotFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a question
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pactera.rb.proto.RbResponse> getResponse(
        com.pactera.rb.proto.RbRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetResponseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_RESPONSE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RobotImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RobotImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RESPONSE:
          serviceImpl.getResponse((com.pactera.rb.proto.RbRequest) request,
              (io.grpc.stub.StreamObserver<com.pactera.rb.proto.RbResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RobotBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RobotBaseDescriptorSupplier() {}

    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.pactera.rb.proto.RobotProto.getDescriptor();
    }

    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Robot");
    }
  }

  private static final class RobotFileDescriptorSupplier
      extends RobotBaseDescriptorSupplier {
    RobotFileDescriptorSupplier() {}
  }

  private static final class RobotMethodDescriptorSupplier
      extends RobotBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RobotMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RobotGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RobotFileDescriptorSupplier())
              .addMethod(getGetResponseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
