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
 * A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<String> values;

  public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner() {
  }

  public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * key is the label key that the selector applies to.
   * @return key
  **/
  @jakarta.annotation.Nonnull
  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner operator(String operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * operator represents a key&#39;s relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
   * @return operator
  **/
  @jakarta.annotation.Nonnull
  public String getOperator() {
    return operator;
  }


  public void setOperator(String operator) {
    this.operator = operator;
  }


  public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner values(List<String> values) {
    
    this.values = values;
    return this;
  }

  public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
   * @return values
  **/
  @jakarta.annotation.Nullable
  public List<String> getValues() {
    return values;
  }


  public void setValues(List<String> values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner v1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner = (V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner) o;
    return Objects.equals(this.key, v1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner.key) &&
        Objects.equals(this.operator, v1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner.operator) &&
        Objects.equals(this.values, v1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, operator, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("operator");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("operator");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner is not found in the empty JSON string", V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (!jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner
  */
  public static V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner.class);
  }

 /**
  * Convert an instance of V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetPodSelectorMatchExpressionsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

