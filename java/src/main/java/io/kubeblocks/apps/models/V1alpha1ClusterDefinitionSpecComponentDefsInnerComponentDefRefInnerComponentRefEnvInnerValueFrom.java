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
 * valueFrom specifies the source of the env to be injected.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom {
  public static final String SERIALIZED_NAME_FIELD_PATH = "fieldPath";
  @SerializedName(SERIALIZED_NAME_FIELD_PATH)
  private String fieldPath;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public static final String SERIALIZED_NAME_JOIN_WITH = "joinWith";
  @SerializedName(SERIALIZED_NAME_JOIN_WITH)
  private String joinWith;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom() {
  }

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom fieldPath(String fieldPath) {
    
    this.fieldPath = fieldPath;
    return this;
  }

   /**
   * fieldRef is the jsonpath of the source to select when type is &#x60;FieldRef&#x60;. there are two objects registered in the jsonpath: &#x60;componentDef&#x60; and &#x60;components&#x60;. componentDef is the component definition object specified in &#x60;componentRef.componentDefName&#x60;. components is the component list objects referring to the component definition object.
   * @return fieldPath
  **/
  @jakarta.annotation.Nullable
  public String getFieldPath() {
    return fieldPath;
  }


  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom format(String format) {
    
    this.format = format;
    return this;
  }

   /**
   * format is the format of each headless service address. there are three builtin variables can be used as placeholder: $POD_ORDINAL, $POD_FQDN, $POD_NAME $POD_ORDINAL is the ordinal of the pod. $POD_FQDN is the fully qualified domain name of the pod. $POD_NAME is the name of the pod
   * @return format
  **/
  @jakarta.annotation.Nullable
  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom joinWith(String joinWith) {
    
    this.joinWith = joinWith;
    return this;
  }

   /**
   * joinWith is the string to join the values of headless service addresses.
   * @return joinWith
  **/
  @jakarta.annotation.Nullable
  public String getJoinWith() {
    return joinWith;
  }


  public void setJoinWith(String joinWith) {
    this.joinWith = joinWith;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * type is the type of the source to select. There are three types: &#x60;FieldRef&#x60;, &#x60;ServiceRef&#x60;, &#x60;HeadlessServiceRef&#x60;.
   * @return type
  **/
  @jakarta.annotation.Nonnull
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom v1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom = (V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom) o;
    return Objects.equals(this.fieldPath, v1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom.fieldPath) &&
        Objects.equals(this.format, v1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom.format) &&
        Objects.equals(this.joinWith, v1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom.joinWith) &&
        Objects.equals(this.type, v1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldPath, format, joinWith, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom {\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    joinWith: ").append(toIndentedString(joinWith)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("fieldPath");
    openapiFields.add("format");
    openapiFields.add("joinWith");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom is not found in the empty JSON string", V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("fieldPath") != null && !jsonObj.get("fieldPath").isJsonNull()) && !jsonObj.get("fieldPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldPath").toString()));
      }
      if ((jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) && !jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      if ((jsonObj.get("joinWith") != null && !jsonObj.get("joinWith").isJsonNull()) && !jsonObj.get("joinWith").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `joinWith` to be a primitive type in the JSON string but got `%s`", jsonObj.get("joinWith").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom
  */
  public static V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerComponentDefRefInnerComponentRefEnvInnerValueFrom to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

