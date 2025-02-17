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
 * The capabilities to add/drop when running containers. Defaults to the default set of capabilities granted by the container runtime. Note that this field cannot be set when spec.os.name is windows.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities {
  public static final String SERIALIZED_NAME_ADD = "add";
  @SerializedName(SERIALIZED_NAME_ADD)
  private List<String> add;

  public static final String SERIALIZED_NAME_DROP = "drop";
  @SerializedName(SERIALIZED_NAME_DROP)
  private List<String> drop;

  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities() {
  }

  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities add(List<String> add) {
    
    this.add = add;
    return this;
  }

  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities addAddItem(String addItem) {
    if (this.add == null) {
      this.add = new ArrayList<>();
    }
    this.add.add(addItem);
    return this;
  }

   /**
   * Added capabilities
   * @return add
  **/
  @jakarta.annotation.Nullable
  public List<String> getAdd() {
    return add;
  }


  public void setAdd(List<String> add) {
    this.add = add;
  }


  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities drop(List<String> drop) {
    
    this.drop = drop;
    return this;
  }

  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities addDropItem(String dropItem) {
    if (this.drop == null) {
      this.drop = new ArrayList<>();
    }
    this.drop.add(dropItem);
    return this;
  }

   /**
   * Removed capabilities
   * @return drop
  **/
  @jakarta.annotation.Nullable
  public List<String> getDrop() {
    return drop;
  }


  public void setDrop(List<String> drop) {
    this.drop = drop;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities v1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities = (V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities) o;
    return Objects.equals(this.add, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities.add) &&
        Objects.equals(this.drop, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities.drop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, drop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities {\n");
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
    sb.append("    drop: ").append(toIndentedString(drop)).append("\n");
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
    openapiFields.add("add");
    openapiFields.add("drop");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities is not found in the empty JSON string", V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("add") != null && !jsonObj.get("add").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `add` to be an array in the JSON string but got `%s`", jsonObj.get("add").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("drop") != null && !jsonObj.get("drop").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `drop` to be an array in the JSON string but got `%s`", jsonObj.get("drop").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities
  */
  public static V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities.class);
  }

 /**
  * Convert an instance of V1alpha1OpsDefinitionSpecJobSpecTemplateSpecContainersInnerSecurityContextCapabilities to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

