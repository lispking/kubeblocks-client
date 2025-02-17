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
import io.kubeblocks.apps.models.V1alpha1OpsRequestSpecReconfigureConfigurationsInnerKeysInner;
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
 * V1alpha1OpsRequestSpecReconfigureConfigurationsInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1OpsRequestSpecReconfigureConfigurationsInner {
  public static final String SERIALIZED_NAME_KEYS = "keys";
  @SerializedName(SERIALIZED_NAME_KEYS)
  private List<V1alpha1OpsRequestSpecReconfigureConfigurationsInnerKeysInner> keys = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * policy defines the upgrade policy.
   */
  @JsonAdapter(PolicyEnum.Adapter.class)
  public enum PolicyEnum {
    SIMPLE("simple"),
    
    PARALLEL("parallel"),
    
    ROLLING("rolling"),
    
    AUTORELOAD("autoReload"),
    
    OPERATORSYNCUPDATE("operatorSyncUpdate");

    private String value;

    PolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PolicyEnum fromValue(String value) {
      for (PolicyEnum b : PolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PolicyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private PolicyEnum policy;

  public V1alpha1OpsRequestSpecReconfigureConfigurationsInner() {
  }

  public V1alpha1OpsRequestSpecReconfigureConfigurationsInner keys(List<V1alpha1OpsRequestSpecReconfigureConfigurationsInnerKeysInner> keys) {
    
    this.keys = keys;
    return this;
  }

  public V1alpha1OpsRequestSpecReconfigureConfigurationsInner addKeysItem(V1alpha1OpsRequestSpecReconfigureConfigurationsInnerKeysInner keysItem) {
    if (this.keys == null) {
      this.keys = new ArrayList<>();
    }
    this.keys.add(keysItem);
    return this;
  }

   /**
   * keys is used to set the parameters to be updated.
   * @return keys
  **/
  @jakarta.annotation.Nonnull
  public List<V1alpha1OpsRequestSpecReconfigureConfigurationsInnerKeysInner> getKeys() {
    return keys;
  }


  public void setKeys(List<V1alpha1OpsRequestSpecReconfigureConfigurationsInnerKeysInner> keys) {
    this.keys = keys;
  }


  public V1alpha1OpsRequestSpecReconfigureConfigurationsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name is a config template name.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1OpsRequestSpecReconfigureConfigurationsInner policy(PolicyEnum policy) {
    
    this.policy = policy;
    return this;
  }

   /**
   * policy defines the upgrade policy.
   * @return policy
  **/
  @jakarta.annotation.Nullable
  public PolicyEnum getPolicy() {
    return policy;
  }


  public void setPolicy(PolicyEnum policy) {
    this.policy = policy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsRequestSpecReconfigureConfigurationsInner v1alpha1OpsRequestSpecReconfigureConfigurationsInner = (V1alpha1OpsRequestSpecReconfigureConfigurationsInner) o;
    return Objects.equals(this.keys, v1alpha1OpsRequestSpecReconfigureConfigurationsInner.keys) &&
        Objects.equals(this.name, v1alpha1OpsRequestSpecReconfigureConfigurationsInner.name) &&
        Objects.equals(this.policy, v1alpha1OpsRequestSpecReconfigureConfigurationsInner.policy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keys, name, policy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsRequestSpecReconfigureConfigurationsInner {\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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
    openapiFields.add("keys");
    openapiFields.add("name");
    openapiFields.add("policy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("keys");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsRequestSpecReconfigureConfigurationsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsRequestSpecReconfigureConfigurationsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsRequestSpecReconfigureConfigurationsInner is not found in the empty JSON string", V1alpha1OpsRequestSpecReconfigureConfigurationsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsRequestSpecReconfigureConfigurationsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsRequestSpecReconfigureConfigurationsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsRequestSpecReconfigureConfigurationsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("keys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `keys` to be an array in the JSON string but got `%s`", jsonObj.get("keys").toString()));
      }

      JsonArray jsonArraykeys = jsonObj.getAsJsonArray("keys");
      // validate the required field `keys` (array)
      for (int i = 0; i < jsonArraykeys.size(); i++) {
        V1alpha1OpsRequestSpecReconfigureConfigurationsInnerKeysInner.validateJsonObject(jsonArraykeys.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("policy") != null && !jsonObj.get("policy").isJsonNull()) && !jsonObj.get("policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsRequestSpecReconfigureConfigurationsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsRequestSpecReconfigureConfigurationsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsRequestSpecReconfigureConfigurationsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsRequestSpecReconfigureConfigurationsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsRequestSpecReconfigureConfigurationsInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsRequestSpecReconfigureConfigurationsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsRequestSpecReconfigureConfigurationsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsRequestSpecReconfigureConfigurationsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsRequestSpecReconfigureConfigurationsInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsRequestSpecReconfigureConfigurationsInner
  */
  public static V1alpha1OpsRequestSpecReconfigureConfigurationsInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsRequestSpecReconfigureConfigurationsInner.class);
  }

 /**
  * Convert an instance of V1alpha1OpsRequestSpecReconfigureConfigurationsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

