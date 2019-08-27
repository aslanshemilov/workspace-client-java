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
 * Target
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-27T12:31:12.286Z")
public class Target {
  @SerializedName("DBID")
  private Integer DBID = null;

  @SerializedName("name")
  private String name = null;

  /**
   * The type of target.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    AGENT("agent"),
    
    AGENT_GROUP("agent-group"),
    
    ACD_QUEUE("acd-queue"),
    
    INTERACTION_QUEUE("interaction-queue"),
    
    ROUTE_POINT("route-point"),
    
    SKILL("skill"),
    
    CUSTOM_CONTACT("custom-contact"),
    
    CONTACT("contact");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("employeeId")
  private String employeeId = null;

  @SerializedName("userName")
  private String userName = null;

  @SerializedName("number")
  private String number = null;

  @SerializedName("switchName")
  private String switchName = null;

  @SerializedName("availability")
  private Object availability = null;

  public Target DBID(Integer DBID) {
    this.DBID = DBID;
    return this;
  }

   /**
   * The unique database identifier.
   * @return DBID
  **/
  @ApiModelProperty(value = "The unique database identifier.")
  public Integer getDBID() {
    return DBID;
  }

  public void setDBID(Integer DBID) {
    this.DBID = DBID;
  }

  public Target name(String name) {
    this.name = name;
    return this;
  }

   /**
   * If the target is not **agent**, this property has a value. For example, the name of the agent group. If the target is **agent**, then the firstName and lastName fields are returned instead (or the username if neither is defined).
   * @return name
  **/
  @ApiModelProperty(value = "If the target is not **agent**, this property has a value. For example, the name of the agent group. If the target is **agent**, then the firstName and lastName fields are returned instead (or the username if neither is defined).")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Target type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of target.
   * @return type
  **/
  @ApiModelProperty(value = "The type of target.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Target firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The agent&#39;s first name.
   * @return firstName
  **/
  @ApiModelProperty(value = "The agent's first name.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Target lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The agent&#39;s last name.
   * @return lastName
  **/
  @ApiModelProperty(value = "The agent's last name.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Target employeeId(String employeeId) {
    this.employeeId = employeeId;
    return this;
  }

   /**
   * The agent&#39;s employee ID.
   * @return employeeId
  **/
  @ApiModelProperty(value = "The agent's employee ID.")
  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public Target userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * The agent&#39;s username.
   * @return userName
  **/
  @ApiModelProperty(value = "The agent's username.")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Target number(String number) {
    this.number = number;
    return this;
  }

   /**
   * The number associated with either an **acd-queue** or a **route-point**.
   * @return number
  **/
  @ApiModelProperty(value = "The number associated with either an **acd-queue** or a **route-point**.")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Target switchName(String switchName) {
    this.switchName = switchName;
    return this;
  }

   /**
   * The name of the switch associated with either an **acd-queue** or a **route-point**.
   * @return switchName
  **/
  @ApiModelProperty(value = "The name of the switch associated with either an **acd-queue** or a **route-point**.")
  public String getSwitchName() {
    return switchName;
  }

  public void setSwitchName(String switchName) {
    this.switchName = switchName;
  }

  public Target availability(Object availability) {
    this.availability = availability;
    return this;
  }

   /**
   * The structure of this object depends on the target type. For **agent**, availability includes channel details. For **acd-queue** and **route-point**, it includes waiting calls. For **agent-groups**, availability includes the number of ready agents.
   * @return availability
  **/
  @ApiModelProperty(value = "The structure of this object depends on the target type. For **agent**, availability includes channel details. For **acd-queue** and **route-point**, it includes waiting calls. For **agent-groups**, availability includes the number of ready agents.")
  public Object getAvailability() {
    return availability;
  }

  public void setAvailability(Object availability) {
    this.availability = availability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Target target = (Target) o;
    return Objects.equals(this.DBID, target.DBID) &&
        Objects.equals(this.name, target.name) &&
        Objects.equals(this.type, target.type) &&
        Objects.equals(this.firstName, target.firstName) &&
        Objects.equals(this.lastName, target.lastName) &&
        Objects.equals(this.employeeId, target.employeeId) &&
        Objects.equals(this.userName, target.userName) &&
        Objects.equals(this.number, target.number) &&
        Objects.equals(this.switchName, target.switchName) &&
        Objects.equals(this.availability, target.availability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(DBID, name, type, firstName, lastName, employeeId, userName, number, switchName, availability);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Target {\n");
    
    sb.append("    DBID: ").append(toIndentedString(DBID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    switchName: ").append(toIndentedString(switchName)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
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

