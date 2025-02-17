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
 * The constraint for vcpu cores.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1ComponentResourceConstraintSpecRulesInnerCpu {
  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private Object max;

  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private Object min;

  public static final String SERIALIZED_NAME_SLOTS = "slots";
  @SerializedName(SERIALIZED_NAME_SLOTS)
  private List<Object> slots;

  public static final String SERIALIZED_NAME_STEP = "step";
  @SerializedName(SERIALIZED_NAME_STEP)
  private Object step;

  public V1alpha1ComponentResourceConstraintSpecRulesInnerCpu() {
  }

  public V1alpha1ComponentResourceConstraintSpecRulesInnerCpu max(Object max) {
    
    this.max = max;
    return this;
  }

   /**
   * The maximum count of vcpu cores, [Min, Max] defines a range for valid vcpu cores, and the value in this range must be multiple times of Step. It&#39;s useful to define a large number of valid values without defining them one by one. Please see the documentation for Step for some examples. If Slots is specified, Max, Min, and Step are ignored
   * @return max
  **/
  @jakarta.annotation.Nullable
  public Object getMax() {
    return max;
  }


  public void setMax(Object max) {
    this.max = max;
  }


  public V1alpha1ComponentResourceConstraintSpecRulesInnerCpu min(Object min) {
    
    this.min = min;
    return this;
  }

   /**
   * The minimum count of vcpu cores, [Min, Max] defines a range for valid vcpu cores, and the value in this range must be multiple times of Step. It&#39;s useful to define a large number of valid values without defining them one by one. Please see the documentation for Step for some examples. If Slots is specified, Max, Min, and Step are ignored
   * @return min
  **/
  @jakarta.annotation.Nullable
  public Object getMin() {
    return min;
  }


  public void setMin(Object min) {
    this.min = min;
  }


  public V1alpha1ComponentResourceConstraintSpecRulesInnerCpu slots(List<Object> slots) {
    
    this.slots = slots;
    return this;
  }

  public V1alpha1ComponentResourceConstraintSpecRulesInnerCpu addSlotsItem(Object slotsItem) {
    if (this.slots == null) {
      this.slots = new ArrayList<>();
    }
    this.slots.add(slotsItem);
    return this;
  }

   /**
   * The valid vcpu cores, it&#39;s useful if you want to define valid vcpu cores explicitly. If Slots is specified, Max, Min, and Step are ignored
   * @return slots
  **/
  @jakarta.annotation.Nullable
  public List<Object> getSlots() {
    return slots;
  }


  public void setSlots(List<Object> slots) {
    this.slots = slots;
  }


  public V1alpha1ComponentResourceConstraintSpecRulesInnerCpu step(Object step) {
    
    this.step = step;
    return this;
  }

   /**
   * The minimum granularity of vcpu cores, [Min, Max] defines a range for valid vcpu cores and the value in this range must be multiple times of Step. For example: 1. Min is 2, Max is 8, Step is 2, and the valid vcpu core is {2, 4, 6, 8}. 2. Min is 0.5, Max is 2, Step is 0.5, and the valid vcpu core is {0.5, 1, 1.5, 2}.
   * @return step
  **/
  @jakarta.annotation.Nullable
  public Object getStep() {
    return step;
  }


  public void setStep(Object step) {
    this.step = step;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentResourceConstraintSpecRulesInnerCpu v1alpha1ComponentResourceConstraintSpecRulesInnerCpu = (V1alpha1ComponentResourceConstraintSpecRulesInnerCpu) o;
    return Objects.equals(this.max, v1alpha1ComponentResourceConstraintSpecRulesInnerCpu.max) &&
        Objects.equals(this.min, v1alpha1ComponentResourceConstraintSpecRulesInnerCpu.min) &&
        Objects.equals(this.slots, v1alpha1ComponentResourceConstraintSpecRulesInnerCpu.slots) &&
        Objects.equals(this.step, v1alpha1ComponentResourceConstraintSpecRulesInnerCpu.step);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min, slots, step);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentResourceConstraintSpecRulesInnerCpu {\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
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
    openapiFields.add("max");
    openapiFields.add("min");
    openapiFields.add("slots");
    openapiFields.add("step");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentResourceConstraintSpecRulesInnerCpu
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentResourceConstraintSpecRulesInnerCpu.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentResourceConstraintSpecRulesInnerCpu is not found in the empty JSON string", V1alpha1ComponentResourceConstraintSpecRulesInnerCpu.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentResourceConstraintSpecRulesInnerCpu.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentResourceConstraintSpecRulesInnerCpu` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("slots") != null && !jsonObj.get("slots").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `slots` to be an array in the JSON string but got `%s`", jsonObj.get("slots").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentResourceConstraintSpecRulesInnerCpu.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentResourceConstraintSpecRulesInnerCpu' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentResourceConstraintSpecRulesInnerCpu> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentResourceConstraintSpecRulesInnerCpu.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentResourceConstraintSpecRulesInnerCpu>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentResourceConstraintSpecRulesInnerCpu value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentResourceConstraintSpecRulesInnerCpu read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentResourceConstraintSpecRulesInnerCpu given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentResourceConstraintSpecRulesInnerCpu
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentResourceConstraintSpecRulesInnerCpu
  */
  public static V1alpha1ComponentResourceConstraintSpecRulesInnerCpu fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ComponentResourceConstraintSpecRulesInnerCpu.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentResourceConstraintSpecRulesInnerCpu to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

