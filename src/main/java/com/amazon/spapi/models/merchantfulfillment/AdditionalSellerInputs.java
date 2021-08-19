/*
 * Selling Partner API for Merchant Fulfillment
 * The Selling Partner API for Merchant Fulfillment helps you build applications that let sellers purchase shipping for non-Prime and Prime orders using Amazon’s Buy Shipping Services.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.spapi.models.merchantfulfillment;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.models.merchantfulfillment.AdditionalSellerInput;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * An additional set of seller inputs required to purchase shipping.
 */
@Schema(description = "An additional set of seller inputs required to purchase shipping.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-19T18:24:02.400188+08:00[Asia/Shanghai]")
public class AdditionalSellerInputs {
  @SerializedName("AdditionalInputFieldName")
  private String additionalInputFieldName = null;

  @SerializedName("AdditionalSellerInput")
  private AdditionalSellerInput additionalSellerInput = null;

  public AdditionalSellerInputs additionalInputFieldName(String additionalInputFieldName) {
    this.additionalInputFieldName = additionalInputFieldName;
    return this;
  }

   /**
   * The name of the additional input field.
   * @return additionalInputFieldName
  **/
  @Schema(required = true, description = "The name of the additional input field.")
  public String getAdditionalInputFieldName() {
    return additionalInputFieldName;
  }

  public void setAdditionalInputFieldName(String additionalInputFieldName) {
    this.additionalInputFieldName = additionalInputFieldName;
  }

  public AdditionalSellerInputs additionalSellerInput(AdditionalSellerInput additionalSellerInput) {
    this.additionalSellerInput = additionalSellerInput;
    return this;
  }

   /**
   * Get additionalSellerInput
   * @return additionalSellerInput
  **/
  @Schema(required = true, description = "")
  public AdditionalSellerInput getAdditionalSellerInput() {
    return additionalSellerInput;
  }

  public void setAdditionalSellerInput(AdditionalSellerInput additionalSellerInput) {
    this.additionalSellerInput = additionalSellerInput;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalSellerInputs additionalSellerInputs = (AdditionalSellerInputs) o;
    return Objects.equals(this.additionalInputFieldName, additionalSellerInputs.additionalInputFieldName) &&
        Objects.equals(this.additionalSellerInput, additionalSellerInputs.additionalSellerInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInputFieldName, additionalSellerInput);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalSellerInputs {\n");

    sb.append("    additionalInputFieldName: ").append(toIndentedString(additionalInputFieldName)).append("\n");
    sb.append("    additionalSellerInput: ").append(toIndentedString(additionalSellerInput)).append("\n");
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