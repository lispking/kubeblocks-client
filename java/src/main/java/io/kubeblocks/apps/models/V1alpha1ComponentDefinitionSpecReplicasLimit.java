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
 * ReplicasLimit defines the limit of valid replicas supported. Cannot be updated.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1ComponentDefinitionSpecReplicasLimit {
  public static final String SERIALIZED_NAME_MAX_REPLICAS = "maxReplicas";
  @SerializedName(SERIALIZED_NAME_MAX_REPLICAS)
  private Integer maxReplicas;

  public static final String SERIALIZED_NAME_MIN_REPLICAS = "minReplicas";
  @SerializedName(SERIALIZED_NAME_MIN_REPLICAS)
  private Integer minReplicas;

  public V1alpha1ComponentDefinitionSpecReplicasLimit() {
  }

  public V1alpha1ComponentDefinitionSpecReplicasLimit maxReplicas(Integer maxReplicas) {
    
    this.maxReplicas = maxReplicas;
    return this;
  }

   /**
   * The maximum limit of replicas.
   * @return maxReplicas
  **/
  @jakarta.annotation.Nonnull
  public Integer getMaxReplicas() {
    return maxReplicas;
  }


  public void setMaxReplicas(Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
  }


  public V1alpha1ComponentDefinitionSpecReplicasLimit minReplicas(Integer minReplicas) {
    
    this.minReplicas = minReplicas;
    return this;
  }

   /**
   * The minimum limit of replicas.
   * @return minReplicas
  **/
  @jakarta.annotation.Nonnull
  public Integer getMinReplicas() {
    return minReplicas;
  }


  public void setMinReplicas(Integer minReplicas) {
    this.minReplicas = minReplicas;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentDefinitionSpecReplicasLimit v1alpha1ComponentDefinitionSpecReplicasLimit = (V1alpha1ComponentDefinitionSpecReplicasLimit) o;
    return Objects.equals(this.maxReplicas, v1alpha1ComponentDefinitionSpecReplicasLimit.maxReplicas) &&
        Objects.equals(this.minReplicas, v1alpha1ComponentDefinitionSpecReplicasLimit.minReplicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxReplicas, minReplicas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentDefinitionSpecReplicasLimit {\n");
    sb.append("    maxReplicas: ").append(toIndentedString(maxReplicas)).append("\n");
    sb.append("    minReplicas: ").append(toIndentedString(minReplicas)).append("\n");
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
    openapiFields.add("maxReplicas");
    openapiFields.add("minReplicas");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("maxReplicas");
    openapiRequiredFields.add("minReplicas");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentDefinitionSpecReplicasLimit
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentDefinitionSpecReplicasLimit.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentDefinitionSpecReplicasLimit is not found in the empty JSON string", V1alpha1ComponentDefinitionSpecReplicasLimit.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentDefinitionSpecReplicasLimit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentDefinitionSpecReplicasLimit` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ComponentDefinitionSpecReplicasLimit.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentDefinitionSpecReplicasLimit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentDefinitionSpecReplicasLimit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentDefinitionSpecReplicasLimit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentDefinitionSpecReplicasLimit.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentDefinitionSpecReplicasLimit>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentDefinitionSpecReplicasLimit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentDefinitionSpecReplicasLimit read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentDefinitionSpecReplicasLimit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentDefinitionSpecReplicasLimit
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentDefinitionSpecReplicasLimit
  */
  public static V1alpha1ComponentDefinitionSpecReplicasLimit fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ComponentDefinitionSpecReplicasLimit.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentDefinitionSpecReplicasLimit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

