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


package com.genesys.internal.workspace.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * UcsfindorcreatephonecallData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-17T19:01:40.686Z")
public class UcsfindorcreatephonecallData {
  @SerializedName("status")
  private String status = null;

  @SerializedName("userData")
  private List<Kvpair> userData = new ArrayList<Kvpair>();

  @SerializedName("callId")
  private String callId = null;

  @SerializedName("threadId")
  private String threadId = null;

  @SerializedName("contactId")
  private String contactId = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("parentId")
  private String parentId = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("subject")
  private String subject = null;

  public UcsfindorcreatephonecallData status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the call
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the call")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public UcsfindorcreatephonecallData userData(List<Kvpair> userData) {
    this.userData = userData;
    return this;
  }

  public UcsfindorcreatephonecallData addUserDataItem(Kvpair userDataItem) {
    this.userData.add(userDataItem);
    return this;
  }

   /**
   * A key/value pairs list of the user data of the call.
   * @return userData
  **/
  @ApiModelProperty(required = true, value = "A key/value pairs list of the user data of the call.")
  public List<Kvpair> getUserData() {
    return userData;
  }

  public void setUserData(List<Kvpair> userData) {
    this.userData = userData;
  }

  public UcsfindorcreatephonecallData callId(String callId) {
    this.callId = callId;
    return this;
  }

   /**
   * The id of the call
   * @return callId
  **/
  @ApiModelProperty(required = true, value = "The id of the call")
  public String getCallId() {
    return callId;
  }

  public void setCallId(String callId) {
    this.callId = callId;
  }

  public UcsfindorcreatephonecallData threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

   /**
   * The thread id
   * @return threadId
  **/
  @ApiModelProperty(value = "The thread id")
  public String getThreadId() {
    return threadId;
  }

  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

  public UcsfindorcreatephonecallData contactId(String contactId) {
    this.contactId = contactId;
    return this;
  }

   /**
   * The id of the contact
   * @return contactId
  **/
  @ApiModelProperty(required = true, value = "The id of the contact")
  public String getContactId() {
    return contactId;
  }

  public void setContactId(String contactId) {
    this.contactId = contactId;
  }

  public UcsfindorcreatephonecallData phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number of the call
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "The phone number of the call")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public UcsfindorcreatephonecallData parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * The id of the parent interaction
   * @return parentId
  **/
  @ApiModelProperty(value = "The id of the parent interaction")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public UcsfindorcreatephonecallData type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the call
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the call")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public UcsfindorcreatephonecallData subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The subject of the call
   * @return subject
  **/
  @ApiModelProperty(value = "The subject of the call")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UcsfindorcreatephonecallData ucsfindorcreatephonecallData = (UcsfindorcreatephonecallData) o;
    return Objects.equals(this.status, ucsfindorcreatephonecallData.status) &&
        Objects.equals(this.userData, ucsfindorcreatephonecallData.userData) &&
        Objects.equals(this.callId, ucsfindorcreatephonecallData.callId) &&
        Objects.equals(this.threadId, ucsfindorcreatephonecallData.threadId) &&
        Objects.equals(this.contactId, ucsfindorcreatephonecallData.contactId) &&
        Objects.equals(this.phoneNumber, ucsfindorcreatephonecallData.phoneNumber) &&
        Objects.equals(this.parentId, ucsfindorcreatephonecallData.parentId) &&
        Objects.equals(this.type, ucsfindorcreatephonecallData.type) &&
        Objects.equals(this.subject, ucsfindorcreatephonecallData.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, userData, callId, threadId, contactId, phoneNumber, parentId, type, subject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UcsfindorcreatephonecallData {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

