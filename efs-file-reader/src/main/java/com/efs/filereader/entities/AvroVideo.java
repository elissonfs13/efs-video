/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.efs.filereader.entities;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class AvroVideo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6241141876152458569L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroVideo\",\"namespace\":\"com.efs.filereader.entities\",\"fields\":[{\"name\":\"identifier\",\"type\":\"string\",\"avro.java.string\":\"String\"},{\"name\":\"name\",\"type\":\"string\",\"avro.java.string\":\"String\"},{\"name\":\"url\",\"type\":\"string\",\"avro.java.string\":\"String\"},{\"name\":\"description\",\"type\":\"string\",\"avro.java.string\":\"String\"},{\"name\":\"duration\",\"type\":\"string\",\"avro.java.string\":\"String\"},{\"name\":\"category\",\"type\":\"string\",\"avro.java.string\":\"String\"},{\"name\":\"idOnlineVideo\",\"type\":\"string\",\"avro.java.string\":\"String\"},{\"name\":\"localPath\",\"type\":\"string\",\"avro.java.string\":\"String\"},{\"name\":\"size\",\"type\":\"string\",\"avro.java.string\":\"String\"}]}");
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
   private java.lang.CharSequence description;
   private java.lang.CharSequence duration;
   private java.lang.CharSequence category;
   private java.lang.CharSequence idOnlineVideo;
   private java.lang.CharSequence localPath;
   private java.lang.CharSequence size;

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
   * @param description The new value for description
   * @param duration The new value for duration
   * @param category The new value for category
   * @param idOnlineVideo The new value for idOnlineVideo
   * @param localPath The new value for localPath
   * @param size The new value for size
   */
  public AvroVideo(java.lang.CharSequence identifier, java.lang.CharSequence name, java.lang.CharSequence url, java.lang.CharSequence description, java.lang.CharSequence duration, java.lang.CharSequence category, java.lang.CharSequence idOnlineVideo, java.lang.CharSequence localPath, java.lang.CharSequence size) {
    this.identifier = identifier;
    this.name = name;
    this.url = url;
    this.description = description;
    this.duration = duration;
    this.category = category;
    this.idOnlineVideo = idOnlineVideo;
    this.localPath = localPath;
    this.size = size;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return identifier;
    case 1: return name;
    case 2: return url;
    case 3: return description;
    case 4: return duration;
    case 5: return category;
    case 6: return idOnlineVideo;
    case 7: return localPath;
    case 8: return size;
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
    case 3: description = (java.lang.CharSequence)value$; break;
    case 4: duration = (java.lang.CharSequence)value$; break;
    case 5: category = (java.lang.CharSequence)value$; break;
    case 6: idOnlineVideo = (java.lang.CharSequence)value$; break;
    case 7: localPath = (java.lang.CharSequence)value$; break;
    case 8: size = (java.lang.CharSequence)value$; break;
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
   * Gets the value of the 'description' field.
   * @return The value of the 'description' field.
   */
  public java.lang.CharSequence getDescription() {
    return description;
  }


  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(java.lang.CharSequence value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'duration' field.
   * @return The value of the 'duration' field.
   */
  public java.lang.CharSequence getDuration() {
    return duration;
  }


  /**
   * Sets the value of the 'duration' field.
   * @param value the value to set.
   */
  public void setDuration(java.lang.CharSequence value) {
    this.duration = value;
  }

  /**
   * Gets the value of the 'category' field.
   * @return The value of the 'category' field.
   */
  public java.lang.CharSequence getCategory() {
    return category;
  }


  /**
   * Sets the value of the 'category' field.
   * @param value the value to set.
   */
  public void setCategory(java.lang.CharSequence value) {
    this.category = value;
  }

  /**
   * Gets the value of the 'idOnlineVideo' field.
   * @return The value of the 'idOnlineVideo' field.
   */
  public java.lang.CharSequence getIdOnlineVideo() {
    return idOnlineVideo;
  }


  /**
   * Sets the value of the 'idOnlineVideo' field.
   * @param value the value to set.
   */
  public void setIdOnlineVideo(java.lang.CharSequence value) {
    this.idOnlineVideo = value;
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
   * Gets the value of the 'size' field.
   * @return The value of the 'size' field.
   */
  public java.lang.CharSequence getSize() {
    return size;
  }


  /**
   * Sets the value of the 'size' field.
   * @param value the value to set.
   */
  public void setSize(java.lang.CharSequence value) {
    this.size = value;
  }

  /**
   * Creates a new AvroVideo RecordBuilder.
   * @return A new AvroVideo RecordBuilder
   */
  public static com.efs.filereader.entities.AvroVideo.Builder newBuilder() {
    return new com.efs.filereader.entities.AvroVideo.Builder();
  }

  /**
   * Creates a new AvroVideo RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AvroVideo RecordBuilder
   */
  public static com.efs.filereader.entities.AvroVideo.Builder newBuilder(com.efs.filereader.entities.AvroVideo.Builder other) {
    if (other == null) {
      return new com.efs.filereader.entities.AvroVideo.Builder();
    } else {
      return new com.efs.filereader.entities.AvroVideo.Builder(other);
    }
  }

  /**
   * Creates a new AvroVideo RecordBuilder by copying an existing AvroVideo instance.
   * @param other The existing instance to copy.
   * @return A new AvroVideo RecordBuilder
   */
  public static com.efs.filereader.entities.AvroVideo.Builder newBuilder(com.efs.filereader.entities.AvroVideo other) {
    if (other == null) {
      return new com.efs.filereader.entities.AvroVideo.Builder();
    } else {
      return new com.efs.filereader.entities.AvroVideo.Builder(other);
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
    private java.lang.CharSequence description;
    private java.lang.CharSequence duration;
    private java.lang.CharSequence category;
    private java.lang.CharSequence idOnlineVideo;
    private java.lang.CharSequence localPath;
    private java.lang.CharSequence size;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.efs.filereader.entities.AvroVideo.Builder other) {
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
      if (isValidValue(fields()[3], other.description)) {
        this.description = data().deepCopy(fields()[3].schema(), other.description);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.duration)) {
        this.duration = data().deepCopy(fields()[4].schema(), other.duration);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.category)) {
        this.category = data().deepCopy(fields()[5].schema(), other.category);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.idOnlineVideo)) {
        this.idOnlineVideo = data().deepCopy(fields()[6].schema(), other.idOnlineVideo);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.localPath)) {
        this.localPath = data().deepCopy(fields()[7].schema(), other.localPath);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.size)) {
        this.size = data().deepCopy(fields()[8].schema(), other.size);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
    }

    /**
     * Creates a Builder by copying an existing AvroVideo instance
     * @param other The existing instance to copy.
     */
    private Builder(com.efs.filereader.entities.AvroVideo other) {
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
      if (isValidValue(fields()[3], other.description)) {
        this.description = data().deepCopy(fields()[3].schema(), other.description);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.duration)) {
        this.duration = data().deepCopy(fields()[4].schema(), other.duration);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.category)) {
        this.category = data().deepCopy(fields()[5].schema(), other.category);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.idOnlineVideo)) {
        this.idOnlineVideo = data().deepCopy(fields()[6].schema(), other.idOnlineVideo);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.localPath)) {
        this.localPath = data().deepCopy(fields()[7].schema(), other.localPath);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.size)) {
        this.size = data().deepCopy(fields()[8].schema(), other.size);
        fieldSetFlags()[8] = true;
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
    public com.efs.filereader.entities.AvroVideo.Builder setIdentifier(java.lang.CharSequence value) {
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
    public com.efs.filereader.entities.AvroVideo.Builder clearIdentifier() {
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
    public com.efs.filereader.entities.AvroVideo.Builder setName(java.lang.CharSequence value) {
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
    public com.efs.filereader.entities.AvroVideo.Builder clearName() {
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
    public com.efs.filereader.entities.AvroVideo.Builder setUrl(java.lang.CharSequence value) {
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
    public com.efs.filereader.entities.AvroVideo.Builder clearUrl() {
      url = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'description' field.
      * @return The value.
      */
    public java.lang.CharSequence getDescription() {
      return description;
    }


    /**
      * Sets the value of the 'description' field.
      * @param value The value of 'description'.
      * @return This builder.
      */
    public com.efs.filereader.entities.AvroVideo.Builder setDescription(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.description = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'description' field has been set.
      * @return True if the 'description' field has been set, false otherwise.
      */
    public boolean hasDescription() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'description' field.
      * @return This builder.
      */
    public com.efs.filereader.entities.AvroVideo.Builder clearDescription() {
      description = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'duration' field.
      * @return The value.
      */
    public java.lang.CharSequence getDuration() {
      return duration;
    }


    /**
      * Sets the value of the 'duration' field.
      * @param value The value of 'duration'.
      * @return This builder.
      */
    public com.efs.filereader.entities.AvroVideo.Builder setDuration(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.duration = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'duration' field has been set.
      * @return True if the 'duration' field has been set, false otherwise.
      */
    public boolean hasDuration() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'duration' field.
      * @return This builder.
      */
    public com.efs.filereader.entities.AvroVideo.Builder clearDuration() {
      duration = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'category' field.
      * @return The value.
      */
    public java.lang.CharSequence getCategory() {
      return category;
    }


    /**
      * Sets the value of the 'category' field.
      * @param value The value of 'category'.
      * @return This builder.
      */
    public com.efs.filereader.entities.AvroVideo.Builder setCategory(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.category = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'category' field has been set.
      * @return True if the 'category' field has been set, false otherwise.
      */
    public boolean hasCategory() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'category' field.
      * @return This builder.
      */
    public com.efs.filereader.entities.AvroVideo.Builder clearCategory() {
      category = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'idOnlineVideo' field.
      * @return The value.
      */
    public java.lang.CharSequence getIdOnlineVideo() {
      return idOnlineVideo;
    }


    /**
      * Sets the value of the 'idOnlineVideo' field.
      * @param value The value of 'idOnlineVideo'.
      * @return This builder.
      */
    public com.efs.filereader.entities.AvroVideo.Builder setIdOnlineVideo(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.idOnlineVideo = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'idOnlineVideo' field has been set.
      * @return True if the 'idOnlineVideo' field has been set, false otherwise.
      */
    public boolean hasIdOnlineVideo() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'idOnlineVideo' field.
      * @return This builder.
      */
    public com.efs.filereader.entities.AvroVideo.Builder clearIdOnlineVideo() {
      idOnlineVideo = null;
      fieldSetFlags()[6] = false;
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
    public com.efs.filereader.entities.AvroVideo.Builder setLocalPath(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.localPath = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'localPath' field has been set.
      * @return True if the 'localPath' field has been set, false otherwise.
      */
    public boolean hasLocalPath() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'localPath' field.
      * @return This builder.
      */
    public com.efs.filereader.entities.AvroVideo.Builder clearLocalPath() {
      localPath = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'size' field.
      * @return The value.
      */
    public java.lang.CharSequence getSize() {
      return size;
    }


    /**
      * Sets the value of the 'size' field.
      * @param value The value of 'size'.
      * @return This builder.
      */
    public com.efs.filereader.entities.AvroVideo.Builder setSize(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.size = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'size' field has been set.
      * @return True if the 'size' field has been set, false otherwise.
      */
    public boolean hasSize() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'size' field.
      * @return This builder.
      */
    public com.efs.filereader.entities.AvroVideo.Builder clearSize() {
      size = null;
      fieldSetFlags()[8] = false;
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
        record.description = fieldSetFlags()[3] ? this.description : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.duration = fieldSetFlags()[4] ? this.duration : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.category = fieldSetFlags()[5] ? this.category : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.idOnlineVideo = fieldSetFlags()[6] ? this.idOnlineVideo : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.localPath = fieldSetFlags()[7] ? this.localPath : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.size = fieldSetFlags()[8] ? this.size : (java.lang.CharSequence) defaultValue(fields()[8]);
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

    out.writeString(this.description);

    out.writeString(this.duration);

    out.writeString(this.category);

    out.writeString(this.idOnlineVideo);

    out.writeString(this.localPath);

    out.writeString(this.size);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.identifier = in.readString(this.identifier instanceof Utf8 ? (Utf8)this.identifier : null);

      this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);

      this.url = in.readString(this.url instanceof Utf8 ? (Utf8)this.url : null);

      this.description = in.readString(this.description instanceof Utf8 ? (Utf8)this.description : null);

      this.duration = in.readString(this.duration instanceof Utf8 ? (Utf8)this.duration : null);

      this.category = in.readString(this.category instanceof Utf8 ? (Utf8)this.category : null);

      this.idOnlineVideo = in.readString(this.idOnlineVideo instanceof Utf8 ? (Utf8)this.idOnlineVideo : null);

      this.localPath = in.readString(this.localPath instanceof Utf8 ? (Utf8)this.localPath : null);

      this.size = in.readString(this.size instanceof Utf8 ? (Utf8)this.size : null);

    } else {
      for (int i = 0; i < 9; i++) {
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
          this.description = in.readString(this.description instanceof Utf8 ? (Utf8)this.description : null);
          break;

        case 4:
          this.duration = in.readString(this.duration instanceof Utf8 ? (Utf8)this.duration : null);
          break;

        case 5:
          this.category = in.readString(this.category instanceof Utf8 ? (Utf8)this.category : null);
          break;

        case 6:
          this.idOnlineVideo = in.readString(this.idOnlineVideo instanceof Utf8 ? (Utf8)this.idOnlineVideo : null);
          break;

        case 7:
          this.localPath = in.readString(this.localPath instanceof Utf8 ? (Utf8)this.localPath : null);
          break;

        case 8:
          this.size = in.readString(this.size instanceof Utf8 ? (Utf8)this.size : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










