/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.workspace.model;

import java.util.Objects;
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
 * UcsresponsesidrenderfieldcodesData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-13T19:04:58.049Z")
public class UcsresponsesidrenderfieldcodesData {
  @SerializedName("interactionId")
  private String interactionId = null;

  @SerializedName("usePlainText")
  private Boolean usePlainText = null;

  @SerializedName("customProperties")
  private List<Kvpair> customProperties = null;

  @SerializedName("agentCustomProperties")
  private List<Kvpair> agentCustomProperties = null;

  public UcsresponsesidrenderfieldcodesData interactionId(String interactionId) {
    this.interactionId = interactionId;
    return this;
  }

   /**
   * id of the interaction
   * @return interactionId
  **/
  @ApiModelProperty(required = true, value = "id of the interaction")
  public String getInteractionId() {
    return interactionId;
  }

  public void setInteractionId(String interactionId) {
    this.interactionId = interactionId;
  }

  public UcsresponsesidrenderfieldcodesData usePlainText(Boolean usePlainText) {
    this.usePlainText = usePlainText;
    return this;
  }

   /**
   * true to use Plain Text
   * @return usePlainText
  **/
  @ApiModelProperty(value = "true to use Plain Text")
  public Boolean isUsePlainText() {
    return usePlainText;
  }

  public void setUsePlainText(Boolean usePlainText) {
    this.usePlainText = usePlainText;
  }

  public UcsresponsesidrenderfieldcodesData customProperties(List<Kvpair> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public UcsresponsesidrenderfieldcodesData addCustomPropertiesItem(Kvpair customPropertiesItem) {
    if (this.customProperties == null) {
      this.customProperties = new ArrayList<Kvpair>();
    }
    this.customProperties.add(customPropertiesItem);
    return this;
  }

   /**
   * A key/value pairs list of the custom properties to render.
   * @return customProperties
  **/
  @ApiModelProperty(value = "A key/value pairs list of the custom properties to render.")
  public List<Kvpair> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(List<Kvpair> customProperties) {
    this.customProperties = customProperties;
  }

  public UcsresponsesidrenderfieldcodesData agentCustomProperties(List<Kvpair> agentCustomProperties) {
    this.agentCustomProperties = agentCustomProperties;
    return this;
  }

  public UcsresponsesidrenderfieldcodesData addAgentCustomPropertiesItem(Kvpair agentCustomPropertiesItem) {
    if (this.agentCustomProperties == null) {
      this.agentCustomProperties = new ArrayList<Kvpair>();
    }
    this.agentCustomProperties.add(agentCustomPropertiesItem);
    return this;
  }

   /**
   * A key/value pairs list of the agent custom properties to render.
   * @return agentCustomProperties
  **/
  @ApiModelProperty(value = "A key/value pairs list of the agent custom properties to render.")
  public List<Kvpair> getAgentCustomProperties() {
    return agentCustomProperties;
  }

  public void setAgentCustomProperties(List<Kvpair> agentCustomProperties) {
    this.agentCustomProperties = agentCustomProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UcsresponsesidrenderfieldcodesData ucsresponsesidrenderfieldcodesData = (UcsresponsesidrenderfieldcodesData) o;
    return Objects.equals(this.interactionId, ucsresponsesidrenderfieldcodesData.interactionId) &&
        Objects.equals(this.usePlainText, ucsresponsesidrenderfieldcodesData.usePlainText) &&
        Objects.equals(this.customProperties, ucsresponsesidrenderfieldcodesData.customProperties) &&
        Objects.equals(this.agentCustomProperties, ucsresponsesidrenderfieldcodesData.agentCustomProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interactionId, usePlainText, customProperties, agentCustomProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UcsresponsesidrenderfieldcodesData {\n");
    
    sb.append("    interactionId: ").append(toIndentedString(interactionId)).append("\n");
    sb.append("    usePlainText: ").append(toIndentedString(usePlainText)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    agentCustomProperties: ").append(toIndentedString(agentCustomProperties)).append("\n");
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
