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
import com.genesys.internal.workspace.model.Kvpair;
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
 * ConfigResponseDataActionCodes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-20T10:00:40.765Z")
public class ConfigResponseDataActionCodes {
  @SerializedName("name")
  private String name = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("userProperties")
  private List<Kvpair> userProperties = null;

  public ConfigResponseDataActionCodes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConfigResponseDataActionCodes code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ConfigResponseDataActionCodes userProperties(List<Kvpair> userProperties) {
    this.userProperties = userProperties;
    return this;
  }

  public ConfigResponseDataActionCodes addUserPropertiesItem(Kvpair userPropertiesItem) {
    if (this.userProperties == null) {
      this.userProperties = new ArrayList<Kvpair>();
    }
    this.userProperties.add(userPropertiesItem);
    return this;
  }

   /**
   * Get userProperties
   * @return userProperties
  **/
  @ApiModelProperty(value = "")
  public List<Kvpair> getUserProperties() {
    return userProperties;
  }

  public void setUserProperties(List<Kvpair> userProperties) {
    this.userProperties = userProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigResponseDataActionCodes configResponseDataActionCodes = (ConfigResponseDataActionCodes) o;
    return Objects.equals(this.name, configResponseDataActionCodes.name) &&
        Objects.equals(this.code, configResponseDataActionCodes.code) &&
        Objects.equals(this.userProperties, configResponseDataActionCodes.userProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, userProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigResponseDataActionCodes {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    userProperties: ").append(toIndentedString(userProperties)).append("\n");
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

