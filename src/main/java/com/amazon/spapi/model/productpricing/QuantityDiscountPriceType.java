/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer information for Amazon Marketplace products.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.spapi.model.productpricing;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.productpricing.MoneyType;
import com.amazon.spapi.model.productpricing.QuantityDiscountType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Contains pricing information that includes special pricing when buying in bulk.
 */
@Schema(description = "Contains pricing information that includes special pricing when buying in bulk.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-18T13:04:49.696345+08:00[Asia/Shanghai]")
public class QuantityDiscountPriceType {
  @SerializedName("quantityTier")
  private Integer quantityTier = null;

  @SerializedName("quantityDiscountType")
  private QuantityDiscountType quantityDiscountType = null;

  @SerializedName("price")
  private MoneyType price = null;

  public QuantityDiscountPriceType quantityTier(Integer quantityTier) {
    this.quantityTier = quantityTier;
    return this;
  }

   /**
   * Indicates at what quantity this price becomes active.
   * @return quantityTier
  **/
  @Schema(required = true, description = "Indicates at what quantity this price becomes active.")
  public Integer getQuantityTier() {
    return quantityTier;
  }

  public void setQuantityTier(Integer quantityTier) {
    this.quantityTier = quantityTier;
  }

  public QuantityDiscountPriceType quantityDiscountType(QuantityDiscountType quantityDiscountType) {
    this.quantityDiscountType = quantityDiscountType;
    return this;
  }

   /**
   * Get quantityDiscountType
   * @return quantityDiscountType
  **/
  @Schema(required = true, description = "")
  public QuantityDiscountType getQuantityDiscountType() {
    return quantityDiscountType;
  }

  public void setQuantityDiscountType(QuantityDiscountType quantityDiscountType) {
    this.quantityDiscountType = quantityDiscountType;
  }

  public QuantityDiscountPriceType price(MoneyType price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @Schema(required = true, description = "")
  public MoneyType getPrice() {
    return price;
  }

  public void setPrice(MoneyType price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuantityDiscountPriceType quantityDiscountPriceType = (QuantityDiscountPriceType) o;
    return Objects.equals(this.quantityTier, quantityDiscountPriceType.quantityTier) &&
        Objects.equals(this.quantityDiscountType, quantityDiscountPriceType.quantityDiscountType) &&
        Objects.equals(this.price, quantityDiscountPriceType.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantityTier, quantityDiscountType, price);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuantityDiscountPriceType {\n");
    
    sb.append("    quantityTier: ").append(toIndentedString(quantityTier)).append("\n");
    sb.append("    quantityDiscountType: ").append(toIndentedString(quantityDiscountType)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
