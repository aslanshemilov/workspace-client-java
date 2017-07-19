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
import com.genesys.workspace.model.CurrentUserDataPendingloginasync;
import com.genesys.workspace.model.CurrentUserDataUser;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CurrentUserData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-19T22:53:03.614Z")
public class CurrentUserData {
  @SerializedName("pending-login-async")
  private CurrentUserDataPendingloginasync pendingLoginAsync = null;

  @SerializedName("user")
  private CurrentUserDataUser user = null;

  public CurrentUserData pendingLoginAsync(CurrentUserDataPendingloginasync pendingLoginAsync) {
    this.pendingLoginAsync = pendingLoginAsync;
    return this;
  }

   /**
   * Get pendingLoginAsync
   * @return pendingLoginAsync
  **/
  @ApiModelProperty(example = "null", value = "")
  public CurrentUserDataPendingloginasync getPendingLoginAsync() {
    return pendingLoginAsync;
  }

  public void setPendingLoginAsync(CurrentUserDataPendingloginasync pendingLoginAsync) {
    this.pendingLoginAsync = pendingLoginAsync;
  }

  public CurrentUserData user(CurrentUserDataUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(example = "null", value = "")
  public CurrentUserDataUser getUser() {
    return user;
  }

  public void setUser(CurrentUserDataUser user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentUserData currentUserData = (CurrentUserData) o;
    return Objects.equals(this.pendingLoginAsync, currentUserData.pendingLoginAsync) &&
        Objects.equals(this.user, currentUserData.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pendingLoginAsync, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentUserData {\n");
    
    sb.append("    pendingLoginAsync: ").append(toIndentedString(pendingLoginAsync)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

