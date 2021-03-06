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

package com.amazon.spapi.models.vendordirectfulfillmentshipping;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.models.vendordirectfulfillmentshipping.ItemQuantity;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Details of the item being shipped.
 */
@Schema(description = "Details of the item being shipped.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-19T18:32:26.407858+08:00[Asia/Shanghai]")
public class Item {
  @SerializedName("itemSequenceNumber")
  private Integer itemSequenceNumber = null;

  @SerializedName("buyerProductIdentifier")
  private String buyerProductIdentifier = null;

  @SerializedName("vendorProductIdentifier")
  private String vendorProductIdentifier = null;

  @SerializedName("shippedQuantity")
  private ItemQuantity shippedQuantity = null;

  public Item itemSequenceNumber(Integer itemSequenceNumber) {
    this.itemSequenceNumber = itemSequenceNumber;
    return this;
  }

   /**
   * Item Sequence Number for the item. This must be the same value as sent in order for a given item.
   * @return itemSequenceNumber
  **/
  @Schema(required = true, description = "Item Sequence Number for the item. This must be the same value as sent in order for a given item.")
  public Integer getItemSequenceNumber() {
    return itemSequenceNumber;
  }

  public void setItemSequenceNumber(Integer itemSequenceNumber) {
    this.itemSequenceNumber = itemSequenceNumber;
  }

  public Item buyerProductIdentifier(String buyerProductIdentifier) {
    this.buyerProductIdentifier = buyerProductIdentifier;
    return this;
  }

   /**
   * Buyer&#x27;s Standard Identification Number (ASIN) of an item. Either buyerProductIdentifier or vendorProductIdentifier is required.
   * @return buyerProductIdentifier
  **/
  @Schema(description = "Buyer's Standard Identification Number (ASIN) of an item. Either buyerProductIdentifier or vendorProductIdentifier is required.")
  public String getBuyerProductIdentifier() {
    return buyerProductIdentifier;
  }

  public void setBuyerProductIdentifier(String buyerProductIdentifier) {
    this.buyerProductIdentifier = buyerProductIdentifier;
  }

  public Item vendorProductIdentifier(String vendorProductIdentifier) {
    this.vendorProductIdentifier = vendorProductIdentifier;
    return this;
  }

   /**
   * The vendor selected product identification of the item. Should be the same as was sent in the purchase order, like SKU Number.
   * @return vendorProductIdentifier
  **/
  @Schema(description = "The vendor selected product identification of the item. Should be the same as was sent in the purchase order, like SKU Number.")
  public String getVendorProductIdentifier() {
    return vendorProductIdentifier;
  }

  public void setVendorProductIdentifier(String vendorProductIdentifier) {
    this.vendorProductIdentifier = vendorProductIdentifier;
  }

  public Item shippedQuantity(ItemQuantity shippedQuantity) {
    this.shippedQuantity = shippedQuantity;
    return this;
  }

   /**
   * Get shippedQuantity
   * @return shippedQuantity
  **/
  @Schema(required = true, description = "")
  public ItemQuantity getShippedQuantity() {
    return shippedQuantity;
  }

  public void setShippedQuantity(ItemQuantity shippedQuantity) {
    this.shippedQuantity = shippedQuantity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.itemSequenceNumber, item.itemSequenceNumber) &&
        Objects.equals(this.buyerProductIdentifier, item.buyerProductIdentifier) &&
        Objects.equals(this.vendorProductIdentifier, item.vendorProductIdentifier) &&
        Objects.equals(this.shippedQuantity, item.shippedQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemSequenceNumber, buyerProductIdentifier, vendorProductIdentifier, shippedQuantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");

    sb.append("    itemSequenceNumber: ").append(toIndentedString(itemSequenceNumber)).append("\n");
    sb.append("    buyerProductIdentifier: ").append(toIndentedString(buyerProductIdentifier)).append("\n");
    sb.append("    vendorProductIdentifier: ").append(toIndentedString(vendorProductIdentifier)).append("\n");
    sb.append("    shippedQuantity: ").append(toIndentedString(shippedQuantity)).append("\n");
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
