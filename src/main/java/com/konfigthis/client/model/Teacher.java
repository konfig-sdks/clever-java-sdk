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
import com.konfigthis.client.model.Credentials;
import com.konfigthis.client.model.Name;
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
 * Teacher
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Teacher {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_CREDENTIALS = "credentials";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS)
  private Credentials credentials;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private String district;

  public static final String SERIALIZED_NAME_EXT = "ext";
  @SerializedName(SERIALIZED_NAME_EXT)
  private Object ext;

  public static final String SERIALIZED_NAME_LAST_MODIFIED = "last_modified";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED)
  private String lastModified;

  public static final String SERIALIZED_NAME_LEGACY_ID = "legacy_id";
  @SerializedName(SERIALIZED_NAME_LEGACY_ID)
  private String legacyId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Name name;

  public static final String SERIALIZED_NAME_SCHOOL = "school";
  @SerializedName(SERIALIZED_NAME_SCHOOL)
  private String school;

  public static final String SERIALIZED_NAME_SCHOOLS = "schools";
  @SerializedName(SERIALIZED_NAME_SCHOOLS)
  private List<String> schools = null;

  public static final String SERIALIZED_NAME_SIS_ID = "sis_id";
  @SerializedName(SERIALIZED_NAME_SIS_ID)
  private String sisId;

  public static final String SERIALIZED_NAME_STATE_ID = "state_id";
  @SerializedName(SERIALIZED_NAME_STATE_ID)
  private String stateId;

  public static final String SERIALIZED_NAME_TEACHER_NUMBER = "teacher_number";
  @SerializedName(SERIALIZED_NAME_TEACHER_NUMBER)
  private String teacherNumber;

  public Teacher() {
  }

  public Teacher title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public Teacher created(String created) {
    
    
    
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreated() {
    return created;
  }


  public void setCreated(String created) {
    
    
    
    this.created = created;
  }


  public Teacher credentials(Credentials credentials) {
    
    
    
    
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Credentials getCredentials() {
    return credentials;
  }


  public void setCredentials(Credentials credentials) {
    
    
    
    this.credentials = credentials;
  }


  public Teacher district(String district) {
    
    
    
    
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDistrict() {
    return district;
  }


  public void setDistrict(String district) {
    
    
    
    this.district = district;
  }


  public Teacher ext(Object ext) {
    
    
    
    
    this.ext = ext;
    return this;
  }

   /**
   * Get ext
   * @return ext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getExt() {
    return ext;
  }


  public void setExt(Object ext) {
    
    
    
    this.ext = ext;
  }


  public Teacher lastModified(String lastModified) {
    
    
    
    
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Get lastModified
   * @return lastModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastModified() {
    return lastModified;
  }


  public void setLastModified(String lastModified) {
    
    
    
    this.lastModified = lastModified;
  }


  public Teacher legacyId(String legacyId) {
    
    
    
    
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


  public Teacher name(Name name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Name getName() {
    return name;
  }


  public void setName(Name name) {
    
    
    
    this.name = name;
  }


  public Teacher school(String school) {
    
    
    
    
    this.school = school;
    return this;
  }

   /**
   * Get school
   * @return school
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSchool() {
    return school;
  }


  public void setSchool(String school) {
    
    
    
    this.school = school;
  }


  public Teacher schools(List<String> schools) {
    
    
    
    
    this.schools = schools;
    return this;
  }

  public Teacher addSchoolsItem(String schoolsItem) {
    if (this.schools == null) {
      this.schools = new ArrayList<>();
    }
    this.schools.add(schoolsItem);
    return this;
  }

   /**
   * Get schools
   * @return schools
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSchools() {
    return schools;
  }


  public void setSchools(List<String> schools) {
    
    
    
    this.schools = schools;
  }


  public Teacher sisId(String sisId) {
    
    
    
    
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


  public Teacher stateId(String stateId) {
    
    
    
    
    this.stateId = stateId;
    return this;
  }

   /**
   * Get stateId
   * @return stateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStateId() {
    return stateId;
  }


  public void setStateId(String stateId) {
    
    
    
    this.stateId = stateId;
  }


  public Teacher teacherNumber(String teacherNumber) {
    
    
    
    
    this.teacherNumber = teacherNumber;
    return this;
  }

   /**
   * Get teacherNumber
   * @return teacherNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTeacherNumber() {
    return teacherNumber;
  }


  public void setTeacherNumber(String teacherNumber) {
    
    
    
    this.teacherNumber = teacherNumber;
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
   * @return the Teacher instance itself
   */
  public Teacher putAdditionalProperty(String key, Object value) {
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
    Teacher teacher = (Teacher) o;
    return Objects.equals(this.title, teacher.title) &&
        Objects.equals(this.created, teacher.created) &&
        Objects.equals(this.credentials, teacher.credentials) &&
        Objects.equals(this.district, teacher.district) &&
        Objects.equals(this.ext, teacher.ext) &&
        Objects.equals(this.lastModified, teacher.lastModified) &&
        Objects.equals(this.legacyId, teacher.legacyId) &&
        Objects.equals(this.name, teacher.name) &&
        Objects.equals(this.school, teacher.school) &&
        Objects.equals(this.schools, teacher.schools) &&
        Objects.equals(this.sisId, teacher.sisId) &&
        Objects.equals(this.stateId, teacher.stateId) &&
        Objects.equals(this.teacherNumber, teacher.teacherNumber)&&
        Objects.equals(this.additionalProperties, teacher.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, created, credentials, district, ext, lastModified, legacyId, name, school, schools, sisId, stateId, teacherNumber, additionalProperties);
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
    sb.append("class Teacher {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    legacyId: ").append(toIndentedString(legacyId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    school: ").append(toIndentedString(school)).append("\n");
    sb.append("    schools: ").append(toIndentedString(schools)).append("\n");
    sb.append("    sisId: ").append(toIndentedString(sisId)).append("\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
    sb.append("    teacherNumber: ").append(toIndentedString(teacherNumber)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("created");
    openapiFields.add("credentials");
    openapiFields.add("district");
    openapiFields.add("ext");
    openapiFields.add("last_modified");
    openapiFields.add("legacy_id");
    openapiFields.add("name");
    openapiFields.add("school");
    openapiFields.add("schools");
    openapiFields.add("sis_id");
    openapiFields.add("state_id");
    openapiFields.add("teacher_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Teacher
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Teacher.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Teacher is not found in the empty JSON string", Teacher.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("title").isJsonNull() && (jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("created") != null && !jsonObj.get("created").isJsonNull()) && !jsonObj.get("created").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created").toString()));
      }
      // validate the optional field `credentials`
      if (jsonObj.get("credentials") != null && !jsonObj.get("credentials").isJsonNull()) {
        Credentials.validateJsonObject(jsonObj.getAsJsonObject("credentials"));
      }
      if ((jsonObj.get("district") != null && !jsonObj.get("district").isJsonNull()) && !jsonObj.get("district").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `district` to be a primitive type in the JSON string but got `%s`", jsonObj.get("district").toString()));
      }
      if ((jsonObj.get("last_modified") != null && !jsonObj.get("last_modified").isJsonNull()) && !jsonObj.get("last_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_modified").toString()));
      }
      if ((jsonObj.get("legacy_id") != null && !jsonObj.get("legacy_id").isJsonNull()) && !jsonObj.get("legacy_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legacy_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legacy_id").toString()));
      }
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        Name.validateJsonObject(jsonObj.getAsJsonObject("name"));
      }
      if ((jsonObj.get("school") != null && !jsonObj.get("school").isJsonNull()) && !jsonObj.get("school").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `school` to be a primitive type in the JSON string but got `%s`", jsonObj.get("school").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("schools") != null && !jsonObj.get("schools").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schools` to be an array in the JSON string but got `%s`", jsonObj.get("schools").toString()));
      }
      if ((jsonObj.get("sis_id") != null && !jsonObj.get("sis_id").isJsonNull()) && !jsonObj.get("sis_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sis_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sis_id").toString()));
      }
      if (!jsonObj.get("state_id").isJsonNull() && (jsonObj.get("state_id") != null && !jsonObj.get("state_id").isJsonNull()) && !jsonObj.get("state_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state_id").toString()));
      }
      if (!jsonObj.get("teacher_number").isJsonNull() && (jsonObj.get("teacher_number") != null && !jsonObj.get("teacher_number").isJsonNull()) && !jsonObj.get("teacher_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `teacher_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("teacher_number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Teacher.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Teacher' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Teacher> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Teacher.class));

       return (TypeAdapter<T>) new TypeAdapter<Teacher>() {
           @Override
           public void write(JsonWriter out, Teacher value) throws IOException {
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
           public Teacher read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Teacher instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Teacher given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Teacher
  * @throws IOException if the JSON string is invalid with respect to Teacher
  */
  public static Teacher fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Teacher.class);
  }

 /**
  * Convert an instance of Teacher to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

