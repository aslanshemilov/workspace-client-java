/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 9.0.000.40.2832
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
import com.genesys.internal.workspace.model.PublishEventData;
import com.genesys.internal.workspace.model.SubscribeTopicData;
import com.genesys.internal.workspace.model.UnsubscribeTopicData;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopicApi {
    private ApiClient apiClient;

    public TopicApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TopicApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for publishTopic
     * @param topic The specific topic (required)
     * @param publishEventData  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call publishTopicCall(String topic, PublishEventData publishEventData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = publishEventData;

        // create path and map variables
        String localVarPath = "/media/topics/{topic}/publish"
            .replaceAll("\\{" + "topic" + "\\}", apiClient.escapeString(topic.toString()));

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
    private com.squareup.okhttp.Call publishTopicValidateBeforeCall(String topic, PublishEventData publishEventData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'topic' is set
        if (topic == null) {
            throw new ApiException("Missing the required parameter 'topic' when calling publishTopic(Async)");
        }
        
        // verify the required parameter 'publishEventData' is set
        if (publishEventData == null) {
            throw new ApiException("Missing the required parameter 'publishEventData' when calling publishTopic(Async)");
        }
        

        com.squareup.okhttp.Call call = publishTopicCall(topic, publishEventData, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Publish an user event regarding specific topic
     * Publish a user event on interaction server channel regarding specific topic.
     * @param topic The specific topic (required)
     * @param publishEventData  (required)
     * @return ApiSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiSuccessResponse publishTopic(String topic, PublishEventData publishEventData) throws ApiException {
        ApiResponse<ApiSuccessResponse> resp = publishTopicWithHttpInfo(topic, publishEventData);
        return resp.getData();
    }

    /**
     * Publish an user event regarding specific topic
     * Publish a user event on interaction server channel regarding specific topic.
     * @param topic The specific topic (required)
     * @param publishEventData  (required)
     * @return ApiResponse&lt;ApiSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiSuccessResponse> publishTopicWithHttpInfo(String topic, PublishEventData publishEventData) throws ApiException {
        com.squareup.okhttp.Call call = publishTopicValidateBeforeCall(topic, publishEventData, null, null);
        Type localVarReturnType = new TypeToken<ApiSuccessResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Publish an user event regarding specific topic (asynchronously)
     * Publish a user event on interaction server channel regarding specific topic.
     * @param topic The specific topic (required)
     * @param publishEventData  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call publishTopicAsync(String topic, PublishEventData publishEventData, final ApiCallback<ApiSuccessResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = publishTopicValidateBeforeCall(topic, publishEventData, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiSuccessResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for subscribeTopic
     * @param subscribeTopicData  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call subscribeTopicCall(SubscribeTopicData subscribeTopicData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = subscribeTopicData;

        // create path and map variables
        String localVarPath = "/media/topics/subscribe";

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
    private com.squareup.okhttp.Call subscribeTopicValidateBeforeCall(SubscribeTopicData subscribeTopicData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'subscribeTopicData' is set
        if (subscribeTopicData == null) {
            throw new ApiException("Missing the required parameter 'subscribeTopicData' when calling subscribeTopic(Async)");
        }
        

        com.squareup.okhttp.Call call = subscribeTopicCall(subscribeTopicData, progressListener, progressRequestListener);
        return call;

    }

    /**
     * subscribe to receive user events regarding specific topic(s).
     * subscribe to receive user events regarding specific topic(s) from interaction server.
     * @param subscribeTopicData  (required)
     * @return ApiSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiSuccessResponse subscribeTopic(SubscribeTopicData subscribeTopicData) throws ApiException {
        ApiResponse<ApiSuccessResponse> resp = subscribeTopicWithHttpInfo(subscribeTopicData);
        return resp.getData();
    }

    /**
     * subscribe to receive user events regarding specific topic(s).
     * subscribe to receive user events regarding specific topic(s) from interaction server.
     * @param subscribeTopicData  (required)
     * @return ApiResponse&lt;ApiSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiSuccessResponse> subscribeTopicWithHttpInfo(SubscribeTopicData subscribeTopicData) throws ApiException {
        com.squareup.okhttp.Call call = subscribeTopicValidateBeforeCall(subscribeTopicData, null, null);
        Type localVarReturnType = new TypeToken<ApiSuccessResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * subscribe to receive user events regarding specific topic(s). (asynchronously)
     * subscribe to receive user events regarding specific topic(s) from interaction server.
     * @param subscribeTopicData  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call subscribeTopicAsync(SubscribeTopicData subscribeTopicData, final ApiCallback<ApiSuccessResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = subscribeTopicValidateBeforeCall(subscribeTopicData, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiSuccessResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for unsubscribeTopic
     * @param unsubscribeTopicData  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call unsubscribeTopicCall(UnsubscribeTopicData unsubscribeTopicData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = unsubscribeTopicData;

        // create path and map variables
        String localVarPath = "/media/topics/unsubscribe";

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
    private com.squareup.okhttp.Call unsubscribeTopicValidateBeforeCall(UnsubscribeTopicData unsubscribeTopicData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'unsubscribeTopicData' is set
        if (unsubscribeTopicData == null) {
            throw new ApiException("Missing the required parameter 'unsubscribeTopicData' when calling unsubscribeTopic(Async)");
        }
        

        com.squareup.okhttp.Call call = unsubscribeTopicCall(unsubscribeTopicData, progressListener, progressRequestListener);
        return call;

    }

    /**
     * unsubscribe to receive user events regarding specific topic(s).
     * unsubscribe to receive user events regarding specific topic(s) from interaction server.
     * @param unsubscribeTopicData  (required)
     * @return ApiSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiSuccessResponse unsubscribeTopic(UnsubscribeTopicData unsubscribeTopicData) throws ApiException {
        ApiResponse<ApiSuccessResponse> resp = unsubscribeTopicWithHttpInfo(unsubscribeTopicData);
        return resp.getData();
    }

    /**
     * unsubscribe to receive user events regarding specific topic(s).
     * unsubscribe to receive user events regarding specific topic(s) from interaction server.
     * @param unsubscribeTopicData  (required)
     * @return ApiResponse&lt;ApiSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiSuccessResponse> unsubscribeTopicWithHttpInfo(UnsubscribeTopicData unsubscribeTopicData) throws ApiException {
        com.squareup.okhttp.Call call = unsubscribeTopicValidateBeforeCall(unsubscribeTopicData, null, null);
        Type localVarReturnType = new TypeToken<ApiSuccessResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * unsubscribe to receive user events regarding specific topic(s). (asynchronously)
     * unsubscribe to receive user events regarding specific topic(s) from interaction server.
     * @param unsubscribeTopicData  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call unsubscribeTopicAsync(UnsubscribeTopicData unsubscribeTopicData, final ApiCallback<ApiSuccessResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = unsubscribeTopicValidateBeforeCall(unsubscribeTopicData, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiSuccessResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
