/*
 * Selling Partner API for Direct Fulfillment Inventory Updates
 * The Selling Partner API for Direct Fulfillment Inventory Updates provides programmatic access to a direct fulfillment vendor's inventory updates.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiCallback;
import com.amazon.spapi.client.ApiClient;
import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.client.ApiResponse;
import com.amazon.spapi.client.Configuration;
import com.amazon.spapi.client.Pair;
import com.amazon.spapi.client.ProgressRequestBody;
import com.amazon.spapi.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.amazon.spapi.model.vendordirectfulfillmentinventoryv1.SubmitInventoryUpdateRequest;
import com.amazon.spapi.model.vendordirectfulfillmentinventoryv1.SubmitInventoryUpdateResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UpdateInventoryApi {
    private ApiClient apiClient;

    public UpdateInventoryApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UpdateInventoryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for submitInventoryUpdate
     * @param body  (required)
     * @param warehouseId Identifier for the warehouse for which to update inventory. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call submitInventoryUpdateCall(SubmitInventoryUpdateRequest body, String warehouseId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/vendor/directFulfillment/inventory/v1/warehouses/{warehouseId}/items"
            .replaceAll("\\{" + "warehouseId" + "\\}", apiClient.escapeString(warehouseId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call submitInventoryUpdateValidateBeforeCall(SubmitInventoryUpdateRequest body, String warehouseId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling submitInventoryUpdate(Async)");
        }
        // verify the required parameter 'warehouseId' is set
        if (warehouseId == null) {
            throw new ApiException("Missing the required parameter 'warehouseId' when calling submitInventoryUpdate(Async)");
        }
        
        com.squareup.okhttp.Call call = submitInventoryUpdateCall(body, warehouseId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Submits inventory updates for the specified warehouse for either a partial or full feed of inventory items.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param body  (required)
     * @param warehouseId Identifier for the warehouse for which to update inventory. (required)
     * @return SubmitInventoryUpdateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SubmitInventoryUpdateResponse submitInventoryUpdate(SubmitInventoryUpdateRequest body, String warehouseId) throws ApiException {
        ApiResponse<SubmitInventoryUpdateResponse> resp = submitInventoryUpdateWithHttpInfo(body, warehouseId);
        return resp.getData();
    }

    /**
     * 
     * Submits inventory updates for the specified warehouse for either a partial or full feed of inventory items.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param body  (required)
     * @param warehouseId Identifier for the warehouse for which to update inventory. (required)
     * @return ApiResponse&lt;SubmitInventoryUpdateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SubmitInventoryUpdateResponse> submitInventoryUpdateWithHttpInfo(SubmitInventoryUpdateRequest body, String warehouseId) throws ApiException {
        com.squareup.okhttp.Call call = submitInventoryUpdateValidateBeforeCall(body, warehouseId, null, null);
        Type localVarReturnType = new TypeToken<SubmitInventoryUpdateResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Submits inventory updates for the specified warehouse for either a partial or full feed of inventory items.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param body  (required)
     * @param warehouseId Identifier for the warehouse for which to update inventory. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call submitInventoryUpdateAsync(SubmitInventoryUpdateRequest body, String warehouseId, final ApiCallback<SubmitInventoryUpdateResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = submitInventoryUpdateValidateBeforeCall(body, warehouseId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SubmitInventoryUpdateResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}