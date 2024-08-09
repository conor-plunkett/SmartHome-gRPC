package ds.service3;

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
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: service3.proto")
public final class Service3Grpc {

  private Service3Grpc() {}

  public static final String SERVICE_NAME = "service3.Service3";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.service3.MotionRequestMessage,
      ds.service3.MotionResponseMessage> getMotionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "motion",
      requestType = ds.service3.MotionRequestMessage.class,
      responseType = ds.service3.MotionResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service3.MotionRequestMessage,
      ds.service3.MotionResponseMessage> getMotionMethod() {
    io.grpc.MethodDescriptor<ds.service3.MotionRequestMessage, ds.service3.MotionResponseMessage> getMotionMethod;
    if ((getMotionMethod = Service3Grpc.getMotionMethod) == null) {
      synchronized (Service3Grpc.class) {
        if ((getMotionMethod = Service3Grpc.getMotionMethod) == null) {
          Service3Grpc.getMotionMethod = getMotionMethod = 
              io.grpc.MethodDescriptor.<ds.service3.MotionRequestMessage, ds.service3.MotionResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service3.Service3", "motion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.MotionRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.MotionResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new Service3MethodDescriptorSupplier("motion"))
                  .build();
          }
        }
     }
     return getMotionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service3.CameraRequestMessage,
      ds.service3.CameraResponseMessage> getCameraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "camera",
      requestType = ds.service3.CameraRequestMessage.class,
      responseType = ds.service3.CameraResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.service3.CameraRequestMessage,
      ds.service3.CameraResponseMessage> getCameraMethod() {
    io.grpc.MethodDescriptor<ds.service3.CameraRequestMessage, ds.service3.CameraResponseMessage> getCameraMethod;
    if ((getCameraMethod = Service3Grpc.getCameraMethod) == null) {
      synchronized (Service3Grpc.class) {
        if ((getCameraMethod = Service3Grpc.getCameraMethod) == null) {
          Service3Grpc.getCameraMethod = getCameraMethod = 
              io.grpc.MethodDescriptor.<ds.service3.CameraRequestMessage, ds.service3.CameraResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service3.Service3", "camera"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.CameraRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.CameraResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new Service3MethodDescriptorSupplier("camera"))
                  .build();
          }
        }
     }
     return getCameraMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service3.DimRequestMessage,
      ds.service3.DimResponseMessage> getDimMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "dim",
      requestType = ds.service3.DimRequestMessage.class,
      responseType = ds.service3.DimResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service3.DimRequestMessage,
      ds.service3.DimResponseMessage> getDimMethod() {
    io.grpc.MethodDescriptor<ds.service3.DimRequestMessage, ds.service3.DimResponseMessage> getDimMethod;
    if ((getDimMethod = Service3Grpc.getDimMethod) == null) {
      synchronized (Service3Grpc.class) {
        if ((getDimMethod = Service3Grpc.getDimMethod) == null) {
          Service3Grpc.getDimMethod = getDimMethod = 
              io.grpc.MethodDescriptor.<ds.service3.DimRequestMessage, ds.service3.DimResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service3.Service3", "dim"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.DimRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.DimResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new Service3MethodDescriptorSupplier("dim"))
                  .build();
          }
        }
     }
     return getDimMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Service3Stub newStub(io.grpc.Channel channel) {
    return new Service3Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Service3BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Service3BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Service3FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Service3FutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class Service3ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Motion Sensor Actvity Method (Server Streaming)
     * </pre>
     */
    public void motion(ds.service3.MotionRequestMessage request,
        io.grpc.stub.StreamObserver<ds.service3.MotionResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getMotionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Camera Access Method (Unary)
     * </pre>
     */
    public void camera(ds.service3.CameraRequestMessage request,
        io.grpc.stub.StreamObserver<ds.service3.CameraResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getCameraMethod(), responseObserver);
    }

    /**
     * <pre>
     * Dim Window Method (Server Streaminig)
     * </pre>
     */
    public void dim(ds.service3.DimRequestMessage request,
        io.grpc.stub.StreamObserver<ds.service3.DimResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getDimMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMotionMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.service3.MotionRequestMessage,
                ds.service3.MotionResponseMessage>(
                  this, METHODID_MOTION)))
          .addMethod(
            getCameraMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.service3.CameraRequestMessage,
                ds.service3.CameraResponseMessage>(
                  this, METHODID_CAMERA)))
          .addMethod(
            getDimMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.service3.DimRequestMessage,
                ds.service3.DimResponseMessage>(
                  this, METHODID_DIM)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service3Stub extends io.grpc.stub.AbstractStub<Service3Stub> {
    private Service3Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service3Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service3Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service3Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Motion Sensor Actvity Method (Server Streaming)
     * </pre>
     */
    public void motion(ds.service3.MotionRequestMessage request,
        io.grpc.stub.StreamObserver<ds.service3.MotionResponseMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getMotionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Camera Access Method (Unary)
     * </pre>
     */
    public void camera(ds.service3.CameraRequestMessage request,
        io.grpc.stub.StreamObserver<ds.service3.CameraResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCameraMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Dim Window Method (Server Streaminig)
     * </pre>
     */
    public void dim(ds.service3.DimRequestMessage request,
        io.grpc.stub.StreamObserver<ds.service3.DimResponseMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getDimMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service3BlockingStub extends io.grpc.stub.AbstractStub<Service3BlockingStub> {
    private Service3BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service3BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service3BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service3BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Motion Sensor Actvity Method (Server Streaming)
     * </pre>
     */
    public java.util.Iterator<ds.service3.MotionResponseMessage> motion(
        ds.service3.MotionRequestMessage request) {
      return blockingServerStreamingCall(
          getChannel(), getMotionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Camera Access Method (Unary)
     * </pre>
     */
    public ds.service3.CameraResponseMessage camera(ds.service3.CameraRequestMessage request) {
      return blockingUnaryCall(
          getChannel(), getCameraMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Dim Window Method (Server Streaminig)
     * </pre>
     */
    public java.util.Iterator<ds.service3.DimResponseMessage> dim(
        ds.service3.DimRequestMessage request) {
      return blockingServerStreamingCall(
          getChannel(), getDimMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service3FutureStub extends io.grpc.stub.AbstractStub<Service3FutureStub> {
    private Service3FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service3FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service3FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service3FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Camera Access Method (Unary)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.service3.CameraResponseMessage> camera(
        ds.service3.CameraRequestMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getCameraMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MOTION = 0;
  private static final int METHODID_CAMERA = 1;
  private static final int METHODID_DIM = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Service3ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Service3ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MOTION:
          serviceImpl.motion((ds.service3.MotionRequestMessage) request,
              (io.grpc.stub.StreamObserver<ds.service3.MotionResponseMessage>) responseObserver);
          break;
        case METHODID_CAMERA:
          serviceImpl.camera((ds.service3.CameraRequestMessage) request,
              (io.grpc.stub.StreamObserver<ds.service3.CameraResponseMessage>) responseObserver);
          break;
        case METHODID_DIM:
          serviceImpl.dim((ds.service3.DimRequestMessage) request,
              (io.grpc.stub.StreamObserver<ds.service3.DimResponseMessage>) responseObserver);
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

  private static abstract class Service3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Service3BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.service3.Service3Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service3");
    }
  }

  private static final class Service3FileDescriptorSupplier
      extends Service3BaseDescriptorSupplier {
    Service3FileDescriptorSupplier() {}
  }

  private static final class Service3MethodDescriptorSupplier
      extends Service3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Service3MethodDescriptorSupplier(String methodName) {
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
      synchronized (Service3Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Service3FileDescriptorSupplier())
              .addMethod(getMotionMethod())
              .addMethod(getCameraMethod())
              .addMethod(getDimMethod())
              .build();
        }
      }
    }
    return result;
  }
}
