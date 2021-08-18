/*
 * Selling Partner API for Finances
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.spapi.model.finances;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.finances.Currency;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * A promotion applied to an item.
 */
@Schema(description = "A promotion applied to an item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-18T11:31:30.762647+08:00[Asia/Shanghai]")
public class Promotion {
  @SerializedName("PromotionType")
  private String promotionType = null;

  @SerializedName("PromotionId")
  private String promotionId = null;

  @SerializedName("PromotionAmount")
  private Currency promotionAmount = null;

  public Promotion promotionType(String promotionType) {
    this.promotionType = promotionType;
    return this;
  }

   /**
   * The type of promotion.
   * @return promotionType
  **/
  @Schema(description = "The type of promotion.")
  public String getPromotionType() {
    return promotionType;
  }

  public void setPromotionType(String promotionType) {
    this.promotionType = promotionType;
  }

  public Promotion promotionId(String promotionId) {
    this.promotionId = promotionId;
    return this;
  }

   /**
   * The seller-specified identifier for the promotion.
   * @return promotionId
  **/
  @Schema(description = "The seller-specified identifier for the promotion.")
  public String getPromotionId() {
    return promotionId;
  }

  public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }

  public Promotion promotionAmount(Currency promotionAmount) {
    this.promotionAmount = promotionAmount;
    return this;
  }

   /**
   * Get promotionAmount
   * @return promotionAmount
  **/
  @Schema(description = "")
  public Currency getPromotionAmount() {
    return promotionAmount;
  }

  public void setPromotionAmount(Currency promotionAmount) {
    this.promotionAmount = promotionAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Promotion promotion = (Promotion) o;
    return Objects.equals(this.promotionType, promotion.promotionType) &&
        Objects.equals(this.promotionId, promotion.promotionId) &&
        Objects.equals(this.promotionAmount, promotion.promotionAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotionType, promotionId, promotionAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Promotion {\n");
    
    sb.append("    promotionType: ").append(toIndentedString(promotionType)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    promotionAmount: ").append(toIndentedString(promotionAmount)).append("\n");
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
