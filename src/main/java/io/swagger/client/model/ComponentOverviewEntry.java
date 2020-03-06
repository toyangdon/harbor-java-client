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
 * ComponentOverviewEntry
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-06T02:07:22.019Z")
public class ComponentOverviewEntry {
  @SerializedName("severity")
  private Integer severity = null;

  @SerializedName("count")
  private Integer count = null;

  public ComponentOverviewEntry severity(Integer severity) {
    this.severity = severity;
    return this;
  }

   /**
   * 1-None/Negligible, 2-Unknown, 3-Low, 4-Medium, 5-High
   * @return severity
  **/
  @ApiModelProperty(value = "1-None/Negligible, 2-Unknown, 3-Low, 4-Medium, 5-High")
  public Integer getSeverity() {
    return severity;
  }

  public void setSeverity(Integer severity) {
    this.severity = severity;
  }

  public ComponentOverviewEntry count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * number of the components with certain severity.
   * @return count
  **/
  @ApiModelProperty(value = "number of the components with certain severity.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentOverviewEntry componentOverviewEntry = (ComponentOverviewEntry) o;
    return Objects.equals(this.severity, componentOverviewEntry.severity) &&
        Objects.equals(this.count, componentOverviewEntry.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(severity, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentOverviewEntry {\n");
    
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

