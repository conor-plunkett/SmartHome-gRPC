package ds.service2;

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
    comments = "Source: service2.proto")
public final class Service2Grpc {

  private Service2Grpc() {}

  public static final String SERVICE_NAME = "service2.Service2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.service2.SetTemperatureRequestMessage,
      ds.service2.SetTemperatureResponseMessage> getSetTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setTemperature",
      requestType = ds.service2.SetTemperatureRequestMessage.class,
      responseType = ds.service2.SetTemperatureResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service2.SetTemperatureRequestMessage,
      ds.service2.SetTemperatureResponseMessage> getSetTemperatureMethod() {
    io.grpc.MethodDescriptor<ds.service2.SetTemperatureRequestMessage, ds.service2.SetTemperatureResponseMessage> getSetTemperatureMethod;
    if ((getSetTemperatureMethod = Service2Grpc.getSetTemperatureMethod) == null) {
      synchronized (Service2Grpc.class) {
        if ((getSetTemperatureMethod = Service2Grpc.getSetTemperatureMethod) == null) {
          Service2Grpc.getSetTemperatureMethod = getSetTemperatureMethod = 
              io.grpc.MethodDescriptor.<ds.service2.SetTemperatureRequestMessage, ds.service2.SetTemperatureResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service2.Service2", "setTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.SetTemperatureRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.SetTemperatureResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new Service2MethodDescriptorSupplier("setTemperature"))
                  .build();
          }
        }
     }
     return getSetTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service2.HumidifyRequestMessage,
      ds.service2.HumidifyResponseMessage> getDehumidifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "dehumidify",
      requestType = ds.service2.HumidifyRequestMessage.class,
      responseType = ds.service2.HumidifyResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service2.HumidifyRequestMessage,
      ds.service2.HumidifyResponseMessage> getDehumidifyMethod() {
    io.grpc.MethodDescriptor<ds.service2.HumidifyRequestMessage, ds.service2.HumidifyResponseMessage> getDehumidifyMethod;
    if ((getDehumidifyMethod = Service2Grpc.getDehumidifyMethod) == null) {
      synchronized (Service2Grpc.class) {
        if ((getDehumidifyMethod = Service2Grpc.getDehumidifyMethod) == null) {
          Service2Grpc.getDehumidifyMethod = getDehumidifyMethod = 
              io.grpc.MethodDescriptor.<ds.service2.HumidifyRequestMessage, ds.service2.HumidifyResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service2.Service2", "dehumidify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.HumidifyRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.HumidifyResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new Service2MethodDescriptorSupplier("dehumidify"))
                  .build();
          }
        }
     }
     return getDehumidifyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service2.PresetRequestMessage,
      ds.service2.PresetResponseMessage> getPresetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "preset",
      requestType = ds.service2.PresetRequestMessage.class,
      responseType = ds.service2.PresetResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service2.PresetRequestMessage,
      ds.service2.PresetResponseMessage> getPresetMethod() {
    io.grpc.MethodDescriptor<ds.service2.PresetRequestMessage, ds.service2.PresetResponseMessage> getPresetMethod;
    if ((getPresetMethod = Service2Grpc.getPresetMethod) == null) {
      synchronized (Service2Grpc.class) {
        if ((getPresetMethod = Service2Grpc.getPresetMethod) == null) {
          Service2Grpc.getPresetMethod = getPresetMethod = 
              io.grpc.MethodDescriptor.<ds.service2.PresetRequestMessage, ds.service2.PresetResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service2.Service2", "preset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.PresetRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.PresetResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new Service2MethodDescriptorSupplier("preset"))
                  .build();
          }
        }
     }
     return getPresetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Service2Stub newStub(io.grpc.Channel channel) {
    return new Service2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Service2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Service2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Service2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Service2FutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class Service2ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Set Temperature Method (Server Streaming)
     * </pre>
     */
    public void setTemperature(ds.service2.SetTemperatureRequestMessage request,
        io.grpc.stub.StreamObserver<ds.service2.SetTemperatureResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getSetTemperatureMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.service2.HumidifyRequestMessage> dehumidify(
        io.grpc.stub.StreamObserver<ds.service2.HumidifyResponseMessage> responseObserver) {
      return asyncUnimplementedStreamingCall(getDehumidifyMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.service2.PresetRequestMessage> preset(
        io.grpc.stub.StreamObserver<ds.service2.PresetResponseMessage> responseObserver) {
      return asyncUnimplementedStreamingCall(getPresetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetTemperatureMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.service2.SetTemperatureRequestMessage,
                ds.service2.SetTemperatureResponseMessage>(
                  this, METHODID_SET_TEMPERATURE)))
          .addMethod(
            getDehumidifyMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ds.service2.HumidifyRequestMessage,
                ds.service2.HumidifyResponseMessage>(
                  this, METHODID_DEHUMIDIFY)))
          .addMethod(
            getPresetMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ds.service2.PresetRequestMessage,
                ds.service2.PresetResponseMessage>(
                  this, METHODID_PRESET)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service2Stub extends io.grpc.stub.AbstractStub<Service2Stub> {
    private Service2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Set Temperature Method (Server Streaming)
     * </pre>
     */
    public void setTemperature(ds.service2.SetTemperatureRequestMessage request,
        io.grpc.stub.StreamObserver<ds.service2.SetTemperatureResponseMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSetTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.service2.HumidifyRequestMessage> dehumidify(
        io.grpc.stub.StreamObserver<ds.service2.HumidifyResponseMessage> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getDehumidifyMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.service2.PresetRequestMessage> preset(
        io.grpc.stub.StreamObserver<ds.service2.PresetResponseMessage> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getPresetMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service2BlockingStub extends io.grpc.stub.AbstractStub<Service2BlockingStub> {
    private Service2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service2BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set Temperature Method (Server Streaming)
     * </pre>
     */
    public java.util.Iterator<ds.service2.SetTemperatureResponseMessage> setTemperature(
        ds.service2.SetTemperatureRequestMessage request) {
      return blockingServerStreamingCall(
          getChannel(), getSetTemperatureMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service2FutureStub extends io.grpc.stub.AbstractStub<Service2FutureStub> {
    private Service2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service2FutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SET_TEMPERATURE = 0;
  private static final int METHODID_DEHUMIDIFY = 1;
  private static final int METHODID_PRESET = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Service2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Service2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_TEMPERATURE:
          serviceImpl.setTemperature((ds.service2.SetTemperatureRequestMessage) request,
              (io.grpc.stub.StreamObserver<ds.service2.SetTemperatureResponseMessage>) responseObserver);
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
        case METHODID_DEHUMIDIFY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.dehumidify(
              (io.grpc.stub.StreamObserver<ds.service2.HumidifyResponseMessage>) responseObserver);
        case METHODID_PRESET:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.preset(
              (io.grpc.stub.StreamObserver<ds.service2.PresetResponseMessage>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class Service2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Service2BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.service2.Service2Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service2");
    }
  }

  private static final class Service2FileDescriptorSupplier
      extends Service2BaseDescriptorSupplier {
    Service2FileDescriptorSupplier() {}
  }

  private static final class Service2MethodDescriptorSupplier
      extends Service2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Service2MethodDescriptorSupplier(String methodName) {
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
      synchronized (Service2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Service2FileDescriptorSupplier())
              .addMethod(getSetTemperatureMethod())
              .addMethod(getDehumidifyMethod())
              .addMethod(getPresetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
