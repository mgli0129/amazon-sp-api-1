/*
 * Selling Partner API for A+ Content Management
 * With the A+ Content API, you can build applications that help selling partners add rich marketing content to their Amazon product detail pages. A+ content helps selling partners share their brand and product story, which helps buyers make informed purchasing decisions. Selling partners assemble content by choosing from content modules and adding images and text.
 *
 * OpenAPI spec version: 2020-11-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.spapi.model.apluscontent;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.apluscontent.TextComponent;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Rich positional text, usually presented as a collection of bullet points.
 */
@Schema(description = "Rich positional text, usually presented as a collection of bullet points.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-18T13:04:02.980344+08:00[Asia/Shanghai]")
public class TextItem {
  @SerializedName("position")
  private Integer position = null;

  @SerializedName("text")
  private TextComponent text = null;

  public TextItem position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * The rank or index of this text item within the collection. Different items cannot occupy the same position within a single collection.
   * minimum: 1
   * maximum: 100
   * @return position
  **/
  @Schema(required = true, description = "The rank or index of this text item within the collection. Different items cannot occupy the same position within a single collection.")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public TextItem text(TextComponent text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @Schema(required = true, description = "")
  public TextComponent getText() {
    return text;
  }

  public void setText(TextComponent text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextItem textItem = (TextItem) o;
    return Objects.equals(this.position, textItem.position) &&
        Objects.equals(this.text, textItem.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextItem {\n");
    
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
