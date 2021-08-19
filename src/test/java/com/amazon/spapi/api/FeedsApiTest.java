/*
 * Selling Partner API for Feeds
 * The Selling Partner API for Feeds lets you upload data to Amazon on behalf of a selling partner.
 *
 * OpenAPI spec version: 2021-06-30
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.models.feeds.CreateFeedDocumentResponse;
import com.amazon.spapi.models.feeds.CreateFeedDocumentSpecification;
import com.amazon.spapi.models.feeds.CreateFeedResponse;
import com.amazon.spapi.models.feeds.CreateFeedSpecification;
import com.amazon.spapi.models.feeds.ErrorList;
import com.amazon.spapi.models.feeds.Feed;
import com.amazon.spapi.models.feeds.FeedDocument;
import com.amazon.spapi.models.feeds.GetFeedsResponse;
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FeedsApi
 */
@Ignore
public class FeedsApiTest {

    private final FeedsApi api = new FeedsApi();

    /**
     * 
     *
     * Cancels the feed that you specify. Only feeds with processingStatus&#x3D;IN_QUEUE can be cancelled. Cancelled feeds are returned in subsequent calls to the getFeed and getFeeds operations.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0222 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelFeedTest() throws ApiException {
        String feedId = null;
        api.cancelFeed(feedId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Creates a feed. Upload the contents of the feed document before calling this operation.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0083 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFeedTest() throws ApiException {
        CreateFeedSpecification body = null;
        CreateFeedResponse response = api.createFeed(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Creates a feed document for the feed type that you specify. This operation returns a presigned URL for uploading the feed document contents. It also returns a feedDocumentId value that you can pass in with a subsequent call to the createFeed operation.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0083 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFeedDocumentTest() throws ApiException {
        CreateFeedDocumentSpecification body = null;
        CreateFeedDocumentResponse response = api.createFeedDocument(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Returns feed details (including the resultDocumentId, if available) for the feed that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2.0 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeedTest() throws ApiException {
        String feedId = null;
        Feed response = api.getFeed(feedId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Returns the information required for retrieving a feed document&#x27;s contents.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0222 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeedDocumentTest() throws ApiException {
        String feedDocumentId = null;
        FeedDocument response = api.getFeedDocument(feedDocumentId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Returns feed details for the feeds that match the filters that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0222 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeedsTest() throws ApiException {
        List<String> feedTypes = null;
        List<String> marketplaceIds = null;
        Integer pageSize = null;
        List<String> processingStatuses = null;
        OffsetDateTime createdSince = null;
        OffsetDateTime createdUntil = null;
        String nextToken = null;
        GetFeedsResponse response = api.getFeeds(feedTypes, marketplaceIds, pageSize, processingStatuses, createdSince, createdUntil, nextToken);

        // TODO: test validations
    }
}
