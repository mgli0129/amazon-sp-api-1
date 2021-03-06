/*
 * Selling Partner API for Product Fees
 * The Selling Partner API for Product Fees lets you programmatically retrieve estimated fees for a product. You can then account for those fees in your pricing.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.spapi.models.productfees;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.models.productfees.FeesEstimateResult;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Response schema.
 */
@Schema(description = "Response schema.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-19T18:25:33.339786+08:00[Asia/Shanghai]")
public class GetMyFeesEstimateResult {
  @SerializedName("FeesEstimateResult")
  private FeesEstimateResult feesEstimateResult = null;

  public GetMyFeesEstimateResult feesEstimateResult(FeesEstimateResult feesEstimateResult) {
    this.feesEstimateResult = feesEstimateResult;
    return this;
  }

   /**
   * Get feesEstimateResult
   * @return feesEstimateResult
  **/
  @Schema(description = "")
  public FeesEstimateResult getFeesEstimateResult() {
    return feesEstimateResult;
  }

  public void setFeesEstimateResult(FeesEstimateResult feesEstimateResult) {
    this.feesEstimateResult = feesEstimateResult;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMyFeesEstimateResult getMyFeesEstimateResult = (GetMyFeesEstimateResult) o;
    return Objects.equals(this.feesEstimateResult, getMyFeesEstimateResult.feesEstimateResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feesEstimateResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMyFeesEstimateResult {\n");

    sb.append("    feesEstimateResult: ").append(toIndentedString(feesEstimateResult)).append("\n");
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
