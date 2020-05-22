/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 9.0.000.73.3700
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.workspace.model;

import java.util.Objects;
import java.util.Arrays;
import com.genesys.internal.workspace.model.StatisticValue;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SubscriptionSuccessResponseData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-19T15:26:26.798Z")
public class SubscriptionSuccessResponseData {
  @SerializedName("subscriptionId")
  private String subscriptionId = null;

  @SerializedName("statistics")
  private List<StatisticValue> statistics = new ArrayList<StatisticValue>();

  public SubscriptionSuccessResponseData subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * The ID used to fetch statistics values from [/reporting/subscriptions/{subscriptionId}](/reference/workspace/Reporting/index.html#peek).
   * @return subscriptionId
  **/
  @ApiModelProperty(required = true, value = "The ID used to fetch statistics values from [/reporting/subscriptions/{subscriptionId}](/reference/workspace/Reporting/index.html#peek).")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public SubscriptionSuccessResponseData statistics(List<StatisticValue> statistics) {
    this.statistics = statistics;
    return this;
  }

  public SubscriptionSuccessResponseData addStatisticsItem(StatisticValue statisticsItem) {
    this.statistics.add(statisticsItem);
    return this;
  }

   /**
   * The list of all the subscribed statistics with the assigned ids.
   * @return statistics
  **/
  @ApiModelProperty(required = true, value = "The list of all the subscribed statistics with the assigned ids.")
  public List<StatisticValue> getStatistics() {
    return statistics;
  }

  public void setStatistics(List<StatisticValue> statistics) {
    this.statistics = statistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionSuccessResponseData subscriptionSuccessResponseData = (SubscriptionSuccessResponseData) o;
    return Objects.equals(this.subscriptionId, subscriptionSuccessResponseData.subscriptionId) &&
        Objects.equals(this.statistics, subscriptionSuccessResponseData.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, statistics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionSuccessResponseData {\n");
    
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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

