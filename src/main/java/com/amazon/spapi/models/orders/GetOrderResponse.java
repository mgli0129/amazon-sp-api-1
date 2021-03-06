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

package com.amazon.spapi.models.orders;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.models.orders.ErrorList;
import com.amazon.spapi.models.orders.Order;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The response schema for the getOrder operation.
 */
@Schema(description = "The response schema for the getOrder operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-19T18:25:13.432270+08:00[Asia/Shanghai]")
public class GetOrderResponse {
  @SerializedName("payload")
  private Order payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetOrderResponse payload(Order payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @Schema(description = "")
  public Order getPayload() {
    return payload;
  }

  public void setPayload(Order payload) {
    this.payload = payload;
  }

  public GetOrderResponse errors(ErrorList errors) {
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOrderResponse getOrderResponse = (GetOrderResponse) o;
    return Objects.equals(this.payload, getOrderResponse.payload) &&
        Objects.equals(this.errors, getOrderResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOrderResponse {\n");

    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
