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


package com.genesys._internal.workspace.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import com.genesys.workspace.models.KeyValueCollection;

/**
 * VoicecallsiddeletefromconferenceData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T16:18:36.606Z")
public class VoicecallsiddeletefromconferenceData {
  @SerializedName("reasons")
  private KeyValueCollection reasons = null;

  @SerializedName("extensions")
  private KeyValueCollection extensions = null;

  @SerializedName("dnToDrop")
  private String dnToDrop = null;

  public VoicecallsiddeletefromconferenceData reasons(KeyValueCollection reasons) {
    this.reasons = reasons;
    return this;
  }

   /**
   * A key/value pairs list of a data structure that provides additional information associated with this action.
   * @return reasons
  **/
  @ApiModelProperty(value = "A key/value pairs list of a data structure that provides additional information associated with this action.")
  public KeyValueCollection getReasons() {
    return reasons;
  }

  public void setReasons(KeyValueCollection reasons) {
    this.reasons = reasons;
  }

  public VoicecallsiddeletefromconferenceData extensions(KeyValueCollection extensions) {
    this.extensions = extensions;
    return this;
  }


   /**
   * A key/value pairs list of additional data.
   * @return extensions
  **/
  @ApiModelProperty(value = "A key/value pairs list of additional data.")
  public KeyValueCollection getExtensions() {
    return extensions;
  }

  public void setExtensions(KeyValueCollection extensions) {
    this.extensions = extensions;
  }

  public VoicecallsiddeletefromconferenceData dnToDrop(String dnToDrop) {
    this.dnToDrop = dnToDrop;
    return this;
  }

   /**
   * The party to be deleted from the conference
   * @return dnToDrop
  **/
  @ApiModelProperty(required = true, value = "The party to be deleted from the conference")
  public String getDnToDrop() {
    return dnToDrop;
  }

  public void setDnToDrop(String dnToDrop) {
    this.dnToDrop = dnToDrop;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicecallsiddeletefromconferenceData voicecallsiddeletefromconferenceData = (VoicecallsiddeletefromconferenceData) o;
    return Objects.equals(this.reasons, voicecallsiddeletefromconferenceData.reasons) &&
        Objects.equals(this.extensions, voicecallsiddeletefromconferenceData.extensions) &&
        Objects.equals(this.dnToDrop, voicecallsiddeletefromconferenceData.dnToDrop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasons, extensions, dnToDrop);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicecallsiddeletefromconferenceData {\n");
    
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    dnToDrop: ").append(toIndentedString(dnToDrop)).append("\n");
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
