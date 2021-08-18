/*
 * Selling Partner API for Direct Fulfillment Shipping
 * The Selling Partner API for Direct Fulfillment Shipping provides programmatic access to a direct fulfillment vendor's shipping data.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.spapi.model.vendordirectfulfillmentshippingv1;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.vendordirectfulfillmentshippingv1.ErrorList;
import com.amazon.spapi.model.vendordirectfulfillmentshippingv1.TransactionReference;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The response schema for the submitShipmentConfirmations operation.
 */
@Schema(description = "The response schema for the submitShipmentConfirmations operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-18T11:32:44.432758+08:00[Asia/Shanghai]")
public class SubmitShipmentConfirmationsResponse {
  @SerializedName("payload")
  private TransactionReference payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public SubmitShipmentConfirmationsResponse payload(TransactionReference payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @Schema(description = "")
  public TransactionReference getPayload() {
    return payload;
  }

  public void setPayload(TransactionReference payload) {
    this.payload = payload;
  }

  public SubmitShipmentConfirmationsResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @Schema(description = "")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitShipmentConfirmationsResponse submitShipmentConfirmationsResponse = (SubmitShipmentConfirmationsResponse) o;
    return Objects.equals(this.payload, submitShipmentConfirmationsResponse.payload) &&
        Objects.equals(this.errors, submitShipmentConfirmationsResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitShipmentConfirmationsResponse {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
