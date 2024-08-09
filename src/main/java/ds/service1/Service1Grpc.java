package ds.service1;

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
    comments = "Source: service1.proto")
public final class Service1Grpc {

  private Service1Grpc() {}

  public static final String SERVICE_NAME = "service1.Service1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.service1.InspectRequestMessage,
      ds.service1.InspectResponseMessage> getInspectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "inspect",
      requestType = ds.service1.InspectRequestMessage.class,
      responseType = ds.service1.InspectResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.service1.InspectRequestMessage,
      ds.service1.InspectResponseMessage> getInspectMethod() {
    io.grpc.MethodDescriptor<ds.service1.InspectRequestMessage, ds.service1.InspectResponseMessage> getInspectMethod;
    if ((getInspectMethod = Service1Grpc.getInspectMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getInspectMethod = Service1Grpc.getInspectMethod) == null) {
          Service1Grpc.getInspectMethod = getInspectMethod = 
              io.grpc.MethodDescriptor.<ds.service1.InspectRequestMessage, ds.service1.InspectResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service1.Service1", "inspect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.InspectRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.InspectResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("inspect"))
                  .build();
          }
        }
     }
     return getInspectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service1.DeleteRequestMessage,
      ds.service1.DeleteResponseMessage> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = ds.service1.DeleteRequestMessage.class,
      responseType = ds.service1.DeleteResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service1.DeleteRequestMessage,
      ds.service1.DeleteResponseMessage> getDeleteMethod() {
    io.grpc.MethodDescriptor<ds.service1.DeleteRequestMessage, ds.service1.DeleteResponseMessage> getDeleteMethod;
    if ((getDeleteMethod = Service1Grpc.getDeleteMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getDeleteMethod = Service1Grpc.getDeleteMethod) == null) {
          Service1Grpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<ds.service1.DeleteRequestMessage, ds.service1.DeleteResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service1.Service1", "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.DeleteRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.DeleteResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service1.CreateRequestMessage,
      ds.service1.CreateResponseMessage> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = ds.service1.CreateRequestMessage.class,
      responseType = ds.service1.CreateResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service1.CreateRequestMessage,
      ds.service1.CreateResponseMessage> getCreateMethod() {
    io.grpc.MethodDescriptor<ds.service1.CreateRequestMessage, ds.service1.CreateResponseMessage> getCreateMethod;
    if ((getCreateMethod = Service1Grpc.getCreateMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getCreateMethod = Service1Grpc.getCreateMethod) == null) {
          Service1Grpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<ds.service1.CreateRequestMessage, ds.service1.CreateResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service1.Service1", "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.CreateRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.CreateResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service1.ListRequestMessage,
      ds.service1.ListResponseMessage> getListdevicesconnectedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listdevicesconnected",
      requestType = ds.service1.ListRequestMessage.class,
      responseType = ds.service1.ListResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service1.ListRequestMessage,
      ds.service1.ListResponseMessage> getListdevicesconnectedMethod() {
    io.grpc.MethodDescriptor<ds.service1.ListRequestMessage, ds.service1.ListResponseMessage> getListdevicesconnectedMethod;
    if ((getListdevicesconnectedMethod = Service1Grpc.getListdevicesconnectedMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getListdevicesconnectedMethod = Service1Grpc.getListdevicesconnectedMethod) == null) {
          Service1Grpc.getListdevicesconnectedMethod = getListdevicesconnectedMethod = 
              io.grpc.MethodDescriptor.<ds.service1.ListRequestMessage, ds.service1.ListResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service1.Service1", "listdevicesconnected"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.ListRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.ListResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("listdevicesconnected"))
                  .build();
          }
        }
     }
     return getListdevicesconnectedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service1.PowerRequestMessage,
      ds.service1.PowerResponseMessage> getPowerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "power",
      requestType = ds.service1.PowerRequestMessage.class,
      responseType = ds.service1.PowerResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.service1.PowerRequestMessage,
      ds.service1.PowerResponseMessage> getPowerMethod() {
    io.grpc.MethodDescriptor<ds.service1.PowerRequestMessage, ds.service1.PowerResponseMessage> getPowerMethod;
    if ((getPowerMethod = Service1Grpc.getPowerMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getPowerMethod = Service1Grpc.getPowerMethod) == null) {
          Service1Grpc.getPowerMethod = getPowerMethod = 
              io.grpc.MethodDescriptor.<ds.service1.PowerRequestMessage, ds.service1.PowerResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service1.Service1", "power"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.PowerRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.PowerResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("power"))
                  .build();
          }
        }
     }
     return getPowerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service1.IntensityRequestMessage,
      ds.service1.IntensityResponseMessage> getIntensityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "intensity",
      requestType = ds.service1.IntensityRequestMessage.class,
      responseType = ds.service1.IntensityResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service1.IntensityRequestMessage,
      ds.service1.IntensityResponseMessage> getIntensityMethod() {
    io.grpc.MethodDescriptor<ds.service1.IntensityRequestMessage, ds.service1.IntensityResponseMessage> getIntensityMethod;
    if ((getIntensityMethod = Service1Grpc.getIntensityMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getIntensityMethod = Service1Grpc.getIntensityMethod) == null) {
          Service1Grpc.getIntensityMethod = getIntensityMethod = 
              io.grpc.MethodDescriptor.<ds.service1.IntensityRequestMessage, ds.service1.IntensityResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service1.Service1", "intensity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.IntensityRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.IntensityResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("intensity"))
                  .build();
          }
        }
     }
     return getIntensityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Service1Stub newStub(io.grpc.Channel channel) {
    return new Service1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Service1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Service1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Service1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Service1FutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class Service1ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Inspect Method (Unary)
     * </pre>
     */
    public void inspect(ds.service1.InspectRequestMessage request,
        io.grpc.stub.StreamObserver<ds.service1.InspectResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getInspectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete Method (Server Streaming)
     * </pre>
     */
    public void delete(ds.service1.DeleteRequestMessage request,
        io.grpc.stub.StreamObserver<ds.service1.DeleteResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create Method (Client Streaming)
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.service1.CreateRequestMessage> create(
        io.grpc.stub.StreamObserver<ds.service1.CreateResponseMessage> responseObserver) {
      return asyncUnimplementedStreamingCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * List Method (Server Streaming)
     * </pre>
     */
    public void listdevicesconnected(ds.service1.ListRequestMessage request,
        io.grpc.stub.StreamObserver<ds.service1.ListResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getListdevicesconnectedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Power Method (Unary)
     * </pre>
     */
    public void power(ds.service1.PowerRequestMessage request,
        io.grpc.stub.StreamObserver<ds.service1.PowerResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getPowerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Intensity Method (Client Streaming)
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.service1.IntensityRequestMessage> intensity(
        io.grpc.stub.StreamObserver<ds.service1.IntensityResponseMessage> responseObserver) {
      return asyncUnimplementedStreamingCall(getIntensityMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInspectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.service1.InspectRequestMessage,
                ds.service1.InspectResponseMessage>(
                  this, METHODID_INSPECT)))
          .addMethod(
            getDeleteMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.service1.DeleteRequestMessage,
                ds.service1.DeleteResponseMessage>(
                  this, METHODID_DELETE)))
          .addMethod(
            getCreateMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ds.service1.CreateRequestMessage,
                ds.service1.CreateResponseMessage>(
                  this, METHODID_CREATE)))
          .addMethod(
            getListdevicesconnectedMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.service1.ListRequestMessage,
                ds.service1.ListResponseMessage>(
                  this, METHODID_LISTDEVICESCONNECTED)))
          .addMethod(
            getPowerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.service1.PowerRequestMessage,
                ds.service1.PowerResponseMessage>(
                  this, METHODID_POWER)))
          .addMethod(
            getIntensityMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ds.service1.IntensityRequestMessage,
                ds.service1.IntensityResponseMessage>(
                  this, METHODID_INTENSITY)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service1Stub extends io.grpc.stub.AbstractStub<Service1Stub> {
    private Service1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service1Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Inspect Method (Unary)
     * </pre>
     */
    public void inspect(ds.service1.InspectRequestMessage request,
        io.grpc.stub.StreamObserver<ds.service1.InspectResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInspectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete Method (Server Streaming)
     * </pre>
     */
    public void delete(ds.service1.DeleteRequestMessage request,
        io.grpc.stub.StreamObserver<ds.service1.DeleteResponseMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create Method (Client Streaming)
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.service1.CreateRequestMessage> create(
        io.grpc.stub.StreamObserver<ds.service1.CreateResponseMessage> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * List Method (Server Streaming)
     * </pre>
     */
    public void listdevicesconnected(ds.service1.ListRequestMessage request,
        io.grpc.stub.StreamObserver<ds.service1.ListResponseMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListdevicesconnectedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Power Method (Unary)
     * </pre>
     */
    public void power(ds.service1.PowerRequestMessage request,
        io.grpc.stub.StreamObserver<ds.service1.PowerResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPowerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Intensity Method (Client Streaming)
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.service1.IntensityRequestMessage> intensity(
        io.grpc.stub.StreamObserver<ds.service1.IntensityResponseMessage> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getIntensityMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service1BlockingStub extends io.grpc.stub.AbstractStub<Service1BlockingStub> {
    private Service1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service1BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Inspect Method (Unary)
     * </pre>
     */
    public ds.service1.InspectResponseMessage inspect(ds.service1.InspectRequestMessage request) {
      return blockingUnaryCall(
          getChannel(), getInspectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete Method (Server Streaming)
     * </pre>
     */
    public java.util.Iterator<ds.service1.DeleteResponseMessage> delete(
        ds.service1.DeleteRequestMessage request) {
      return blockingServerStreamingCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Method (Server Streaming)
     * </pre>
     */
    public java.util.Iterator<ds.service1.ListResponseMessage> listdevicesconnected(
        ds.service1.ListRequestMessage request) {
      return blockingServerStreamingCall(
          getChannel(), getListdevicesconnectedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Power Method (Unary)
     * </pre>
     */
    public ds.service1.PowerResponseMessage power(ds.service1.PowerRequestMessage request) {
      return blockingUnaryCall(
          getChannel(), getPowerMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service1FutureStub extends io.grpc.stub.AbstractStub<Service1FutureStub> {
    private Service1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service1FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Inspect Method (Unary)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.service1.InspectResponseMessage> inspect(
        ds.service1.InspectRequestMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getInspectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Power Method (Unary)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.service1.PowerResponseMessage> power(
        ds.service1.PowerRequestMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getPowerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INSPECT = 0;
  private static final int METHODID_DELETE = 1;
  private static final int METHODID_LISTDEVICESCONNECTED = 2;
  private static final int METHODID_POWER = 3;
  private static final int METHODID_CREATE = 4;
  private static final int METHODID_INTENSITY = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Service1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Service1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INSPECT:
          serviceImpl.inspect((ds.service1.InspectRequestMessage) request,
              (io.grpc.stub.StreamObserver<ds.service1.InspectResponseMessage>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((ds.service1.DeleteRequestMessage) request,
              (io.grpc.stub.StreamObserver<ds.service1.DeleteResponseMessage>) responseObserver);
          break;
        case METHODID_LISTDEVICESCONNECTED:
          serviceImpl.listdevicesconnected((ds.service1.ListRequestMessage) request,
              (io.grpc.stub.StreamObserver<ds.service1.ListResponseMessage>) responseObserver);
          break;
        case METHODID_POWER:
          serviceImpl.power((ds.service1.PowerRequestMessage) request,
              (io.grpc.stub.StreamObserver<ds.service1.PowerResponseMessage>) responseObserver);
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
        case METHODID_CREATE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.create(
              (io.grpc.stub.StreamObserver<ds.service1.CreateResponseMessage>) responseObserver);
        case METHODID_INTENSITY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.intensity(
              (io.grpc.stub.StreamObserver<ds.service1.IntensityResponseMessage>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class Service1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Service1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.service1.Service1Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service1");
    }
  }

  private static final class Service1FileDescriptorSupplier
      extends Service1BaseDescriptorSupplier {
    Service1FileDescriptorSupplier() {}
  }

  private static final class Service1MethodDescriptorSupplier
      extends Service1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Service1MethodDescriptorSupplier(String methodName) {
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
      synchronized (Service1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Service1FileDescriptorSupplier())
              .addMethod(getInspectMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getCreateMethod())
              .addMethod(getListdevicesconnectedMethod())
              .addMethod(getPowerMethod())
              .addMethod(getIntensityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
