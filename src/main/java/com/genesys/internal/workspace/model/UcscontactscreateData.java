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
 * UcscontactscreateData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-16T14:39:08.778Z")
public class UcscontactscreateData {
  @SerializedName("properties")
  private List<Object> properties = new ArrayList<Object>();

  public UcscontactscreateData properties(List<Object> properties) {
    this.properties = properties;
    return this;
  }

  public UcscontactscreateData addPropertiesItem(Object propertiesItem) {
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * The list of contact attributes to be added to the contact
   * @return properties
  **/
  @ApiModelProperty(required = true, value = "The list of contact attributes to be added to the contact")
  public List<Object> getProperties() {
    return properties;
  }

  public void setProperties(List<Object> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UcscontactscreateData ucscontactscreateData = (UcscontactscreateData) o;
    return Objects.equals(this.properties, ucscontactscreateData.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UcscontactscreateData {\n");
    
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

