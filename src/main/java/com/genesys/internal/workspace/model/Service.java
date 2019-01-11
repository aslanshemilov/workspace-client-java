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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Service
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-11T03:30:03.382Z")
public class Service {
  /**
   * The name of the service.
   */
  @JsonAdapter(ServiceNameEnum.Adapter.class)
  public enum ServiceNameEnum {
    VOICE("VOICE"),
    
    STATS("STATS"),
    
    IXN("IXN"),
    
    UCS("UCS");

    private String value;

    ServiceNameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ServiceNameEnum fromValue(String text) {
      for (ServiceNameEnum b : ServiceNameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ServiceNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServiceNameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServiceNameEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ServiceNameEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("serviceName")
  private ServiceNameEnum serviceName = null;

  /**
   * The state of the service - AVAILABLE or UNAVAILABLE
   */
  @JsonAdapter(ServiceStateEnum.Adapter.class)
  public enum ServiceStateEnum {
    AVAILABLE("AVAILABLE"),
    
    UNAVAILABLE("UNAVAILABLE");

    private String value;

    ServiceStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ServiceStateEnum fromValue(String text) {
      for (ServiceStateEnum b : ServiceStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ServiceStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServiceStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServiceStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ServiceStateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("serviceState")
  private ServiceStateEnum serviceState = null;

  public Service serviceName(ServiceNameEnum serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * The name of the service.
   * @return serviceName
  **/
  @ApiModelProperty(value = "The name of the service.")
  public ServiceNameEnum getServiceName() {
    return serviceName;
  }

  public void setServiceName(ServiceNameEnum serviceName) {
    this.serviceName = serviceName;
  }

  public Service serviceState(ServiceStateEnum serviceState) {
    this.serviceState = serviceState;
    return this;
  }

   /**
   * The state of the service - AVAILABLE or UNAVAILABLE
   * @return serviceState
  **/
  @ApiModelProperty(value = "The state of the service - AVAILABLE or UNAVAILABLE")
  public ServiceStateEnum getServiceState() {
    return serviceState;
  }

  public void setServiceState(ServiceStateEnum serviceState) {
    this.serviceState = serviceState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.serviceName, service.serviceName) &&
        Objects.equals(this.serviceState, service.serviceState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceName, serviceState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceState: ").append(toIndentedString(serviceState)).append("\n");
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

