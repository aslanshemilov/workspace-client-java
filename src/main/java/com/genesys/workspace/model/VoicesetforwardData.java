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
 * VoicesetforwardData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:49:31.797Z")
public class VoicesetforwardData {
  @SerializedName("forwardTo")
  private String forwardTo = null;

  public VoicesetforwardData forwardTo(String forwardTo) {
    this.forwardTo = forwardTo;
    return this;
  }

   /**
   * Get forwardTo
   * @return forwardTo
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getForwardTo() {
    return forwardTo;
  }

  public void setForwardTo(String forwardTo) {
    this.forwardTo = forwardTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicesetforwardData voicesetforwardData = (VoicesetforwardData) o;
    return Objects.equals(this.forwardTo, voicesetforwardData.forwardTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forwardTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicesetforwardData {\n");
    
    sb.append("    forwardTo: ").append(toIndentedString(forwardTo)).append("\n");
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

