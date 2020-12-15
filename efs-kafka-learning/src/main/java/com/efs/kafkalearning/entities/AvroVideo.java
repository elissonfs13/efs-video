/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.efs.kafkalearning.entities;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class AvroVideo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4353167349618423426L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroVideo\",\"namespace\":\"com.efs.kafkalearning.entities\",\"fields\":[{\"name\":\"identifier\",\"type\":\"string\",\"avro.java.string\":\"String\"},{\"name\":\"name\",\"type\":\"string\",\"avro.java.string\":\"String\"},{\"name\":\"url\",\"type\":\"string\",\"avro.java.string\":\"String\"},{\"name\":\"localPath\",\"type\":\"string\",\"avro.java.string\":\"String\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AvroVideo> ENCODER =
      new BinaryMessageEncoder<AvroVideo>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AvroVideo> DECODER =
      new BinaryMessageDecoder<AvroVideo>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<AvroVideo> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<AvroVideo> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<AvroVideo> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AvroVideo>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this AvroVideo to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a AvroVideo from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a AvroVideo instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static AvroVideo fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence identifier;
   private java.lang.CharSequence name;
   private java.lang.CharSequence url;
   private java.lang.CharSequence localPath;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AvroVideo() {}

  /**
   * All-args constructor.
   * @param identifier The new value for identifier
   * @param name The new value for name
   * @param url The new value for url
   * @param localPath The new value for localPath
   */
  public AvroVideo(java.lang.CharSequence identifier, java.lang.CharSequence name, java.lang.CharSequence url, java.lang.CharSequence localPath) {
    this.identifier = identifier;
    this.name = name;
    this.url = url;
    this.localPath = localPath;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return identifier;
    case 1: return name;
    case 2: return url;
    case 3: return localPath;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: identifier = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: url = (java.lang.CharSequence)value$; break;
    case 3: localPath = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'identifier' field.
   * @return The value of the 'identifier' field.
   */
  public java.lang.CharSequence getIdentifier() {
    return identifier;
  }


  /**
   * Sets the value of the 'identifier' field.
   * @param value the value to set.
   */
  public void setIdentifier(java.lang.CharSequence value) {
    this.identifier = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'url' field.
   * @return The value of the 'url' field.
   */
  public java.lang.CharSequence getUrl() {
    return url;
  }


  /**
   * Sets the value of the 'url' field.
   * @param value the value to set.
   */
  public void setUrl(java.lang.CharSequence value) {
    this.url = value;
  }

  /**
   * Gets the value of the 'localPath' field.
   * @return The value of the 'localPath' field.
   */
  public java.lang.CharSequence getLocalPath() {
    return localPath;
  }


  /**
   * Sets the value of the 'localPath' field.
   * @param value the value to set.
   */
  public void setLocalPath(java.lang.CharSequence value) {
    this.localPath = value;
  }

  /**
   * Creates a new AvroVideo RecordBuilder.
   * @return A new AvroVideo RecordBuilder
   */
  public static com.efs.kafkalearning.entities.AvroVideo.Builder newBuilder() {
    return new com.efs.kafkalearning.entities.AvroVideo.Builder();
  }

  /**
   * Creates a new AvroVideo RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AvroVideo RecordBuilder
   */
  public static com.efs.kafkalearning.entities.AvroVideo.Builder newBuilder(com.efs.kafkalearning.entities.AvroVideo.Builder other) {
    if (other == null) {
      return new com.efs.kafkalearning.entities.AvroVideo.Builder();
    } else {
      return new com.efs.kafkalearning.entities.AvroVideo.Builder(other);
    }
  }

  /**
   * Creates a new AvroVideo RecordBuilder by copying an existing AvroVideo instance.
   * @param other The existing instance to copy.
   * @return A new AvroVideo RecordBuilder
   */
  public static com.efs.kafkalearning.entities.AvroVideo.Builder newBuilder(com.efs.kafkalearning.entities.AvroVideo other) {
    if (other == null) {
      return new com.efs.kafkalearning.entities.AvroVideo.Builder();
    } else {
      return new com.efs.kafkalearning.entities.AvroVideo.Builder(other);
    }
  }

  /**
   * RecordBuilder for AvroVideo instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroVideo>
    implements org.apache.avro.data.RecordBuilder<AvroVideo> {

    private java.lang.CharSequence identifier;
    private java.lang.CharSequence name;
    private java.lang.CharSequence url;
    private java.lang.CharSequence localPath;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.efs.kafkalearning.entities.AvroVideo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.identifier)) {
        this.identifier = data().deepCopy(fields()[0].schema(), other.identifier);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.url)) {
        this.url = data().deepCopy(fields()[2].schema(), other.url);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.localPath)) {
        this.localPath = data().deepCopy(fields()[3].schema(), other.localPath);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing AvroVideo instance
     * @param other The existing instance to copy.
     */
    private Builder(com.efs.kafkalearning.entities.AvroVideo other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.identifier)) {
        this.identifier = data().deepCopy(fields()[0].schema(), other.identifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.url)) {
        this.url = data().deepCopy(fields()[2].schema(), other.url);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.localPath)) {
        this.localPath = data().deepCopy(fields()[3].schema(), other.localPath);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'identifier' field.
      * @return The value.
      */
    public java.lang.CharSequence getIdentifier() {
      return identifier;
    }


    /**
      * Sets the value of the 'identifier' field.
      * @param value The value of 'identifier'.
      * @return This builder.
      */
    public com.efs.kafkalearning.entities.AvroVideo.Builder setIdentifier(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.identifier = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'identifier' field has been set.
      * @return True if the 'identifier' field has been set, false otherwise.
      */
    public boolean hasIdentifier() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'identifier' field.
      * @return This builder.
      */
    public com.efs.kafkalearning.entities.AvroVideo.Builder clearIdentifier() {
      identifier = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.efs.kafkalearning.entities.AvroVideo.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.efs.kafkalearning.entities.AvroVideo.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'url' field.
      * @return The value.
      */
    public java.lang.CharSequence getUrl() {
      return url;
    }


    /**
      * Sets the value of the 'url' field.
      * @param value The value of 'url'.
      * @return This builder.
      */
    public com.efs.kafkalearning.entities.AvroVideo.Builder setUrl(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.url = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'url' field has been set.
      * @return True if the 'url' field has been set, false otherwise.
      */
    public boolean hasUrl() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'url' field.
      * @return This builder.
      */
    public com.efs.kafkalearning.entities.AvroVideo.Builder clearUrl() {
      url = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'localPath' field.
      * @return The value.
      */
    public java.lang.CharSequence getLocalPath() {
      return localPath;
    }


    /**
      * Sets the value of the 'localPath' field.
      * @param value The value of 'localPath'.
      * @return This builder.
      */
    public com.efs.kafkalearning.entities.AvroVideo.Builder setLocalPath(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.localPath = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'localPath' field has been set.
      * @return True if the 'localPath' field has been set, false otherwise.
      */
    public boolean hasLocalPath() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'localPath' field.
      * @return This builder.
      */
    public com.efs.kafkalearning.entities.AvroVideo.Builder clearLocalPath() {
      localPath = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AvroVideo build() {
      try {
        AvroVideo record = new AvroVideo();
        record.identifier = fieldSetFlags()[0] ? this.identifier : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.url = fieldSetFlags()[2] ? this.url : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.localPath = fieldSetFlags()[3] ? this.localPath : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AvroVideo>
    WRITER$ = (org.apache.avro.io.DatumWriter<AvroVideo>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AvroVideo>
    READER$ = (org.apache.avro.io.DatumReader<AvroVideo>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.identifier);

    out.writeString(this.name);

    out.writeString(this.url);

    out.writeString(this.localPath);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.identifier = in.readString(this.identifier instanceof Utf8 ? (Utf8)this.identifier : null);

      this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);

      this.url = in.readString(this.url instanceof Utf8 ? (Utf8)this.url : null);

      this.localPath = in.readString(this.localPath instanceof Utf8 ? (Utf8)this.localPath : null);

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.identifier = in.readString(this.identifier instanceof Utf8 ? (Utf8)this.identifier : null);
          break;

        case 1:
          this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          break;

        case 2:
          this.url = in.readString(this.url instanceof Utf8 ? (Utf8)this.url : null);
          break;

        case 3:
          this.localPath = in.readString(this.localPath instanceof Utf8 ? (Utf8)this.localPath : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










