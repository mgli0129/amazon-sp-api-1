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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Package information for a shipment in a fulfillment order.
 */
@Schema(description = "Package information for a shipment in a fulfillment order.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-18T11:31:41.384190+08:00[Asia/Shanghai]")
public class FulfillmentShipmentPackage {
  @SerializedName("packageNumber")
  private Integer packageNumber = null;

  @SerializedName("carrierCode")
  private String carrierCode = null;

  @SerializedName("trackingNumber")
  private String trackingNumber = null;

  @SerializedName("estimatedArrivalDate")
  private OffsetDateTime estimatedArrivalDate = null;

  public FulfillmentShipmentPackage packageNumber(Integer packageNumber) {
    this.packageNumber = packageNumber;
    return this;
  }

   /**
   * Identifies a package in a shipment.
   * @return packageNumber
  **/
  @Schema(required = true, description = "Identifies a package in a shipment.")
  public Integer getPackageNumber() {
    return packageNumber;
  }

  public void setPackageNumber(Integer packageNumber) {
    this.packageNumber = packageNumber;
  }

  public FulfillmentShipmentPackage carrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
    return this;
  }

   /**
   * Identifies the carrier who will deliver the shipment to the recipient.
   * @return carrierCode
  **/
  @Schema(required = true, description = "Identifies the carrier who will deliver the shipment to the recipient.")
  public String getCarrierCode() {
    return carrierCode;
  }

  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }

  public FulfillmentShipmentPackage trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

   /**
   * The tracking number, if provided, can be used to obtain tracking and delivery information.
   * @return trackingNumber
  **/
  @Schema(description = "The tracking number, if provided, can be used to obtain tracking and delivery information.")
  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public FulfillmentShipmentPackage estimatedArrivalDate(OffsetDateTime estimatedArrivalDate) {
    this.estimatedArrivalDate = estimatedArrivalDate;
    return this;
  }

   /**
   * Get estimatedArrivalDate
   * @return estimatedArrivalDate
  **/
  @Schema(description = "")
  public OffsetDateTime getEstimatedArrivalDate() {
    return estimatedArrivalDate;
  }

  public void setEstimatedArrivalDate(OffsetDateTime estimatedArrivalDate) {
    this.estimatedArrivalDate = estimatedArrivalDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentShipmentPackage fulfillmentShipmentPackage = (FulfillmentShipmentPackage) o;
    return Objects.equals(this.packageNumber, fulfillmentShipmentPackage.packageNumber) &&
        Objects.equals(this.carrierCode, fulfillmentShipmentPackage.carrierCode) &&
        Objects.equals(this.trackingNumber, fulfillmentShipmentPackage.trackingNumber) &&
        Objects.equals(this.estimatedArrivalDate, fulfillmentShipmentPackage.estimatedArrivalDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageNumber, carrierCode, trackingNumber, estimatedArrivalDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentShipmentPackage {\n");
    
    sb.append("    packageNumber: ").append(toIndentedString(packageNumber)).append("\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    estimatedArrivalDate: ").append(toIndentedString(estimatedArrivalDate)).append("\n");
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
