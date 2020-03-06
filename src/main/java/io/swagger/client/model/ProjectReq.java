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
import io.swagger.client.model.CVEWhitelist;
import io.swagger.client.model.ProjectMetadata;
import java.io.IOException;

/**
 * ProjectReq
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-06T02:07:22.019Z")
public class ProjectReq {
  @SerializedName("project_name")
  private String projectName = null;

  @SerializedName("metadata")
  private ProjectMetadata metadata = null;

  @SerializedName("cve_whitelist")
  private CVEWhitelist cveWhitelist = null;

  @SerializedName("count_limit")
  private Long countLimit = null;

  @SerializedName("storage_limit")
  private Long storageLimit = null;

  public ProjectReq projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * The name of the project.
   * @return projectName
  **/
  @ApiModelProperty(value = "The name of the project.")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public ProjectReq metadata(ProjectMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata of the project.
   * @return metadata
  **/
  @ApiModelProperty(value = "The metadata of the project.")
  public ProjectMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(ProjectMetadata metadata) {
    this.metadata = metadata;
  }

  public ProjectReq cveWhitelist(CVEWhitelist cveWhitelist) {
    this.cveWhitelist = cveWhitelist;
    return this;
  }

   /**
   * The CVE whitelist of the project.
   * @return cveWhitelist
  **/
  @ApiModelProperty(value = "The CVE whitelist of the project.")
  public CVEWhitelist getCveWhitelist() {
    return cveWhitelist;
  }

  public void setCveWhitelist(CVEWhitelist cveWhitelist) {
    this.cveWhitelist = cveWhitelist;
  }

  public ProjectReq countLimit(Long countLimit) {
    this.countLimit = countLimit;
    return this;
  }

   /**
   * The count quota of the project.
   * @return countLimit
  **/
  @ApiModelProperty(value = "The count quota of the project.")
  public Long getCountLimit() {
    return countLimit;
  }

  public void setCountLimit(Long countLimit) {
    this.countLimit = countLimit;
  }

  public ProjectReq storageLimit(Long storageLimit) {
    this.storageLimit = storageLimit;
    return this;
  }

   /**
   * The storage quota of the project.
   * @return storageLimit
  **/
  @ApiModelProperty(value = "The storage quota of the project.")
  public Long getStorageLimit() {
    return storageLimit;
  }

  public void setStorageLimit(Long storageLimit) {
    this.storageLimit = storageLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectReq projectReq = (ProjectReq) o;
    return Objects.equals(this.projectName, projectReq.projectName) &&
        Objects.equals(this.metadata, projectReq.metadata) &&
        Objects.equals(this.cveWhitelist, projectReq.cveWhitelist) &&
        Objects.equals(this.countLimit, projectReq.countLimit) &&
        Objects.equals(this.storageLimit, projectReq.storageLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectName, metadata, cveWhitelist, countLimit, storageLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectReq {\n");
    
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    cveWhitelist: ").append(toIndentedString(cveWhitelist)).append("\n");
    sb.append("    countLimit: ").append(toIndentedString(countLimit)).append("\n");
    sb.append("    storageLimit: ").append(toIndentedString(storageLimit)).append("\n");
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

