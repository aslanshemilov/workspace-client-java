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
 * VoicecallsidsenddtmfData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-13T14:09:53.404Z")
public class VoicecallsidsenddtmfData {
  @SerializedName("dtmfDigits")
  private String dtmfDigits = null;

  @SerializedName("reasons")
  private List<Kvpair> reasons = null;

  @SerializedName("extensions")
  private List<Kvpair> extensions = null;

  public VoicecallsidsenddtmfData dtmfDigits(String dtmfDigits) {
    this.dtmfDigits = dtmfDigits;
    return this;
  }

   /**
   * The DTMF digits to send to the call.
   * @return dtmfDigits
  **/
  @ApiModelProperty(required = true, value = "The DTMF digits to send to the call.")
  public String getDtmfDigits() {
    return dtmfDigits;
  }

  public void setDtmfDigits(String dtmfDigits) {
    this.dtmfDigits = dtmfDigits;
  }

  public VoicecallsidsenddtmfData reasons(List<Kvpair> reasons) {
    this.reasons = reasons;
    return this;
  }

  public VoicecallsidsenddtmfData addReasonsItem(Kvpair reasonsItem) {
    if (this.reasons == null) {
      this.reasons = new ArrayList<Kvpair>();
    }
    this.reasons.add(reasonsItem);
    return this;
  }

   /**
   * A collection of key/value pairs. For details about reasons, refer to the [Genesys Events and Models Reference Manual](https://docs.genesys.com/Documentation/System).
   * @return reasons
  **/
  @ApiModelProperty(value = "A collection of key/value pairs. For details about reasons, refer to the [Genesys Events and Models Reference Manual](https://docs.genesys.com/Documentation/System).")
  public List<Kvpair> getReasons() {
    return reasons;
  }

  public void setReasons(List<Kvpair> reasons) {
    this.reasons = reasons;
  }

  public VoicecallsidsenddtmfData extensions(List<Kvpair> extensions) {
    this.extensions = extensions;
    return this;
  }

  public VoicecallsidsenddtmfData addExtensionsItem(Kvpair extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new ArrayList<Kvpair>();
    }
    this.extensions.add(extensionsItem);
    return this;
  }

   /**
   * A collection of key/value pairs. For details about extensions, refer to the [Genesys Events and Models Reference Manual](https://docs.genesys.com/Documentation/System).
   * @return extensions
  **/
  @ApiModelProperty(value = "A collection of key/value pairs. For details about extensions, refer to the [Genesys Events and Models Reference Manual](https://docs.genesys.com/Documentation/System).")
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
    VoicecallsidsenddtmfData voicecallsidsenddtmfData = (VoicecallsidsenddtmfData) o;
    return Objects.equals(this.dtmfDigits, voicecallsidsenddtmfData.dtmfDigits) &&
        Objects.equals(this.reasons, voicecallsidsenddtmfData.reasons) &&
        Objects.equals(this.extensions, voicecallsidsenddtmfData.extensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dtmfDigits, reasons, extensions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicecallsidsenddtmfData {\n");
    
    sb.append("    dtmfDigits: ").append(toIndentedString(dtmfDigits)).append("\n");
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

