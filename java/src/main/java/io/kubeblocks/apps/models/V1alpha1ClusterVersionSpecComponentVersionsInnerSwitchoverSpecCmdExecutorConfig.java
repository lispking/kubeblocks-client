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
 * CmdExecutorConfig is the command executor config.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig {
  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private Object env;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig() {
  }

  public V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig env(Object env) {
    
    this.env = env;
    return this;
  }

   /**
   * envs is a list of environment variables.
   * @return env
  **/
  @jakarta.annotation.Nullable
  public Object getEnv() {
    return env;
  }


  public void setEnv(Object env) {
    this.env = env;
  }


  public V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * image for Connector when executing the command.
   * @return image
  **/
  @jakarta.annotation.Nonnull
  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig v1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig = (V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig) o;
    return Objects.equals(this.env, v1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig.env) &&
        Objects.equals(this.image, v1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(env, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig {\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
    openapiFields.add("env");
    openapiFields.add("image");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("image");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig is not found in the empty JSON string", V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig
  */
  public static V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

