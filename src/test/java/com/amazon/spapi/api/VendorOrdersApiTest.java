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

package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.models.vendordirectfulfillmentorders.GetOrderResponse;
import com.amazon.spapi.models.vendordirectfulfillmentorders.GetOrdersResponse;
import org.threeten.bp.OffsetDateTime;
import com.amazon.spapi.models.vendordirectfulfillmentorders.SubmitAcknowledgementRequest;
import com.amazon.spapi.models.vendordirectfulfillmentorders.SubmitAcknowledgementResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VendorOrdersApi
 */
@Ignore
public class VendorOrdersApiTest {

    private final VendorOrdersApi api = new VendorOrdersApi();

    /**
     * 
     *
     * Returns purchase order information for the purchaseOrderNumber that you specify.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderTest() throws ApiException {
        String purchaseOrderNumber = null;
        GetOrderResponse response = api.getOrder(purchaseOrderNumber);

        // TODO: test validations
    }
    /**
     * 
     *
     * Returns a list of purchase orders created during the time frame that you specify. You define the time frame using the createdAfter and createdBefore parameters. You must use both parameters. You can choose to get only the purchase order numbers by setting the includeDetails parameter to false. In that case, the operation returns a list of purchase order numbers. You can then call the getOrder operation to return the details of a specific order.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrdersTest() throws ApiException {
        OffsetDateTime createdAfter = null;
        OffsetDateTime createdBefore = null;
        String shipFromPartyId = null;
        String status = null;
        Long limit = null;
        String sortOrder = null;
        String nextToken = null;
        String includeDetails = null;
        GetOrdersResponse response = api.getOrders(createdAfter, createdBefore, shipFromPartyId, status, limit, sortOrder, nextToken, includeDetails);

        // TODO: test validations
    }
    /**
     * 
     *
     * Submits acknowledgements for one or more purchase orders.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitAcknowledgementTest() throws ApiException {
        SubmitAcknowledgementRequest body = null;
        SubmitAcknowledgementResponse response = api.submitAcknowledgement(body);

        // TODO: test validations
    }
}
