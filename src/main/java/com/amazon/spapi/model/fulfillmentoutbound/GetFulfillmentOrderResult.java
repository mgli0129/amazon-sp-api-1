/*
 * Selling Partner APIs for Fulfillment Outbound
 * The Selling Partner API for Fulfillment Outbound lets you create applications that help a seller fulfill Multi-Channel Fulfillment orders using their inventory in Amazon's fulfillment network. You can get information on both potential and existing fulfillment orders.
 *
 * OpenAPI spec version: 2020-07-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.spapi.model.fulfillmentoutbound;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.fulfillmentoutbound.FulfillmentOrder;
import com.amazon.spapi.model.fulfillmentoutbound.FulfillmentOrderItemList;
import com.amazon.spapi.model.fulfillmentoutbound.FulfillmentShipmentList;
import com.amazon.spapi.model.fulfillmentoutbound.ReturnAuthorizationList;
import com.amazon.spapi.model.fulfillmentoutbound.ReturnItemList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * GetFulfillmentOrderResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-18T13:04:29.964921+08:00[Asia/Shanghai]")
public class GetFulfillmentOrderResult {
  @SerializedName("fulfillmentOrder")
  private FulfillmentOrder fulfillmentOrder = null;

  @SerializedName("fulfillmentOrderItems")
  private FulfillmentOrderItemList fulfillmentOrderItems = null;

  @SerializedName("fulfillmentShipments")
  private FulfillmentShipmentList fulfillmentShipments = null;

  @SerializedName("returnItems")
  private ReturnItemList returnItems = null;

  @SerializedName("returnAuthorizations")
  private ReturnAuthorizationList returnAuthorizations = null;

  public GetFulfillmentOrderResult fulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
    this.fulfillmentOrder = fulfillmentOrder;
    return this;
  }

   /**
   * Get fulfillmentOrder
   * @return fulfillmentOrder
  **/
  @Schema(required = true, description = "")
  public FulfillmentOrder getFulfillmentOrder() {
    return fulfillmentOrder;
  }

  public void setFulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
    this.fulfillmentOrder = fulfillmentOrder;
  }

  public GetFulfillmentOrderResult fulfillmentOrderItems(FulfillmentOrderItemList fulfillmentOrderItems) {
    this.fulfillmentOrderItems = fulfillmentOrderItems;
    return this;
  }

   /**
   * Get fulfillmentOrderItems
   * @return fulfillmentOrderItems
  **/
  @Schema(required = true, description = "")
  public FulfillmentOrderItemList getFulfillmentOrderItems() {
    return fulfillmentOrderItems;
  }

  public void setFulfillmentOrderItems(FulfillmentOrderItemList fulfillmentOrderItems) {
    this.fulfillmentOrderItems = fulfillmentOrderItems;
  }

  public GetFulfillmentOrderResult fulfillmentShipments(FulfillmentShipmentList fulfillmentShipments) {
    this.fulfillmentShipments = fulfillmentShipments;
    return this;
  }

   /**
   * Get fulfillmentShipments
   * @return fulfillmentShipments
  **/
  @Schema(description = "")
  public FulfillmentShipmentList getFulfillmentShipments() {
    return fulfillmentShipments;
  }

  public void setFulfillmentShipments(FulfillmentShipmentList fulfillmentShipments) {
    this.fulfillmentShipments = fulfillmentShipments;
  }

  public GetFulfillmentOrderResult returnItems(ReturnItemList returnItems) {
    this.returnItems = returnItems;
    return this;
  }

   /**
   * Get returnItems
   * @return returnItems
  **/
  @Schema(required = true, description = "")
  public ReturnItemList getReturnItems() {
    return returnItems;
  }

  public void setReturnItems(ReturnItemList returnItems) {
    this.returnItems = returnItems;
  }

  public GetFulfillmentOrderResult returnAuthorizations(ReturnAuthorizationList returnAuthorizations) {
    this.returnAuthorizations = returnAuthorizations;
    return this;
  }

   /**
   * Get returnAuthorizations
   * @return returnAuthorizations
  **/
  @Schema(required = true, description = "")
  public ReturnAuthorizationList getReturnAuthorizations() {
    return returnAuthorizations;
  }

  public void setReturnAuthorizations(ReturnAuthorizationList returnAuthorizations) {
    this.returnAuthorizations = returnAuthorizations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFulfillmentOrderResult getFulfillmentOrderResult = (GetFulfillmentOrderResult) o;
    return Objects.equals(this.fulfillmentOrder, getFulfillmentOrderResult.fulfillmentOrder) &&
        Objects.equals(this.fulfillmentOrderItems, getFulfillmentOrderResult.fulfillmentOrderItems) &&
        Objects.equals(this.fulfillmentShipments, getFulfillmentOrderResult.fulfillmentShipments) &&
        Objects.equals(this.returnItems, getFulfillmentOrderResult.returnItems) &&
        Objects.equals(this.returnAuthorizations, getFulfillmentOrderResult.returnAuthorizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentOrder, fulfillmentOrderItems, fulfillmentShipments, returnItems, returnAuthorizations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFulfillmentOrderResult {\n");
    
    sb.append("    fulfillmentOrder: ").append(toIndentedString(fulfillmentOrder)).append("\n");
    sb.append("    fulfillmentOrderItems: ").append(toIndentedString(fulfillmentOrderItems)).append("\n");
    sb.append("    fulfillmentShipments: ").append(toIndentedString(fulfillmentShipments)).append("\n");
    sb.append("    returnItems: ").append(toIndentedString(returnItems)).append("\n");
    sb.append("    returnAuthorizations: ").append(toIndentedString(returnAuthorizations)).append("\n");
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
