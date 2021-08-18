/*
 * Selling Partner API for Shipment Invoicing
 * The Selling Partner API for Shipment Invoicing helps you programmatically retrieve shipment invoice information in the Brazil marketplace for a selling partner’s Fulfillment by Amazon (FBA) orders.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.spapi.model.shipmentinvoicing;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.shipmentinvoicing.ShipmentInvoiceStatusInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The shipment invoice status response.
 */
@Schema(description = "The shipment invoice status response.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-18T13:05:03.482145+08:00[Asia/Shanghai]")
public class ShipmentInvoiceStatusResponse {
  @SerializedName("Shipments")
  private ShipmentInvoiceStatusInfo shipments = null;

  public ShipmentInvoiceStatusResponse shipments(ShipmentInvoiceStatusInfo shipments) {
    this.shipments = shipments;
    return this;
  }

   /**
   * Get shipments
   * @return shipments
  **/
  @Schema(description = "")
  public ShipmentInvoiceStatusInfo getShipments() {
    return shipments;
  }

  public void setShipments(ShipmentInvoiceStatusInfo shipments) {
    this.shipments = shipments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentInvoiceStatusResponse shipmentInvoiceStatusResponse = (ShipmentInvoiceStatusResponse) o;
    return Objects.equals(this.shipments, shipmentInvoiceStatusResponse.shipments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentInvoiceStatusResponse {\n");
    
    sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
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
