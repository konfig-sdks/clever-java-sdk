/*
 * Data API
 * Serves the Clever Data API
 *
 * The version of the OpenAPI document: 3.1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Disability
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Disability {
  /**
   * Gets or Sets disabilityCode
   */
  @JsonAdapter(DisabilityCodeEnum.Adapter.class)
 public enum DisabilityCodeEnum {
    AUT("aut"),
    
    DB("db"),
    
    DD("dd"),
    
    EMN("emn"),
    
    HI("hi"),
    
    ID("id"),
    
    MD("md"),
    
    OI("oi"),
    
    OTHER("other"),
    
    OHI("ohi"),
    
    SLD("sld"),
    
    SLI("sli"),
    
    TBI("tbi"),
    
    VI("vi");

    private String value;

    DisabilityCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DisabilityCodeEnum fromValue(String value) {
      for (DisabilityCodeEnum b : DisabilityCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DisabilityCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DisabilityCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DisabilityCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DisabilityCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DISABILITY_CODE = "disability_code";
  @SerializedName(SERIALIZED_NAME_DISABILITY_CODE)
  private DisabilityCodeEnum disabilityCode;

  /**
   * Gets or Sets disabilityStatus
   */
  @JsonAdapter(DisabilityStatusEnum.Adapter.class)
 public enum DisabilityStatusEnum {
    Y("Y"),
    
    N("N"),
    
    EMPTY("");

    private String value;

    DisabilityStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DisabilityStatusEnum fromValue(String value) {
      for (DisabilityStatusEnum b : DisabilityStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DisabilityStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DisabilityStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DisabilityStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DisabilityStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DISABILITY_STATUS = "disability_status";
  @SerializedName(SERIALIZED_NAME_DISABILITY_STATUS)
  private DisabilityStatusEnum disabilityStatus;

  /**
   * Gets or Sets disabilityType
   */
  @JsonAdapter(DisabilityTypeEnum.Adapter.class)
 public enum DisabilityTypeEnum {
    AUTISM("Autism"),
    
    DEAF_BLINDNESS("Deaf-blindness"),
    
    DEVELOPMENTAL_DELAY("Developmental delay"),
    
    EMOTIONAL_DISTURBANCE("Emotional disturbance"),
    
    HEARING_IMPAIRMENT("Hearing impairment"),
    
    INTELLECTUAL_DISABILITY("Intellectual Disability"),
    
    MULTIPLE_DISABILITIES("Multiple disabilities"),
    
    ORTHOPEDIC_IMPAIRMENT("Orthopedic impairment"),
    
    OTHER("Other"),
    
    OTHER_HEALTH_IMPAIRMENT("Other health impairment"),
    
    SPECIFIC_LEARNING_DISABILITY("Specific learning disability"),
    
    SPEECH_OR_LANGUAGE_IMPAIRMENT("Speech or language impairment"),
    
    TRAUMATIC_BRAIN_INJURY("Traumatic brain injury"),
    
    VISUAL_IMPAIRMENT("Visual impairment");

    private String value;

    DisabilityTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DisabilityTypeEnum fromValue(String value) {
      for (DisabilityTypeEnum b : DisabilityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DisabilityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DisabilityTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DisabilityTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DisabilityTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DISABILITY_TYPE = "disability_type";
  @SerializedName(SERIALIZED_NAME_DISABILITY_TYPE)
  private DisabilityTypeEnum disabilityType;

  public Disability() {
  }

  public Disability disabilityCode(DisabilityCodeEnum disabilityCode) {
    
    
    
    
    this.disabilityCode = disabilityCode;
    return this;
  }

   /**
   * Get disabilityCode
   * @return disabilityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DisabilityCodeEnum getDisabilityCode() {
    return disabilityCode;
  }


  public void setDisabilityCode(DisabilityCodeEnum disabilityCode) {
    
    
    
    this.disabilityCode = disabilityCode;
  }


  public Disability disabilityStatus(DisabilityStatusEnum disabilityStatus) {
    
    
    
    
    this.disabilityStatus = disabilityStatus;
    return this;
  }

   /**
   * Get disabilityStatus
   * @return disabilityStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DisabilityStatusEnum getDisabilityStatus() {
    return disabilityStatus;
  }


  public void setDisabilityStatus(DisabilityStatusEnum disabilityStatus) {
    
    
    
    this.disabilityStatus = disabilityStatus;
  }


  public Disability disabilityType(DisabilityTypeEnum disabilityType) {
    
    
    
    
    this.disabilityType = disabilityType;
    return this;
  }

   /**
   * Get disabilityType
   * @return disabilityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DisabilityTypeEnum getDisabilityType() {
    return disabilityType;
  }


  public void setDisabilityType(DisabilityTypeEnum disabilityType) {
    
    
    
    this.disabilityType = disabilityType;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the Disability instance itself
   */
  public Disability putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Disability disability = (Disability) o;
    return Objects.equals(this.disabilityCode, disability.disabilityCode) &&
        Objects.equals(this.disabilityStatus, disability.disabilityStatus) &&
        Objects.equals(this.disabilityType, disability.disabilityType)&&
        Objects.equals(this.additionalProperties, disability.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabilityCode, disabilityStatus, disabilityType, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Disability {\n");
    sb.append("    disabilityCode: ").append(toIndentedString(disabilityCode)).append("\n");
    sb.append("    disabilityStatus: ").append(toIndentedString(disabilityStatus)).append("\n");
    sb.append("    disabilityType: ").append(toIndentedString(disabilityType)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("disability_code");
    openapiFields.add("disability_status");
    openapiFields.add("disability_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Disability
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Disability.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Disability is not found in the empty JSON string", Disability.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("disability_code").isJsonNull() && (jsonObj.get("disability_code") != null && !jsonObj.get("disability_code").isJsonNull()) && !jsonObj.get("disability_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disability_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disability_code").toString()));
      }
      if (!jsonObj.get("disability_status").isJsonNull() && (jsonObj.get("disability_status") != null && !jsonObj.get("disability_status").isJsonNull()) && !jsonObj.get("disability_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disability_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disability_status").toString()));
      }
      if (!jsonObj.get("disability_type").isJsonNull() && (jsonObj.get("disability_type") != null && !jsonObj.get("disability_type").isJsonNull()) && !jsonObj.get("disability_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disability_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disability_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Disability.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Disability' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Disability> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Disability.class));

       return (TypeAdapter<T>) new TypeAdapter<Disability>() {
           @Override
           public void write(JsonWriter out, Disability value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Disability read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Disability instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Disability given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Disability
  * @throws IOException if the JSON string is invalid with respect to Disability
  */
  public static Disability fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Disability.class);
  }

 /**
  * Convert an instance of Disability to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

