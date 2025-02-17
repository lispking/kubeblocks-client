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
import io.kubeblocks.apps.models.V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerRuntimeSettingsResourcesClaimsInner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * Resources are not allowed for ephemeral containers. Ephemeral containers use spare resources already allocated to the pod.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources {
  public static final String SERIALIZED_NAME_CLAIMS = "claims";
  @SerializedName(SERIALIZED_NAME_CLAIMS)
  private List<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerRuntimeSettingsResourcesClaimsInner> claims;

  public static final String SERIALIZED_NAME_LIMITS = "limits";
  @SerializedName(SERIALIZED_NAME_LIMITS)
  private Map<String, Object> limits = new HashMap<>();

  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private Map<String, Object> requests = new HashMap<>();

  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources() {
  }

  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources claims(List<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerRuntimeSettingsResourcesClaimsInner> claims) {
    
    this.claims = claims;
    return this;
  }

  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources addClaimsItem(V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerRuntimeSettingsResourcesClaimsInner claimsItem) {
    if (this.claims == null) {
      this.claims = new ArrayList<>();
    }
    this.claims.add(claimsItem);
    return this;
  }

   /**
   * Claims lists the names of resources, defined in spec.resourceClaims, that are used by this container.   This is an alpha field and requires enabling the DynamicResourceAllocation feature gate.   This field is immutable. It can only be set for containers.
   * @return claims
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerRuntimeSettingsResourcesClaimsInner> getClaims() {
    return claims;
  }


  public void setClaims(List<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerRuntimeSettingsResourcesClaimsInner> claims) {
    this.claims = claims;
  }


  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources limits(Map<String, Object> limits) {
    
    this.limits = limits;
    return this;
  }

  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources putLimitsItem(String key, Object limitsItem) {
    if (this.limits == null) {
      this.limits = new HashMap<>();
    }
    this.limits.put(key, limitsItem);
    return this;
  }

   /**
   * Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
   * @return limits
  **/
  @jakarta.annotation.Nullable
  public Map<String, Object> getLimits() {
    return limits;
  }


  public void setLimits(Map<String, Object> limits) {
    this.limits = limits;
  }


  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources requests(Map<String, Object> requests) {
    
    this.requests = requests;
    return this;
  }

  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources putRequestsItem(String key, Object requestsItem) {
    if (this.requests == null) {
      this.requests = new HashMap<>();
    }
    this.requests.put(key, requestsItem);
    return this;
  }

   /**
   * Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. Requests cannot exceed Limits. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
   * @return requests
  **/
  @jakarta.annotation.Nullable
  public Map<String, Object> getRequests() {
    return requests;
  }


  public void setRequests(Map<String, Object> requests) {
    this.requests = requests;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources v1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources = (V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources) o;
    return Objects.equals(this.claims, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources.claims) &&
        Objects.equals(this.limits, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources.limits) &&
        Objects.equals(this.requests, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claims, limits, requests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources {\n");
    sb.append("    claims: ").append(toIndentedString(claims)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
    openapiFields.add("claims");
    openapiFields.add("limits");
    openapiFields.add("requests");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources is not found in the empty JSON string", V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("claims") != null && !jsonObj.get("claims").isJsonNull()) {
        JsonArray jsonArrayclaims = jsonObj.getAsJsonArray("claims");
        if (jsonArrayclaims != null) {
          // ensure the json data is an array
          if (!jsonObj.get("claims").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `claims` to be an array in the JSON string but got `%s`", jsonObj.get("claims").toString()));
          }

          // validate the optional field `claims` (array)
          for (int i = 0; i < jsonArrayclaims.size(); i++) {
            V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerRuntimeSettingsResourcesClaimsInner.validateJsonObject(jsonArrayclaims.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources
  */
  public static V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources.class);
  }

 /**
  * Convert an instance of V1alpha1OpsDefinitionSpecJobSpecTemplateSpecEphemeralContainersInnerResources to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

