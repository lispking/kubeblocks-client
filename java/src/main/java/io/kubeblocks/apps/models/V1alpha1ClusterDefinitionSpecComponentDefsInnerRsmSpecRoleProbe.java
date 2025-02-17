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
import io.kubeblocks.apps.models.V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbeCustomHandlerInner;
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
 * RoleProbe provides method to probe role.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe {
  public static final String SERIALIZED_NAME_BUILTIN_HANDLER_NAME = "builtinHandlerName";
  @SerializedName(SERIALIZED_NAME_BUILTIN_HANDLER_NAME)
  private String builtinHandlerName;

  public static final String SERIALIZED_NAME_CUSTOM_HANDLER = "customHandler";
  @SerializedName(SERIALIZED_NAME_CUSTOM_HANDLER)
  private List<V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbeCustomHandlerInner> customHandler;

  public static final String SERIALIZED_NAME_FAILURE_THRESHOLD = "failureThreshold";
  @SerializedName(SERIALIZED_NAME_FAILURE_THRESHOLD)
  private Integer failureThreshold;

  public static final String SERIALIZED_NAME_INITIAL_DELAY_SECONDS = "initialDelaySeconds";
  @SerializedName(SERIALIZED_NAME_INITIAL_DELAY_SECONDS)
  private Integer initialDelaySeconds;

  public static final String SERIALIZED_NAME_PERIOD_SECONDS = "periodSeconds";
  @SerializedName(SERIALIZED_NAME_PERIOD_SECONDS)
  private Integer periodSeconds;

  /**
   * RoleUpdateMechanism specifies the way how pod role label being updated.
   */
  @JsonAdapter(RoleUpdateMechanismEnum.Adapter.class)
  public enum RoleUpdateMechanismEnum {
    READINESSPROBEEVENTUPDATE("ReadinessProbeEventUpdate"),
    
    DIRECTAPISERVEREVENTUPDATE("DirectAPIServerEventUpdate");

    private String value;

    RoleUpdateMechanismEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RoleUpdateMechanismEnum fromValue(String value) {
      for (RoleUpdateMechanismEnum b : RoleUpdateMechanismEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RoleUpdateMechanismEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleUpdateMechanismEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoleUpdateMechanismEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RoleUpdateMechanismEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ROLE_UPDATE_MECHANISM = "roleUpdateMechanism";
  @SerializedName(SERIALIZED_NAME_ROLE_UPDATE_MECHANISM)
  private RoleUpdateMechanismEnum roleUpdateMechanism;

  public static final String SERIALIZED_NAME_SUCCESS_THRESHOLD = "successThreshold";
  @SerializedName(SERIALIZED_NAME_SUCCESS_THRESHOLD)
  private Integer successThreshold;

  public static final String SERIALIZED_NAME_TIMEOUT_SECONDS = "timeoutSeconds";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_SECONDS)
  private Integer timeoutSeconds;

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe() {
  }

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe builtinHandlerName(String builtinHandlerName) {
    
    this.builtinHandlerName = builtinHandlerName;
    return this;
  }

   /**
   * BuiltinHandler specifies the builtin handler name to use to probe the role of the main container. current available handlers: mysql, postgres, mongodb, redis, etcd, kafka. use CustomHandler to define your own role probe function if none of them satisfies the requirement.
   * @return builtinHandlerName
  **/
  @jakarta.annotation.Nullable
  public String getBuiltinHandlerName() {
    return builtinHandlerName;
  }


  public void setBuiltinHandlerName(String builtinHandlerName) {
    this.builtinHandlerName = builtinHandlerName;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe customHandler(List<V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbeCustomHandlerInner> customHandler) {
    
    this.customHandler = customHandler;
    return this;
  }

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe addCustomHandlerItem(V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbeCustomHandlerInner customHandlerItem) {
    if (this.customHandler == null) {
      this.customHandler = new ArrayList<>();
    }
    this.customHandler.add(customHandlerItem);
    return this;
  }

   /**
   * CustomHandler defines the custom way to do role probe. if the BuiltinHandler satisfies the requirement, use it instead.   how the actions defined here works:   Actions will be taken in serial. after all actions done, the final output should be a single string of the role name defined in spec.Roles latest [BusyBox](https://busybox.net/) image will be used if Image not configured Environment variables can be used in Command: - v_KB_RSM_LAST_STDOUT stdout from last action, watch &#39;v_&#39; prefixed - KB_RSM_USERNAME username part of credential - KB_RSM_PASSWORD password part of credential
   * @return customHandler
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbeCustomHandlerInner> getCustomHandler() {
    return customHandler;
  }


  public void setCustomHandler(List<V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbeCustomHandlerInner> customHandler) {
    this.customHandler = customHandler;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe failureThreshold(Integer failureThreshold) {
    
    this.failureThreshold = failureThreshold;
    return this;
  }

   /**
   * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
   * minimum: 1
   * @return failureThreshold
  **/
  @jakarta.annotation.Nullable
  public Integer getFailureThreshold() {
    return failureThreshold;
  }


  public void setFailureThreshold(Integer failureThreshold) {
    this.failureThreshold = failureThreshold;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe initialDelaySeconds(Integer initialDelaySeconds) {
    
    this.initialDelaySeconds = initialDelaySeconds;
    return this;
  }

   /**
   * Number of seconds after the container has started before role probe has started.
   * minimum: 0
   * @return initialDelaySeconds
  **/
  @jakarta.annotation.Nullable
  public Integer getInitialDelaySeconds() {
    return initialDelaySeconds;
  }


  public void setInitialDelaySeconds(Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe periodSeconds(Integer periodSeconds) {
    
    this.periodSeconds = periodSeconds;
    return this;
  }

   /**
   * How often (in seconds) to perform the probe. Default to 2 seconds. Minimum value is 1.
   * minimum: 1
   * @return periodSeconds
  **/
  @jakarta.annotation.Nullable
  public Integer getPeriodSeconds() {
    return periodSeconds;
  }


  public void setPeriodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe roleUpdateMechanism(RoleUpdateMechanismEnum roleUpdateMechanism) {
    
    this.roleUpdateMechanism = roleUpdateMechanism;
    return this;
  }

   /**
   * RoleUpdateMechanism specifies the way how pod role label being updated.
   * @return roleUpdateMechanism
  **/
  @jakarta.annotation.Nullable
  public RoleUpdateMechanismEnum getRoleUpdateMechanism() {
    return roleUpdateMechanism;
  }


  public void setRoleUpdateMechanism(RoleUpdateMechanismEnum roleUpdateMechanism) {
    this.roleUpdateMechanism = roleUpdateMechanism;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe successThreshold(Integer successThreshold) {
    
    this.successThreshold = successThreshold;
    return this;
  }

   /**
   * Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Minimum value is 1.
   * minimum: 1
   * @return successThreshold
  **/
  @jakarta.annotation.Nullable
  public Integer getSuccessThreshold() {
    return successThreshold;
  }


  public void setSuccessThreshold(Integer successThreshold) {
    this.successThreshold = successThreshold;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe timeoutSeconds(Integer timeoutSeconds) {
    
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

   /**
   * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1.
   * minimum: 1
   * @return timeoutSeconds
  **/
  @jakarta.annotation.Nullable
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }


  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe v1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe = (V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe) o;
    return Objects.equals(this.builtinHandlerName, v1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe.builtinHandlerName) &&
        Objects.equals(this.customHandler, v1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe.customHandler) &&
        Objects.equals(this.failureThreshold, v1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe.failureThreshold) &&
        Objects.equals(this.initialDelaySeconds, v1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe.initialDelaySeconds) &&
        Objects.equals(this.periodSeconds, v1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe.periodSeconds) &&
        Objects.equals(this.roleUpdateMechanism, v1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe.roleUpdateMechanism) &&
        Objects.equals(this.successThreshold, v1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe.successThreshold) &&
        Objects.equals(this.timeoutSeconds, v1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(builtinHandlerName, customHandler, failureThreshold, initialDelaySeconds, periodSeconds, roleUpdateMechanism, successThreshold, timeoutSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe {\n");
    sb.append("    builtinHandlerName: ").append(toIndentedString(builtinHandlerName)).append("\n");
    sb.append("    customHandler: ").append(toIndentedString(customHandler)).append("\n");
    sb.append("    failureThreshold: ").append(toIndentedString(failureThreshold)).append("\n");
    sb.append("    initialDelaySeconds: ").append(toIndentedString(initialDelaySeconds)).append("\n");
    sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
    sb.append("    roleUpdateMechanism: ").append(toIndentedString(roleUpdateMechanism)).append("\n");
    sb.append("    successThreshold: ").append(toIndentedString(successThreshold)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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
    openapiFields.add("builtinHandlerName");
    openapiFields.add("customHandler");
    openapiFields.add("failureThreshold");
    openapiFields.add("initialDelaySeconds");
    openapiFields.add("periodSeconds");
    openapiFields.add("roleUpdateMechanism");
    openapiFields.add("successThreshold");
    openapiFields.add("timeoutSeconds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe is not found in the empty JSON string", V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("builtinHandlerName") != null && !jsonObj.get("builtinHandlerName").isJsonNull()) && !jsonObj.get("builtinHandlerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `builtinHandlerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("builtinHandlerName").toString()));
      }
      if (jsonObj.get("customHandler") != null && !jsonObj.get("customHandler").isJsonNull()) {
        JsonArray jsonArraycustomHandler = jsonObj.getAsJsonArray("customHandler");
        if (jsonArraycustomHandler != null) {
          // ensure the json data is an array
          if (!jsonObj.get("customHandler").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `customHandler` to be an array in the JSON string but got `%s`", jsonObj.get("customHandler").toString()));
          }

          // validate the optional field `customHandler` (array)
          for (int i = 0; i < jsonArraycustomHandler.size(); i++) {
            V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbeCustomHandlerInner.validateJsonObject(jsonArraycustomHandler.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("roleUpdateMechanism") != null && !jsonObj.get("roleUpdateMechanism").isJsonNull()) && !jsonObj.get("roleUpdateMechanism").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleUpdateMechanism` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roleUpdateMechanism").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe
  */
  public static V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerRsmSpecRoleProbe to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

