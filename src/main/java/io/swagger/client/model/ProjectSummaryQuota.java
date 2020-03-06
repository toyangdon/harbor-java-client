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
import io.swagger.client.model.ResourceList;
import java.io.IOException;

/**
 * ProjectSummaryQuota
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-06T02:07:22.019Z")
public class ProjectSummaryQuota {
  @SerializedName("hard")
  private ResourceList hard = null;

  @SerializedName("used")
  private ResourceList used = null;

  public ProjectSummaryQuota hard(ResourceList hard) {
    this.hard = hard;
    return this;
  }

   /**
   * The hard limits of the quota
   * @return hard
  **/
  @ApiModelProperty(value = "The hard limits of the quota")
  public ResourceList getHard() {
    return hard;
  }

  public void setHard(ResourceList hard) {
    this.hard = hard;
  }

  public ProjectSummaryQuota used(ResourceList used) {
    this.used = used;
    return this;
  }

   /**
   * The used status of the quota
   * @return used
  **/
  @ApiModelProperty(value = "The used status of the quota")
  public ResourceList getUsed() {
    return used;
  }

  public void setUsed(ResourceList used) {
    this.used = used;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectSummaryQuota projectSummaryQuota = (ProjectSummaryQuota) o;
    return Objects.equals(this.hard, projectSummaryQuota.hard) &&
        Objects.equals(this.used, projectSummaryQuota.used);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hard, used);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectSummaryQuota {\n");
    
    sb.append("    hard: ").append(toIndentedString(hard)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
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

