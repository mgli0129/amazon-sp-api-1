/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.spapi.model.orders;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.orders.OrderItemList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The order items list along with the order ID.
 */
@Schema(description = "The order items list along with the order ID.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-18T13:04:44.630904+08:00[Asia/Shanghai]")
public class OrderItemsList {
  @SerializedName("OrderItems")
  private OrderItemList orderItems = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  @SerializedName("AmazonOrderId")
  private String amazonOrderId = null;

  public OrderItemsList orderItems(OrderItemList orderItems) {
    this.orderItems = orderItems;
    return this;
  }

   /**
   * Get orderItems
   * @return orderItems
  **/
  @Schema(required = true, description = "")
  public OrderItemList getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(OrderItemList orderItems) {
    this.orderItems = orderItems;
  }

  public OrderItemsList nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * When present and not empty, pass this string token in the next request to return the next response page.
   * @return nextToken
  **/
  @Schema(description = "When present and not empty, pass this string token in the next request to return the next response page.")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public OrderItemsList amazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
    return this;
  }

   /**
   * An Amazon-defined order identifier, in 3-7-7 format.
   * @return amazonOrderId
  **/
  @Schema(required = true, description = "An Amazon-defined order identifier, in 3-7-7 format.")
  public String getAmazonOrderId() {
    return amazonOrderId;
  }

  public void setAmazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemsList orderItemsList = (OrderItemsList) o;
    return Objects.equals(this.orderItems, orderItemsList.orderItems) &&
        Objects.equals(this.nextToken, orderItemsList.nextToken) &&
        Objects.equals(this.amazonOrderId, orderItemsList.amazonOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderItems, nextToken, amazonOrderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemsList {\n");
    
    sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
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
