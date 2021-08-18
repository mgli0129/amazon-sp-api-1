/*
 * Selling Partner API for Direct Fulfillment Shipping
 * The Selling Partner API for Direct Fulfillment Shipping provides programmatic access to a direct fulfillment vendor's shipping data.
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
import com.amazon.spapi.model.vendordirectfulfillmentshippingv1.GetShippingLabelListResponse;
import com.amazon.spapi.model.vendordirectfulfillmentshippingv1.GetShippingLabelResponse;
import org.threeten.bp.OffsetDateTime;
import com.amazon.spapi.model.vendordirectfulfillmentshippingv1.SubmitShippingLabelsRequest;
import com.amazon.spapi.model.vendordirectfulfillmentshippingv1.SubmitShippingLabelsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VendorShippingLabelsApi
 */
@Ignore
public class VendorShippingLabelsApiTest {

    private final VendorShippingLabelsApi api = new VendorShippingLabelsApi();

    /**
     * 
     *
     * Returns a shipping label for the purchaseOrderNumber that you specify.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShippingLabelTest() throws ApiException {
        String purchaseOrderNumber = null;
        GetShippingLabelResponse response = api.getShippingLabel(purchaseOrderNumber);

        // TODO: test validations
    }
    /**
     * 
     *
     * Returns a list of shipping labels created during the time frame that you specify. You define that time frame using the createdAfter and createdBefore parameters. You must use both of these parameters. The date range to search must not be more than 7 days.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShippingLabelsTest() throws ApiException {
        OffsetDateTime createdAfter = null;
        OffsetDateTime createdBefore = null;
        String shipFromPartyId = null;
        Integer limit = null;
        String sortOrder = null;
        String nextToken = null;
        GetShippingLabelListResponse response = api.getShippingLabels(createdAfter, createdBefore, shipFromPartyId, limit, sortOrder, nextToken);

        // TODO: test validations
    }
    /**
     * 
     *
     * Creates a shipping label for a purchase order and returns a transactionId for reference.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitShippingLabelRequestTest() throws ApiException {
        SubmitShippingLabelsRequest body = null;
        SubmitShippingLabelsResponse response = api.submitShippingLabelRequest(body);

        // TODO: test validations
    }
}
