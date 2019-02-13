/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 9.0.000.31.2540
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
import java.math.BigDecimal;

/**
 * MediamanagementsnapshotIdgetsnapshotcontentData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-21T19:45:26.412Z")
public class MediamanagementsnapshotIdgetsnapshotcontentData {
  @SerializedName("startIndex")
  private BigDecimal startIndex = null;

  @SerializedName("size")
  private BigDecimal size = null;

  public MediamanagementsnapshotIdgetsnapshotcontentData startIndex(BigDecimal startIndex) {
    this.startIndex = startIndex;
    return this;
  }

   /**
   * The start index.
   * @return startIndex
  **/
  @ApiModelProperty(value = "The start index.")
  public BigDecimal getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(BigDecimal startIndex) {
    this.startIndex = startIndex;
  }

  public MediamanagementsnapshotIdgetsnapshotcontentData size(BigDecimal size) {
    this.size = size;
    return this;
  }

   /**
   * The number of elements
   * @return size
  **/
  @ApiModelProperty(value = "The number of elements")
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediamanagementsnapshotIdgetsnapshotcontentData mediamanagementsnapshotIdgetsnapshotcontentData = (MediamanagementsnapshotIdgetsnapshotcontentData) o;
    return Objects.equals(this.startIndex, mediamanagementsnapshotIdgetsnapshotcontentData.startIndex) &&
        Objects.equals(this.size, mediamanagementsnapshotIdgetsnapshotcontentData.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startIndex, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediamanagementsnapshotIdgetsnapshotcontentData {\n");
    
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

