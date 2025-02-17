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
import io.kubeblocks.apps.models.V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitorExporterConfig;
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
 * monitor is monitoring config which provided by provider.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor {
  public static final String SERIALIZED_NAME_BUILT_IN = "builtIn";
  @SerializedName(SERIALIZED_NAME_BUILT_IN)
  private Boolean builtIn;

  public static final String SERIALIZED_NAME_EXPORTER_CONFIG = "exporterConfig";
  @SerializedName(SERIALIZED_NAME_EXPORTER_CONFIG)
  private V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitorExporterConfig exporterConfig;

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor() {
  }

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor builtIn(Boolean builtIn) {
    
    this.builtIn = builtIn;
    return this;
  }

   /**
   * builtIn is a switch to enable KubeBlocks builtIn monitoring. If BuiltIn is set to true, monitor metrics will be scraped automatically. If BuiltIn is set to false, the provider should set ExporterConfig and Sidecar container own.
   * @return builtIn
  **/
  @jakarta.annotation.Nullable
  public Boolean getBuiltIn() {
    return builtIn;
  }


  public void setBuiltIn(Boolean builtIn) {
    this.builtIn = builtIn;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor exporterConfig(V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitorExporterConfig exporterConfig) {
    
    this.exporterConfig = exporterConfig;
    return this;
  }

   /**
   * Get exporterConfig
   * @return exporterConfig
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitorExporterConfig getExporterConfig() {
    return exporterConfig;
  }


  public void setExporterConfig(V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitorExporterConfig exporterConfig) {
    this.exporterConfig = exporterConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor v1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor = (V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor) o;
    return Objects.equals(this.builtIn, v1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor.builtIn) &&
        Objects.equals(this.exporterConfig, v1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor.exporterConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(builtIn, exporterConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor {\n");
    sb.append("    builtIn: ").append(toIndentedString(builtIn)).append("\n");
    sb.append("    exporterConfig: ").append(toIndentedString(exporterConfig)).append("\n");
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
    openapiFields.add("builtIn");
    openapiFields.add("exporterConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor is not found in the empty JSON string", V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `exporterConfig`
      if (jsonObj.get("exporterConfig") != null && !jsonObj.get("exporterConfig").isJsonNull()) {
        V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitorExporterConfig.validateJsonObject(jsonObj.getAsJsonObject("exporterConfig"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor
  */
  public static V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerMonitor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

