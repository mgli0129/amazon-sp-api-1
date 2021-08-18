/*
 * Selling Partner API for Retail Procurement Orders
 * The Selling Partner API for Retail Procurement Orders provides programmatic access to vendor orders data.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.spapi.model.vendororders;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.vendororders.ItemQuantity;
import com.amazon.spapi.model.vendororders.OrderedQuantityDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Ordered quantity information.
 */
@Schema(description = "Ordered quantity information.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-18T11:32:52.455629+08:00[Asia/Shanghai]")
public class OrderItemStatusOrderedQuantity {
  @SerializedName("orderedQuantity")
  private ItemQuantity orderedQuantity = null;

  @SerializedName("orderedQuantityDetails")
  private List<OrderedQuantityDetails> orderedQuantityDetails = null;

  public OrderItemStatusOrderedQuantity orderedQuantity(ItemQuantity orderedQuantity) {
    this.orderedQuantity = orderedQuantity;
    return this;
  }

   /**
   * Get orderedQuantity
   * @return orderedQuantity
  **/
  @Schema(description = "")
  public ItemQuantity getOrderedQuantity() {
    return orderedQuantity;
  }

  public void setOrderedQuantity(ItemQuantity orderedQuantity) {
    this.orderedQuantity = orderedQuantity;
  }

  public OrderItemStatusOrderedQuantity orderedQuantityDetails(List<OrderedQuantityDetails> orderedQuantityDetails) {
    this.orderedQuantityDetails = orderedQuantityDetails;
    return this;
  }

  public OrderItemStatusOrderedQuantity addOrderedQuantityDetailsItem(OrderedQuantityDetails orderedQuantityDetailsItem) {
    if (this.orderedQuantityDetails == null) {
      this.orderedQuantityDetails = new ArrayList<OrderedQuantityDetails>();
    }
    this.orderedQuantityDetails.add(orderedQuantityDetailsItem);
    return this;
  }

   /**
   * Details of item quantity ordered.
   * @return orderedQuantityDetails
  **/
  @Schema(description = "Details of item quantity ordered.")
  public List<OrderedQuantityDetails> getOrderedQuantityDetails() {
    return orderedQuantityDetails;
  }

  public void setOrderedQuantityDetails(List<OrderedQuantityDetails> orderedQuantityDetails) {
    this.orderedQuantityDetails = orderedQuantityDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemStatusOrderedQuantity orderItemStatusOrderedQuantity = (OrderItemStatusOrderedQuantity) o;
    return Objects.equals(this.orderedQuantity, orderItemStatusOrderedQuantity.orderedQuantity) &&
        Objects.equals(this.orderedQuantityDetails, orderItemStatusOrderedQuantity.orderedQuantityDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderedQuantity, orderedQuantityDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemStatusOrderedQuantity {\n");
    
    sb.append("    orderedQuantity: ").append(toIndentedString(orderedQuantity)).append("\n");
    sb.append("    orderedQuantityDetails: ").append(toIndentedString(orderedQuantityDetails)).append("\n");
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
