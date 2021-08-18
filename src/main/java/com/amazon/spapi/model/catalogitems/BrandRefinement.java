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

package com.amazon.spapi.model.catalogitems;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Description of a brand that can be used to get more fine-grained search results.
 */
@Schema(description = "Description of a brand that can be used to get more fine-grained search results.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-18T11:31:18.960277+08:00[Asia/Shanghai]")
public class BrandRefinement {
  @SerializedName("numberOfResults")
  private Integer numberOfResults = null;

  @SerializedName("brandName")
  private String brandName = null;

  public BrandRefinement numberOfResults(Integer numberOfResults) {
    this.numberOfResults = numberOfResults;
    return this;
  }

   /**
   * The estimated number of results that would still be returned if refinement key applied.
   * @return numberOfResults
  **/
  @Schema(required = true, description = "The estimated number of results that would still be returned if refinement key applied.")
  public Integer getNumberOfResults() {
    return numberOfResults;
  }

  public void setNumberOfResults(Integer numberOfResults) {
    this.numberOfResults = numberOfResults;
  }

  public BrandRefinement brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

   /**
   * Brand name. For display and can be used as a search refinement.
   * @return brandName
  **/
  @Schema(required = true, description = "Brand name. For display and can be used as a search refinement.")
  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandRefinement brandRefinement = (BrandRefinement) o;
    return Objects.equals(this.numberOfResults, brandRefinement.numberOfResults) &&
        Objects.equals(this.brandName, brandRefinement.brandName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfResults, brandName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandRefinement {\n");
    
    sb.append("    numberOfResults: ").append(toIndentedString(numberOfResults)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
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
