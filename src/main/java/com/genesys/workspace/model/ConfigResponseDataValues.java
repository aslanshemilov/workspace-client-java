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


package com.genesys.workspace.model;

import java.util.Objects;
import com.genesys.workspace.model.Kvpair;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ConfigResponseDataValues
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-25T12:14:49.310Z")
public class ConfigResponseDataValues {
  @SerializedName("name")
  private String name = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("default")
  private Boolean _default = null;

  @SerializedName("userProperties")
  private List<Kvpair> userProperties = new ArrayList<Kvpair>();

  public ConfigResponseDataValues name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConfigResponseDataValues displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ConfigResponseDataValues description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ConfigResponseDataValues _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public ConfigResponseDataValues userProperties(List<Kvpair> userProperties) {
    this.userProperties = userProperties;
    return this;
  }

  public ConfigResponseDataValues addUserPropertiesItem(Kvpair userPropertiesItem) {
    this.userProperties.add(userPropertiesItem);
    return this;
  }

   /**
   * Get userProperties
   * @return userProperties
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Kvpair> getUserProperties() {
    return userProperties;
  }

  public void setUserProperties(List<Kvpair> userProperties) {
    this.userProperties = userProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigResponseDataValues configResponseDataValues = (ConfigResponseDataValues) o;
    return Objects.equals(this.name, configResponseDataValues.name) &&
        Objects.equals(this.displayName, configResponseDataValues.displayName) &&
        Objects.equals(this.description, configResponseDataValues.description) &&
        Objects.equals(this._default, configResponseDataValues._default) &&
        Objects.equals(this.userProperties, configResponseDataValues.userProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, displayName, description, _default, userProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigResponseDataValues {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    userProperties: ").append(toIndentedString(userProperties)).append("\n");
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

