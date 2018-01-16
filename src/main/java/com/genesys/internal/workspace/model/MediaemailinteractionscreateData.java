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
 * MediaemailinteractionscreateData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-16T18:12:18.490Z")
public class MediaemailinteractionscreateData {
  @SerializedName("queue")
  private String queue = null;

  @SerializedName("threadId")
  private String threadId = null;

  @SerializedName("contactId")
  private String contactId = null;

  @SerializedName("userData")
  private List<Kvpair> userData = null;

  public MediaemailinteractionscreateData queue(String queue) {
    this.queue = queue;
    return this;
  }

   /**
   * the name of the queue to submit the new email
   * @return queue
  **/
  @ApiModelProperty(value = "the name of the queue to submit the new email")
  public String getQueue() {
    return queue;
  }

  public void setQueue(String queue) {
    this.queue = queue;
  }

  public MediaemailinteractionscreateData threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

   /**
   * Blalala
   * @return threadId
  **/
  @ApiModelProperty(value = "Blalala")
  public String getThreadId() {
    return threadId;
  }

  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

  public MediaemailinteractionscreateData contactId(String contactId) {
    this.contactId = contactId;
    return this;
  }

   /**
   * id of the contact
   * @return contactId
  **/
  @ApiModelProperty(value = "id of the contact")
  public String getContactId() {
    return contactId;
  }

  public void setContactId(String contactId) {
    this.contactId = contactId;
  }

  public MediaemailinteractionscreateData userData(List<Kvpair> userData) {
    this.userData = userData;
    return this;
  }

  public MediaemailinteractionscreateData addUserDataItem(Kvpair userDataItem) {
    if (this.userData == null) {
      this.userData = new ArrayList<Kvpair>();
    }
    this.userData.add(userDataItem);
    return this;
  }

   /**
   * A key/value pairs list of user data.
   * @return userData
  **/
  @ApiModelProperty(value = "A key/value pairs list of user data.")
  public List<Kvpair> getUserData() {
    return userData;
  }

  public void setUserData(List<Kvpair> userData) {
    this.userData = userData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaemailinteractionscreateData mediaemailinteractionscreateData = (MediaemailinteractionscreateData) o;
    return Objects.equals(this.queue, mediaemailinteractionscreateData.queue) &&
        Objects.equals(this.threadId, mediaemailinteractionscreateData.threadId) &&
        Objects.equals(this.contactId, mediaemailinteractionscreateData.contactId) &&
        Objects.equals(this.userData, mediaemailinteractionscreateData.userData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, threadId, contactId, userData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaemailinteractionscreateData {\n");
    
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
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

