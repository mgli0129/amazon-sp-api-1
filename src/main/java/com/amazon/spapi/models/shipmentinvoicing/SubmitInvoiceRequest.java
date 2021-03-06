/*
 * Selling Partner API for Shipment Invoicing
 * The Selling Partner API for Shipment Invoicing helps you programmatically retrieve shipment invoice information in the Brazil marketplace for a selling partner’s Fulfillment by Amazon (FBA) orders.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.spapi.models.shipmentinvoicing;

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
 * The request schema for the submitInvoice operation.
 */
@Schema(description = "The request schema for the submitInvoice operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-19T18:28:52.436483+08:00[Asia/Shanghai]")
public class SubmitInvoiceRequest {
  @SerializedName("InvoiceContent")
  private byte[] invoiceContent = null;

  @SerializedName("ContentMD5Value")
  private String contentMD5Value = null;

  public SubmitInvoiceRequest invoiceContent(byte[] invoiceContent) {
    this.invoiceContent = invoiceContent;
    return this;
  }

   /**
   * Get invoiceContent
   * @return invoiceContent
  **/
  @Schema(required = true, description = "")
  public byte[] getInvoiceContent() {
    return invoiceContent;
  }

  public void setInvoiceContent(byte[] invoiceContent) {
    this.invoiceContent = invoiceContent;
  }

  public SubmitInvoiceRequest contentMD5Value(String contentMD5Value) {
    this.contentMD5Value = contentMD5Value;
    return this;
  }

   /**
   * MD5 sum for validating the invoice data. For more information about calculating this value, see [Working with Content-MD5 Checksums](https://docs.developer.amazonservices.com/en_US/dev_guide/DG_MD5.html).
   * @return contentMD5Value
  **/
  @Schema(required = true, description = "MD5 sum for validating the invoice data. For more information about calculating this value, see [Working with Content-MD5 Checksums](https://docs.developer.amazonservices.com/en_US/dev_guide/DG_MD5.html).")
  public String getContentMD5Value() {
    return contentMD5Value;
  }

  public void setContentMD5Value(String contentMD5Value) {
    this.contentMD5Value = contentMD5Value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitInvoiceRequest submitInvoiceRequest = (SubmitInvoiceRequest) o;
    return Objects.equals(this.invoiceContent, submitInvoiceRequest.invoiceContent) &&
        Objects.equals(this.contentMD5Value, submitInvoiceRequest.contentMD5Value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceContent, contentMD5Value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitInvoiceRequest {\n");

    sb.append("    invoiceContent: ").append(toIndentedString(invoiceContent)).append("\n");
    sb.append("    contentMD5Value: ").append(toIndentedString(contentMD5Value)).append("\n");
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
