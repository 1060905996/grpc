// source: grpc_message.proto

package com.pactera.rb.proto;

public final class RobotProto {
  private RobotProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Robot_RbRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Robot_RbRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Robot_RbResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Robot_RbResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Robot_RbCallBack_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Robot_RbCallBack_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Robot_RbCallBack_ParamsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Robot_RbCallBack_ParamsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022grpc_message.proto\022\005Robot\"*\n\tRbRequest" +
      "\022\016\n\006userId\030\001 \001(\t\022\r\n\005query\030\002 \001(\t\"\356\001\n\nRbRe" +
      "sponse\022\013\n\003key\030\001 \001(\t\022\013\n\003tts\030\002 \001(\t\022\022\n\nscre" +
      "enShow\030\003 \001(\t\022\025\n\rrecommendList\030\004 \003(\t\022\024\n\014r" +
      "esponseType\030\005 \001(\t\022\031\n\021recommendVagueMsg\030\006" +
      " \001(\t\022!\n\006events\030\007 \003(\0132\021.Robot.RbCallBack\022" +
      "\"\n\007actions\030\010 \003(\0132\021.Robot.RbCallBack\022\014\n\004p" +
      "ath\030\t \001(\t\022\017\n\007context\030\n \001(\tJ\004\010\013\020\020\"x\n\nRbCa" +
      "llBack\022\014\n\004func\030\001 \001(\t\022-\n\006params\030\002 \003(\0132\035.R" +
      "obot.RbCallBack.ParamsEntry\032-\n\013ParamsEnt" +
      "ry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\0012=\n\005Ro" +
      "bot\0224\n\013getResponse\022\020.Robot.RbRequest\032\021.R" +
      "obot.RbResponse\"\000B$\n\024com.pactera.rb.prot" +
      "oB\nRobotProtoP\001b\006proto3"
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
    internal_static_Robot_RbRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Robot_RbRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Robot_RbRequest_descriptor,
        new java.lang.String[] { "UserId", "Query", });
    internal_static_Robot_RbResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Robot_RbResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Robot_RbResponse_descriptor,
        new java.lang.String[] { "Key", "Tts", "ScreenShow", "RecommendList", "ResponseType", "RecommendVagueMsg", "Events", "Actions", "Path", "Context", });
    internal_static_Robot_RbCallBack_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Robot_RbCallBack_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Robot_RbCallBack_descriptor,
        new java.lang.String[] { "Func", "Params", });
    internal_static_Robot_RbCallBack_ParamsEntry_descriptor =
      internal_static_Robot_RbCallBack_descriptor.getNestedTypes().get(0);
    internal_static_Robot_RbCallBack_ParamsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Robot_RbCallBack_ParamsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
