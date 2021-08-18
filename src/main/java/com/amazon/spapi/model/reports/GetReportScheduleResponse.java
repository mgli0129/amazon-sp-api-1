/*
 * Selling Partner API for Reports
 * The Selling Partner API for Reports lets you retrieve and manage a variety of reports that can help selling partners manage their businesses.
 *
 * OpenAPI spec version: 2020-09-04
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.spapi.model.reports;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.reports.ErrorList;
import com.amazon.spapi.model.reports.ReportSchedule;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The response for the getReportSchedule operation.
 */
@Schema(description = "The response for the getReportSchedule operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-18T11:32:12.718807+08:00[Asia/Shanghai]")
public class GetReportScheduleResponse {
  @SerializedName("payload")
  private ReportSchedule payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetReportScheduleResponse payload(ReportSchedule payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @Schema(description = "")
  public ReportSchedule getPayload() {
    return payload;
  }

  public void setPayload(ReportSchedule payload) {
    this.payload = payload;
  }

  public GetReportScheduleResponse errors(ErrorList errors) {
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
    GetReportScheduleResponse getReportScheduleResponse = (GetReportScheduleResponse) o;
    return Objects.equals(this.payload, getReportScheduleResponse.payload) &&
        Objects.equals(this.errors, getReportScheduleResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetReportScheduleResponse {\n");
    
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