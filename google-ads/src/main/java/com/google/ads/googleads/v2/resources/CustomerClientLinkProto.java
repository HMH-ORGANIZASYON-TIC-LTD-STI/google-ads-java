// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/customer_client_link.proto

package com.google.ads.googleads.v2.resources;

public final class CustomerClientLinkProto {
  private CustomerClientLinkProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_CustomerClientLink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_CustomerClientLink_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v2/resources/cust" +
      "omer_client_link.proto\022!google.ads.googl" +
      "eads.v2.resources\0327google/ads/googleads/" +
      "v2/enums/manager_link_status.proto\032\036goog" +
      "le/protobuf/wrappers.proto\032\034google/api/a" +
      "nnotations.proto\"\234\002\n\022CustomerClientLink\022" +
      "\025\n\rresource_name\030\001 \001(\t\0225\n\017client_custome" +
      "r\030\003 \001(\0132\034.google.protobuf.StringValue\0224\n" +
      "\017manager_link_id\030\004 \001(\0132\033.google.protobuf" +
      ".Int64Value\022V\n\006status\030\005 \001(\0162F.google.ads" +
      ".googleads.v2.enums.ManagerLinkStatusEnu" +
      "m.ManagerLinkStatus\022*\n\006hidden\030\006 \001(\0132\032.go" +
      "ogle.protobuf.BoolValueB\204\002\n%com.google.a" +
      "ds.googleads.v2.resourcesB\027CustomerClien" +
      "tLinkProtoP\001ZJgoogle.golang.org/genproto" +
      "/googleapis/ads/googleads/v2/resources;r" +
      "esources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V2" +
      ".Resources\312\002!Google\\Ads\\GoogleAds\\V2\\Res" +
      "ources\352\002%Google::Ads::GoogleAds::V2::Res" +
      "ourcesb\006proto3"
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
          com.google.ads.googleads.v2.enums.ManagerLinkStatusProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_resources_CustomerClientLink_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_CustomerClientLink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_CustomerClientLink_descriptor,
        new java.lang.String[] { "ResourceName", "ClientCustomer", "ManagerLinkId", "Status", "Hidden", });
    com.google.ads.googleads.v2.enums.ManagerLinkStatusProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}