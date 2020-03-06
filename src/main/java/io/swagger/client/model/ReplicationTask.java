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
 * The replication task
 */
@ApiModel(description = "The replication task")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-06T02:07:22.019Z")
public class ReplicationTask {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("execution_id")
  private Integer executionId = null;

  @SerializedName("resource_type")
  private String resourceType = null;

  @SerializedName("src_resource")
  private String srcResource = null;

  @SerializedName("dst_resource")
  private String dstResource = null;

  @SerializedName("job_id")
  private String jobId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("start_time")
  private String startTime = null;

  @SerializedName("end_time")
  private String endTime = null;

  public ReplicationTask id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The ID
   * @return id
  **/
  @ApiModelProperty(value = "The ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ReplicationTask executionId(Integer executionId) {
    this.executionId = executionId;
    return this;
  }

   /**
   * The execution ID
   * @return executionId
  **/
  @ApiModelProperty(value = "The execution ID")
  public Integer getExecutionId() {
    return executionId;
  }

  public void setExecutionId(Integer executionId) {
    this.executionId = executionId;
  }

  public ReplicationTask resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * The resource type
   * @return resourceType
  **/
  @ApiModelProperty(value = "The resource type")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public ReplicationTask srcResource(String srcResource) {
    this.srcResource = srcResource;
    return this;
  }

   /**
   * The source resource
   * @return srcResource
  **/
  @ApiModelProperty(value = "The source resource")
  public String getSrcResource() {
    return srcResource;
  }

  public void setSrcResource(String srcResource) {
    this.srcResource = srcResource;
  }

  public ReplicationTask dstResource(String dstResource) {
    this.dstResource = dstResource;
    return this;
  }

   /**
   * The destination resource
   * @return dstResource
  **/
  @ApiModelProperty(value = "The destination resource")
  public String getDstResource() {
    return dstResource;
  }

  public void setDstResource(String dstResource) {
    this.dstResource = dstResource;
  }

  public ReplicationTask jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * The job ID
   * @return jobId
  **/
  @ApiModelProperty(value = "The job ID")
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public ReplicationTask status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status
   * @return status
  **/
  @ApiModelProperty(value = "The status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ReplicationTask startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The start time
   * @return startTime
  **/
  @ApiModelProperty(value = "The start time")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public ReplicationTask endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * The end time
   * @return endTime
  **/
  @ApiModelProperty(value = "The end time")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplicationTask replicationTask = (ReplicationTask) o;
    return Objects.equals(this.id, replicationTask.id) &&
        Objects.equals(this.executionId, replicationTask.executionId) &&
        Objects.equals(this.resourceType, replicationTask.resourceType) &&
        Objects.equals(this.srcResource, replicationTask.srcResource) &&
        Objects.equals(this.dstResource, replicationTask.dstResource) &&
        Objects.equals(this.jobId, replicationTask.jobId) &&
        Objects.equals(this.status, replicationTask.status) &&
        Objects.equals(this.startTime, replicationTask.startTime) &&
        Objects.equals(this.endTime, replicationTask.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, executionId, resourceType, srcResource, dstResource, jobId, status, startTime, endTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplicationTask {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    srcResource: ").append(toIndentedString(srcResource)).append("\n");
    sb.append("    dstResource: ").append(toIndentedString(dstResource)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

