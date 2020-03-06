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
import java.io.IOException;

/**
 * AdminJobScheduleObj
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-06T02:07:22.019Z")
public class AdminJobScheduleObj {
  @SerializedName("type")
  private String type = null;

  @SerializedName("cron")
  private String cron = null;

  public AdminJobScheduleObj type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The schedule type. The valid values are &#39;Hourly&#39;, &#39;Daily&#39;, &#39;Weekly&#39;, &#39;Custom&#39;, &#39;Manually&#39; and &#39;None&#39;. &#39;Manually&#39; means to trigger it right away and &#39;None&#39; means to cancel the schedule. 
   * @return type
  **/
  @ApiModelProperty(value = "The schedule type. The valid values are 'Hourly', 'Daily', 'Weekly', 'Custom', 'Manually' and 'None'. 'Manually' means to trigger it right away and 'None' means to cancel the schedule. ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AdminJobScheduleObj cron(String cron) {
    this.cron = cron;
    return this;
  }

   /**
   * A cron expression, a time-based job scheduler.
   * @return cron
  **/
  @ApiModelProperty(value = "A cron expression, a time-based job scheduler.")
  public String getCron() {
    return cron;
  }

  public void setCron(String cron) {
    this.cron = cron;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminJobScheduleObj adminJobScheduleObj = (AdminJobScheduleObj) o;
    return Objects.equals(this.type, adminJobScheduleObj.type) &&
        Objects.equals(this.cron, adminJobScheduleObj.cron);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, cron);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminJobScheduleObj {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
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

