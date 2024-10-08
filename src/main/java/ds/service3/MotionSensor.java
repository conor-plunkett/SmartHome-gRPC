// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service3.proto

package ds.service3;

/**
 * Protobuf type {@code service3.MotionSensor}
 */
public  final class MotionSensor extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:service3.MotionSensor)
    MotionSensorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MotionSensor.newBuilder() to construct.
  private MotionSensor(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MotionSensor() {
    id_ = 0;
    location_ = "";
    power_ = false;
    activity_ = "";
    activity2_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MotionSensor(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            location_ = s;
            break;
          }
          case 24: {

            power_ = input.readBool();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            activity_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            activity2_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ds.service3.Service3Impl.internal_static_service3_MotionSensor_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.service3.Service3Impl.internal_static_service3_MotionSensor_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.service3.MotionSensor.class, ds.service3.MotionSensor.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int LOCATION_FIELD_NUMBER = 2;
  private volatile java.lang.Object location_;
  /**
   * <code>string location = 2;</code>
   */
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   * <code>string location = 2;</code>
   */
  public com.google.protobuf.ByteString
      getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      location_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POWER_FIELD_NUMBER = 3;
  private boolean power_;
  /**
   * <code>bool power = 3;</code>
   */
  public boolean getPower() {
    return power_;
  }

  public static final int ACTIVITY_FIELD_NUMBER = 4;
  private volatile java.lang.Object activity_;
  /**
   * <code>string activity = 4;</code>
   */
  public java.lang.String getActivity() {
    java.lang.Object ref = activity_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      activity_ = s;
      return s;
    }
  }
  /**
   * <code>string activity = 4;</code>
   */
  public com.google.protobuf.ByteString
      getActivityBytes() {
    java.lang.Object ref = activity_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      activity_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTIVITY2_FIELD_NUMBER = 5;
  private volatile java.lang.Object activity2_;
  /**
   * <code>string activity2 = 5;</code>
   */
  public java.lang.String getActivity2() {
    java.lang.Object ref = activity2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      activity2_ = s;
      return s;
    }
  }
  /**
   * <code>string activity2 = 5;</code>
   */
  public com.google.protobuf.ByteString
      getActivity2Bytes() {
    java.lang.Object ref = activity2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      activity2_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!getLocationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, location_);
    }
    if (power_ != false) {
      output.writeBool(3, power_);
    }
    if (!getActivityBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, activity_);
    }
    if (!getActivity2Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, activity2_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!getLocationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, location_);
    }
    if (power_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, power_);
    }
    if (!getActivityBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, activity_);
    }
    if (!getActivity2Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, activity2_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ds.service3.MotionSensor)) {
      return super.equals(obj);
    }
    ds.service3.MotionSensor other = (ds.service3.MotionSensor) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getLocation()
        .equals(other.getLocation());
    result = result && (getPower()
        == other.getPower());
    result = result && getActivity()
        .equals(other.getActivity());
    result = result && getActivity2()
        .equals(other.getActivity2());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    hash = (37 * hash) + POWER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPower());
    hash = (37 * hash) + ACTIVITY_FIELD_NUMBER;
    hash = (53 * hash) + getActivity().hashCode();
    hash = (37 * hash) + ACTIVITY2_FIELD_NUMBER;
    hash = (53 * hash) + getActivity2().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.service3.MotionSensor parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service3.MotionSensor parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service3.MotionSensor parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service3.MotionSensor parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service3.MotionSensor parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service3.MotionSensor parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service3.MotionSensor parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.service3.MotionSensor parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.service3.MotionSensor parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.service3.MotionSensor parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.service3.MotionSensor parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.service3.MotionSensor parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ds.service3.MotionSensor prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code service3.MotionSensor}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:service3.MotionSensor)
      ds.service3.MotionSensorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.service3.Service3Impl.internal_static_service3_MotionSensor_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.service3.Service3Impl.internal_static_service3_MotionSensor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.service3.MotionSensor.class, ds.service3.MotionSensor.Builder.class);
    }

    // Construct using ds.service3.MotionSensor.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      location_ = "";

      power_ = false;

      activity_ = "";

      activity2_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.service3.Service3Impl.internal_static_service3_MotionSensor_descriptor;
    }

    @java.lang.Override
    public ds.service3.MotionSensor getDefaultInstanceForType() {
      return ds.service3.MotionSensor.getDefaultInstance();
    }

    @java.lang.Override
    public ds.service3.MotionSensor build() {
      ds.service3.MotionSensor result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.service3.MotionSensor buildPartial() {
      ds.service3.MotionSensor result = new ds.service3.MotionSensor(this);
      result.id_ = id_;
      result.location_ = location_;
      result.power_ = power_;
      result.activity_ = activity_;
      result.activity2_ = activity2_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ds.service3.MotionSensor) {
        return mergeFrom((ds.service3.MotionSensor)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.service3.MotionSensor other) {
      if (other == ds.service3.MotionSensor.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
        onChanged();
      }
      if (other.getPower() != false) {
        setPower(other.getPower());
      }
      if (!other.getActivity().isEmpty()) {
        activity_ = other.activity_;
        onChanged();
      }
      if (!other.getActivity2().isEmpty()) {
        activity2_ = other.activity2_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ds.service3.MotionSensor parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.service3.MotionSensor) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object location_ = "";
    /**
     * <code>string location = 2;</code>
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string location = 2;</code>
     */
    public com.google.protobuf.ByteString
        getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string location = 2;</code>
     */
    public Builder setLocation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      location_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string location = 2;</code>
     */
    public Builder clearLocation() {
      
      location_ = getDefaultInstance().getLocation();
      onChanged();
      return this;
    }
    /**
     * <code>string location = 2;</code>
     */
    public Builder setLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      location_ = value;
      onChanged();
      return this;
    }

    private boolean power_ ;
    /**
     * <code>bool power = 3;</code>
     */
    public boolean getPower() {
      return power_;
    }
    /**
     * <code>bool power = 3;</code>
     */
    public Builder setPower(boolean value) {
      
      power_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool power = 3;</code>
     */
    public Builder clearPower() {
      
      power_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object activity_ = "";
    /**
     * <code>string activity = 4;</code>
     */
    public java.lang.String getActivity() {
      java.lang.Object ref = activity_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        activity_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string activity = 4;</code>
     */
    public com.google.protobuf.ByteString
        getActivityBytes() {
      java.lang.Object ref = activity_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        activity_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string activity = 4;</code>
     */
    public Builder setActivity(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      activity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string activity = 4;</code>
     */
    public Builder clearActivity() {
      
      activity_ = getDefaultInstance().getActivity();
      onChanged();
      return this;
    }
    /**
     * <code>string activity = 4;</code>
     */
    public Builder setActivityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      activity_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object activity2_ = "";
    /**
     * <code>string activity2 = 5;</code>
     */
    public java.lang.String getActivity2() {
      java.lang.Object ref = activity2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        activity2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string activity2 = 5;</code>
     */
    public com.google.protobuf.ByteString
        getActivity2Bytes() {
      java.lang.Object ref = activity2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        activity2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string activity2 = 5;</code>
     */
    public Builder setActivity2(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      activity2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string activity2 = 5;</code>
     */
    public Builder clearActivity2() {
      
      activity2_ = getDefaultInstance().getActivity2();
      onChanged();
      return this;
    }
    /**
     * <code>string activity2 = 5;</code>
     */
    public Builder setActivity2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      activity2_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:service3.MotionSensor)
  }

  // @@protoc_insertion_point(class_scope:service3.MotionSensor)
  private static final ds.service3.MotionSensor DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.service3.MotionSensor();
  }

  public static ds.service3.MotionSensor getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MotionSensor>
      PARSER = new com.google.protobuf.AbstractParser<MotionSensor>() {
    @java.lang.Override
    public MotionSensor parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MotionSensor(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MotionSensor> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MotionSensor> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.service3.MotionSensor getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

