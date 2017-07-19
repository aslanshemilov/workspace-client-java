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
import com.genesys.workspace.model.Kvpair;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * VoicecallsidreconnectData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-19T22:53:03.614Z")
public class VoicecallsidreconnectData {
  @SerializedName("heldConnId")
  private String heldConnId = null;

  @SerializedName("reasons")
  private List<Kvpair> reasons = new ArrayList<Kvpair>();

  @SerializedName("extensions")
  private List<Kvpair> extensions = new ArrayList<Kvpair>();

  public VoicecallsidreconnectData heldConnId(String heldConnId) {
    this.heldConnId = heldConnId;
    return this;
  }

   /**
   * Connection identifier of the active call from which the telephony object in question should be released.
   * @return heldConnId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Connection identifier of the active call from which the telephony object in question should be released.")
  public String getHeldConnId() {
    return heldConnId;
  }

  public void setHeldConnId(String heldConnId) {
    this.heldConnId = heldConnId;
  }

  public VoicecallsidreconnectData reasons(List<Kvpair> reasons) {
    this.reasons = reasons;
    return this;
  }

  public VoicecallsidreconnectData addReasonsItem(Kvpair reasonsItem) {
    this.reasons.add(reasonsItem);
    return this;
  }

   /**
   * A key/value pairs list of a data structure that provides additional information associated with this action.
   * @return reasons
  **/
  @ApiModelProperty(example = "null", value = "A key/value pairs list of a data structure that provides additional information associated with this action.")
  public List<Kvpair> getReasons() {
    return reasons;
  }

  public void setReasons(List<Kvpair> reasons) {
    this.reasons = reasons;
  }

  public VoicecallsidreconnectData extensions(List<Kvpair> extensions) {
    this.extensions = extensions;
    return this;
  }

  public VoicecallsidreconnectData addExtensionsItem(Kvpair extensionsItem) {
    this.extensions.add(extensionsItem);
    return this;
  }

   /**
   * A key/value pairs list of additional data.
   * @return extensions
  **/
  @ApiModelProperty(example = "null", value = "A key/value pairs list of additional data.")
  public List<Kvpair> getExtensions() {
    return extensions;
  }

  public void setExtensions(List<Kvpair> extensions) {
    this.extensions = extensions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicecallsidreconnectData voicecallsidreconnectData = (VoicecallsidreconnectData) o;
    return Objects.equals(this.heldConnId, voicecallsidreconnectData.heldConnId) &&
        Objects.equals(this.reasons, voicecallsidreconnectData.reasons) &&
        Objects.equals(this.extensions, voicecallsidreconnectData.extensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heldConnId, reasons, extensions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicecallsidreconnectData {\n");
    
    sb.append("    heldConnId: ").append(toIndentedString(heldConnId)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
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

