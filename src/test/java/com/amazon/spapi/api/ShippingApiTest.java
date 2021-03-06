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

package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.models.shipping.CancelShipmentResponse;
import com.amazon.spapi.models.shipping.CreateShipmentRequest;
import com.amazon.spapi.models.shipping.CreateShipmentResponse;
import com.amazon.spapi.models.shipping.GetAccountResponse;
import com.amazon.spapi.models.shipping.GetRatesRequest;
import com.amazon.spapi.models.shipping.GetRatesResponse;
import com.amazon.spapi.models.shipping.GetShipmentResponse;
import com.amazon.spapi.models.shipping.GetTrackingInformationResponse;
import com.amazon.spapi.models.shipping.PurchaseLabelsRequest;
import com.amazon.spapi.models.shipping.PurchaseLabelsResponse;
import com.amazon.spapi.models.shipping.PurchaseShipmentRequest;
import com.amazon.spapi.models.shipping.PurchaseShipmentResponse;
import com.amazon.spapi.models.shipping.RetrieveShippingLabelRequest;
import com.amazon.spapi.models.shipping.RetrieveShippingLabelResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ShippingApi
 */
@Ignore
public class ShippingApiTest {

    private final ShippingApi api = new ShippingApi();

    /**
     * 
     *
     * Cancel a shipment by the given shipmentId.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelShipmentTest() throws ApiException {
        String shipmentId = null;
        CancelShipmentResponse response = api.cancelShipment(shipmentId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Create a new shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createShipmentTest() throws ApiException {
        CreateShipmentRequest body = null;
        CreateShipmentResponse response = api.createShipment(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Verify if the current account is valid.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountTest() throws ApiException {
        GetAccountResponse response = api.getAccount();

        // TODO: test validations
    }
    /**
     * 
     *
     * Get service rates.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRatesTest() throws ApiException {
        GetRatesRequest body = null;
        GetRatesResponse response = api.getRates(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Return the entire shipment object for the shipmentId.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShipmentTest() throws ApiException {
        String shipmentId = null;
        GetShipmentResponse response = api.getShipment(shipmentId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Return the tracking information of a shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrackingInformationTest() throws ApiException {
        String trackingId = null;
        GetTrackingInformationResponse response = api.getTrackingInformation(trackingId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Purchase shipping labels based on a given rate.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void purchaseLabelsTest() throws ApiException {
        PurchaseLabelsRequest body = null;
        String shipmentId = null;
        PurchaseLabelsResponse response = api.purchaseLabels(body, shipmentId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Purchase shipping labels.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void purchaseShipmentTest() throws ApiException {
        PurchaseShipmentRequest body = null;
        PurchaseShipmentResponse response = api.purchaseShipment(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieve shipping label based on the shipment id and tracking id.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveShippingLabelTest() throws ApiException {
        RetrieveShippingLabelRequest body = null;
        String shipmentId = null;
        String trackingId = null;
        RetrieveShippingLabelResponse response = api.retrieveShippingLabel(body, shipmentId, trackingId);

        // TODO: test validations
    }
}
