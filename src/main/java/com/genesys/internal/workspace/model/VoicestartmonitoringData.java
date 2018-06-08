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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VoicestartmonitoringData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-08T14:04:43.111Z")
public class VoicestartmonitoringData {
  @SerializedName("phoneNumberToMonitor")
  private String phoneNumberToMonitor = null;

  /**
   * The monitoring mode.
   */
  @JsonAdapter(MonitoringModeEnum.Adapter.class)
  public enum MonitoringModeEnum {
    MUTE("Mute"),
    
    COACH("Coach"),
    
    CONNECT("Connect");

    private String value;

    MonitoringModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MonitoringModeEnum fromValue(String text) {
      for (MonitoringModeEnum b : MonitoringModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MonitoringModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MonitoringModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MonitoringModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MonitoringModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("monitoringMode")
  private MonitoringModeEnum monitoringMode = null;

  /**
   * The monitoring call type.
   */
  @JsonAdapter(MonitoringNextCallTypeEnum.Adapter.class)
  public enum MonitoringNextCallTypeEnum {
    ONECALL("OneCall"),
    
    ALLCALLS("AllCalls");

    private String value;

    MonitoringNextCallTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MonitoringNextCallTypeEnum fromValue(String text) {
      for (MonitoringNextCallTypeEnum b : MonitoringNextCallTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MonitoringNextCallTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MonitoringNextCallTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MonitoringNextCallTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MonitoringNextCallTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("monitoringNextCallType")
  private MonitoringNextCallTypeEnum monitoringNextCallType = null;

  /**
   * The monitoring scope.
   */
  @JsonAdapter(MonitoringScopeEnum.Adapter.class)
  public enum MonitoringScopeEnum {
    CALL("Call"),
    
    AGENT("Agent");

    private String value;

    MonitoringScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MonitoringScopeEnum fromValue(String text) {
      for (MonitoringScopeEnum b : MonitoringScopeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MonitoringScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MonitoringScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MonitoringScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MonitoringScopeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("monitoringScope")
  private MonitoringScopeEnum monitoringScope = null;

  @SerializedName("location")
  private String location = null;

  public VoicestartmonitoringData phoneNumberToMonitor(String phoneNumberToMonitor) {
    this.phoneNumberToMonitor = phoneNumberToMonitor;
    return this;
  }

   /**
   * The phone number that should be monitored.
   * @return phoneNumberToMonitor
  **/
  @ApiModelProperty(required = true, value = "The phone number that should be monitored.")
  public String getPhoneNumberToMonitor() {
    return phoneNumberToMonitor;
  }

  public void setPhoneNumberToMonitor(String phoneNumberToMonitor) {
    this.phoneNumberToMonitor = phoneNumberToMonitor;
  }

  public VoicestartmonitoringData monitoringMode(MonitoringModeEnum monitoringMode) {
    this.monitoringMode = monitoringMode;
    return this;
  }

   /**
   * The monitoring mode.
   * @return monitoringMode
  **/
  @ApiModelProperty(value = "The monitoring mode.")
  public MonitoringModeEnum getMonitoringMode() {
    return monitoringMode;
  }

  public void setMonitoringMode(MonitoringModeEnum monitoringMode) {
    this.monitoringMode = monitoringMode;
  }

  public VoicestartmonitoringData monitoringNextCallType(MonitoringNextCallTypeEnum monitoringNextCallType) {
    this.monitoringNextCallType = monitoringNextCallType;
    return this;
  }

   /**
   * The monitoring call type.
   * @return monitoringNextCallType
  **/
  @ApiModelProperty(value = "The monitoring call type.")
  public MonitoringNextCallTypeEnum getMonitoringNextCallType() {
    return monitoringNextCallType;
  }

  public void setMonitoringNextCallType(MonitoringNextCallTypeEnum monitoringNextCallType) {
    this.monitoringNextCallType = monitoringNextCallType;
  }

  public VoicestartmonitoringData monitoringScope(MonitoringScopeEnum monitoringScope) {
    this.monitoringScope = monitoringScope;
    return this;
  }

   /**
   * The monitoring scope.
   * @return monitoringScope
  **/
  @ApiModelProperty(value = "The monitoring scope.")
  public MonitoringScopeEnum getMonitoringScope() {
    return monitoringScope;
  }

  public void setMonitoringScope(MonitoringScopeEnum monitoringScope) {
    this.monitoringScope = monitoringScope;
  }

  public VoicestartmonitoringData location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Name of the remote location in the form of &lt;SwitchName&gt; or &lt;T-ServerApplicationName&gt;@&lt;SwitchName&gt;. This value is used by Workspace to set the location attribute for the corresponding T-Server requests. When there is no need to specify a T-Server for location, this parameter must have the value NULL, not an empty string.
   * @return location
  **/
  @ApiModelProperty(value = "Name of the remote location in the form of <SwitchName> or <T-ServerApplicationName>@<SwitchName>. This value is used by Workspace to set the location attribute for the corresponding T-Server requests. When there is no need to specify a T-Server for location, this parameter must have the value NULL, not an empty string.")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicestartmonitoringData voicestartmonitoringData = (VoicestartmonitoringData) o;
    return Objects.equals(this.phoneNumberToMonitor, voicestartmonitoringData.phoneNumberToMonitor) &&
        Objects.equals(this.monitoringMode, voicestartmonitoringData.monitoringMode) &&
        Objects.equals(this.monitoringNextCallType, voicestartmonitoringData.monitoringNextCallType) &&
        Objects.equals(this.monitoringScope, voicestartmonitoringData.monitoringScope) &&
        Objects.equals(this.location, voicestartmonitoringData.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumberToMonitor, monitoringMode, monitoringNextCallType, monitoringScope, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicestartmonitoringData {\n");
    
    sb.append("    phoneNumberToMonitor: ").append(toIndentedString(phoneNumberToMonitor)).append("\n");
    sb.append("    monitoringMode: ").append(toIndentedString(monitoringMode)).append("\n");
    sb.append("    monitoringNextCallType: ").append(toIndentedString(monitoringNextCallType)).append("\n");
    sb.append("    monitoringScope: ").append(toIndentedString(monitoringScope)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

