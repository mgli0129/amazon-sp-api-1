/*
 * Selling Partner API for Merchant Fulfillment
 * The Selling Partner API for Merchant Fulfillment helps you build applications that let sellers purchase shipping for non-Prime and Prime orders using Amazon’s Buy Shipping Services.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.spapi.model.merchantfulfillment;

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
 * The shipment status.
 */
@JsonAdapter(ShipmentStatus.Adapter.class)
public enum ShipmentStatus {
  PURCHASED("Purchased"),
  REFUNDPENDING("RefundPending"),
  REFUNDREJECTED("RefundRejected"),
  REFUNDAPPLIED("RefundApplied");

  private String value;

  ShipmentStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ShipmentStatus fromValue(String text) {
    for (ShipmentStatus b : ShipmentStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ShipmentStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ShipmentStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ShipmentStatus read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ShipmentStatus.fromValue(String.valueOf(value));
    }
  }
}
