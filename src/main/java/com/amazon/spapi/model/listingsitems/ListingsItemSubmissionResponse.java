/*
 * Selling Partner API for Listings Items
 * The Selling Partner API for Listings Items (Listings Items API) provides programmatic access to selling partner listings on Amazon. Use this API in collaboration with the Selling Partner API for Product Type Definitions, which you use to retrieve the information about Amazon product types needed to use the Listings Items API.  For more information, see the [Listing Items API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/listings-items-api-use-case-guide/listings-items-api-use-case-guide_2020-09-01.md).
 *
 * OpenAPI spec version: 2020-09-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.spapi.model.listingsitems;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.listingsitems.Issue;
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
 * Response containing the results of a submission to the Selling Partner API for Listings Items.
 */
@Schema(description = "Response containing the results of a submission to the Selling Partner API for Listings Items.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-18T13:04:34.171325+08:00[Asia/Shanghai]")
public class ListingsItemSubmissionResponse {
  @SerializedName("sku")
  private String sku = null;

  /**
   * The status of the listings item submission.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACCEPTED("ACCEPTED"),
    INVALID("INVALID");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("submissionId")
  private String submissionId = null;

  @SerializedName("issues")
  private List<Issue> issues = null;

  public ListingsItemSubmissionResponse sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * A selling partner provided identifier for an Amazon listing.
   * @return sku
  **/
  @Schema(required = true, description = "A selling partner provided identifier for an Amazon listing.")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public ListingsItemSubmissionResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the listings item submission.
   * @return status
  **/
  @Schema(required = true, description = "The status of the listings item submission.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ListingsItemSubmissionResponse submissionId(String submissionId) {
    this.submissionId = submissionId;
    return this;
  }

   /**
   * The unique identifier of the listings item submission.
   * @return submissionId
  **/
  @Schema(required = true, description = "The unique identifier of the listings item submission.")
  public String getSubmissionId() {
    return submissionId;
  }

  public void setSubmissionId(String submissionId) {
    this.submissionId = submissionId;
  }

  public ListingsItemSubmissionResponse issues(List<Issue> issues) {
    this.issues = issues;
    return this;
  }

  public ListingsItemSubmissionResponse addIssuesItem(Issue issuesItem) {
    if (this.issues == null) {
      this.issues = new ArrayList<Issue>();
    }
    this.issues.add(issuesItem);
    return this;
  }

   /**
   * Listings item issues related to the listings item submission.
   * @return issues
  **/
  @Schema(description = "Listings item issues related to the listings item submission.")
  public List<Issue> getIssues() {
    return issues;
  }

  public void setIssues(List<Issue> issues) {
    this.issues = issues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingsItemSubmissionResponse listingsItemSubmissionResponse = (ListingsItemSubmissionResponse) o;
    return Objects.equals(this.sku, listingsItemSubmissionResponse.sku) &&
        Objects.equals(this.status, listingsItemSubmissionResponse.status) &&
        Objects.equals(this.submissionId, listingsItemSubmissionResponse.submissionId) &&
        Objects.equals(this.issues, listingsItemSubmissionResponse.issues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, status, submissionId, issues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingsItemSubmissionResponse {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
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
