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
 * MonitoringScopeDataData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-05T15:28:59.863Z")
public class MonitoringScopeDataData {
  /**
   * The monitoring scope (Call/Agent).
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

  public MonitoringScopeDataData monitoringScope(MonitoringScopeEnum monitoringScope) {
    this.monitoringScope = monitoringScope;
    return this;
  }

   /**
   * The monitoring scope (Call/Agent).
   * @return monitoringScope
  **/
  @ApiModelProperty(value = "The monitoring scope (Call/Agent).")
  public MonitoringScopeEnum getMonitoringScope() {
    return monitoringScope;
  }

  public void setMonitoringScope(MonitoringScopeEnum monitoringScope) {
    this.monitoringScope = monitoringScope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoringScopeDataData monitoringScopeDataData = (MonitoringScopeDataData) o;
    return Objects.equals(this.monitoringScope, monitoringScopeDataData.monitoringScope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitoringScope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringScopeDataData {\n");
    
    sb.append("    monitoringScope: ").append(toIndentedString(monitoringScope)).append("\n");
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

