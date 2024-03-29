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
import com.konfigthis.client.model.DistrictContact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
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
 * District
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class District {
  public static final String SERIALIZED_NAME_DISTRICT_CONTACT = "district_contact";
  @SerializedName(SERIALIZED_NAME_DISTRICT_CONTACT)
  private DistrictContact districtContact;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LAST_SYNC = "last_sync";
  @SerializedName(SERIALIZED_NAME_LAST_SYNC)
  private String lastSync;

  public static final String SERIALIZED_NAME_LAUNCH_DATE = "launch_date";
  @SerializedName(SERIALIZED_NAME_LAUNCH_DATE)
  private LocalDate launchDate;

  /**
   * Gets or Sets lmsState
   */
  @JsonAdapter(LmsStateEnum.Adapter.class)
 public enum LmsStateEnum {
    MATCHING_IN_PROGRESS("matching_in_progress"),
    
    ERROR("error"),
    
    DISCONNECTED("disconnected"),
    
    EMPTY(""),
    
    SUCCESS("success");

    private String value;

    LmsStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LmsStateEnum fromValue(String value) {
      for (LmsStateEnum b : LmsStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LmsStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LmsStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LmsStateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LmsStateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LMS_STATE = "lms_state";
  @SerializedName(SERIALIZED_NAME_LMS_STATE)
  private LmsStateEnum lmsState;

  public static final String SERIALIZED_NAME_LOGIN_METHODS = "login_methods";
  @SerializedName(SERIALIZED_NAME_LOGIN_METHODS)
  private List<String> loginMethods = null;

  public static final String SERIALIZED_NAME_MDR_NUMBER = "mdr_number";
  @SerializedName(SERIALIZED_NAME_MDR_NUMBER)
  private String mdrNumber;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NCES_ID = "nces_id";
  @SerializedName(SERIALIZED_NAME_NCES_ID)
  private String ncesId;

  public static final String SERIALIZED_NAME_PAUSE_END = "pause_end";
  @SerializedName(SERIALIZED_NAME_PAUSE_END)
  private String pauseEnd;

  public static final String SERIALIZED_NAME_PAUSE_START = "pause_start";
  @SerializedName(SERIALIZED_NAME_PAUSE_START)
  private String pauseStart;

  public static final String SERIALIZED_NAME_PORTAL_URL = "portal_url";
  @SerializedName(SERIALIZED_NAME_PORTAL_URL)
  private String portalUrl;

  public static final String SERIALIZED_NAME_SIS_TYPE = "sis_type";
  @SerializedName(SERIALIZED_NAME_SIS_TYPE)
  private String sisType;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
 public enum StateEnum {
    RUNNING("running"),
    
    PENDING("pending"),
    
    ERROR("error"),
    
    PAUSED("paused"),
    
    EMPTY(""),
    
    SUCCESS("success");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public District() {
  }

  public District districtContact(DistrictContact districtContact) {
    
    
    
    
    this.districtContact = districtContact;
    return this;
  }

   /**
   * Get districtContact
   * @return districtContact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DistrictContact getDistrictContact() {
    return districtContact;
  }


  public void setDistrictContact(DistrictContact districtContact) {
    
    
    
    this.districtContact = districtContact;
  }


  public District error(String error) {
    
    
    
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getError() {
    return error;
  }


  public void setError(String error) {
    
    
    
    this.error = error;
  }


  public District id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public District lastSync(String lastSync) {
    
    
    
    
    this.lastSync = lastSync;
    return this;
  }

   /**
   * Get lastSync
   * @return lastSync
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastSync() {
    return lastSync;
  }


  public void setLastSync(String lastSync) {
    
    
    
    this.lastSync = lastSync;
  }


  public District launchDate(LocalDate launchDate) {
    
    
    
    
    this.launchDate = launchDate;
    return this;
  }

   /**
   * Get launchDate
   * @return launchDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getLaunchDate() {
    return launchDate;
  }


  public void setLaunchDate(LocalDate launchDate) {
    
    
    
    this.launchDate = launchDate;
  }


  public District lmsState(LmsStateEnum lmsState) {
    
    
    
    
    this.lmsState = lmsState;
    return this;
  }

   /**
   * Get lmsState
   * @return lmsState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LmsStateEnum getLmsState() {
    return lmsState;
  }


  public void setLmsState(LmsStateEnum lmsState) {
    
    
    
    this.lmsState = lmsState;
  }


  public District loginMethods(List<String> loginMethods) {
    
    
    
    
    this.loginMethods = loginMethods;
    return this;
  }

  public District addLoginMethodsItem(String loginMethodsItem) {
    if (this.loginMethods == null) {
      this.loginMethods = new ArrayList<>();
    }
    this.loginMethods.add(loginMethodsItem);
    return this;
  }

   /**
   * Get loginMethods
   * @return loginMethods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLoginMethods() {
    return loginMethods;
  }


  public void setLoginMethods(List<String> loginMethods) {
    
    
    
    this.loginMethods = loginMethods;
  }


  public District mdrNumber(String mdrNumber) {
    
    
    
    
    this.mdrNumber = mdrNumber;
    return this;
  }

   /**
   * Get mdrNumber
   * @return mdrNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMdrNumber() {
    return mdrNumber;
  }


  public void setMdrNumber(String mdrNumber) {
    
    
    
    this.mdrNumber = mdrNumber;
  }


  public District name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public District ncesId(String ncesId) {
    
    
    
    
    this.ncesId = ncesId;
    return this;
  }

   /**
   * Get ncesId
   * @return ncesId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNcesId() {
    return ncesId;
  }


  public void setNcesId(String ncesId) {
    
    
    
    this.ncesId = ncesId;
  }


  public District pauseEnd(String pauseEnd) {
    
    
    
    
    this.pauseEnd = pauseEnd;
    return this;
  }

   /**
   * Get pauseEnd
   * @return pauseEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPauseEnd() {
    return pauseEnd;
  }


  public void setPauseEnd(String pauseEnd) {
    
    
    
    this.pauseEnd = pauseEnd;
  }


  public District pauseStart(String pauseStart) {
    
    
    
    
    this.pauseStart = pauseStart;
    return this;
  }

   /**
   * Get pauseStart
   * @return pauseStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPauseStart() {
    return pauseStart;
  }


  public void setPauseStart(String pauseStart) {
    
    
    
    this.pauseStart = pauseStart;
  }


  public District portalUrl(String portalUrl) {
    
    
    
    
    this.portalUrl = portalUrl;
    return this;
  }

   /**
   * Get portalUrl
   * @return portalUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPortalUrl() {
    return portalUrl;
  }


  public void setPortalUrl(String portalUrl) {
    
    
    
    this.portalUrl = portalUrl;
  }


  public District sisType(String sisType) {
    
    
    
    
    this.sisType = sisType;
    return this;
  }

   /**
   * Get sisType
   * @return sisType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSisType() {
    return sisType;
  }


  public void setSisType(String sisType) {
    
    
    
    this.sisType = sisType;
  }


  public District state(StateEnum state) {
    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    
    
    
    this.state = state;
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
   * @return the District instance itself
   */
  public District putAdditionalProperty(String key, Object value) {
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
    District district = (District) o;
    return Objects.equals(this.districtContact, district.districtContact) &&
        Objects.equals(this.error, district.error) &&
        Objects.equals(this.id, district.id) &&
        Objects.equals(this.lastSync, district.lastSync) &&
        Objects.equals(this.launchDate, district.launchDate) &&
        Objects.equals(this.lmsState, district.lmsState) &&
        Objects.equals(this.loginMethods, district.loginMethods) &&
        Objects.equals(this.mdrNumber, district.mdrNumber) &&
        Objects.equals(this.name, district.name) &&
        Objects.equals(this.ncesId, district.ncesId) &&
        Objects.equals(this.pauseEnd, district.pauseEnd) &&
        Objects.equals(this.pauseStart, district.pauseStart) &&
        Objects.equals(this.portalUrl, district.portalUrl) &&
        Objects.equals(this.sisType, district.sisType) &&
        Objects.equals(this.state, district.state)&&
        Objects.equals(this.additionalProperties, district.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(districtContact, error, id, lastSync, launchDate, lmsState, loginMethods, mdrNumber, name, ncesId, pauseEnd, pauseStart, portalUrl, sisType, state, additionalProperties);
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
    sb.append("class District {\n");
    sb.append("    districtContact: ").append(toIndentedString(districtContact)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastSync: ").append(toIndentedString(lastSync)).append("\n");
    sb.append("    launchDate: ").append(toIndentedString(launchDate)).append("\n");
    sb.append("    lmsState: ").append(toIndentedString(lmsState)).append("\n");
    sb.append("    loginMethods: ").append(toIndentedString(loginMethods)).append("\n");
    sb.append("    mdrNumber: ").append(toIndentedString(mdrNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ncesId: ").append(toIndentedString(ncesId)).append("\n");
    sb.append("    pauseEnd: ").append(toIndentedString(pauseEnd)).append("\n");
    sb.append("    pauseStart: ").append(toIndentedString(pauseStart)).append("\n");
    sb.append("    portalUrl: ").append(toIndentedString(portalUrl)).append("\n");
    sb.append("    sisType: ").append(toIndentedString(sisType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
    openapiFields.add("district_contact");
    openapiFields.add("error");
    openapiFields.add("id");
    openapiFields.add("last_sync");
    openapiFields.add("launch_date");
    openapiFields.add("lms_state");
    openapiFields.add("login_methods");
    openapiFields.add("mdr_number");
    openapiFields.add("name");
    openapiFields.add("nces_id");
    openapiFields.add("pause_end");
    openapiFields.add("pause_start");
    openapiFields.add("portal_url");
    openapiFields.add("sis_type");
    openapiFields.add("state");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to District
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!District.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in District is not found in the empty JSON string", District.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `district_contact`
      if (jsonObj.get("district_contact") != null && !jsonObj.get("district_contact").isJsonNull()) {
        DistrictContact.validateJsonObject(jsonObj.getAsJsonObject("district_contact"));
      }
      if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("last_sync").isJsonNull() && (jsonObj.get("last_sync") != null && !jsonObj.get("last_sync").isJsonNull()) && !jsonObj.get("last_sync").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_sync` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_sync").toString()));
      }
      if (!jsonObj.get("lms_state").isJsonNull() && (jsonObj.get("lms_state") != null && !jsonObj.get("lms_state").isJsonNull()) && !jsonObj.get("lms_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lms_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lms_state").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("login_methods") != null && !jsonObj.get("login_methods").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `login_methods` to be an array in the JSON string but got `%s`", jsonObj.get("login_methods").toString()));
      }
      if (!jsonObj.get("mdr_number").isJsonNull() && (jsonObj.get("mdr_number") != null && !jsonObj.get("mdr_number").isJsonNull()) && !jsonObj.get("mdr_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mdr_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mdr_number").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("nces_id").isJsonNull() && (jsonObj.get("nces_id") != null && !jsonObj.get("nces_id").isJsonNull()) && !jsonObj.get("nces_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nces_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nces_id").toString()));
      }
      if (!jsonObj.get("pause_end").isJsonNull() && (jsonObj.get("pause_end") != null && !jsonObj.get("pause_end").isJsonNull()) && !jsonObj.get("pause_end").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pause_end` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pause_end").toString()));
      }
      if (!jsonObj.get("pause_start").isJsonNull() && (jsonObj.get("pause_start") != null && !jsonObj.get("pause_start").isJsonNull()) && !jsonObj.get("pause_start").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pause_start` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pause_start").toString()));
      }
      if ((jsonObj.get("portal_url") != null && !jsonObj.get("portal_url").isJsonNull()) && !jsonObj.get("portal_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `portal_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("portal_url").toString()));
      }
      if ((jsonObj.get("sis_type") != null && !jsonObj.get("sis_type").isJsonNull()) && !jsonObj.get("sis_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sis_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sis_type").toString()));
      }
      if (!jsonObj.get("state").isJsonNull() && (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!District.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'District' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<District> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(District.class));

       return (TypeAdapter<T>) new TypeAdapter<District>() {
           @Override
           public void write(JsonWriter out, District value) throws IOException {
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
           public District read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             District instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of District given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of District
  * @throws IOException if the JSON string is invalid with respect to District
  */
  public static District fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, District.class);
  }

 /**
  * Convert an instance of District to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

