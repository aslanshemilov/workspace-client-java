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
 * CurrentSessionDataPendingloginasync
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-05T00:04:39.623Z")
public class CurrentSessionDataPendingloginasync {
  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    NOTSTARTED("NotStarted"),
    
    EXECUTING("Executing"),
    
    FAILED("Failed"),
    
    COMPLETE("Complete");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("actualWaitTime")
  private Integer actualWaitTime = null;

  @SerializedName("submittedAt")
  private String submittedAt = null;

  @SerializedName("errors")
  private List<Kvpair> errors = null;

  public CurrentSessionDataPendingloginasync state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(required = true, value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public CurrentSessionDataPendingloginasync actualWaitTime(Integer actualWaitTime) {
    this.actualWaitTime = actualWaitTime;
    return this;
  }

   /**
   * Get actualWaitTime
   * @return actualWaitTime
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getActualWaitTime() {
    return actualWaitTime;
  }

  public void setActualWaitTime(Integer actualWaitTime) {
    this.actualWaitTime = actualWaitTime;
  }

  public CurrentSessionDataPendingloginasync submittedAt(String submittedAt) {
    this.submittedAt = submittedAt;
    return this;
  }

   /**
   * Get submittedAt
   * @return submittedAt
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSubmittedAt() {
    return submittedAt;
  }

  public void setSubmittedAt(String submittedAt) {
    this.submittedAt = submittedAt;
  }

  public CurrentSessionDataPendingloginasync errors(List<Kvpair> errors) {
    this.errors = errors;
    return this;
  }

  public CurrentSessionDataPendingloginasync addErrorsItem(Kvpair errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<Kvpair>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
  public List<Kvpair> getErrors() {
    return errors;
  }

  public void setErrors(List<Kvpair> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentSessionDataPendingloginasync currentSessionDataPendingloginasync = (CurrentSessionDataPendingloginasync) o;
    return Objects.equals(this.state, currentSessionDataPendingloginasync.state) &&
        Objects.equals(this.actualWaitTime, currentSessionDataPendingloginasync.actualWaitTime) &&
        Objects.equals(this.submittedAt, currentSessionDataPendingloginasync.submittedAt) &&
        Objects.equals(this.errors, currentSessionDataPendingloginasync.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, actualWaitTime, submittedAt, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentSessionDataPendingloginasync {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    actualWaitTime: ").append(toIndentedString(actualWaitTime)).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

