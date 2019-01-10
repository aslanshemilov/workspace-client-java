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
 * MediamediatypeinteractionscreateData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-05T01:34:42.106Z")
public class MediamediatypeinteractionscreateData {
  /**
   * Specifies the subtype of interaction.
   */
  @JsonAdapter(SubtypeEnum.Adapter.class)
  public enum SubtypeEnum {
    OUTBOUNDNEW("OutboundNew"),
    
    OUTBOUNDREPLY("OutboundReply");

    private String value;

    SubtypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubtypeEnum fromValue(String text) {
      for (SubtypeEnum b : SubtypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SubtypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubtypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubtypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SubtypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("subtype")
  private SubtypeEnum subtype = null;

  @SerializedName("queue")
  private String queue = null;

  @SerializedName("parentId")
  private String parentId = null;

  @SerializedName("contactId")
  private String contactId = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("userData")
  private List<Kvpair> userData = null;

  @SerializedName("extension")
  private List<Kvpair> extension = null;

  public MediamediatypeinteractionscreateData subtype(SubtypeEnum subtype) {
    this.subtype = subtype;
    return this;
  }

   /**
   * Specifies the subtype of interaction.
   * @return subtype
  **/
  @ApiModelProperty(value = "Specifies the subtype of interaction.")
  public SubtypeEnum getSubtype() {
    return subtype;
  }

  public void setSubtype(SubtypeEnum subtype) {
    this.subtype = subtype;
  }

  public MediamediatypeinteractionscreateData queue(String queue) {
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

  public MediamediatypeinteractionscreateData parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * specify the Id of Parent interaction
   * @return parentId
  **/
  @ApiModelProperty(value = "specify the Id of Parent interaction")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public MediamediatypeinteractionscreateData contactId(String contactId) {
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

  public MediamediatypeinteractionscreateData subject(String subject) {
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

  public MediamediatypeinteractionscreateData userData(List<Kvpair> userData) {
    this.userData = userData;
    return this;
  }

  public MediamediatypeinteractionscreateData addUserDataItem(Kvpair userDataItem) {
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

  public MediamediatypeinteractionscreateData extension(List<Kvpair> extension) {
    this.extension = extension;
    return this;
  }

  public MediamediatypeinteractionscreateData addExtensionItem(Kvpair extensionItem) {
    if (this.extension == null) {
      this.extension = new ArrayList<Kvpair>();
    }
    this.extension.add(extensionItem);
    return this;
  }

   /**
   * A key/value pairs list of additional information.
   * @return extension
  **/
  @ApiModelProperty(value = "A key/value pairs list of additional information.")
  public List<Kvpair> getExtension() {
    return extension;
  }

  public void setExtension(List<Kvpair> extension) {
    this.extension = extension;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediamediatypeinteractionscreateData mediamediatypeinteractionscreateData = (MediamediatypeinteractionscreateData) o;
    return Objects.equals(this.subtype, mediamediatypeinteractionscreateData.subtype) &&
        Objects.equals(this.queue, mediamediatypeinteractionscreateData.queue) &&
        Objects.equals(this.parentId, mediamediatypeinteractionscreateData.parentId) &&
        Objects.equals(this.contactId, mediamediatypeinteractionscreateData.contactId) &&
        Objects.equals(this.subject, mediamediatypeinteractionscreateData.subject) &&
        Objects.equals(this.userData, mediamediatypeinteractionscreateData.userData) &&
        Objects.equals(this.extension, mediamediatypeinteractionscreateData.extension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subtype, queue, parentId, contactId, subject, userData, extension);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediamediatypeinteractionscreateData {\n");
    
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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

