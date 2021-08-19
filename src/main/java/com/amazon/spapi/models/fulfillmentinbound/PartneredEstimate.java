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

package com.amazon.spapi.models.fulfillmentinbound;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.models.fulfillmentinbound.Amount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * The estimated shipping cost for a shipment using an Amazon-partnered carrier.
 */
@Schema(description = "The estimated shipping cost for a shipment using an Amazon-partnered carrier.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-19T18:22:37.156216+08:00[Asia/Shanghai]")
public class PartneredEstimate {
  @SerializedName("Amount")
  private Amount amount = null;

  @SerializedName("ConfirmDeadline")
  private OffsetDateTime confirmDeadline = null;

  @SerializedName("VoidDeadline")
  private OffsetDateTime voidDeadline = null;

  public PartneredEstimate amount(Amount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @Schema(required = true, description = "")
  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public PartneredEstimate confirmDeadline(OffsetDateTime confirmDeadline) {
    this.confirmDeadline = confirmDeadline;
    return this;
  }

   /**
   * Get confirmDeadline
   * @return confirmDeadline
  **/
  @Schema(description = "")
  public OffsetDateTime getConfirmDeadline() {
    return confirmDeadline;
  }

  public void setConfirmDeadline(OffsetDateTime confirmDeadline) {
    this.confirmDeadline = confirmDeadline;
  }

  public PartneredEstimate voidDeadline(OffsetDateTime voidDeadline) {
    this.voidDeadline = voidDeadline;
    return this;
  }

   /**
   * Get voidDeadline
   * @return voidDeadline
  **/
  @Schema(description = "")
  public OffsetDateTime getVoidDeadline() {
    return voidDeadline;
  }

  public void setVoidDeadline(OffsetDateTime voidDeadline) {
    this.voidDeadline = voidDeadline;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartneredEstimate partneredEstimate = (PartneredEstimate) o;
    return Objects.equals(this.amount, partneredEstimate.amount) &&
        Objects.equals(this.confirmDeadline, partneredEstimate.confirmDeadline) &&
        Objects.equals(this.voidDeadline, partneredEstimate.voidDeadline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, confirmDeadline, voidDeadline);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartneredEstimate {\n");

    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    confirmDeadline: ").append(toIndentedString(confirmDeadline)).append("\n");
    sb.append("    voidDeadline: ").append(toIndentedString(voidDeadline)).append("\n");
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

}