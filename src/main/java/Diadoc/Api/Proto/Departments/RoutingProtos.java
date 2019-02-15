// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Departments/Routing.proto

package Diadoc.Api.Proto.Departments;

public final class RoutingProtos {
  private RoutingProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RoutingOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.Departments.Routing)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required bool Kpp = 1;</code>
     */
    boolean hasKpp();
    /**
     * <code>required bool Kpp = 1;</code>
     */
    boolean getKpp();

    /**
     * <code>required bool Address = 2;</code>
     */
    boolean hasAddress();
    /**
     * <code>required bool Address = 2;</code>
     */
    boolean getAddress();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.Departments.Routing}
   */
  public static final class Routing extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.Departments.Routing)
      RoutingOrBuilder {
    // Use Routing.newBuilder() to construct.
    private Routing(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Routing(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Routing defaultInstance;
    public static Routing getDefaultInstance() {
      return defaultInstance;
    }

    public Routing getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Routing(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              kpp_ = input.readBool();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              address_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.Departments.RoutingProtos.internal_static_Diadoc_Api_Proto_Departments_Routing_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.Departments.RoutingProtos.internal_static_Diadoc_Api_Proto_Departments_Routing_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.Departments.RoutingProtos.Routing.class, Diadoc.Api.Proto.Departments.RoutingProtos.Routing.Builder.class);
    }

    public static com.google.protobuf.Parser<Routing> PARSER =
        new com.google.protobuf.AbstractParser<Routing>() {
      public Routing parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Routing(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Routing> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int KPP_FIELD_NUMBER = 1;
    private boolean kpp_;
    /**
     * <code>required bool Kpp = 1;</code>
     */
    public boolean hasKpp() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required bool Kpp = 1;</code>
     */
    public boolean getKpp() {
      return kpp_;
    }

    public static final int ADDRESS_FIELD_NUMBER = 2;
    private boolean address_;
    /**
     * <code>required bool Address = 2;</code>
     */
    public boolean hasAddress() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required bool Address = 2;</code>
     */
    public boolean getAddress() {
      return address_;
    }

    private void initFields() {
      kpp_ = false;
      address_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasKpp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAddress()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, kpp_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, address_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, kpp_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, address_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static Diadoc.Api.Proto.Departments.RoutingProtos.Routing parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Departments.RoutingProtos.Routing parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Departments.RoutingProtos.Routing parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Departments.RoutingProtos.Routing parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Departments.RoutingProtos.Routing parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.Departments.RoutingProtos.Routing parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Departments.RoutingProtos.Routing parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Diadoc.Api.Proto.Departments.RoutingProtos.Routing parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Departments.RoutingProtos.Routing parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.Departments.RoutingProtos.Routing parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Diadoc.Api.Proto.Departments.RoutingProtos.Routing prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Diadoc.Api.Proto.Departments.Routing}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.Departments.Routing)
        Diadoc.Api.Proto.Departments.RoutingProtos.RoutingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.Departments.RoutingProtos.internal_static_Diadoc_Api_Proto_Departments_Routing_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.Departments.RoutingProtos.internal_static_Diadoc_Api_Proto_Departments_Routing_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.Departments.RoutingProtos.Routing.class, Diadoc.Api.Proto.Departments.RoutingProtos.Routing.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.Departments.RoutingProtos.Routing.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        kpp_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        address_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.Departments.RoutingProtos.internal_static_Diadoc_Api_Proto_Departments_Routing_descriptor;
      }

      public Diadoc.Api.Proto.Departments.RoutingProtos.Routing getDefaultInstanceForType() {
        return Diadoc.Api.Proto.Departments.RoutingProtos.Routing.getDefaultInstance();
      }

      public Diadoc.Api.Proto.Departments.RoutingProtos.Routing build() {
        Diadoc.Api.Proto.Departments.RoutingProtos.Routing result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Diadoc.Api.Proto.Departments.RoutingProtos.Routing buildPartial() {
        Diadoc.Api.Proto.Departments.RoutingProtos.Routing result = new Diadoc.Api.Proto.Departments.RoutingProtos.Routing(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.kpp_ = kpp_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.address_ = address_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.Departments.RoutingProtos.Routing) {
          return mergeFrom((Diadoc.Api.Proto.Departments.RoutingProtos.Routing)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.Departments.RoutingProtos.Routing other) {
        if (other == Diadoc.Api.Proto.Departments.RoutingProtos.Routing.getDefaultInstance()) return this;
        if (other.hasKpp()) {
          setKpp(other.getKpp());
        }
        if (other.hasAddress()) {
          setAddress(other.getAddress());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasKpp()) {
          
          return false;
        }
        if (!hasAddress()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Diadoc.Api.Proto.Departments.RoutingProtos.Routing parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Diadoc.Api.Proto.Departments.RoutingProtos.Routing) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean kpp_ ;
      /**
       * <code>required bool Kpp = 1;</code>
       */
      public boolean hasKpp() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required bool Kpp = 1;</code>
       */
      public boolean getKpp() {
        return kpp_;
      }
      /**
       * <code>required bool Kpp = 1;</code>
       */
      public Builder setKpp(boolean value) {
        bitField0_ |= 0x00000001;
        kpp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool Kpp = 1;</code>
       */
      public Builder clearKpp() {
        bitField0_ = (bitField0_ & ~0x00000001);
        kpp_ = false;
        onChanged();
        return this;
      }

      private boolean address_ ;
      /**
       * <code>required bool Address = 2;</code>
       */
      public boolean hasAddress() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required bool Address = 2;</code>
       */
      public boolean getAddress() {
        return address_;
      }
      /**
       * <code>required bool Address = 2;</code>
       */
      public Builder setAddress(boolean value) {
        bitField0_ |= 0x00000002;
        address_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool Address = 2;</code>
       */
      public Builder clearAddress() {
        bitField0_ = (bitField0_ & ~0x00000002);
        address_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.Departments.Routing)
    }

    static {
      defaultInstance = new Routing(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.Departments.Routing)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_Departments_Routing_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_Departments_Routing_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Departments/Routing.proto\022\034Diadoc.Api." +
      "Proto.Departments\"\'\n\007Routing\022\013\n\003Kpp\030\001 \002(" +
      "\010\022\017\n\007Address\030\002 \002(\010B\017B\rRoutingProtos"
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
    internal_static_Diadoc_Api_Proto_Departments_Routing_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_Departments_Routing_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_Departments_Routing_descriptor,
        new java.lang.String[] { "Kpp", "Address", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}