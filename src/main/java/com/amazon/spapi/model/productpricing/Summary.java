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
import com.amazon.spapi.model.productpricing.BuyBoxEligibleOffers;
import com.amazon.spapi.model.productpricing.BuyBoxPrices;
import com.amazon.spapi.model.productpricing.LowestPrices;
import com.amazon.spapi.model.productpricing.MoneyType;
import com.amazon.spapi.model.productpricing.NumberOfOffers;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Contains price information about the product, including the LowestPrices and BuyBoxPrices, the ListPrice, the SuggestedLowerPricePlusShipping, and NumberOfOffers and NumberOfBuyBoxEligibleOffers.
 */
@Schema(description = "Contains price information about the product, including the LowestPrices and BuyBoxPrices, the ListPrice, the SuggestedLowerPricePlusShipping, and NumberOfOffers and NumberOfBuyBoxEligibleOffers.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-18T11:32:05.260775+08:00[Asia/Shanghai]")
public class Summary {
  @SerializedName("TotalOfferCount")
  private Integer totalOfferCount = null;

  @SerializedName("NumberOfOffers")
  private NumberOfOffers numberOfOffers = null;

  @SerializedName("LowestPrices")
  private LowestPrices lowestPrices = null;

  @SerializedName("BuyBoxPrices")
  private BuyBoxPrices buyBoxPrices = null;

  @SerializedName("ListPrice")
  private MoneyType listPrice = null;

  @SerializedName("SuggestedLowerPricePlusShipping")
  private MoneyType suggestedLowerPricePlusShipping = null;

  @SerializedName("BuyBoxEligibleOffers")
  private BuyBoxEligibleOffers buyBoxEligibleOffers = null;

  @SerializedName("OffersAvailableTime")
  private OffsetDateTime offersAvailableTime = null;

  public Summary totalOfferCount(Integer totalOfferCount) {
    this.totalOfferCount = totalOfferCount;
    return this;
  }

   /**
   * The number of unique offers contained in NumberOfOffers.
   * @return totalOfferCount
  **/
  @Schema(required = true, description = "The number of unique offers contained in NumberOfOffers.")
  public Integer getTotalOfferCount() {
    return totalOfferCount;
  }

  public void setTotalOfferCount(Integer totalOfferCount) {
    this.totalOfferCount = totalOfferCount;
  }

  public Summary numberOfOffers(NumberOfOffers numberOfOffers) {
    this.numberOfOffers = numberOfOffers;
    return this;
  }

   /**
   * Get numberOfOffers
   * @return numberOfOffers
  **/
  @Schema(description = "")
  public NumberOfOffers getNumberOfOffers() {
    return numberOfOffers;
  }

  public void setNumberOfOffers(NumberOfOffers numberOfOffers) {
    this.numberOfOffers = numberOfOffers;
  }

  public Summary lowestPrices(LowestPrices lowestPrices) {
    this.lowestPrices = lowestPrices;
    return this;
  }

   /**
   * Get lowestPrices
   * @return lowestPrices
  **/
  @Schema(description = "")
  public LowestPrices getLowestPrices() {
    return lowestPrices;
  }

  public void setLowestPrices(LowestPrices lowestPrices) {
    this.lowestPrices = lowestPrices;
  }

  public Summary buyBoxPrices(BuyBoxPrices buyBoxPrices) {
    this.buyBoxPrices = buyBoxPrices;
    return this;
  }

   /**
   * Get buyBoxPrices
   * @return buyBoxPrices
  **/
  @Schema(description = "")
  public BuyBoxPrices getBuyBoxPrices() {
    return buyBoxPrices;
  }

  public void setBuyBoxPrices(BuyBoxPrices buyBoxPrices) {
    this.buyBoxPrices = buyBoxPrices;
  }

  public Summary listPrice(MoneyType listPrice) {
    this.listPrice = listPrice;
    return this;
  }

   /**
   * Get listPrice
   * @return listPrice
  **/
  @Schema(description = "")
  public MoneyType getListPrice() {
    return listPrice;
  }

  public void setListPrice(MoneyType listPrice) {
    this.listPrice = listPrice;
  }

  public Summary suggestedLowerPricePlusShipping(MoneyType suggestedLowerPricePlusShipping) {
    this.suggestedLowerPricePlusShipping = suggestedLowerPricePlusShipping;
    return this;
  }

   /**
   * Get suggestedLowerPricePlusShipping
   * @return suggestedLowerPricePlusShipping
  **/
  @Schema(description = "")
  public MoneyType getSuggestedLowerPricePlusShipping() {
    return suggestedLowerPricePlusShipping;
  }

  public void setSuggestedLowerPricePlusShipping(MoneyType suggestedLowerPricePlusShipping) {
    this.suggestedLowerPricePlusShipping = suggestedLowerPricePlusShipping;
  }

  public Summary buyBoxEligibleOffers(BuyBoxEligibleOffers buyBoxEligibleOffers) {
    this.buyBoxEligibleOffers = buyBoxEligibleOffers;
    return this;
  }

   /**
   * Get buyBoxEligibleOffers
   * @return buyBoxEligibleOffers
  **/
  @Schema(description = "")
  public BuyBoxEligibleOffers getBuyBoxEligibleOffers() {
    return buyBoxEligibleOffers;
  }

  public void setBuyBoxEligibleOffers(BuyBoxEligibleOffers buyBoxEligibleOffers) {
    this.buyBoxEligibleOffers = buyBoxEligibleOffers;
  }

  public Summary offersAvailableTime(OffsetDateTime offersAvailableTime) {
    this.offersAvailableTime = offersAvailableTime;
    return this;
  }

   /**
   * When the status is ActiveButTooSoonForProcessing, this is the time when the offers will be available for processing.
   * @return offersAvailableTime
  **/
  @Schema(description = "When the status is ActiveButTooSoonForProcessing, this is the time when the offers will be available for processing.")
  public OffsetDateTime getOffersAvailableTime() {
    return offersAvailableTime;
  }

  public void setOffersAvailableTime(OffsetDateTime offersAvailableTime) {
    this.offersAvailableTime = offersAvailableTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Summary summary = (Summary) o;
    return Objects.equals(this.totalOfferCount, summary.totalOfferCount) &&
        Objects.equals(this.numberOfOffers, summary.numberOfOffers) &&
        Objects.equals(this.lowestPrices, summary.lowestPrices) &&
        Objects.equals(this.buyBoxPrices, summary.buyBoxPrices) &&
        Objects.equals(this.listPrice, summary.listPrice) &&
        Objects.equals(this.suggestedLowerPricePlusShipping, summary.suggestedLowerPricePlusShipping) &&
        Objects.equals(this.buyBoxEligibleOffers, summary.buyBoxEligibleOffers) &&
        Objects.equals(this.offersAvailableTime, summary.offersAvailableTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalOfferCount, numberOfOffers, lowestPrices, buyBoxPrices, listPrice, suggestedLowerPricePlusShipping, buyBoxEligibleOffers, offersAvailableTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Summary {\n");
    
    sb.append("    totalOfferCount: ").append(toIndentedString(totalOfferCount)).append("\n");
    sb.append("    numberOfOffers: ").append(toIndentedString(numberOfOffers)).append("\n");
    sb.append("    lowestPrices: ").append(toIndentedString(lowestPrices)).append("\n");
    sb.append("    buyBoxPrices: ").append(toIndentedString(buyBoxPrices)).append("\n");
    sb.append("    listPrice: ").append(toIndentedString(listPrice)).append("\n");
    sb.append("    suggestedLowerPricePlusShipping: ").append(toIndentedString(suggestedLowerPricePlusShipping)).append("\n");
    sb.append("    buyBoxEligibleOffers: ").append(toIndentedString(buyBoxEligibleOffers)).append("\n");
    sb.append("    offersAvailableTime: ").append(toIndentedString(offersAvailableTime)).append("\n");
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
