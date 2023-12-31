// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: persona.proto

package cl.ucn.disc.as.grpc;

/**
 * <pre>
 *peticion persona
 * </pre>
 *
 * Protobuf type {@code conserjeria.PersonaGrpcRequest}
 */
public final class PersonaGrpcRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:conserjeria.PersonaGrpcRequest)
    PersonaGrpcRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PersonaGrpcRequest.newBuilder() to construct.
  private PersonaGrpcRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PersonaGrpcRequest() {
    rut_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PersonaGrpcRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cl.ucn.disc.as.grpc.Persona.internal_static_conserjeria_PersonaGrpcRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cl.ucn.disc.as.grpc.Persona.internal_static_conserjeria_PersonaGrpcRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cl.ucn.disc.as.grpc.PersonaGrpcRequest.class, cl.ucn.disc.as.grpc.PersonaGrpcRequest.Builder.class);
  }

  public static final int RUT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object rut_ = "";
  /**
   * <code>string rut = 1;</code>
   * @return The rut.
   */
  @java.lang.Override
  public java.lang.String getRut() {
    java.lang.Object ref = rut_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rut_ = s;
      return s;
    }
  }
  /**
   * <code>string rut = 1;</code>
   * @return The bytes for rut.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRutBytes() {
    java.lang.Object ref = rut_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rut_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rut_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rut_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rut_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rut_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cl.ucn.disc.as.grpc.PersonaGrpcRequest)) {
      return super.equals(obj);
    }
    cl.ucn.disc.as.grpc.PersonaGrpcRequest other = (cl.ucn.disc.as.grpc.PersonaGrpcRequest) obj;

    if (!getRut()
        .equals(other.getRut())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RUT_FIELD_NUMBER;
    hash = (53 * hash) + getRut().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cl.ucn.disc.as.grpc.PersonaGrpcRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cl.ucn.disc.as.grpc.PersonaGrpcRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cl.ucn.disc.as.grpc.PersonaGrpcRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cl.ucn.disc.as.grpc.PersonaGrpcRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cl.ucn.disc.as.grpc.PersonaGrpcRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cl.ucn.disc.as.grpc.PersonaGrpcRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cl.ucn.disc.as.grpc.PersonaGrpcRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cl.ucn.disc.as.grpc.PersonaGrpcRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cl.ucn.disc.as.grpc.PersonaGrpcRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cl.ucn.disc.as.grpc.PersonaGrpcRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cl.ucn.disc.as.grpc.PersonaGrpcRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cl.ucn.disc.as.grpc.PersonaGrpcRequest parseFrom(
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
  public static Builder newBuilder(cl.ucn.disc.as.grpc.PersonaGrpcRequest prototype) {
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
   * <pre>
   *peticion persona
   * </pre>
   *
   * Protobuf type {@code conserjeria.PersonaGrpcRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:conserjeria.PersonaGrpcRequest)
      cl.ucn.disc.as.grpc.PersonaGrpcRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cl.ucn.disc.as.grpc.Persona.internal_static_conserjeria_PersonaGrpcRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cl.ucn.disc.as.grpc.Persona.internal_static_conserjeria_PersonaGrpcRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cl.ucn.disc.as.grpc.PersonaGrpcRequest.class, cl.ucn.disc.as.grpc.PersonaGrpcRequest.Builder.class);
    }

    // Construct using cl.ucn.disc.as.grpc.PersonaGrpcRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      rut_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cl.ucn.disc.as.grpc.Persona.internal_static_conserjeria_PersonaGrpcRequest_descriptor;
    }

    @java.lang.Override
    public cl.ucn.disc.as.grpc.PersonaGrpcRequest getDefaultInstanceForType() {
      return cl.ucn.disc.as.grpc.PersonaGrpcRequest.getDefaultInstance();
    }

    @java.lang.Override
    public cl.ucn.disc.as.grpc.PersonaGrpcRequest build() {
      cl.ucn.disc.as.grpc.PersonaGrpcRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cl.ucn.disc.as.grpc.PersonaGrpcRequest buildPartial() {
      cl.ucn.disc.as.grpc.PersonaGrpcRequest result = new cl.ucn.disc.as.grpc.PersonaGrpcRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(cl.ucn.disc.as.grpc.PersonaGrpcRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rut_ = rut_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cl.ucn.disc.as.grpc.PersonaGrpcRequest) {
        return mergeFrom((cl.ucn.disc.as.grpc.PersonaGrpcRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cl.ucn.disc.as.grpc.PersonaGrpcRequest other) {
      if (other == cl.ucn.disc.as.grpc.PersonaGrpcRequest.getDefaultInstance()) return this;
      if (!other.getRut().isEmpty()) {
        rut_ = other.rut_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              rut_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object rut_ = "";
    /**
     * <code>string rut = 1;</code>
     * @return The rut.
     */
    public java.lang.String getRut() {
      java.lang.Object ref = rut_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rut_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string rut = 1;</code>
     * @return The bytes for rut.
     */
    public com.google.protobuf.ByteString
        getRutBytes() {
      java.lang.Object ref = rut_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rut_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string rut = 1;</code>
     * @param value The rut to set.
     * @return This builder for chaining.
     */
    public Builder setRut(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      rut_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string rut = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRut() {
      rut_ = getDefaultInstance().getRut();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string rut = 1;</code>
     * @param value The bytes for rut to set.
     * @return This builder for chaining.
     */
    public Builder setRutBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      rut_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:conserjeria.PersonaGrpcRequest)
  }

  // @@protoc_insertion_point(class_scope:conserjeria.PersonaGrpcRequest)
  private static final cl.ucn.disc.as.grpc.PersonaGrpcRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cl.ucn.disc.as.grpc.PersonaGrpcRequest();
  }

  public static cl.ucn.disc.as.grpc.PersonaGrpcRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PersonaGrpcRequest>
      PARSER = new com.google.protobuf.AbstractParser<PersonaGrpcRequest>() {
    @java.lang.Override
    public PersonaGrpcRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<PersonaGrpcRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PersonaGrpcRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cl.ucn.disc.as.grpc.PersonaGrpcRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

