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
 * V1alpha1OpsRequestSpecSwitchoverInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1OpsRequestSpecSwitchoverInner {
  public static final String SERIALIZED_NAME_COMPONENT_NAME = "componentName";
  @SerializedName(SERIALIZED_NAME_COMPONENT_NAME)
  private String componentName;

  public static final String SERIALIZED_NAME_INSTANCE_NAME = "instanceName";
  @SerializedName(SERIALIZED_NAME_INSTANCE_NAME)
  private String instanceName;

  public V1alpha1OpsRequestSpecSwitchoverInner() {
  }

  public V1alpha1OpsRequestSpecSwitchoverInner componentName(String componentName) {
    
    this.componentName = componentName;
    return this;
  }

   /**
   * componentName cluster component name.
   * @return componentName
  **/
  @jakarta.annotation.Nonnull
  public String getComponentName() {
    return componentName;
  }


  public void setComponentName(String componentName) {
    this.componentName = componentName;
  }


  public V1alpha1OpsRequestSpecSwitchoverInner instanceName(String instanceName) {
    
    this.instanceName = instanceName;
    return this;
  }

   /**
   * instanceName is used to specify the candidate primary or leader instanceName for switchover. If instanceName is set to \&quot;*\&quot;, it means that no specific primary or leader is specified for the switchover, and the switchoverAction defined in clusterDefinition.componentDefs[x].switchoverSpec.withoutCandidate will be executed, It is required that clusterDefinition.componentDefs[x].switchoverSpec.withoutCandidate is not empty. If instanceName is set to a valid instanceName other than \&quot;*\&quot;, it means that a specific candidate primary or leader is specified for the switchover. the value of instanceName can be obtained using &#x60;kbcli cluster list-instances&#x60;, any other value is invalid. In this case, the &#x60;switchoverAction&#x60; defined in clusterDefinition.componentDefs[x].switchoverSpec.withCandidate will be executed, and it is required that clusterDefinition.componentDefs[x].switchoverSpec.withCandidate is not empty.
   * @return instanceName
  **/
  @jakarta.annotation.Nonnull
  public String getInstanceName() {
    return instanceName;
  }


  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsRequestSpecSwitchoverInner v1alpha1OpsRequestSpecSwitchoverInner = (V1alpha1OpsRequestSpecSwitchoverInner) o;
    return Objects.equals(this.componentName, v1alpha1OpsRequestSpecSwitchoverInner.componentName) &&
        Objects.equals(this.instanceName, v1alpha1OpsRequestSpecSwitchoverInner.instanceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentName, instanceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsRequestSpecSwitchoverInner {\n");
    sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
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
    openapiFields.add("componentName");
    openapiFields.add("instanceName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("componentName");
    openapiRequiredFields.add("instanceName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsRequestSpecSwitchoverInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsRequestSpecSwitchoverInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsRequestSpecSwitchoverInner is not found in the empty JSON string", V1alpha1OpsRequestSpecSwitchoverInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsRequestSpecSwitchoverInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsRequestSpecSwitchoverInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsRequestSpecSwitchoverInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("componentName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `componentName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("componentName").toString()));
      }
      if (!jsonObj.get("instanceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instanceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instanceName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsRequestSpecSwitchoverInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsRequestSpecSwitchoverInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsRequestSpecSwitchoverInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsRequestSpecSwitchoverInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsRequestSpecSwitchoverInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsRequestSpecSwitchoverInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsRequestSpecSwitchoverInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsRequestSpecSwitchoverInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsRequestSpecSwitchoverInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsRequestSpecSwitchoverInner
  */
  public static V1alpha1OpsRequestSpecSwitchoverInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsRequestSpecSwitchoverInner.class);
  }

 /**
  * Convert an instance of V1alpha1OpsRequestSpecSwitchoverInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

