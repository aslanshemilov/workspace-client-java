/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 9.0.000.78.3880
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
 * VoiceloginData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-17T14:42:00.538Z")
public class VoiceloginData {
  /**
   * The agent workmode.
   */
  @JsonAdapter(AgentWorkModeEnum.Adapter.class)
  public enum AgentWorkModeEnum {
    AUTOIN("AutoIn"),
    
    MANUALIN("ManualIn"),
    
    AFTERCALLWORK("AfterCallWork"),
    
    AUXWORK("AuxWork"),
    
    LEGALGUARD("LegalGuard"),
    
    NOCALLDISCONNECT("NoCallDisconnect"),
    
    WALKAWAY("WalkAway");

    private String value;

    AgentWorkModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AgentWorkModeEnum fromValue(String text) {
      for (AgentWorkModeEnum b : AgentWorkModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AgentWorkModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AgentWorkModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AgentWorkModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AgentWorkModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("agentWorkMode")
  private AgentWorkModeEnum agentWorkMode = null;

  public VoiceloginData agentWorkMode(AgentWorkModeEnum agentWorkMode) {
    this.agentWorkMode = agentWorkMode;
    return this;
  }

   /**
   * The agent workmode.
   * @return agentWorkMode
  **/
  @ApiModelProperty(value = "The agent workmode.")
  public AgentWorkModeEnum getAgentWorkMode() {
    return agentWorkMode;
  }

  public void setAgentWorkMode(AgentWorkModeEnum agentWorkMode) {
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
    VoiceloginData voiceloginData = (VoiceloginData) o;
    return Objects.equals(this.agentWorkMode, voiceloginData.agentWorkMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentWorkMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoiceloginData {\n");
    
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

