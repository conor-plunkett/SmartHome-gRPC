// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service1.proto

package ds.service1;

public final class Service1Impl {
  private Service1Impl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service1_InspectRequestMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service1_InspectRequestMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service1_InspectResponseMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service1_InspectResponseMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service1_DeleteRequestMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service1_DeleteRequestMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service1_DeleteResponseMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service1_DeleteResponseMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service1_ListRequestMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service1_ListRequestMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service1_ListResponseMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service1_ListResponseMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service1_CreateRequestMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service1_CreateRequestMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service1_CreateResponseMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service1_CreateResponseMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service1_PowerRequestMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service1_PowerRequestMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service1_PowerResponseMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service1_PowerResponseMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service1_IntensityRequestMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service1_IntensityRequestMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service1_IntensityResponseMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service1_IntensityResponseMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service1_Device_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service1_Device_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016service1.proto\022\010service1\"#\n\025InspectReq" +
      "uestMessage\022\n\n\002id\030\001 \001(\005\"&\n\026InspectRespon" +
      "seMessage\022\014\n\004item\030\001 \001(\t\"\"\n\024DeleteRequest" +
      "Message\022\n\n\002id\030\001 \001(\005\"%\n\025DeleteResponseMes" +
      "sage\022\014\n\004item\030\001 \001(\t\"#\n\022ListRequestMessage" +
      "\022\r\n\005input\030\001 \001(\t\"#\n\023ListResponseMessage\022\014" +
      "\n\004item\030\001 \001(\t\"$\n\024CreateRequestMessage\022\014\n\004" +
      "item\030\001 \001(\t\"%\n\025CreateResponseMessage\022\014\n\004i" +
      "tem\030\001 \001(\t\"!\n\023PowerRequestMessage\022\n\n\002id\030\001" +
      " \001(\005\"$\n\024PowerResponseMessage\022\014\n\004item\030\001 \001" +
      "(\t\"\'\n\027IntensityRequestMessage\022\014\n\004item\030\001 " +
      "\001(\t\"(\n\030IntensityResponseMessage\022\014\n\004item\030" +
      "\001 \001(\t\"D\n\006Device\022\n\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(" +
      "\t\022\r\n\005power\030\003 \001(\010\022\021\n\tintensity\030\004 \001(\0022\363\003\n\010" +
      "Service1\022N\n\007inspect\022\037.service1.InspectRe" +
      "questMessage\032 .service1.InspectResponseM" +
      "essage\"\000\022M\n\006delete\022\036.service1.DeleteRequ" +
      "estMessage\032\037.service1.DeleteResponseMess" +
      "age\"\0000\001\022M\n\006create\022\036.service1.CreateReque" +
      "stMessage\032\037.service1.CreateResponseMessa" +
      "ge\"\000(\001\022W\n\024listdevicesconnected\022\034.service" +
      "1.ListRequestMessage\032\035.service1.ListResp" +
      "onseMessage\"\0000\001\022H\n\005power\022\035.service1.Powe" +
      "rRequestMessage\032\036.service1.PowerResponse" +
      "Message\"\000\022V\n\tintensity\022!.service1.Intens" +
      "ityRequestMessage\032\".service1.IntensityRe" +
      "sponseMessage\"\000(\001B\035\n\013ds.service1B\014Servic" +
      "e1ImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_service1_InspectRequestMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_service1_InspectRequestMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service1_InspectRequestMessage_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_service1_InspectResponseMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_service1_InspectResponseMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service1_InspectResponseMessage_descriptor,
        new java.lang.String[] { "Item", });
    internal_static_service1_DeleteRequestMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_service1_DeleteRequestMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service1_DeleteRequestMessage_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_service1_DeleteResponseMessage_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_service1_DeleteResponseMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service1_DeleteResponseMessage_descriptor,
        new java.lang.String[] { "Item", });
    internal_static_service1_ListRequestMessage_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_service1_ListRequestMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service1_ListRequestMessage_descriptor,
        new java.lang.String[] { "Input", });
    internal_static_service1_ListResponseMessage_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_service1_ListResponseMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service1_ListResponseMessage_descriptor,
        new java.lang.String[] { "Item", });
    internal_static_service1_CreateRequestMessage_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_service1_CreateRequestMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service1_CreateRequestMessage_descriptor,
        new java.lang.String[] { "Item", });
    internal_static_service1_CreateResponseMessage_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_service1_CreateResponseMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service1_CreateResponseMessage_descriptor,
        new java.lang.String[] { "Item", });
    internal_static_service1_PowerRequestMessage_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_service1_PowerRequestMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service1_PowerRequestMessage_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_service1_PowerResponseMessage_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_service1_PowerResponseMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service1_PowerResponseMessage_descriptor,
        new java.lang.String[] { "Item", });
    internal_static_service1_IntensityRequestMessage_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_service1_IntensityRequestMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service1_IntensityRequestMessage_descriptor,
        new java.lang.String[] { "Item", });
    internal_static_service1_IntensityResponseMessage_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_service1_IntensityResponseMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service1_IntensityResponseMessage_descriptor,
        new java.lang.String[] { "Item", });
    internal_static_service1_Device_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_service1_Device_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service1_Device_descriptor,
        new java.lang.String[] { "Id", "Name", "Power", "Intensity", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
