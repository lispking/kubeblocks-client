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
import io.kubeblocks.apps.models.V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinityNodeAffinity;
import io.kubeblocks.apps.models.V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinityPodAffinity;
import io.kubeblocks.apps.models.V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinityPodAntiAffinity;
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
 * If specified, the pod&#39;s scheduling constraints
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity {
  public static final String SERIALIZED_NAME_NODE_AFFINITY = "nodeAffinity";
  @SerializedName(SERIALIZED_NAME_NODE_AFFINITY)
  private V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinityNodeAffinity nodeAffinity;

  public static final String SERIALIZED_NAME_POD_AFFINITY = "podAffinity";
  @SerializedName(SERIALIZED_NAME_POD_AFFINITY)
  private V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinityPodAffinity podAffinity;

  public static final String SERIALIZED_NAME_POD_ANTI_AFFINITY = "podAntiAffinity";
  @SerializedName(SERIALIZED_NAME_POD_ANTI_AFFINITY)
  private V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity;

  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity() {
  }

  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity nodeAffinity(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinityNodeAffinity nodeAffinity) {
    
    this.nodeAffinity = nodeAffinity;
    return this;
  }

   /**
   * Get nodeAffinity
   * @return nodeAffinity
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinityNodeAffinity getNodeAffinity() {
    return nodeAffinity;
  }


  public void setNodeAffinity(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinityNodeAffinity nodeAffinity) {
    this.nodeAffinity = nodeAffinity;
  }


  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity podAffinity(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinityPodAffinity podAffinity) {
    
    this.podAffinity = podAffinity;
    return this;
  }

   /**
   * Get podAffinity
   * @return podAffinity
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinityPodAffinity getPodAffinity() {
    return podAffinity;
  }


  public void setPodAffinity(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinityPodAffinity podAffinity) {
    this.podAffinity = podAffinity;
  }


  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity podAntiAffinity(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
    
    this.podAntiAffinity = podAntiAffinity;
    return this;
  }

   /**
   * Get podAntiAffinity
   * @return podAntiAffinity
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinityPodAntiAffinity getPodAntiAffinity() {
    return podAntiAffinity;
  }


  public void setPodAntiAffinity(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
    this.podAntiAffinity = podAntiAffinity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity v1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity = (V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity) o;
    return Objects.equals(this.nodeAffinity, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity.nodeAffinity) &&
        Objects.equals(this.podAffinity, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity.podAffinity) &&
        Objects.equals(this.podAntiAffinity, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity.podAntiAffinity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeAffinity, podAffinity, podAntiAffinity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity {\n");
    sb.append("    nodeAffinity: ").append(toIndentedString(nodeAffinity)).append("\n");
    sb.append("    podAffinity: ").append(toIndentedString(podAffinity)).append("\n");
    sb.append("    podAntiAffinity: ").append(toIndentedString(podAntiAffinity)).append("\n");
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
    openapiFields.add("nodeAffinity");
    openapiFields.add("podAffinity");
    openapiFields.add("podAntiAffinity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity is not found in the empty JSON string", V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `nodeAffinity`
      if (jsonObj.get("nodeAffinity") != null && !jsonObj.get("nodeAffinity").isJsonNull()) {
        V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinityNodeAffinity.validateJsonObject(jsonObj.getAsJsonObject("nodeAffinity"));
      }
      // validate the optional field `podAffinity`
      if (jsonObj.get("podAffinity") != null && !jsonObj.get("podAffinity").isJsonNull()) {
        V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinityPodAffinity.validateJsonObject(jsonObj.getAsJsonObject("podAffinity"));
      }
      // validate the optional field `podAntiAffinity`
      if (jsonObj.get("podAntiAffinity") != null && !jsonObj.get("podAntiAffinity").isJsonNull()) {
        V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinityPodAntiAffinity.validateJsonObject(jsonObj.getAsJsonObject("podAntiAffinity"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity
  */
  public static V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity.class);
  }

 /**
  * Convert an instance of V1alpha1OpsDefinitionSpecJobSpecTemplateSpecAffinity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

