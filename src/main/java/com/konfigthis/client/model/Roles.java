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
import com.konfigthis.client.model.Contact;
import com.konfigthis.client.model.DistrictAdmin;
import com.konfigthis.client.model.Staff;
import com.konfigthis.client.model.Student;
import com.konfigthis.client.model.Teacher;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * Roles
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Roles {
  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private Contact contact;

  public static final String SERIALIZED_NAME_DISTRICT_ADMIN = "district_admin";
  @SerializedName(SERIALIZED_NAME_DISTRICT_ADMIN)
  private DistrictAdmin districtAdmin;

  public static final String SERIALIZED_NAME_STAFF = "staff";
  @SerializedName(SERIALIZED_NAME_STAFF)
  private Staff staff;

  public static final String SERIALIZED_NAME_STUDENT = "student";
  @SerializedName(SERIALIZED_NAME_STUDENT)
  private Student student;

  public static final String SERIALIZED_NAME_TEACHER = "teacher";
  @SerializedName(SERIALIZED_NAME_TEACHER)
  private Teacher teacher;

  public Roles() {
  }

  public Roles contact(Contact contact) {
    
    
    
    
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Contact getContact() {
    return contact;
  }


  public void setContact(Contact contact) {
    
    
    
    this.contact = contact;
  }


  public Roles districtAdmin(DistrictAdmin districtAdmin) {
    
    
    
    
    this.districtAdmin = districtAdmin;
    return this;
  }

   /**
   * Get districtAdmin
   * @return districtAdmin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DistrictAdmin getDistrictAdmin() {
    return districtAdmin;
  }


  public void setDistrictAdmin(DistrictAdmin districtAdmin) {
    
    
    
    this.districtAdmin = districtAdmin;
  }


  public Roles staff(Staff staff) {
    
    
    
    
    this.staff = staff;
    return this;
  }

   /**
   * Get staff
   * @return staff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Staff getStaff() {
    return staff;
  }


  public void setStaff(Staff staff) {
    
    
    
    this.staff = staff;
  }


  public Roles student(Student student) {
    
    
    
    
    this.student = student;
    return this;
  }

   /**
   * Get student
   * @return student
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Student getStudent() {
    return student;
  }


  public void setStudent(Student student) {
    
    
    
    this.student = student;
  }


  public Roles teacher(Teacher teacher) {
    
    
    
    
    this.teacher = teacher;
    return this;
  }

   /**
   * Get teacher
   * @return teacher
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Teacher getTeacher() {
    return teacher;
  }


  public void setTeacher(Teacher teacher) {
    
    
    
    this.teacher = teacher;
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
   * @return the Roles instance itself
   */
  public Roles putAdditionalProperty(String key, Object value) {
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
    Roles roles = (Roles) o;
    return Objects.equals(this.contact, roles.contact) &&
        Objects.equals(this.districtAdmin, roles.districtAdmin) &&
        Objects.equals(this.staff, roles.staff) &&
        Objects.equals(this.student, roles.student) &&
        Objects.equals(this.teacher, roles.teacher)&&
        Objects.equals(this.additionalProperties, roles.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contact, districtAdmin, staff, student, teacher, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Roles {\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    districtAdmin: ").append(toIndentedString(districtAdmin)).append("\n");
    sb.append("    staff: ").append(toIndentedString(staff)).append("\n");
    sb.append("    student: ").append(toIndentedString(student)).append("\n");
    sb.append("    teacher: ").append(toIndentedString(teacher)).append("\n");
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
    openapiFields.add("contact");
    openapiFields.add("district_admin");
    openapiFields.add("staff");
    openapiFields.add("student");
    openapiFields.add("teacher");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Roles
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Roles.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Roles is not found in the empty JSON string", Roles.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `contact`
      if (jsonObj.get("contact") != null && !jsonObj.get("contact").isJsonNull()) {
        Contact.validateJsonObject(jsonObj.getAsJsonObject("contact"));
      }
      // validate the optional field `district_admin`
      if (jsonObj.get("district_admin") != null && !jsonObj.get("district_admin").isJsonNull()) {
        DistrictAdmin.validateJsonObject(jsonObj.getAsJsonObject("district_admin"));
      }
      // validate the optional field `staff`
      if (jsonObj.get("staff") != null && !jsonObj.get("staff").isJsonNull()) {
        Staff.validateJsonObject(jsonObj.getAsJsonObject("staff"));
      }
      // validate the optional field `student`
      if (jsonObj.get("student") != null && !jsonObj.get("student").isJsonNull()) {
        Student.validateJsonObject(jsonObj.getAsJsonObject("student"));
      }
      // validate the optional field `teacher`
      if (jsonObj.get("teacher") != null && !jsonObj.get("teacher").isJsonNull()) {
        Teacher.validateJsonObject(jsonObj.getAsJsonObject("teacher"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Roles.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Roles' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Roles> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Roles.class));

       return (TypeAdapter<T>) new TypeAdapter<Roles>() {
           @Override
           public void write(JsonWriter out, Roles value) throws IOException {
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
           public Roles read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Roles instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Roles given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Roles
  * @throws IOException if the JSON string is invalid with respect to Roles
  */
  public static Roles fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Roles.class);
  }

 /**
  * Convert an instance of Roles to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

