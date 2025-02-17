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
 * V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner {
  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private String cluster;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_SERVICE_DESCRIPTOR = "serviceDescriptor";
  @SerializedName(SERIALIZED_NAME_SERVICE_DESCRIPTOR)
  private String serviceDescriptor;

  public V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner() {
  }

  public V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner cluster(String cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * When referencing a service provided by other KubeBlocks cluster, you need to provide the name of the Cluster being referenced. By default, when other KubeBlocks Cluster are referenced, the ClusterDefinition.spec.connectionCredential secret corresponding to the referenced Cluster will be used to bind to the current component. Currently, if a KubeBlocks cluster is to be referenced, the connection credential secret should include and correspond to the following fields: endpoint, port, username, and password. Under this referencing approach, the ServiceKind and ServiceVersion of service reference declaration defined in the ClusterDefinition will not be validated. If both Cluster and ServiceDescriptor are specified, the Cluster takes precedence.
   * @return cluster
  **/
  @jakarta.annotation.Nullable
  public String getCluster() {
    return cluster;
  }


  public void setCluster(String cluster) {
    this.cluster = cluster;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name of the service reference declaration. references the serviceRefDeclaration name defined in clusterDefinition.componentDefs[*].serviceRefDeclarations[*].name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * namespace defines the namespace of the referenced Cluster or the namespace of the referenced ServiceDescriptor object. If not set, the referenced Cluster and ServiceDescriptor will be searched in the namespace of the current cluster by default.
   * @return namespace
  **/
  @jakarta.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner serviceDescriptor(String serviceDescriptor) {
    
    this.serviceDescriptor = serviceDescriptor;
    return this;
  }

   /**
   * serviceDescriptor defines the service descriptor of the service provided by external sources. When referencing a service provided by external sources, you need to provide the ServiceDescriptor object name to establish the service binding. And serviceDescriptor is the name of the ServiceDescriptor object, furthermore, the ServiceDescriptor.spec.serviceKind and ServiceDescriptor.spec.serviceVersion should match clusterDefinition.componentDefs[*].serviceRefDeclarations[*].serviceRefDeclarationSpecs[*].serviceKind and the regular expression defines in clusterDefinition.componentDefs[*].serviceRefDeclarations[*].serviceRefDeclarationSpecs[*].serviceVersion. If both Cluster and ServiceDescriptor are specified, the Cluster takes precedence.
   * @return serviceDescriptor
  **/
  @jakarta.annotation.Nullable
  public String getServiceDescriptor() {
    return serviceDescriptor;
  }


  public void setServiceDescriptor(String serviceDescriptor) {
    this.serviceDescriptor = serviceDescriptor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner v1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner = (V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner) o;
    return Objects.equals(this.cluster, v1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner.cluster) &&
        Objects.equals(this.name, v1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner.name) &&
        Objects.equals(this.namespace, v1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner.namespace) &&
        Objects.equals(this.serviceDescriptor, v1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner.serviceDescriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, name, namespace, serviceDescriptor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    serviceDescriptor: ").append(toIndentedString(serviceDescriptor)).append("\n");
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
    openapiFields.add("cluster");
    openapiFields.add("name");
    openapiFields.add("namespace");
    openapiFields.add("serviceDescriptor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner is not found in the empty JSON string", V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("cluster") != null && !jsonObj.get("cluster").isJsonNull()) && !jsonObj.get("cluster").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cluster` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cluster").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("serviceDescriptor") != null && !jsonObj.get("serviceDescriptor").isJsonNull()) && !jsonObj.get("serviceDescriptor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceDescriptor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceDescriptor").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner
  */
  public static V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

