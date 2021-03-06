/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items provides programmatic access to information about items in the Amazon catalog.  For more information, see the [Catalog Items API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/catalog-items-api-use-case-guide/catalog-items-api-use-case-guide_2020-12-01.md).
 *
 * OpenAPI spec version: 2020-12-01
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.spapi.models.catalogitems;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.models.catalogitems.ItemImage;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Images for an item in the Amazon catalog for the indicated Amazon marketplace.
 */
@Schema(description = "Images for an item in the Amazon catalog for the indicated Amazon marketplace.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-19T18:19:15.019584+08:00[Asia/Shanghai]")
public class ItemImagesByMarketplace {
  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("images")
  private List<ItemImage> images = new ArrayList<ItemImage>();

  public ItemImagesByMarketplace marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * Amazon marketplace identifier.
   * @return marketplaceId
  **/
  @Schema(required = true, description = "Amazon marketplace identifier.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public ItemImagesByMarketplace images(List<ItemImage> images) {
    this.images = images;
    return this;
  }

  public ItemImagesByMarketplace addImagesItem(ItemImage imagesItem) {
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Images for an item in the Amazon catalog for the indicated Amazon marketplace.
   * @return images
  **/
  @Schema(required = true, description = "Images for an item in the Amazon catalog for the indicated Amazon marketplace.")
  public List<ItemImage> getImages() {
    return images;
  }

  public void setImages(List<ItemImage> images) {
    this.images = images;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemImagesByMarketplace itemImagesByMarketplace = (ItemImagesByMarketplace) o;
    return Objects.equals(this.marketplaceId, itemImagesByMarketplace.marketplaceId) &&
        Objects.equals(this.images, itemImagesByMarketplace.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, images);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemImagesByMarketplace {\n");

    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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
