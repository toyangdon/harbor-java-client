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
import io.swagger.client.model.QuotaRefObject;
import io.swagger.client.model.ResourceList;
import java.io.IOException;

/**
 * The quota object
 */
@ApiModel(description = "The quota object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-06T02:07:22.019Z")
public class Quota {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("ref")
  private QuotaRefObject ref = null;

  @SerializedName("hard")
  private ResourceList hard = null;

  @SerializedName("used")
  private ResourceList used = null;

  @SerializedName("creation_time")
  private String creationTime = null;

  @SerializedName("update_time")
  private String updateTime = null;

  public Quota id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the quota
   * @return id
  **/
  @ApiModelProperty(value = "ID of the quota")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Quota ref(QuotaRefObject ref) {
    this.ref = ref;
    return this;
  }

   /**
   * The reference object of the quota
   * @return ref
  **/
  @ApiModelProperty(value = "The reference object of the quota")
  public QuotaRefObject getRef() {
    return ref;
  }

  public void setRef(QuotaRefObject ref) {
    this.ref = ref;
  }

  public Quota hard(ResourceList hard) {
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

  public Quota used(ResourceList used) {
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

  public Quota creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * the creation time of the quota
   * @return creationTime
  **/
  @ApiModelProperty(value = "the creation time of the quota")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public Quota updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * the update time of the quota
   * @return updateTime
  **/
  @ApiModelProperty(value = "the update time of the quota")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Quota quota = (Quota) o;
    return Objects.equals(this.id, quota.id) &&
        Objects.equals(this.ref, quota.ref) &&
        Objects.equals(this.hard, quota.hard) &&
        Objects.equals(this.used, quota.used) &&
        Objects.equals(this.creationTime, quota.creationTime) &&
        Objects.equals(this.updateTime, quota.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ref, hard, used, creationTime, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Quota {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    hard: ").append(toIndentedString(hard)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

