/*
 * Selling Partner API for Sales
 * The Selling Partner API for Sales provides APIs related to sales performance.
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.spapi.models.sales;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.models.sales.ErrorList;
import com.amazon.spapi.models.sales.OrderMetricsList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The response schema for the getOrderMetrics operation.
 */
@Schema(description = "The response schema for the getOrderMetrics operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-19T18:27:35.198596+08:00[Asia/Shanghai]")
public class GetOrderMetricsResponse {
  @SerializedName("payload")
  private OrderMetricsList payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetOrderMetricsResponse payload(OrderMetricsList payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @Schema(description = "")
  public OrderMetricsList getPayload() {
    return payload;
  }

  public void setPayload(OrderMetricsList payload) {
    this.payload = payload;
  }

  public GetOrderMetricsResponse errors(ErrorList errors) {
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
    GetOrderMetricsResponse getOrderMetricsResponse = (GetOrderMetricsResponse) o;
    return Objects.equals(this.payload, getOrderMetricsResponse.payload) &&
        Objects.equals(this.errors, getOrderMetricsResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOrderMetricsResponse {\n");

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