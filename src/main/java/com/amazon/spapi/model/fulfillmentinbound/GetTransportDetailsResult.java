/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.spapi.model.fulfillmentinbound;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.fulfillmentinbound.TransportContent;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * GetTransportDetailsResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-18T13:04:25.138369+08:00[Asia/Shanghai]")
public class GetTransportDetailsResult {
  @SerializedName("TransportContent")
  private TransportContent transportContent = null;

  public GetTransportDetailsResult transportContent(TransportContent transportContent) {
    this.transportContent = transportContent;
    return this;
  }

   /**
   * Get transportContent
   * @return transportContent
  **/
  @Schema(description = "")
  public TransportContent getTransportContent() {
    return transportContent;
  }

  public void setTransportContent(TransportContent transportContent) {
    this.transportContent = transportContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransportDetailsResult getTransportDetailsResult = (GetTransportDetailsResult) o;
    return Objects.equals(this.transportContent, getTransportDetailsResult.transportContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transportContent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransportDetailsResult {\n");
    
    sb.append("    transportContent: ").append(toIndentedString(transportContent)).append("\n");
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
