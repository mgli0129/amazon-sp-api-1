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
import com.amazon.spapi.model.fulfillmentoutbound.DeliveryWindowList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Delivery information for a scheduled delivery.
 */
@Schema(description = "Delivery information for a scheduled delivery.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-18T13:04:29.964921+08:00[Asia/Shanghai]")
public class ScheduledDeliveryInfo {
  @SerializedName("deliveryTimeZone")
  private String deliveryTimeZone = null;

  @SerializedName("deliveryWindows")
  private DeliveryWindowList deliveryWindows = null;

  public ScheduledDeliveryInfo deliveryTimeZone(String deliveryTimeZone) {
    this.deliveryTimeZone = deliveryTimeZone;
    return this;
  }

   /**
   * The time zone of the destination address for the fulfillment order preview. Must be an IANA time zone name. Example: Asia/Tokyo.
   * @return deliveryTimeZone
  **/
  @Schema(required = true, description = "The time zone of the destination address for the fulfillment order preview. Must be an IANA time zone name. Example: Asia/Tokyo.")
  public String getDeliveryTimeZone() {
    return deliveryTimeZone;
  }

  public void setDeliveryTimeZone(String deliveryTimeZone) {
    this.deliveryTimeZone = deliveryTimeZone;
  }

  public ScheduledDeliveryInfo deliveryWindows(DeliveryWindowList deliveryWindows) {
    this.deliveryWindows = deliveryWindows;
    return this;
  }

   /**
   * Get deliveryWindows
   * @return deliveryWindows
  **/
  @Schema(required = true, description = "")
  public DeliveryWindowList getDeliveryWindows() {
    return deliveryWindows;
  }

  public void setDeliveryWindows(DeliveryWindowList deliveryWindows) {
    this.deliveryWindows = deliveryWindows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduledDeliveryInfo scheduledDeliveryInfo = (ScheduledDeliveryInfo) o;
    return Objects.equals(this.deliveryTimeZone, scheduledDeliveryInfo.deliveryTimeZone) &&
        Objects.equals(this.deliveryWindows, scheduledDeliveryInfo.deliveryWindows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryTimeZone, deliveryWindows);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledDeliveryInfo {\n");
    
    sb.append("    deliveryTimeZone: ").append(toIndentedString(deliveryTimeZone)).append("\n");
    sb.append("    deliveryWindows: ").append(toIndentedString(deliveryWindows)).append("\n");
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
