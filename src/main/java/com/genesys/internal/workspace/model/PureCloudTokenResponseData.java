/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 9.0.000.51.3082
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
 * PureCloudTokenResponseData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-27T12:31:12.286Z")
public class PureCloudTokenResponseData {
  @SerializedName("access_token")
  private String accessToken = null;

  @SerializedName("token_type")
  private String tokenType = null;

  @SerializedName("expires_in")
  private BigDecimal expiresIn = null;

  public PureCloudTokenResponseData accessToken(String accessToken) {
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

  public PureCloudTokenResponseData tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * type of the token
   * @return tokenType
  **/
  @ApiModelProperty(value = "type of the token")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public PureCloudTokenResponseData expiresIn(BigDecimal expiresIn) {
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
    PureCloudTokenResponseData pureCloudTokenResponseData = (PureCloudTokenResponseData) o;
    return Objects.equals(this.accessToken, pureCloudTokenResponseData.accessToken) &&
        Objects.equals(this.tokenType, pureCloudTokenResponseData.tokenType) &&
        Objects.equals(this.expiresIn, pureCloudTokenResponseData.expiresIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, tokenType, expiresIn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PureCloudTokenResponseData {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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

