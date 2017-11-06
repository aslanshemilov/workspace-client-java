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
 * UcsidentifycontactData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-06T17:40:36.209Z")
public class UcsidentifycontactData {
  @SerializedName("createContactEnabled")
  private Boolean createContactEnabled = null;

  @SerializedName("mediaType")
  private String mediaType = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("emailAddress")
  private String emailAddress = null;

  @SerializedName("userData")
  private List<Kvpair> userData = new ArrayList<Kvpair>();

  public UcsidentifycontactData createContactEnabled(Boolean createContactEnabled) {
    this.createContactEnabled = createContactEnabled;
    return this;
  }

   /**
   * Indicates if a contact should be created if no matching contact found
   * @return createContactEnabled
  **/
  @ApiModelProperty(value = "Indicates if a contact should be created if no matching contact found")
  public Boolean isCreateContactEnabled() {
    return createContactEnabled;
  }

  public void setCreateContactEnabled(Boolean createContactEnabled) {
    this.createContactEnabled = createContactEnabled;
  }

  public UcsidentifycontactData mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * The media type of the interaction
   * @return mediaType
  **/
  @ApiModelProperty(required = true, value = "The media type of the interaction")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public UcsidentifycontactData phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number of the interaction, if interaction is a voice call
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "The phone number of the interaction, if interaction is a voice call")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public UcsidentifycontactData emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email address of the interaction, if interaction is an email
   * @return emailAddress
  **/
  @ApiModelProperty(value = "The email address of the interaction, if interaction is an email")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public UcsidentifycontactData userData(List<Kvpair> userData) {
    this.userData = userData;
    return this;
  }

  public UcsidentifycontactData addUserDataItem(Kvpair userDataItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UcsidentifycontactData ucsidentifycontactData = (UcsidentifycontactData) o;
    return Objects.equals(this.createContactEnabled, ucsidentifycontactData.createContactEnabled) &&
        Objects.equals(this.mediaType, ucsidentifycontactData.mediaType) &&
        Objects.equals(this.phoneNumber, ucsidentifycontactData.phoneNumber) &&
        Objects.equals(this.emailAddress, ucsidentifycontactData.emailAddress) &&
        Objects.equals(this.userData, ucsidentifycontactData.userData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createContactEnabled, mediaType, phoneNumber, emailAddress, userData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UcsidentifycontactData {\n");
    
    sb.append("    createContactEnabled: ").append(toIndentedString(createContactEnabled)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
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

