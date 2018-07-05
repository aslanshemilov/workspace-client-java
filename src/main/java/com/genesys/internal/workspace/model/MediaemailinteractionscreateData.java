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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-05T12:04:21.715Z")
public class MediaemailinteractionscreateData {
  @SerializedName("queue")
  private String queue = null;

  @SerializedName("threadId")
  private String threadId = null;

  @SerializedName("contactId")
  private String contactId = null;

  @SerializedName("to")
  private String to = null;

  @SerializedName("body")
  private String body = null;

  @SerializedName("bodyAsPlainText")
  private String bodyAsPlainText = null;

  @SerializedName("mime")
  private String mime = null;

  @SerializedName("subject")
  private String subject = null;

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
   * specify the ThreadId of UCS interaction
   * @return threadId
  **/
  @ApiModelProperty(value = "specify the ThreadId of UCS interaction")
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

  public MediaemailinteractionscreateData to(String to) {
    this.to = to;
    return this;
  }

   /**
   * the address mail of to
   * @return to
  **/
  @ApiModelProperty(value = "the address mail of to")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public MediaemailinteractionscreateData body(String body) {
    this.body = body;
    return this;
  }

   /**
   * The message to send. Html body
   * @return body
  **/
  @ApiModelProperty(value = "The message to send. Html body")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public MediaemailinteractionscreateData bodyAsPlainText(String bodyAsPlainText) {
    this.bodyAsPlainText = bodyAsPlainText;
    return this;
  }

   /**
   * The message to send. Plain text body
   * @return bodyAsPlainText
  **/
  @ApiModelProperty(value = "The message to send. Plain text body")
  public String getBodyAsPlainText() {
    return bodyAsPlainText;
  }

  public void setBodyAsPlainText(String bodyAsPlainText) {
    this.bodyAsPlainText = bodyAsPlainText;
  }

  public MediaemailinteractionscreateData mime(String mime) {
    this.mime = mime;
    return this;
  }

   /**
   * Multipurpose internet mail extensions of email
   * @return mime
  **/
  @ApiModelProperty(value = "Multipurpose internet mail extensions of email")
  public String getMime() {
    return mime;
  }

  public void setMime(String mime) {
    this.mime = mime;
  }

  public MediaemailinteractionscreateData subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The subject value
   * @return subject
  **/
  @ApiModelProperty(value = "The subject value")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
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
        Objects.equals(this.to, mediaemailinteractionscreateData.to) &&
        Objects.equals(this.body, mediaemailinteractionscreateData.body) &&
        Objects.equals(this.bodyAsPlainText, mediaemailinteractionscreateData.bodyAsPlainText) &&
        Objects.equals(this.mime, mediaemailinteractionscreateData.mime) &&
        Objects.equals(this.subject, mediaemailinteractionscreateData.subject) &&
        Objects.equals(this.userData, mediaemailinteractionscreateData.userData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, threadId, contactId, to, body, bodyAsPlainText, mime, subject, userData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaemailinteractionscreateData {\n");
    
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    bodyAsPlainText: ").append(toIndentedString(bodyAsPlainText)).append("\n");
    sb.append("    mime: ").append(toIndentedString(mime)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

