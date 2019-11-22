/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 9.0.000.64.3341
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.workspace.api;

import com.genesys.internal.common.ApiCallback;
import com.genesys.internal.common.ApiClient;
import com.genesys.internal.common.ApiException;
import com.genesys.internal.common.ApiResponse;
import com.genesys.internal.common.Configuration;
import com.genesys.internal.common.Pair;
import com.genesys.internal.common.ProgressRequestBody;
import com.genesys.internal.common.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.genesys.internal.workspace.model.ApiErrorResponse;
import com.genesys.internal.workspace.model.ApiSuccessResponse;
import com.genesys.internal.workspace.model.StatisticsSubscribeData;
import com.genesys.internal.workspace.model.SubscriptionSuccessResponse;
import com.genesys.internal.workspace.model.SubscriptionsSuccessResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportingApi {
    private ApiClient apiClient;

    public ReportingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for peek
     * @param subscriptionId The unique ID of the subscription. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call peekCall(String subscriptionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/reporting/subscriptions/{subscriptionId}"
            .replaceAll("\\{" + "subscriptionId" + "\\}", apiClient.escapeString(subscriptionId.toString()));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call peekValidateBeforeCall(String subscriptionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new ApiException("Missing the required parameter 'subscriptionId' when calling peek(Async)");
        }
        

        com.squareup.okhttp.Call call = peekCall(subscriptionId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get the values of statistics
     * Get the values of a set of statistics that was opened with a subscription.
     * @param subscriptionId The unique ID of the subscription. (required)
     * @return SubscriptionSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SubscriptionSuccessResponse peek(String subscriptionId) throws ApiException {
        ApiResponse<SubscriptionSuccessResponse> resp = peekWithHttpInfo(subscriptionId);
        return resp.getData();
    }

    /**
     * Get the values of statistics
     * Get the values of a set of statistics that was opened with a subscription.
     * @param subscriptionId The unique ID of the subscription. (required)
     * @return ApiResponse&lt;SubscriptionSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SubscriptionSuccessResponse> peekWithHttpInfo(String subscriptionId) throws ApiException {
        com.squareup.okhttp.Call call = peekValidateBeforeCall(subscriptionId, null, null);
        Type localVarReturnType = new TypeToken<SubscriptionSuccessResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the values of statistics (asynchronously)
     * Get the values of a set of statistics that was opened with a subscription.
     * @param subscriptionId The unique ID of the subscription. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call peekAsync(String subscriptionId, final ApiCallback<SubscriptionSuccessResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = peekValidateBeforeCall(subscriptionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SubscriptionSuccessResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for peekMultiple
     * @param ids The IDs of the subscriptions. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call peekMultipleCall(String ids, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/reporting/subscriptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ids", ids));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call peekMultipleValidateBeforeCall(String ids, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'ids' is set
        if (ids == null) {
            throw new ApiException("Missing the required parameter 'ids' when calling peekMultiple(Async)");
        }
        

        com.squareup.okhttp.Call call = peekMultipleCall(ids, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get statistics
     * Get the statistics for the specified subscription IDs.
     * @param ids The IDs of the subscriptions. (required)
     * @return SubscriptionsSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SubscriptionsSuccessResponse peekMultiple(String ids) throws ApiException {
        ApiResponse<SubscriptionsSuccessResponse> resp = peekMultipleWithHttpInfo(ids);
        return resp.getData();
    }

    /**
     * Get statistics
     * Get the statistics for the specified subscription IDs.
     * @param ids The IDs of the subscriptions. (required)
     * @return ApiResponse&lt;SubscriptionsSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SubscriptionsSuccessResponse> peekMultipleWithHttpInfo(String ids) throws ApiException {
        com.squareup.okhttp.Call call = peekMultipleValidateBeforeCall(ids, null, null);
        Type localVarReturnType = new TypeToken<SubscriptionsSuccessResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get statistics (asynchronously)
     * Get the statistics for the specified subscription IDs.
     * @param ids The IDs of the subscriptions. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call peekMultipleAsync(String ids, final ApiCallback<SubscriptionsSuccessResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = peekMultipleValidateBeforeCall(ids, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SubscriptionsSuccessResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for subscribe
     * @param statisticsSubscribeData The collection of statistics you want to include in your subscription. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call subscribeCall(StatisticsSubscribeData statisticsSubscribeData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = statisticsSubscribeData;

        // create path and map variables
        String localVarPath = "/reporting/subscriptions";

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
    private com.squareup.okhttp.Call subscribeValidateBeforeCall(StatisticsSubscribeData statisticsSubscribeData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'statisticsSubscribeData' is set
        if (statisticsSubscribeData == null) {
            throw new ApiException("Missing the required parameter 'statisticsSubscribeData' when calling subscribe(Async)");
        }
        

        com.squareup.okhttp.Call call = subscribeCall(statisticsSubscribeData, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Subscribe to statistics
     * Open a subscription for the specified set of statistics. The values are returned when you request them using [/reporting/subscriptions/{subscriptionId}](/reference/workspace/Reporting/index.html#peek).
     * @param statisticsSubscribeData The collection of statistics you want to include in your subscription. (required)
     * @return SubscriptionSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SubscriptionSuccessResponse subscribe(StatisticsSubscribeData statisticsSubscribeData) throws ApiException {
        ApiResponse<SubscriptionSuccessResponse> resp = subscribeWithHttpInfo(statisticsSubscribeData);
        return resp.getData();
    }

    /**
     * Subscribe to statistics
     * Open a subscription for the specified set of statistics. The values are returned when you request them using [/reporting/subscriptions/{subscriptionId}](/reference/workspace/Reporting/index.html#peek).
     * @param statisticsSubscribeData The collection of statistics you want to include in your subscription. (required)
     * @return ApiResponse&lt;SubscriptionSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SubscriptionSuccessResponse> subscribeWithHttpInfo(StatisticsSubscribeData statisticsSubscribeData) throws ApiException {
        com.squareup.okhttp.Call call = subscribeValidateBeforeCall(statisticsSubscribeData, null, null);
        Type localVarReturnType = new TypeToken<SubscriptionSuccessResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Subscribe to statistics (asynchronously)
     * Open a subscription for the specified set of statistics. The values are returned when you request them using [/reporting/subscriptions/{subscriptionId}](/reference/workspace/Reporting/index.html#peek).
     * @param statisticsSubscribeData The collection of statistics you want to include in your subscription. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call subscribeAsync(StatisticsSubscribeData statisticsSubscribeData, final ApiCallback<SubscriptionSuccessResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = subscribeValidateBeforeCall(statisticsSubscribeData, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SubscriptionSuccessResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for unsubscribe
     * @param subscriptionId The unique ID of the subscription. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call unsubscribeCall(String subscriptionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/reporting/subscriptions/{subscriptionId}"
            .replaceAll("\\{" + "subscriptionId" + "\\}", apiClient.escapeString(subscriptionId.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call unsubscribeValidateBeforeCall(String subscriptionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new ApiException("Missing the required parameter 'subscriptionId' when calling unsubscribe(Async)");
        }
        

        com.squareup.okhttp.Call call = unsubscribeCall(subscriptionId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a subscription
     * Delete the specified subscription by closing all its statistics.
     * @param subscriptionId The unique ID of the subscription. (required)
     * @return ApiSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiSuccessResponse unsubscribe(String subscriptionId) throws ApiException {
        ApiResponse<ApiSuccessResponse> resp = unsubscribeWithHttpInfo(subscriptionId);
        return resp.getData();
    }

    /**
     * Delete a subscription
     * Delete the specified subscription by closing all its statistics.
     * @param subscriptionId The unique ID of the subscription. (required)
     * @return ApiResponse&lt;ApiSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiSuccessResponse> unsubscribeWithHttpInfo(String subscriptionId) throws ApiException {
        com.squareup.okhttp.Call call = unsubscribeValidateBeforeCall(subscriptionId, null, null);
        Type localVarReturnType = new TypeToken<ApiSuccessResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a subscription (asynchronously)
     * Delete the specified subscription by closing all its statistics.
     * @param subscriptionId The unique ID of the subscription. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call unsubscribeAsync(String subscriptionId, final ApiCallback<ApiSuccessResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = unsubscribeValidateBeforeCall(subscriptionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiSuccessResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
