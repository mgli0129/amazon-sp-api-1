/*
 * Selling Partner API for Uploads
 * The Uploads API lets you upload files that you can programmatically access using other Selling Partner APIs, such as the A+ Content API and the Messaging API.
 *
 * OpenAPI spec version: 2020-11-01
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


import com.amazon.spapi.model.uploads.CreateUploadDestinationResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UploadsApi {
    private ApiClient apiClient;

    public UploadsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UploadsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createUploadDestinationForResource
     * @param marketplaceIds A list of marketplace identifiers. This specifies the marketplaces where the upload will be available. Only one marketplace can be specified. (required)
     * @param contentMD5 An MD5 hash of the content to be submitted to the upload destination. This value is used to determine if the data has been corrupted or tampered with during transit. (required)
     * @param resource The resource for the upload destination that you are creating. For example, if you are creating an upload destination for the createLegalDisclosure operation of the Messaging API, the {resource} would be /messaging/v1/orders/{amazonOrderId}/messages/legalDisclosure, and the entire path would be /uploads/2020-11-01/uploadDestinations/messaging/v1/orders/{amazonOrderId}/messages/legalDisclosure. (required)
     * @param contentType The content type of the file to be uploaded. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createUploadDestinationForResourceCall(List<String> marketplaceIds, String contentMD5, String resource, String contentType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/uploads/2020-11-01/uploadDestinations/{resource}"
            .replaceAll("\\{" + "resource" + "\\}", apiClient.escapeString(resource.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceIds != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "marketplaceIds", marketplaceIds));
        if (contentMD5 != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("contentMD5", contentMD5));
        if (contentType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("contentType", contentType));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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
    private com.squareup.okhttp.Call createUploadDestinationForResourceValidateBeforeCall(List<String> marketplaceIds, String contentMD5, String resource, String contentType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling createUploadDestinationForResource(Async)");
        }
        // verify the required parameter 'contentMD5' is set
        if (contentMD5 == null) {
            throw new ApiException("Missing the required parameter 'contentMD5' when calling createUploadDestinationForResource(Async)");
        }
        // verify the required parameter 'resource' is set
        if (resource == null) {
            throw new ApiException("Missing the required parameter 'resource' when calling createUploadDestinationForResource(Async)");
        }
        
        com.squareup.okhttp.Call call = createUploadDestinationForResourceCall(marketplaceIds, contentMD5, resource, contentType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Creates an upload destination, returning the information required to upload a file to the destination and to programmatically access the file.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | .1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param marketplaceIds A list of marketplace identifiers. This specifies the marketplaces where the upload will be available. Only one marketplace can be specified. (required)
     * @param contentMD5 An MD5 hash of the content to be submitted to the upload destination. This value is used to determine if the data has been corrupted or tampered with during transit. (required)
     * @param resource The resource for the upload destination that you are creating. For example, if you are creating an upload destination for the createLegalDisclosure operation of the Messaging API, the {resource} would be /messaging/v1/orders/{amazonOrderId}/messages/legalDisclosure, and the entire path would be /uploads/2020-11-01/uploadDestinations/messaging/v1/orders/{amazonOrderId}/messages/legalDisclosure. (required)
     * @param contentType The content type of the file to be uploaded. (optional)
     * @return CreateUploadDestinationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateUploadDestinationResponse createUploadDestinationForResource(List<String> marketplaceIds, String contentMD5, String resource, String contentType) throws ApiException {
        ApiResponse<CreateUploadDestinationResponse> resp = createUploadDestinationForResourceWithHttpInfo(marketplaceIds, contentMD5, resource, contentType);
        return resp.getData();
    }

    /**
     * 
     * Creates an upload destination, returning the information required to upload a file to the destination and to programmatically access the file.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | .1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param marketplaceIds A list of marketplace identifiers. This specifies the marketplaces where the upload will be available. Only one marketplace can be specified. (required)
     * @param contentMD5 An MD5 hash of the content to be submitted to the upload destination. This value is used to determine if the data has been corrupted or tampered with during transit. (required)
     * @param resource The resource for the upload destination that you are creating. For example, if you are creating an upload destination for the createLegalDisclosure operation of the Messaging API, the {resource} would be /messaging/v1/orders/{amazonOrderId}/messages/legalDisclosure, and the entire path would be /uploads/2020-11-01/uploadDestinations/messaging/v1/orders/{amazonOrderId}/messages/legalDisclosure. (required)
     * @param contentType The content type of the file to be uploaded. (optional)
     * @return ApiResponse&lt;CreateUploadDestinationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateUploadDestinationResponse> createUploadDestinationForResourceWithHttpInfo(List<String> marketplaceIds, String contentMD5, String resource, String contentType) throws ApiException {
        com.squareup.okhttp.Call call = createUploadDestinationForResourceValidateBeforeCall(marketplaceIds, contentMD5, resource, contentType, null, null);
        Type localVarReturnType = new TypeToken<CreateUploadDestinationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Creates an upload destination, returning the information required to upload a file to the destination and to programmatically access the file.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | .1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param marketplaceIds A list of marketplace identifiers. This specifies the marketplaces where the upload will be available. Only one marketplace can be specified. (required)
     * @param contentMD5 An MD5 hash of the content to be submitted to the upload destination. This value is used to determine if the data has been corrupted or tampered with during transit. (required)
     * @param resource The resource for the upload destination that you are creating. For example, if you are creating an upload destination for the createLegalDisclosure operation of the Messaging API, the {resource} would be /messaging/v1/orders/{amazonOrderId}/messages/legalDisclosure, and the entire path would be /uploads/2020-11-01/uploadDestinations/messaging/v1/orders/{amazonOrderId}/messages/legalDisclosure. (required)
     * @param contentType The content type of the file to be uploaded. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createUploadDestinationForResourceAsync(List<String> marketplaceIds, String contentMD5, String resource, String contentType, final ApiCallback<CreateUploadDestinationResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createUploadDestinationForResourceValidateBeforeCall(marketplaceIds, contentMD5, resource, contentType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateUploadDestinationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
