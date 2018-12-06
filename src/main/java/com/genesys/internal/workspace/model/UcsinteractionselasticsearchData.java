/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 9.0.000.29.2447
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.workspace.model;

import java.util.Objects;
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
 * UcsinteractionselasticsearchData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-28T17:51:38.932Z")
public class UcsinteractionselasticsearchData {
  @SerializedName("maxResults")
  private Integer maxResults = null;

  @SerializedName("query")
  private String query = null;

  @SerializedName("returnedAttributes")
  private List<String> returnedAttributes = null;

  public UcsinteractionselasticsearchData maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * The maximum number of interactions to be returned
   * @return maxResults
  **/
  @ApiModelProperty(value = "The maximum number of interactions to be returned")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public UcsinteractionselasticsearchData query(String query) {
    this.query = query;
    return this;
  }

   /**
   * The query to do the elastic search for interactions
   * @return query
  **/
  @ApiModelProperty(value = "The query to do the elastic search for interactions")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public UcsinteractionselasticsearchData returnedAttributes(List<String> returnedAttributes) {
    this.returnedAttributes = returnedAttributes;
    return this;
  }

  public UcsinteractionselasticsearchData addReturnedAttributesItem(String returnedAttributesItem) {
    if (this.returnedAttributes == null) {
      this.returnedAttributes = new ArrayList<String>();
    }
    this.returnedAttributes.add(returnedAttributesItem);
    return this;
  }

   /**
   * The list of interaction attributes to be returned for each interaction in response
   * @return returnedAttributes
  **/
  @ApiModelProperty(value = "The list of interaction attributes to be returned for each interaction in response")
  public List<String> getReturnedAttributes() {
    return returnedAttributes;
  }

  public void setReturnedAttributes(List<String> returnedAttributes) {
    this.returnedAttributes = returnedAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UcsinteractionselasticsearchData ucsinteractionselasticsearchData = (UcsinteractionselasticsearchData) o;
    return Objects.equals(this.maxResults, ucsinteractionselasticsearchData.maxResults) &&
        Objects.equals(this.query, ucsinteractionselasticsearchData.query) &&
        Objects.equals(this.returnedAttributes, ucsinteractionselasticsearchData.returnedAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, query, returnedAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UcsinteractionselasticsearchData {\n");
    
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    returnedAttributes: ").append(toIndentedString(returnedAttributes)).append("\n");
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

