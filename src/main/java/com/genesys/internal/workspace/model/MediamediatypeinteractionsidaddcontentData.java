/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 9.0.000.21.2241
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
 * MediamediatypeinteractionsidaddcontentData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-04T15:05:05.835Z")
public class MediamediatypeinteractionsidaddcontentData {
  @SerializedName("comment")
  private String comment = null;

  @SerializedName("threadId")
  private String threadId = null;

  @SerializedName("parentId")
  private String parentId = null;

  @SerializedName("contactId")
  private String contactId = null;

  public MediamediatypeinteractionsidaddcontentData comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * The comment to be set
   * @return comment
  **/
  @ApiModelProperty(value = "The comment to be set")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public MediamediatypeinteractionsidaddcontentData threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

   /**
   * ThreadId
   * @return threadId
  **/
  @ApiModelProperty(value = "ThreadId")
  public String getThreadId() {
    return threadId;
  }

  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

  public MediamediatypeinteractionsidaddcontentData parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * UCS id of parent interaction
   * @return parentId
  **/
  @ApiModelProperty(value = "UCS id of parent interaction")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public MediamediatypeinteractionsidaddcontentData contactId(String contactId) {
    this.contactId = contactId;
    return this;
  }

   /**
   * id of contact
   * @return contactId
  **/
  @ApiModelProperty(value = "id of contact")
  public String getContactId() {
    return contactId;
  }

  public void setContactId(String contactId) {
    this.contactId = contactId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediamediatypeinteractionsidaddcontentData mediamediatypeinteractionsidaddcontentData = (MediamediatypeinteractionsidaddcontentData) o;
    return Objects.equals(this.comment, mediamediatypeinteractionsidaddcontentData.comment) &&
        Objects.equals(this.threadId, mediamediatypeinteractionsidaddcontentData.threadId) &&
        Objects.equals(this.parentId, mediamediatypeinteractionsidaddcontentData.parentId) &&
        Objects.equals(this.contactId, mediamediatypeinteractionsidaddcontentData.contactId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, threadId, parentId, contactId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediamediatypeinteractionsidaddcontentData {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
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

