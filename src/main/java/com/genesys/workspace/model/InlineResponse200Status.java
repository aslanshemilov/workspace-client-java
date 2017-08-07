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

/**
 * InlineResponse200Status
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-07T19:23:12.605Z")
public class InlineResponse200Status {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("message")
  private String message = null;

  public InlineResponse200Status code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * On error will provide a code that can be used to get more detail about the error.
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "On error will provide a code that can be used to get more detail about the error.")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public InlineResponse200Status message(String message) {
    this.message = message;
    return this;
  }

   /**
   * On error will provide a message with more detail about the error. Keep in mind that the error message will be fairly general and internal details are not exposed.
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "On error will provide a message with more detail about the error. Keep in mind that the error message will be fairly general and internal details are not exposed.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Status inlineResponse200Status = (InlineResponse200Status) o;
    return Objects.equals(this.code, inlineResponse200Status.code) &&
        Objects.equals(this.message, inlineResponse200Status.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Status {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

