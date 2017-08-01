/*
 * Workspace API
 * Application API used by Workspace Web Edition
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.workspace.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * StatisticsSubscribeDataData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-01T19:23:05.437Z")
public class StatisticsSubscribeDataData {
  @SerializedName("connectionId")
  private String connectionId = null;

  @SerializedName("statistics")
  private List<Object> statistics = new ArrayList<Object>();

  public StatisticsSubscribeDataData connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Get connectionId
   * @return connectionId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }

  public StatisticsSubscribeDataData statistics(List<Object> statistics) {
    this.statistics = statistics;
    return this;
  }

  public StatisticsSubscribeDataData addStatisticsItem(Object statisticsItem) {
    this.statistics.add(statisticsItem);
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<Object> getStatistics() {
    return statistics;
  }

  public void setStatistics(List<Object> statistics) {
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
    StatisticsSubscribeDataData statisticsSubscribeDataData = (StatisticsSubscribeDataData) o;
    return Objects.equals(this.connectionId, statisticsSubscribeDataData.connectionId) &&
        Objects.equals(this.statistics, statisticsSubscribeDataData.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, statistics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticsSubscribeDataData {\n");
    
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
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

