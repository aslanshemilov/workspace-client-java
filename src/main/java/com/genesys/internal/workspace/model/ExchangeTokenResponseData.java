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


package com.genesys.internal.workspace.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * ExchangeTokenResponseData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-20T10:00:40.765Z")
public class ExchangeTokenResponseData {
  @SerializedName("access_token")
  private String accessToken = null;

  @SerializedName("expires_in")
  private BigDecimal expiresIn = null;

  public ExchangeTokenResponseData accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * the exchanged access token
   * @return accessToken
  **/
  @ApiModelProperty(value = "the exchanged access token")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public ExchangeTokenResponseData expiresIn(BigDecimal expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * expire time in seconds
   * @return expiresIn
  **/
  @ApiModelProperty(value = "expire time in seconds")
  public BigDecimal getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(BigDecimal expiresIn) {
    this.expiresIn = expiresIn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeTokenResponseData exchangeTokenResponseData = (ExchangeTokenResponseData) o;
    return Objects.equals(this.accessToken, exchangeTokenResponseData.accessToken) &&
        Objects.equals(this.expiresIn, exchangeTokenResponseData.expiresIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expiresIn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeTokenResponseData {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
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

