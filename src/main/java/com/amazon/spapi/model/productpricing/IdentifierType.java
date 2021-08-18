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
import com.amazon.spapi.model.productpricing.ASINIdentifier;
import com.amazon.spapi.model.productpricing.SellerSKUIdentifier;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Specifies the identifiers used to uniquely identify an item.
 */
@Schema(description = "Specifies the identifiers used to uniquely identify an item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-18T13:04:49.696345+08:00[Asia/Shanghai]")
public class IdentifierType {
  @SerializedName("MarketplaceASIN")
  private ASINIdentifier marketplaceASIN = null;

  @SerializedName("SKUIdentifier")
  private SellerSKUIdentifier skUIdentifier = null;

  public IdentifierType marketplaceASIN(ASINIdentifier marketplaceASIN) {
    this.marketplaceASIN = marketplaceASIN;
    return this;
  }

   /**
   * Get marketplaceASIN
   * @return marketplaceASIN
  **/
  @Schema(required = true, description = "")
  public ASINIdentifier getMarketplaceASIN() {
    return marketplaceASIN;
  }

  public void setMarketplaceASIN(ASINIdentifier marketplaceASIN) {
    this.marketplaceASIN = marketplaceASIN;
  }

  public IdentifierType skUIdentifier(SellerSKUIdentifier skUIdentifier) {
    this.skUIdentifier = skUIdentifier;
    return this;
  }

   /**
   * Get skUIdentifier
   * @return skUIdentifier
  **/
  @Schema(description = "")
  public SellerSKUIdentifier getSkUIdentifier() {
    return skUIdentifier;
  }

  public void setSkUIdentifier(SellerSKUIdentifier skUIdentifier) {
    this.skUIdentifier = skUIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentifierType identifierType = (IdentifierType) o;
    return Objects.equals(this.marketplaceASIN, identifierType.marketplaceASIN) &&
        Objects.equals(this.skUIdentifier, identifierType.skUIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceASIN, skUIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentifierType {\n");
    
    sb.append("    marketplaceASIN: ").append(toIndentedString(marketplaceASIN)).append("\n");
    sb.append("    skUIdentifier: ").append(toIndentedString(skUIdentifier)).append("\n");
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
