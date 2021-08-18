/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.spapi.model.fulfillmentinbound;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Indicates the unit of weight.
 */
@JsonAdapter(UnitOfWeight.Adapter.class)
public enum UnitOfWeight {
  POUNDS("pounds"),
  KILOGRAMS("kilograms");

  private String value;

  UnitOfWeight(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UnitOfWeight fromValue(String text) {
    for (UnitOfWeight b : UnitOfWeight.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<UnitOfWeight> {
    @Override
    public void write(final JsonWriter jsonWriter, final UnitOfWeight enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public UnitOfWeight read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return UnitOfWeight.fromValue(String.valueOf(value));
    }
  }
}