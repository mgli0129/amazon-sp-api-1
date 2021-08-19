/*
 * Selling Partner API for Shipping
 * Provides programmatic access to Amazon Shipping APIs.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.spapi.models.shipping;

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
 * The type of shipping service that will be used for the service offering.
 */
@JsonAdapter(ServiceType.Adapter.class)
public enum ServiceType {
  GROUND("Amazon Shipping Ground"),
  STANDARD("Amazon Shipping Standard"),
  PREMIUM("Amazon Shipping Premium");

  private String value;

  ServiceType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ServiceType fromValue(String text) {
    for (ServiceType b : ServiceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ServiceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ServiceType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ServiceType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ServiceType.fromValue(String.valueOf(value));
    }
  }
}