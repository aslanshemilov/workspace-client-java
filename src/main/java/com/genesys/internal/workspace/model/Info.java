/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 9.0.000.51.3082
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
 * Info
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-27T12:31:12.286Z")
public class Info {
  @SerializedName("version")
  private String version = null;

  @SerializedName("changeset")
  private String changeset = null;

  public Info version(String version) {
    this.version = version;
    return this;
  }

   /**
   * server version
   * @return version
  **/
  @ApiModelProperty(value = "server version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Info changeset(String changeset) {
    this.changeset = changeset;
    return this;
  }

   /**
   * changeset
   * @return changeset
  **/
  @ApiModelProperty(value = "changeset")
  public String getChangeset() {
    return changeset;
  }

  public void setChangeset(String changeset) {
    this.changeset = changeset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Info info = (Info) o;
    return Objects.equals(this.version, info.version) &&
        Objects.equals(this.changeset, info.changeset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, changeset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Info {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    changeset: ").append(toIndentedString(changeset)).append("\n");
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

