/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 9.0.000.43.2934
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

/**
 * Dn
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-30T18:19:13.634Z")
public class Dn {
  @SerializedName("number")
  private String number = null;

  @SerializedName("agentId")
  private String agentId = null;

  @SerializedName("agentState")
  private String agentState = null;

  @SerializedName("agentWorkMode")
  private String agentWorkMode = null;

  public Dn number(String number) {
    this.number = number;
    return this;
  }

   /**
   * The directory number (phone number).
   * @return number
  **/
  @ApiModelProperty(value = "The directory number (phone number).")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Dn agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * The agent ID used to log in.
   * @return agentId
  **/
  @ApiModelProperty(value = "The agent ID used to log in.")
  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  public Dn agentState(String agentState) {
    this.agentState = agentState;
    return this;
  }

   /**
   * The current state. Valid values are &#x60;LoggedOut&#x60;, &#x60;LoggedIn&#x60;, &#x60;Ready&#x60;, or &#x60;NotReady&#x60;.
   * @return agentState
  **/
  @ApiModelProperty(value = "The current state. Valid values are `LoggedOut`, `LoggedIn`, `Ready`, or `NotReady`.")
  public String getAgentState() {
    return agentState;
  }

  public void setAgentState(String agentState) {
    this.agentState = agentState;
  }

  public Dn agentWorkMode(String agentWorkMode) {
    this.agentWorkMode = agentWorkMode;
    return this;
  }

   /**
   * The current workmode. This value can be either &#x60;AuxWork&#x60; or &#x60;AfterCallWork&#x60; if the agent&#39;s state is Not Ready, or &#x60;AutoIn&#x60; or &#x60;ManualIn&#x60; if the agent&#39;s state is Ready.
   * @return agentWorkMode
  **/
  @ApiModelProperty(value = "The current workmode. This value can be either `AuxWork` or `AfterCallWork` if the agent's state is Not Ready, or `AutoIn` or `ManualIn` if the agent's state is Ready.")
  public String getAgentWorkMode() {
    return agentWorkMode;
  }

  public void setAgentWorkMode(String agentWorkMode) {
    this.agentWorkMode = agentWorkMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dn dn = (Dn) o;
    return Objects.equals(this.number, dn.number) &&
        Objects.equals(this.agentId, dn.agentId) &&
        Objects.equals(this.agentState, dn.agentState) &&
        Objects.equals(this.agentWorkMode, dn.agentWorkMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, agentId, agentState, agentWorkMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dn {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    agentState: ").append(toIndentedString(agentState)).append("\n");
    sb.append("    agentWorkMode: ").append(toIndentedString(agentWorkMode)).append("\n");
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

