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
 * StatisticMap
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-06T02:07:22.019Z")
public class StatisticMap {
  @SerializedName("private_project_count")
  private Integer privateProjectCount = null;

  @SerializedName("private_repo_count")
  private Integer privateRepoCount = null;

  @SerializedName("public_project_count")
  private Integer publicProjectCount = null;

  @SerializedName("public_repo_count")
  private Integer publicRepoCount = null;

  @SerializedName("total_project_count")
  private Integer totalProjectCount = null;

  @SerializedName("total_repo_count")
  private Integer totalRepoCount = null;

  public StatisticMap privateProjectCount(Integer privateProjectCount) {
    this.privateProjectCount = privateProjectCount;
    return this;
  }

   /**
   * The count of the private projects which the user is a member of.
   * @return privateProjectCount
  **/
  @ApiModelProperty(value = "The count of the private projects which the user is a member of.")
  public Integer getPrivateProjectCount() {
    return privateProjectCount;
  }

  public void setPrivateProjectCount(Integer privateProjectCount) {
    this.privateProjectCount = privateProjectCount;
  }

  public StatisticMap privateRepoCount(Integer privateRepoCount) {
    this.privateRepoCount = privateRepoCount;
    return this;
  }

   /**
   * The count of the private repositories belonging to the projects which the user is a member of.
   * @return privateRepoCount
  **/
  @ApiModelProperty(value = "The count of the private repositories belonging to the projects which the user is a member of.")
  public Integer getPrivateRepoCount() {
    return privateRepoCount;
  }

  public void setPrivateRepoCount(Integer privateRepoCount) {
    this.privateRepoCount = privateRepoCount;
  }

  public StatisticMap publicProjectCount(Integer publicProjectCount) {
    this.publicProjectCount = publicProjectCount;
    return this;
  }

   /**
   * The count of the public projects.
   * @return publicProjectCount
  **/
  @ApiModelProperty(value = "The count of the public projects.")
  public Integer getPublicProjectCount() {
    return publicProjectCount;
  }

  public void setPublicProjectCount(Integer publicProjectCount) {
    this.publicProjectCount = publicProjectCount;
  }

  public StatisticMap publicRepoCount(Integer publicRepoCount) {
    this.publicRepoCount = publicRepoCount;
    return this;
  }

   /**
   * The count of the public repositories belonging to the public projects which the user is a member of.
   * @return publicRepoCount
  **/
  @ApiModelProperty(value = "The count of the public repositories belonging to the public projects which the user is a member of.")
  public Integer getPublicRepoCount() {
    return publicRepoCount;
  }

  public void setPublicRepoCount(Integer publicRepoCount) {
    this.publicRepoCount = publicRepoCount;
  }

  public StatisticMap totalProjectCount(Integer totalProjectCount) {
    this.totalProjectCount = totalProjectCount;
    return this;
  }

   /**
   * The count of the total projects, only be seen when the is admin.
   * @return totalProjectCount
  **/
  @ApiModelProperty(value = "The count of the total projects, only be seen when the is admin.")
  public Integer getTotalProjectCount() {
    return totalProjectCount;
  }

  public void setTotalProjectCount(Integer totalProjectCount) {
    this.totalProjectCount = totalProjectCount;
  }

  public StatisticMap totalRepoCount(Integer totalRepoCount) {
    this.totalRepoCount = totalRepoCount;
    return this;
  }

   /**
   * The count of the total repositories, only be seen when the user is admin.
   * @return totalRepoCount
  **/
  @ApiModelProperty(value = "The count of the total repositories, only be seen when the user is admin.")
  public Integer getTotalRepoCount() {
    return totalRepoCount;
  }

  public void setTotalRepoCount(Integer totalRepoCount) {
    this.totalRepoCount = totalRepoCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticMap statisticMap = (StatisticMap) o;
    return Objects.equals(this.privateProjectCount, statisticMap.privateProjectCount) &&
        Objects.equals(this.privateRepoCount, statisticMap.privateRepoCount) &&
        Objects.equals(this.publicProjectCount, statisticMap.publicProjectCount) &&
        Objects.equals(this.publicRepoCount, statisticMap.publicRepoCount) &&
        Objects.equals(this.totalProjectCount, statisticMap.totalProjectCount) &&
        Objects.equals(this.totalRepoCount, statisticMap.totalRepoCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateProjectCount, privateRepoCount, publicProjectCount, publicRepoCount, totalProjectCount, totalRepoCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticMap {\n");
    
    sb.append("    privateProjectCount: ").append(toIndentedString(privateProjectCount)).append("\n");
    sb.append("    privateRepoCount: ").append(toIndentedString(privateRepoCount)).append("\n");
    sb.append("    publicProjectCount: ").append(toIndentedString(publicProjectCount)).append("\n");
    sb.append("    publicRepoCount: ").append(toIndentedString(publicRepoCount)).append("\n");
    sb.append("    totalProjectCount: ").append(toIndentedString(totalProjectCount)).append("\n");
    sb.append("    totalRepoCount: ").append(toIndentedString(totalRepoCount)).append("\n");
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

