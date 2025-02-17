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
import io.kubeblocks.apps.models.V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicySecretRef;
import io.kubeblocks.apps.models.V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicyStatements;
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
 * provisionPolicy defines how to create account.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy {
  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";
  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicySecretRef secretRef;

  public static final String SERIALIZED_NAME_STATEMENTS = "statements";
  @SerializedName(SERIALIZED_NAME_STATEMENTS)
  private V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicyStatements statements;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy() {
  }

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * scope is the scope to provision account, and the scope could be &#x60;AnyPods&#x60; or &#x60;AllPods&#x60;.
   * @return scope
  **/
  @jakarta.annotation.Nonnull
  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy secretRef(V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicySecretRef secretRef) {
    
    this.secretRef = secretRef;
    return this;
  }

   /**
   * Get secretRef
   * @return secretRef
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicySecretRef getSecretRef() {
    return secretRef;
  }


  public void setSecretRef(V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicySecretRef secretRef) {
    this.secretRef = secretRef;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy statements(V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicyStatements statements) {
    
    this.statements = statements;
    return this;
  }

   /**
   * Get statements
   * @return statements
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicyStatements getStatements() {
    return statements;
  }


  public void setStatements(V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicyStatements statements) {
    this.statements = statements;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * type defines the way to provision an account, either &#x60;CreateByStmt&#x60; or &#x60;ReferToExisting&#x60;.
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
    V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy v1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy = (V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy) o;
    return Objects.equals(this.scope, v1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy.scope) &&
        Objects.equals(this.secretRef, v1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy.secretRef) &&
        Objects.equals(this.statements, v1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy.statements) &&
        Objects.equals(this.type, v1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, secretRef, statements, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    statements: ").append(toIndentedString(statements)).append("\n");
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
    openapiFields.add("scope");
    openapiFields.add("secretRef");
    openapiFields.add("statements");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("scope");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy is not found in the empty JSON string", V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      // validate the optional field `secretRef`
      if (jsonObj.get("secretRef") != null && !jsonObj.get("secretRef").isJsonNull()) {
        V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicySecretRef.validateJsonObject(jsonObj.getAsJsonObject("secretRef"));
      }
      // validate the optional field `statements`
      if (jsonObj.get("statements") != null && !jsonObj.get("statements").isJsonNull()) {
        V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicyStatements.validateJsonObject(jsonObj.getAsJsonObject("statements"));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy
  */
  public static V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerSystemAccountsAccountsInnerProvisionPolicy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

