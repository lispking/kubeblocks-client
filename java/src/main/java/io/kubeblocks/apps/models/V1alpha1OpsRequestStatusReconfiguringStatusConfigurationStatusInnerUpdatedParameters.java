/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.27.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubeblocks.apps.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * updatedParameters describes the updated parameters.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters {
  public static final String SERIALIZED_NAME_ADDED_KEYS = "addedKeys";
  @SerializedName(SERIALIZED_NAME_ADDED_KEYS)
  private Map<String, String> addedKeys = new HashMap<>();

  public static final String SERIALIZED_NAME_DELETED_KEYS = "deletedKeys";
  @SerializedName(SERIALIZED_NAME_DELETED_KEYS)
  private Map<String, String> deletedKeys = new HashMap<>();

  public static final String SERIALIZED_NAME_UPDATED_KEYS = "updatedKeys";
  @SerializedName(SERIALIZED_NAME_UPDATED_KEYS)
  private Map<String, String> updatedKeys = new HashMap<>();

  public V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters() {
  }

  public V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters addedKeys(Map<String, String> addedKeys) {
    
    this.addedKeys = addedKeys;
    return this;
  }

  public V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters putAddedKeysItem(String key, String addedKeysItem) {
    if (this.addedKeys == null) {
      this.addedKeys = new HashMap<>();
    }
    this.addedKeys.put(key, addedKeysItem);
    return this;
  }

   /**
   * addedKeys describes the key added.
   * @return addedKeys
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getAddedKeys() {
    return addedKeys;
  }


  public void setAddedKeys(Map<String, String> addedKeys) {
    this.addedKeys = addedKeys;
  }


  public V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters deletedKeys(Map<String, String> deletedKeys) {
    
    this.deletedKeys = deletedKeys;
    return this;
  }

  public V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters putDeletedKeysItem(String key, String deletedKeysItem) {
    if (this.deletedKeys == null) {
      this.deletedKeys = new HashMap<>();
    }
    this.deletedKeys.put(key, deletedKeysItem);
    return this;
  }

   /**
   * deletedKeys describes the key deleted.
   * @return deletedKeys
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getDeletedKeys() {
    return deletedKeys;
  }


  public void setDeletedKeys(Map<String, String> deletedKeys) {
    this.deletedKeys = deletedKeys;
  }


  public V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters updatedKeys(Map<String, String> updatedKeys) {
    
    this.updatedKeys = updatedKeys;
    return this;
  }

  public V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters putUpdatedKeysItem(String key, String updatedKeysItem) {
    if (this.updatedKeys == null) {
      this.updatedKeys = new HashMap<>();
    }
    this.updatedKeys.put(key, updatedKeysItem);
    return this;
  }

   /**
   * updatedKeys describes the key updated.
   * @return updatedKeys
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getUpdatedKeys() {
    return updatedKeys;
  }


  public void setUpdatedKeys(Map<String, String> updatedKeys) {
    this.updatedKeys = updatedKeys;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters v1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters = (V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters) o;
    return Objects.equals(this.addedKeys, v1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters.addedKeys) &&
        Objects.equals(this.deletedKeys, v1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters.deletedKeys) &&
        Objects.equals(this.updatedKeys, v1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters.updatedKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addedKeys, deletedKeys, updatedKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters {\n");
    sb.append("    addedKeys: ").append(toIndentedString(addedKeys)).append("\n");
    sb.append("    deletedKeys: ").append(toIndentedString(deletedKeys)).append("\n");
    sb.append("    updatedKeys: ").append(toIndentedString(updatedKeys)).append("\n");
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
    openapiFields.add("addedKeys");
    openapiFields.add("deletedKeys");
    openapiFields.add("updatedKeys");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters is not found in the empty JSON string", V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters
  */
  public static V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters.class);
  }

 /**
  * Convert an instance of V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInnerUpdatedParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

