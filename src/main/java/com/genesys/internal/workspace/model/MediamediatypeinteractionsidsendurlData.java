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
 * MediamediatypeinteractionsidsendurlData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-27T12:31:12.286Z")
public class MediamediatypeinteractionsidsendurlData {
  @SerializedName("url")
  private String url = null;

  /**
   * Defines which participants in the chat can see the URL.
   */
  @JsonAdapter(VisibilityEnum.Adapter.class)
  public enum VisibilityEnum {
    ALL("All"),
    
    AGENT("Agent"),
    
    SUPERVISOR("Supervisor");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VisibilityEnum fromValue(String text) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VisibilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisibilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VisibilityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VisibilityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("visibility")
  private VisibilityEnum visibility = null;

  public MediamediatypeinteractionsidsendurlData url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL to send to the chat participants.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The URL to send to the chat participants.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public MediamediatypeinteractionsidsendurlData visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Defines which participants in the chat can see the URL.
   * @return visibility
  **/
  @ApiModelProperty(value = "Defines which participants in the chat can see the URL.")
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediamediatypeinteractionsidsendurlData mediamediatypeinteractionsidsendurlData = (MediamediatypeinteractionsidsendurlData) o;
    return Objects.equals(this.url, mediamediatypeinteractionsidsendurlData.url) &&
        Objects.equals(this.visibility, mediamediatypeinteractionsidsendurlData.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, visibility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediamediatypeinteractionsidsendurlData {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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

