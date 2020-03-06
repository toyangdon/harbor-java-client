/*
 * Harbor API
 * These APIs provide services for manipulating Harbor project.
 *
 * OpenAPI spec version: 1.10.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ConfigurationsScanAllPolicyParameter;
import java.io.IOException;

/**
 * ConfigurationsScanAllPolicy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-06T02:07:22.019Z")
public class ConfigurationsScanAllPolicy {
  @SerializedName("type")
  private String type = null;

  @SerializedName("parameter")
  private ConfigurationsScanAllPolicyParameter parameter = null;

  public ConfigurationsScanAllPolicy type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of scan all policy, currently the valid values are \&quot;none\&quot; and \&quot;daily\&quot;
   * @return type
  **/
  @ApiModelProperty(value = "The type of scan all policy, currently the valid values are \"none\" and \"daily\"")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ConfigurationsScanAllPolicy parameter(ConfigurationsScanAllPolicyParameter parameter) {
    this.parameter = parameter;
    return this;
  }

   /**
   * Get parameter
   * @return parameter
  **/
  @ApiModelProperty(value = "")
  public ConfigurationsScanAllPolicyParameter getParameter() {
    return parameter;
  }

  public void setParameter(ConfigurationsScanAllPolicyParameter parameter) {
    this.parameter = parameter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationsScanAllPolicy configurationsScanAllPolicy = (ConfigurationsScanAllPolicy) o;
    return Objects.equals(this.type, configurationsScanAllPolicy.type) &&
        Objects.equals(this.parameter, configurationsScanAllPolicy.parameter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, parameter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationsScanAllPolicy {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
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

