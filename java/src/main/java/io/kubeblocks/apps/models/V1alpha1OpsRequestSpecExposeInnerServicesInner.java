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
import io.kubeblocks.apps.models.V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner;
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
 * V1alpha1OpsRequestSpecExposeInnerServicesInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1OpsRequestSpecExposeInnerServicesInner {
  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private Map<String, String> annotations = new HashMap<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner> ports;

  public static final String SERIALIZED_NAME_ROLE_SELECTOR = "roleSelector";
  @SerializedName(SERIALIZED_NAME_ROLE_SELECTOR)
  private String roleSelector;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private Map<String, String> selector = new HashMap<>();

  public static final String SERIALIZED_NAME_SERVICE_TYPE = "serviceType";
  @SerializedName(SERIALIZED_NAME_SERVICE_TYPE)
  private String serviceType;

  public V1alpha1OpsRequestSpecExposeInnerServicesInner() {
  }

  public V1alpha1OpsRequestSpecExposeInnerServicesInner annotations(Map<String, String> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public V1alpha1OpsRequestSpecExposeInnerServicesInner putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * If ServiceType is LoadBalancer, cloud provider related parameters can be put here More info: https://kubernetes.io/docs/concepts/services-networking/service/#loadbalancer.
   * @return annotations
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getAnnotations() {
    return annotations;
  }


  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }


  public V1alpha1OpsRequestSpecExposeInnerServicesInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name defines the name of the service. otherwise, it indicates the name of the service. Others can refer to this service by its name. (e.g., connection credential) Cannot be updated.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1OpsRequestSpecExposeInnerServicesInner ports(List<V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner> ports) {
    
    this.ports = ports;
    return this;
  }

  public V1alpha1OpsRequestSpecExposeInnerServicesInner addPortsItem(V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * The list of ports that are exposed by this service. If Ports are not provided, the default Services Ports defined in the ClusterDefinition or ComponentDefinition that are neither of NodePort nor LoadBalancer service type will be used. If there is no corresponding Service defined in the ClusterDefinition or ComponentDefinition, the expose operation will fail. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   * @return ports
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner> getPorts() {
    return ports;
  }


  public void setPorts(List<V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner> ports) {
    this.ports = ports;
  }


  public V1alpha1OpsRequestSpecExposeInnerServicesInner roleSelector(String roleSelector) {
    
    this.roleSelector = roleSelector;
    return this;
  }

   /**
   * RoleSelector extends the ServiceSpec.Selector by allowing you to specify defined role as selector for the service.
   * @return roleSelector
  **/
  @jakarta.annotation.Nullable
  public String getRoleSelector() {
    return roleSelector;
  }


  public void setRoleSelector(String roleSelector) {
    this.roleSelector = roleSelector;
  }


  public V1alpha1OpsRequestSpecExposeInnerServicesInner selector(Map<String, String> selector) {
    
    this.selector = selector;
    return this;
  }

  public V1alpha1OpsRequestSpecExposeInnerServicesInner putSelectorItem(String key, String selectorItem) {
    if (this.selector == null) {
      this.selector = new HashMap<>();
    }
    this.selector.put(key, selectorItem);
    return this;
  }

   /**
   * Route service traffic to pods with label keys and values matching this selector. If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/
   * @return selector
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getSelector() {
    return selector;
  }


  public void setSelector(Map<String, String> selector) {
    this.selector = selector;
  }


  public V1alpha1OpsRequestSpecExposeInnerServicesInner serviceType(String serviceType) {
    
    this.serviceType = serviceType;
    return this;
  }

   /**
   * type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. \&quot;ClusterIP\&quot; allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object or EndpointSlice objects. If clusterIP is \&quot;None\&quot;, no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a virtual IP. \&quot;NodePort\&quot; builds on ClusterIP and allocates a port on every node which routes to the same endpoints as the clusterIP. \&quot;LoadBalancer\&quot; builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the same endpoints as the clusterIP. \&quot;ExternalName\&quot; aliases this service to the specified externalName. Several other fields do not apply to ExternalName services. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types
   * @return serviceType
  **/
  @jakarta.annotation.Nullable
  public String getServiceType() {
    return serviceType;
  }


  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsRequestSpecExposeInnerServicesInner v1alpha1OpsRequestSpecExposeInnerServicesInner = (V1alpha1OpsRequestSpecExposeInnerServicesInner) o;
    return Objects.equals(this.annotations, v1alpha1OpsRequestSpecExposeInnerServicesInner.annotations) &&
        Objects.equals(this.name, v1alpha1OpsRequestSpecExposeInnerServicesInner.name) &&
        Objects.equals(this.ports, v1alpha1OpsRequestSpecExposeInnerServicesInner.ports) &&
        Objects.equals(this.roleSelector, v1alpha1OpsRequestSpecExposeInnerServicesInner.roleSelector) &&
        Objects.equals(this.selector, v1alpha1OpsRequestSpecExposeInnerServicesInner.selector) &&
        Objects.equals(this.serviceType, v1alpha1OpsRequestSpecExposeInnerServicesInner.serviceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, name, ports, roleSelector, selector, serviceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsRequestSpecExposeInnerServicesInner {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    roleSelector: ").append(toIndentedString(roleSelector)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
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
    openapiFields.add("annotations");
    openapiFields.add("name");
    openapiFields.add("ports");
    openapiFields.add("roleSelector");
    openapiFields.add("selector");
    openapiFields.add("serviceType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsRequestSpecExposeInnerServicesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsRequestSpecExposeInnerServicesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsRequestSpecExposeInnerServicesInner is not found in the empty JSON string", V1alpha1OpsRequestSpecExposeInnerServicesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsRequestSpecExposeInnerServicesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsRequestSpecExposeInnerServicesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsRequestSpecExposeInnerServicesInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("ports") != null && !jsonObj.get("ports").isJsonNull()) {
        JsonArray jsonArrayports = jsonObj.getAsJsonArray("ports");
        if (jsonArrayports != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ports").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ports` to be an array in the JSON string but got `%s`", jsonObj.get("ports").toString()));
          }

          // validate the optional field `ports` (array)
          for (int i = 0; i < jsonArrayports.size(); i++) {
            V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner.validateJsonObject(jsonArrayports.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("roleSelector") != null && !jsonObj.get("roleSelector").isJsonNull()) && !jsonObj.get("roleSelector").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleSelector` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roleSelector").toString()));
      }
      if ((jsonObj.get("serviceType") != null && !jsonObj.get("serviceType").isJsonNull()) && !jsonObj.get("serviceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsRequestSpecExposeInnerServicesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsRequestSpecExposeInnerServicesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsRequestSpecExposeInnerServicesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsRequestSpecExposeInnerServicesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsRequestSpecExposeInnerServicesInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsRequestSpecExposeInnerServicesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsRequestSpecExposeInnerServicesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsRequestSpecExposeInnerServicesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsRequestSpecExposeInnerServicesInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsRequestSpecExposeInnerServicesInner
  */
  public static V1alpha1OpsRequestSpecExposeInnerServicesInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsRequestSpecExposeInnerServicesInner.class);
  }

 /**
  * Convert an instance of V1alpha1OpsRequestSpecExposeInnerServicesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

