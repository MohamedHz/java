/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1ListMeta;
import io.kubernetes.client.models.V2beta1HorizontalPodAutoscaler;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HorizontalPodAutoscaler is a list of horizontal pod autoscaler objects.
 */
@ApiModel(description = "HorizontalPodAutoscaler is a list of horizontal pod autoscaler objects.")

public class V2beta1HorizontalPodAutoscalerList {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("items")
  private List<V2beta1HorizontalPodAutoscaler> items = new ArrayList<V2beta1HorizontalPodAutoscaler>();

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ListMeta metadata = null;

  public V2beta1HorizontalPodAutoscalerList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V2beta1HorizontalPodAutoscalerList items(List<V2beta1HorizontalPodAutoscaler> items) {
    this.items = items;
    return this;
  }

  public V2beta1HorizontalPodAutoscalerList addItemsItem(V2beta1HorizontalPodAutoscaler itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * items is the list of horizontal pod autoscaler objects.
   * @return items
  **/
  @ApiModelProperty(required = true, value = "items is the list of horizontal pod autoscaler objects.")
  public List<V2beta1HorizontalPodAutoscaler> getItems() {
    return items;
  }

  public void setItems(List<V2beta1HorizontalPodAutoscaler> items) {
    this.items = items;
  }

  public V2beta1HorizontalPodAutoscalerList kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V2beta1HorizontalPodAutoscalerList metadata(V1ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * metadata is the standard list metadata.
   * @return metadata
  **/
  @ApiModelProperty(value = "metadata is the standard list metadata.")
  public V1ListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ListMeta metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2beta1HorizontalPodAutoscalerList v2beta1HorizontalPodAutoscalerList = (V2beta1HorizontalPodAutoscalerList) o;
    return Objects.equals(this.apiVersion, v2beta1HorizontalPodAutoscalerList.apiVersion) &&
        Objects.equals(this.items, v2beta1HorizontalPodAutoscalerList.items) &&
        Objects.equals(this.kind, v2beta1HorizontalPodAutoscalerList.kind) &&
        Objects.equals(this.metadata, v2beta1HorizontalPodAutoscalerList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, items, kind, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta1HorizontalPodAutoscalerList {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

