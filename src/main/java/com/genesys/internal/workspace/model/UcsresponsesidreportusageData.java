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
 * UcsresponsesidreportusageData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-30T21:13:47.687Z")
public class UcsresponsesidreportusageData {
  @SerializedName("interactionId")
  private String interactionId = null;

  /**
   * standard response usage type
   */
  @JsonAdapter(ResponseTypeEnum.Adapter.class)
  public enum ResponseTypeEnum {
    SYSTEMAUTORESPONSE("SystemAutoResponse"),
    
    SUGGESTEDRESPONSESIGNORED("SuggestedResponsesIgnored"),
    
    SUGGESTEDRESPONSECHOOSEN("SuggestedResponseChoosen"),
    
    SUGGESTEDRESPONSENOTRECEIVED("SuggestedResponseNotReceived"),
    
    ADMINISTRATORRESPONSE("AdministratorResponse");

    private String value;

    ResponseTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResponseTypeEnum fromValue(String text) {
      for (ResponseTypeEnum b : ResponseTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ResponseTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResponseTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResponseTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ResponseTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("responseType")
  private ResponseTypeEnum responseType = null;

  public UcsresponsesidreportusageData interactionId(String interactionId) {
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

  public UcsresponsesidreportusageData responseType(ResponseTypeEnum responseType) {
    this.responseType = responseType;
    return this;
  }

   /**
   * standard response usage type
   * @return responseType
  **/
  @ApiModelProperty(value = "standard response usage type")
  public ResponseTypeEnum getResponseType() {
    return responseType;
  }

  public void setResponseType(ResponseTypeEnum responseType) {
    this.responseType = responseType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UcsresponsesidreportusageData ucsresponsesidreportusageData = (UcsresponsesidreportusageData) o;
    return Objects.equals(this.interactionId, ucsresponsesidreportusageData.interactionId) &&
        Objects.equals(this.responseType, ucsresponsesidreportusageData.responseType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interactionId, responseType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UcsresponsesidreportusageData {\n");
    
    sb.append("    interactionId: ").append(toIndentedString(interactionId)).append("\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
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

