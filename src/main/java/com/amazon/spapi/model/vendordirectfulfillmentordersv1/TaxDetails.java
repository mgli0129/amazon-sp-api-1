/*
 * Selling Partner API for Direct Fulfillment Orders
 * The Selling Partner API for Direct Fulfillment Orders provides programmatic access to a direct fulfillment vendor's order data.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.spapi.model.vendordirectfulfillmentordersv1;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.vendordirectfulfillmentordersv1.Money;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * TaxDetails
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-18T11:32:38.867657+08:00[Asia/Shanghai]")
public class TaxDetails {
  @SerializedName("taxRate")
  private String taxRate = null;

  @SerializedName("taxAmount")
  private Money taxAmount = null;

  @SerializedName("taxableAmount")
  private Money taxableAmount = null;

  /**
   * Tax type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CONSUMPTION("CONSUMPTION"),
    GST("GST"),
    MWST_("MwSt."),
    PST("PST"),
    TOTAL("TOTAL"),
    TVA("TVA"),
    VAT("VAT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  public TaxDetails taxRate(String taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Get taxRate
   * @return taxRate
  **/
  @Schema(description = "")
  public String getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(String taxRate) {
    this.taxRate = taxRate;
  }

  public TaxDetails taxAmount(Money taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Get taxAmount
   * @return taxAmount
  **/
  @Schema(required = true, description = "")
  public Money getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(Money taxAmount) {
    this.taxAmount = taxAmount;
  }

  public TaxDetails taxableAmount(Money taxableAmount) {
    this.taxableAmount = taxableAmount;
    return this;
  }

   /**
   * Get taxableAmount
   * @return taxableAmount
  **/
  @Schema(description = "")
  public Money getTaxableAmount() {
    return taxableAmount;
  }

  public void setTaxableAmount(Money taxableAmount) {
    this.taxableAmount = taxableAmount;
  }

  public TaxDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Tax type.
   * @return type
  **/
  @Schema(description = "Tax type.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxDetails taxDetails = (TaxDetails) o;
    return Objects.equals(this.taxRate, taxDetails.taxRate) &&
        Objects.equals(this.taxAmount, taxDetails.taxAmount) &&
        Objects.equals(this.taxableAmount, taxDetails.taxableAmount) &&
        Objects.equals(this.type, taxDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxRate, taxAmount, taxableAmount, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxDetails {\n");
    
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxableAmount: ").append(toIndentedString(taxableAmount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
