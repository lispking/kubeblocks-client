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
import io.kubeblocks.apps.models.V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecyclePostStart;
import io.kubeblocks.apps.models.V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecyclePreStop;
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
 * Actions that the management system should take in response to container lifecycle events. Cannot be updated.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle {
  public static final String SERIALIZED_NAME_POST_START = "postStart";
  @SerializedName(SERIALIZED_NAME_POST_START)
  private V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecyclePostStart postStart;

  public static final String SERIALIZED_NAME_PRE_STOP = "preStop";
  @SerializedName(SERIALIZED_NAME_PRE_STOP)
  private V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecyclePreStop preStop;

  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle() {
  }

  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle postStart(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecyclePostStart postStart) {
    
    this.postStart = postStart;
    return this;
  }

   /**
   * Get postStart
   * @return postStart
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecyclePostStart getPostStart() {
    return postStart;
  }


  public void setPostStart(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecyclePostStart postStart) {
    this.postStart = postStart;
  }


  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle preStop(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecyclePreStop preStop) {
    
    this.preStop = preStop;
    return this;
  }

   /**
   * Get preStop
   * @return preStop
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecyclePreStop getPreStop() {
    return preStop;
  }


  public void setPreStop(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecyclePreStop preStop) {
    this.preStop = preStop;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle v1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle = (V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle) o;
    return Objects.equals(this.postStart, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle.postStart) &&
        Objects.equals(this.preStop, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle.preStop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postStart, preStop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle {\n");
    sb.append("    postStart: ").append(toIndentedString(postStart)).append("\n");
    sb.append("    preStop: ").append(toIndentedString(preStop)).append("\n");
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
    openapiFields.add("postStart");
    openapiFields.add("preStop");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle is not found in the empty JSON string", V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `postStart`
      if (jsonObj.get("postStart") != null && !jsonObj.get("postStart").isJsonNull()) {
        V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecyclePostStart.validateJsonObject(jsonObj.getAsJsonObject("postStart"));
      }
      // validate the optional field `preStop`
      if (jsonObj.get("preStop") != null && !jsonObj.get("preStop").isJsonNull()) {
        V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecyclePreStop.validateJsonObject(jsonObj.getAsJsonObject("preStop"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle
  */
  public static V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle.class);
  }

 /**
  * Convert an instance of V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerLifecycle to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

