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
import com.amazon.spapi.model.fulfillmentoutbound.Money;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Item information for a fulfillment order preview.
 */
@Schema(description = "Item information for a fulfillment order preview.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-18T13:04:29.964921+08:00[Asia/Shanghai]")
public class GetFulfillmentPreviewItem {
  @SerializedName("sellerSku")
  private String sellerSku = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("perUnitDeclaredValue")
  private Money perUnitDeclaredValue = null;

  @SerializedName("sellerFulfillmentOrderItemId")
  private String sellerFulfillmentOrderItemId = null;

  public GetFulfillmentPreviewItem sellerSku(String sellerSku) {
    this.sellerSku = sellerSku;
    return this;
  }

   /**
   * The seller SKU of the item.
   * @return sellerSku
  **/
  @Schema(required = true, description = "The seller SKU of the item.")
  public String getSellerSku() {
    return sellerSku;
  }

  public void setSellerSku(String sellerSku) {
    this.sellerSku = sellerSku;
  }

  public GetFulfillmentPreviewItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @Schema(required = true, description = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public GetFulfillmentPreviewItem perUnitDeclaredValue(Money perUnitDeclaredValue) {
    this.perUnitDeclaredValue = perUnitDeclaredValue;
    return this;
  }

   /**
   * Get perUnitDeclaredValue
   * @return perUnitDeclaredValue
  **/
  @Schema(description = "")
  public Money getPerUnitDeclaredValue() {
    return perUnitDeclaredValue;
  }

  public void setPerUnitDeclaredValue(Money perUnitDeclaredValue) {
    this.perUnitDeclaredValue = perUnitDeclaredValue;
  }

  public GetFulfillmentPreviewItem sellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
    this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
    return this;
  }

   /**
   * A fulfillment order item identifier that the seller creates to track items in the fulfillment preview.
   * @return sellerFulfillmentOrderItemId
  **/
  @Schema(required = true, description = "A fulfillment order item identifier that the seller creates to track items in the fulfillment preview.")
  public String getSellerFulfillmentOrderItemId() {
    return sellerFulfillmentOrderItemId;
  }

  public void setSellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
    this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFulfillmentPreviewItem getFulfillmentPreviewItem = (GetFulfillmentPreviewItem) o;
    return Objects.equals(this.sellerSku, getFulfillmentPreviewItem.sellerSku) &&
        Objects.equals(this.quantity, getFulfillmentPreviewItem.quantity) &&
        Objects.equals(this.perUnitDeclaredValue, getFulfillmentPreviewItem.perUnitDeclaredValue) &&
        Objects.equals(this.sellerFulfillmentOrderItemId, getFulfillmentPreviewItem.sellerFulfillmentOrderItemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerSku, quantity, perUnitDeclaredValue, sellerFulfillmentOrderItemId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFulfillmentPreviewItem {\n");
    
    sb.append("    sellerSku: ").append(toIndentedString(sellerSku)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    perUnitDeclaredValue: ").append(toIndentedString(perUnitDeclaredValue)).append("\n");
    sb.append("    sellerFulfillmentOrderItemId: ").append(toIndentedString(sellerFulfillmentOrderItemId)).append("\n");
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
