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
import com.konfigthis.client.model.StudentRelationship;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * Contact
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Contact {
  public static final String SERIALIZED_NAME_LEGACY_ID = "legacy_id";
  @SerializedName(SERIALIZED_NAME_LEGACY_ID)
  private String legacyId;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  /**
   * Gets or Sets phoneType
   */
  @JsonAdapter(PhoneTypeEnum.Adapter.class)
 public enum PhoneTypeEnum {
    CELL("Cell"),
    
    HOME("Home"),
    
    WORK("Work"),
    
    OTHER("Other"),
    
    EMPTY("");

    private String value;

    PhoneTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PhoneTypeEnum fromValue(String value) {
      for (PhoneTypeEnum b : PhoneTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PhoneTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PhoneTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PhoneTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PhoneTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PHONE_TYPE = "phone_type";
  @SerializedName(SERIALIZED_NAME_PHONE_TYPE)
  private PhoneTypeEnum phoneType;

  public static final String SERIALIZED_NAME_SIS_ID = "sis_id";
  @SerializedName(SERIALIZED_NAME_SIS_ID)
  private String sisId;

  public static final String SERIALIZED_NAME_STUDENT_RELATIONSHIPS = "student_relationships";
  @SerializedName(SERIALIZED_NAME_STUDENT_RELATIONSHIPS)
  private List<StudentRelationship> studentRelationships = null;

  public Contact() {
  }

  public Contact legacyId(String legacyId) {
    
    
    
    
    this.legacyId = legacyId;
    return this;
  }

   /**
   * Get legacyId
   * @return legacyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLegacyId() {
    return legacyId;
  }


  public void setLegacyId(String legacyId) {
    
    
    
    this.legacyId = legacyId;
  }


  public Contact phone(String phone) {
    
    
    
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    
    
    
    this.phone = phone;
  }


  public Contact phoneType(PhoneTypeEnum phoneType) {
    
    
    
    
    this.phoneType = phoneType;
    return this;
  }

   /**
   * Get phoneType
   * @return phoneType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PhoneTypeEnum getPhoneType() {
    return phoneType;
  }


  public void setPhoneType(PhoneTypeEnum phoneType) {
    
    
    
    this.phoneType = phoneType;
  }


  public Contact sisId(String sisId) {
    
    
    
    
    this.sisId = sisId;
    return this;
  }

   /**
   * Get sisId
   * @return sisId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSisId() {
    return sisId;
  }


  public void setSisId(String sisId) {
    
    
    
    this.sisId = sisId;
  }


  public Contact studentRelationships(List<StudentRelationship> studentRelationships) {
    
    
    
    
    this.studentRelationships = studentRelationships;
    return this;
  }

  public Contact addStudentRelationshipsItem(StudentRelationship studentRelationshipsItem) {
    if (this.studentRelationships == null) {
      this.studentRelationships = new ArrayList<>();
    }
    this.studentRelationships.add(studentRelationshipsItem);
    return this;
  }

   /**
   * Get studentRelationships
   * @return studentRelationships
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<StudentRelationship> getStudentRelationships() {
    return studentRelationships;
  }


  public void setStudentRelationships(List<StudentRelationship> studentRelationships) {
    
    
    
    this.studentRelationships = studentRelationships;
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
   * @return the Contact instance itself
   */
  public Contact putAdditionalProperty(String key, Object value) {
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
    Contact contact = (Contact) o;
    return Objects.equals(this.legacyId, contact.legacyId) &&
        Objects.equals(this.phone, contact.phone) &&
        Objects.equals(this.phoneType, contact.phoneType) &&
        Objects.equals(this.sisId, contact.sisId) &&
        Objects.equals(this.studentRelationships, contact.studentRelationships)&&
        Objects.equals(this.additionalProperties, contact.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(legacyId, phone, phoneType, sisId, studentRelationships, additionalProperties);
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
    sb.append("class Contact {\n");
    sb.append("    legacyId: ").append(toIndentedString(legacyId)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
    sb.append("    sisId: ").append(toIndentedString(sisId)).append("\n");
    sb.append("    studentRelationships: ").append(toIndentedString(studentRelationships)).append("\n");
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
    openapiFields.add("legacy_id");
    openapiFields.add("phone");
    openapiFields.add("phone_type");
    openapiFields.add("sis_id");
    openapiFields.add("student_relationships");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Contact
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Contact.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Contact is not found in the empty JSON string", Contact.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("legacy_id") != null && !jsonObj.get("legacy_id").isJsonNull()) && !jsonObj.get("legacy_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legacy_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legacy_id").toString()));
      }
      if (!jsonObj.get("phone").isJsonNull() && (jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if (!jsonObj.get("phone_type").isJsonNull() && (jsonObj.get("phone_type") != null && !jsonObj.get("phone_type").isJsonNull()) && !jsonObj.get("phone_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_type").toString()));
      }
      if (!jsonObj.get("sis_id").isJsonNull() && (jsonObj.get("sis_id") != null && !jsonObj.get("sis_id").isJsonNull()) && !jsonObj.get("sis_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sis_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sis_id").toString()));
      }
      if (jsonObj.get("student_relationships") != null && !jsonObj.get("student_relationships").isJsonNull()) {
        JsonArray jsonArraystudentRelationships = jsonObj.getAsJsonArray("student_relationships");
        if (jsonArraystudentRelationships != null) {
          // ensure the json data is an array
          if (!jsonObj.get("student_relationships").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `student_relationships` to be an array in the JSON string but got `%s`", jsonObj.get("student_relationships").toString()));
          }

          // validate the optional field `student_relationships` (array)
          for (int i = 0; i < jsonArraystudentRelationships.size(); i++) {
            StudentRelationship.validateJsonObject(jsonArraystudentRelationships.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Contact.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Contact' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Contact> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Contact.class));

       return (TypeAdapter<T>) new TypeAdapter<Contact>() {
           @Override
           public void write(JsonWriter out, Contact value) throws IOException {
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
           public Contact read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Contact instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Contact given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Contact
  * @throws IOException if the JSON string is invalid with respect to Contact
  */
  public static Contact fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Contact.class);
  }

 /**
  * Convert an instance of Contact to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

