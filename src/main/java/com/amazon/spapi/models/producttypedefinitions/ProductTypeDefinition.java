/*
 * Selling Partner API for Product Type Definitions
 * The Selling Partner API for Product Type Definitions provides programmatic access to attribute and data requirements for product types in the Amazon catalog. Use this API to return the JSON Schema for a product type that you can then use with other Selling Partner APIs, such as the Selling Partner API for Listings Items, the Selling Partner API for Catalog Items, and the Selling Partner API for Feeds (for JSON-based listing feeds).  For more information, see the [Product Type Definitions API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/product-type-definitions-api-use-case-guide/definitions-product-types-api-use-case-guide_2020-09-01.md).
 *
 * OpenAPI spec version: 2020-09-01
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.spapi.models.producttypedefinitions;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.models.producttypedefinitions.ProductTypeVersion;
import com.amazon.spapi.models.producttypedefinitions.PropertyGroup;
import com.amazon.spapi.models.producttypedefinitions.SchemaLink;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * A product type definition represents the attributes and data requirements for a product type in the Amazon catalog. Product type definitions are used interchangeably between the Selling Partner API for Listings Items, Selling Partner API for Catalog Items, and JSON-based listings feeds in the Selling Partner API for Feeds.
 */
@Schema(description = "A product type definition represents the attributes and data requirements for a product type in the Amazon catalog. Product type definitions are used interchangeably between the Selling Partner API for Listings Items, Selling Partner API for Catalog Items, and JSON-based listings feeds in the Selling Partner API for Feeds.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-19T18:26:26.310790+08:00[Asia/Shanghai]")
public class ProductTypeDefinition {
  @SerializedName("metaSchema")
  private SchemaLink metaSchema = null;

  @SerializedName("schema")
  private SchemaLink schema = null;

  /**
   * Name of the requirements set represented in this product type definition.
   */
  @JsonAdapter(RequirementsEnum.Adapter.class)
  public enum RequirementsEnum {
    LISTING("LISTING"),
    LISTING_PRODUCT_ONLY("LISTING_PRODUCT_ONLY"),
    LISTING_OFFER_ONLY("LISTING_OFFER_ONLY");

    private String value;

    RequirementsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RequirementsEnum fromValue(String text) {
      for (RequirementsEnum b : RequirementsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RequirementsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RequirementsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RequirementsEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return RequirementsEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("requirements")
  private RequirementsEnum requirements = null;

  /**
   * Identifies if the required attributes for a requirements set are enforced by the product type definition schema. Non-enforced requirements enable structural validation of individual attributes without all of the required attributes being present (such as for partial updates).
   */
  @JsonAdapter(RequirementsEnforcedEnum.Adapter.class)
  public enum RequirementsEnforcedEnum {
    ENFORCED("ENFORCED"),
    NOT_ENFORCED("NOT_ENFORCED");

    private String value;

    RequirementsEnforcedEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RequirementsEnforcedEnum fromValue(String text) {
      for (RequirementsEnforcedEnum b : RequirementsEnforcedEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RequirementsEnforcedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RequirementsEnforcedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RequirementsEnforcedEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return RequirementsEnforcedEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("requirementsEnforced")
  private RequirementsEnforcedEnum requirementsEnforced = null;

  @SerializedName("propertyGroups")
  private Map<String, PropertyGroup> propertyGroups = new HashMap<String, PropertyGroup>();

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("marketplaceIds")
  private List<String> marketplaceIds = new ArrayList<String>();

  @SerializedName("productType")
  private String productType = null;

  @SerializedName("productTypeVersion")
  private ProductTypeVersion productTypeVersion = null;

  public ProductTypeDefinition metaSchema(SchemaLink metaSchema) {
    this.metaSchema = metaSchema;
    return this;
  }

   /**
   * Get metaSchema
   * @return metaSchema
  **/
  @Schema(description = "")
  public SchemaLink getMetaSchema() {
    return metaSchema;
  }

  public void setMetaSchema(SchemaLink metaSchema) {
    this.metaSchema = metaSchema;
  }

  public ProductTypeDefinition schema(SchemaLink schema) {
    this.schema = schema;
    return this;
  }

   /**
   * Get schema
   * @return schema
  **/
  @Schema(required = true, description = "")
  public SchemaLink getSchema() {
    return schema;
  }

  public void setSchema(SchemaLink schema) {
    this.schema = schema;
  }

  public ProductTypeDefinition requirements(RequirementsEnum requirements) {
    this.requirements = requirements;
    return this;
  }

   /**
   * Name of the requirements set represented in this product type definition.
   * @return requirements
  **/
  @Schema(required = true, description = "Name of the requirements set represented in this product type definition.")
  public RequirementsEnum getRequirements() {
    return requirements;
  }

  public void setRequirements(RequirementsEnum requirements) {
    this.requirements = requirements;
  }

  public ProductTypeDefinition requirementsEnforced(RequirementsEnforcedEnum requirementsEnforced) {
    this.requirementsEnforced = requirementsEnforced;
    return this;
  }

   /**
   * Identifies if the required attributes for a requirements set are enforced by the product type definition schema. Non-enforced requirements enable structural validation of individual attributes without all of the required attributes being present (such as for partial updates).
   * @return requirementsEnforced
  **/
  @Schema(required = true, description = "Identifies if the required attributes for a requirements set are enforced by the product type definition schema. Non-enforced requirements enable structural validation of individual attributes without all of the required attributes being present (such as for partial updates).")
  public RequirementsEnforcedEnum getRequirementsEnforced() {
    return requirementsEnforced;
  }

  public void setRequirementsEnforced(RequirementsEnforcedEnum requirementsEnforced) {
    this.requirementsEnforced = requirementsEnforced;
  }

  public ProductTypeDefinition propertyGroups(Map<String, PropertyGroup> propertyGroups) {
    this.propertyGroups = propertyGroups;
    return this;
  }

  public ProductTypeDefinition putPropertyGroupsItem(String key, PropertyGroup propertyGroupsItem) {
    this.propertyGroups.put(key, propertyGroupsItem);
    return this;
  }

   /**
   * Mapping of property group names to property groups. Property groups represent logical groupings of schema properties that can be used for display or informational purposes.
   * @return propertyGroups
  **/
  @Schema(required = true, description = "Mapping of property group names to property groups. Property groups represent logical groupings of schema properties that can be used for display or informational purposes.")
  public Map<String, PropertyGroup> getPropertyGroups() {
    return propertyGroups;
  }

  public void setPropertyGroups(Map<String, PropertyGroup> propertyGroups) {
    this.propertyGroups = propertyGroups;
  }

  public ProductTypeDefinition locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Locale of the display elements contained in the product type definition.
   * @return locale
  **/
  @Schema(required = true, description = "Locale of the display elements contained in the product type definition.")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public ProductTypeDefinition marketplaceIds(List<String> marketplaceIds) {
    this.marketplaceIds = marketplaceIds;
    return this;
  }

  public ProductTypeDefinition addMarketplaceIdsItem(String marketplaceIdsItem) {
    this.marketplaceIds.add(marketplaceIdsItem);
    return this;
  }

   /**
   * Amazon marketplace identifiers for which the product type definition is applicable.
   * @return marketplaceIds
  **/
  @Schema(required = true, description = "Amazon marketplace identifiers for which the product type definition is applicable.")
  public List<String> getMarketplaceIds() {
    return marketplaceIds;
  }

  public void setMarketplaceIds(List<String> marketplaceIds) {
    this.marketplaceIds = marketplaceIds;
  }

  public ProductTypeDefinition productType(String productType) {
    this.productType = productType;
    return this;
  }

   /**
   * The name of the Amazon product type that this product type definition applies to.
   * @return productType
  **/
  @Schema(required = true, description = "The name of the Amazon product type that this product type definition applies to.")
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public ProductTypeDefinition productTypeVersion(ProductTypeVersion productTypeVersion) {
    this.productTypeVersion = productTypeVersion;
    return this;
  }

   /**
   * Get productTypeVersion
   * @return productTypeVersion
  **/
  @Schema(required = true, description = "")
  public ProductTypeVersion getProductTypeVersion() {
    return productTypeVersion;
  }

  public void setProductTypeVersion(ProductTypeVersion productTypeVersion) {
    this.productTypeVersion = productTypeVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductTypeDefinition productTypeDefinition = (ProductTypeDefinition) o;
    return Objects.equals(this.metaSchema, productTypeDefinition.metaSchema) &&
        Objects.equals(this.schema, productTypeDefinition.schema) &&
        Objects.equals(this.requirements, productTypeDefinition.requirements) &&
        Objects.equals(this.requirementsEnforced, productTypeDefinition.requirementsEnforced) &&
        Objects.equals(this.propertyGroups, productTypeDefinition.propertyGroups) &&
        Objects.equals(this.locale, productTypeDefinition.locale) &&
        Objects.equals(this.marketplaceIds, productTypeDefinition.marketplaceIds) &&
        Objects.equals(this.productType, productTypeDefinition.productType) &&
        Objects.equals(this.productTypeVersion, productTypeDefinition.productTypeVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaSchema, schema, requirements, requirementsEnforced, propertyGroups, locale, marketplaceIds, productType, productTypeVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductTypeDefinition {\n");

    sb.append("    metaSchema: ").append(toIndentedString(metaSchema)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
    sb.append("    requirementsEnforced: ").append(toIndentedString(requirementsEnforced)).append("\n");
    sb.append("    propertyGroups: ").append(toIndentedString(propertyGroups)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    marketplaceIds: ").append(toIndentedString(marketplaceIds)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    productTypeVersion: ").append(toIndentedString(productTypeVersion)).append("\n");
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