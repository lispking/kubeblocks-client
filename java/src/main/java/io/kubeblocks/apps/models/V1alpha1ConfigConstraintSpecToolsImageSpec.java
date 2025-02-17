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
import io.kubeblocks.apps.models.V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * toolConfig used to config init container.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1ConfigConstraintSpecToolsImageSpec {
  public static final String SERIALIZED_NAME_MOUNT_POINT = "mountPoint";
  @SerializedName(SERIALIZED_NAME_MOUNT_POINT)
  private String mountPoint;

  public static final String SERIALIZED_NAME_TOOL_CONFIGS = "toolConfigs";
  @SerializedName(SERIALIZED_NAME_TOOL_CONFIGS)
  private List<V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner> toolConfigs;

  public V1alpha1ConfigConstraintSpecToolsImageSpec() {
  }

  public V1alpha1ConfigConstraintSpecToolsImageSpec mountPoint(String mountPoint) {
    
    this.mountPoint = mountPoint;
    return this;
  }

   /**
   * mountPoint is the mount point of the scripts file.
   * @return mountPoint
  **/
  @jakarta.annotation.Nonnull
  public String getMountPoint() {
    return mountPoint;
  }


  public void setMountPoint(String mountPoint) {
    this.mountPoint = mountPoint;
  }


  public V1alpha1ConfigConstraintSpecToolsImageSpec toolConfigs(List<V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner> toolConfigs) {
    
    this.toolConfigs = toolConfigs;
    return this;
  }

  public V1alpha1ConfigConstraintSpecToolsImageSpec addToolConfigsItem(V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner toolConfigsItem) {
    if (this.toolConfigs == null) {
      this.toolConfigs = new ArrayList<>();
    }
    this.toolConfigs.add(toolConfigsItem);
    return this;
  }

   /**
   * toolConfig used to config init container.
   * @return toolConfigs
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner> getToolConfigs() {
    return toolConfigs;
  }


  public void setToolConfigs(List<V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner> toolConfigs) {
    this.toolConfigs = toolConfigs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ConfigConstraintSpecToolsImageSpec v1alpha1ConfigConstraintSpecToolsImageSpec = (V1alpha1ConfigConstraintSpecToolsImageSpec) o;
    return Objects.equals(this.mountPoint, v1alpha1ConfigConstraintSpecToolsImageSpec.mountPoint) &&
        Objects.equals(this.toolConfigs, v1alpha1ConfigConstraintSpecToolsImageSpec.toolConfigs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mountPoint, toolConfigs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ConfigConstraintSpecToolsImageSpec {\n");
    sb.append("    mountPoint: ").append(toIndentedString(mountPoint)).append("\n");
    sb.append("    toolConfigs: ").append(toIndentedString(toolConfigs)).append("\n");
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
    openapiFields.add("mountPoint");
    openapiFields.add("toolConfigs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("mountPoint");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ConfigConstraintSpecToolsImageSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ConfigConstraintSpecToolsImageSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ConfigConstraintSpecToolsImageSpec is not found in the empty JSON string", V1alpha1ConfigConstraintSpecToolsImageSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ConfigConstraintSpecToolsImageSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ConfigConstraintSpecToolsImageSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ConfigConstraintSpecToolsImageSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("mountPoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mountPoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mountPoint").toString()));
      }
      if (jsonObj.get("toolConfigs") != null && !jsonObj.get("toolConfigs").isJsonNull()) {
        JsonArray jsonArraytoolConfigs = jsonObj.getAsJsonArray("toolConfigs");
        if (jsonArraytoolConfigs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("toolConfigs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `toolConfigs` to be an array in the JSON string but got `%s`", jsonObj.get("toolConfigs").toString()));
          }

          // validate the optional field `toolConfigs` (array)
          for (int i = 0; i < jsonArraytoolConfigs.size(); i++) {
            V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner.validateJsonObject(jsonArraytoolConfigs.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ConfigConstraintSpecToolsImageSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ConfigConstraintSpecToolsImageSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ConfigConstraintSpecToolsImageSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ConfigConstraintSpecToolsImageSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ConfigConstraintSpecToolsImageSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1ConfigConstraintSpecToolsImageSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ConfigConstraintSpecToolsImageSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ConfigConstraintSpecToolsImageSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ConfigConstraintSpecToolsImageSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ConfigConstraintSpecToolsImageSpec
  */
  public static V1alpha1ConfigConstraintSpecToolsImageSpec fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ConfigConstraintSpecToolsImageSpec.class);
  }

 /**
  * Convert an instance of V1alpha1ConfigConstraintSpecToolsImageSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

