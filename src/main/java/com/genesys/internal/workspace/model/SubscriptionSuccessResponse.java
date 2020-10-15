/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 9.0.000.78.3880
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.workspace.model;

import java.util.Objects;
import java.util.Arrays;
import com.genesys.internal.workspace.model.SubscriptionSuccessResponseData;
import com.genesys.internal.workspace.model.TargetsResponseStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request succeeded.
 */
@ApiModel(description = "Request succeeded.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-02T21:45:42.174Z")
public class SubscriptionSuccessResponse {
  @SerializedName("status")
  private TargetsResponseStatus status = null;

  @SerializedName("data")
  private SubscriptionSuccessResponseData data = null;

  public SubscriptionSuccessResponse status(TargetsResponseStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public TargetsResponseStatus getStatus() {
    return status;
  }

  public void setStatus(TargetsResponseStatus status) {
    this.status = status;
  }

  public SubscriptionSuccessResponse data(SubscriptionSuccessResponseData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public SubscriptionSuccessResponseData getData() {
    return data;
  }

  public void setData(SubscriptionSuccessResponseData data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionSuccessResponse subscriptionSuccessResponse = (SubscriptionSuccessResponse) o;
    return Objects.equals(this.status, subscriptionSuccessResponse.status) &&
        Objects.equals(this.data, subscriptionSuccessResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionSuccessResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

