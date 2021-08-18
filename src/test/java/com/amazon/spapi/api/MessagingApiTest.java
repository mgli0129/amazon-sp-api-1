/*
 * Selling Partner API for Messaging
 * With the Messaging API you can build applications that send messages to buyers. You can get a list of message types that are available for an order that you specify, then call an operation that sends a message to the buyer for that order. The Messaging API returns responses that are formed according to the <a href=https://tools.ietf.org/html/draft-kelly-json-hal-08>JSON Hypertext Application Language</a> (HAL) standard.
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
import com.amazon.spapi.model.messaging.CreateAmazonMotorsRequest;
import com.amazon.spapi.model.messaging.CreateAmazonMotorsResponse;
import com.amazon.spapi.model.messaging.CreateConfirmCustomizationDetailsRequest;
import com.amazon.spapi.model.messaging.CreateConfirmCustomizationDetailsResponse;
import com.amazon.spapi.model.messaging.CreateConfirmDeliveryDetailsRequest;
import com.amazon.spapi.model.messaging.CreateConfirmDeliveryDetailsResponse;
import com.amazon.spapi.model.messaging.CreateConfirmOrderDetailsRequest;
import com.amazon.spapi.model.messaging.CreateConfirmOrderDetailsResponse;
import com.amazon.spapi.model.messaging.CreateConfirmServiceDetailsRequest;
import com.amazon.spapi.model.messaging.CreateConfirmServiceDetailsResponse;
import com.amazon.spapi.model.messaging.CreateDigitalAccessKeyRequest;
import com.amazon.spapi.model.messaging.CreateDigitalAccessKeyResponse;
import com.amazon.spapi.model.messaging.CreateLegalDisclosureRequest;
import com.amazon.spapi.model.messaging.CreateLegalDisclosureResponse;
import com.amazon.spapi.model.messaging.CreateNegativeFeedbackRemovalResponse;
import com.amazon.spapi.model.messaging.CreateUnexpectedProblemRequest;
import com.amazon.spapi.model.messaging.CreateUnexpectedProblemResponse;
import com.amazon.spapi.model.messaging.CreateWarrantyRequest;
import com.amazon.spapi.model.messaging.CreateWarrantyResponse;
import com.amazon.spapi.model.messaging.GetAttributesResponse;
import com.amazon.spapi.model.messaging.GetMessagingActionsForOrderResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagingApi
 */
@Ignore
public class MessagingApiTest {

    private final MessagingApi api = new MessagingApi();

    /**
     * 
     *
     * Sends a message asking a buyer to provide or verify customization details such as name spelling, images, initials, etc.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void confirmCustomizationDetailsTest() throws ApiException {
        CreateConfirmCustomizationDetailsRequest body = null;
        List<String> marketplaceIds = null;
        String amazonOrderId = null;
        CreateConfirmCustomizationDetailsResponse response = api.confirmCustomizationDetails(body, marketplaceIds, amazonOrderId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Sends a message to a buyer to provide details about an Amazon Motors order. This message can only be sent by Amazon Motors sellers.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAmazonMotorsTest() throws ApiException {
        CreateAmazonMotorsRequest body = null;
        List<String> marketplaceIds = null;
        String amazonOrderId = null;
        CreateAmazonMotorsResponse response = api.createAmazonMotors(body, marketplaceIds, amazonOrderId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Sends a message to a buyer to arrange a delivery or to confirm contact information for making a delivery.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createConfirmDeliveryDetailsTest() throws ApiException {
        CreateConfirmDeliveryDetailsRequest body = null;
        List<String> marketplaceIds = null;
        String amazonOrderId = null;
        CreateConfirmDeliveryDetailsResponse response = api.createConfirmDeliveryDetails(body, marketplaceIds, amazonOrderId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Sends a message to ask a buyer an order-related question prior to shipping their order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createConfirmOrderDetailsTest() throws ApiException {
        CreateConfirmOrderDetailsRequest body = null;
        List<String> marketplaceIds = null;
        String amazonOrderId = null;
        CreateConfirmOrderDetailsResponse response = api.createConfirmOrderDetails(body, marketplaceIds, amazonOrderId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Sends a message to contact a Home Service customer to arrange a service call or to gather information prior to a service call.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createConfirmServiceDetailsTest() throws ApiException {
        CreateConfirmServiceDetailsRequest body = null;
        List<String> marketplaceIds = null;
        String amazonOrderId = null;
        CreateConfirmServiceDetailsResponse response = api.createConfirmServiceDetails(body, marketplaceIds, amazonOrderId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Sends a message to a buyer to share a digital access key needed to utilize digital content in their order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDigitalAccessKeyTest() throws ApiException {
        CreateDigitalAccessKeyRequest body = null;
        List<String> marketplaceIds = null;
        String amazonOrderId = null;
        CreateDigitalAccessKeyResponse response = api.createDigitalAccessKey(body, marketplaceIds, amazonOrderId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Sends a critical message that contains documents that a seller is legally obligated to provide to the buyer. This message should only be used to deliver documents that are required by law.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createLegalDisclosureTest() throws ApiException {
        CreateLegalDisclosureRequest body = null;
        List<String> marketplaceIds = null;
        String amazonOrderId = null;
        CreateLegalDisclosureResponse response = api.createLegalDisclosure(body, marketplaceIds, amazonOrderId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Sends a non-critical message that asks a buyer to remove their negative feedback. This message should only be sent after the seller has resolved the buyer&#x27;s problem.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNegativeFeedbackRemovalTest() throws ApiException {
        String amazonOrderId = null;
        List<String> marketplaceIds = null;
        CreateNegativeFeedbackRemovalResponse response = api.createNegativeFeedbackRemoval(amazonOrderId, marketplaceIds);

        // TODO: test validations
    }
    /**
     * 
     *
     * Sends a critical message to a buyer that an unexpected problem was encountered affecting the completion of the order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUnexpectedProblemTest() throws ApiException {
        CreateUnexpectedProblemRequest body = null;
        List<String> marketplaceIds = null;
        String amazonOrderId = null;
        CreateUnexpectedProblemResponse response = api.createUnexpectedProblem(body, marketplaceIds, amazonOrderId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Sends a message to a buyer to provide details about warranty information on a purchase in their order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createWarrantyTest() throws ApiException {
        CreateWarrantyRequest body = null;
        List<String> marketplaceIds = null;
        String amazonOrderId = null;
        CreateWarrantyResponse response = api.createWarranty(body, marketplaceIds, amazonOrderId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Returns a response containing attributes related to an order. This includes buyer preferences.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAttributesTest() throws ApiException {
        String amazonOrderId = null;
        List<String> marketplaceIds = null;
        GetAttributesResponse response = api.getAttributes(amazonOrderId, marketplaceIds);

        // TODO: test validations
    }
    /**
     * 
     *
     * Returns a list of message types that are available for an order that you specify. A message type is represented by an actions object, which contains a path and query parameter(s). You can use the path and parameter(s) to call an operation that sends a message.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMessagingActionsForOrderTest() throws ApiException {
        String amazonOrderId = null;
        List<String> marketplaceIds = null;
        GetMessagingActionsForOrderResponse response = api.getMessagingActionsForOrder(amazonOrderId, marketplaceIds);

        // TODO: test validations
    }
}