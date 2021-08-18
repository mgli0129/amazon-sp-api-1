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
import com.amazon.spapi.model.apluscontent.DecoratorSet;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Rich text content.
 */
@Schema(description = "Rich text content.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-18T11:31:12.277960+08:00[Asia/Shanghai]")
public class TextComponent {
  @SerializedName("value")
  private String value = null;

  @SerializedName("decoratorSet")
  private DecoratorSet decoratorSet = null;

  public TextComponent value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The actual plain text.
   * @return value
  **/
  @Schema(required = true, description = "The actual plain text.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public TextComponent decoratorSet(DecoratorSet decoratorSet) {
    this.decoratorSet = decoratorSet;
    return this;
  }

   /**
   * Get decoratorSet
   * @return decoratorSet
  **/
  @Schema(description = "")
  public DecoratorSet getDecoratorSet() {
    return decoratorSet;
  }

  public void setDecoratorSet(DecoratorSet decoratorSet) {
    this.decoratorSet = decoratorSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextComponent textComponent = (TextComponent) o;
    return Objects.equals(this.value, textComponent.value) &&
        Objects.equals(this.decoratorSet, textComponent.decoratorSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, decoratorSet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextComponent {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    decoratorSet: ").append(toIndentedString(decoratorSet)).append("\n");
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
