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
 * ImmutableTagRule
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-06T02:07:22.019Z")
public class ImmutableTagRule {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("project_id")
  private Long projectId = null;

  @SerializedName("tag_filter")
  private String tagFilter = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  public ImmutableTagRule id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ImmutableTagRule projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @ApiModelProperty(value = "")
  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public ImmutableTagRule tagFilter(String tagFilter) {
    this.tagFilter = tagFilter;
    return this;
  }

   /**
   * Get tagFilter
   * @return tagFilter
  **/
  @ApiModelProperty(value = "")
  public String getTagFilter() {
    return tagFilter;
  }

  public void setTagFilter(String tagFilter) {
    this.tagFilter = tagFilter;
  }

  public ImmutableTagRule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImmutableTagRule immutableTagRule = (ImmutableTagRule) o;
    return Objects.equals(this.id, immutableTagRule.id) &&
        Objects.equals(this.projectId, immutableTagRule.projectId) &&
        Objects.equals(this.tagFilter, immutableTagRule.tagFilter) &&
        Objects.equals(this.enabled, immutableTagRule.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, projectId, tagFilter, enabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImmutableTagRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    tagFilter: ").append(toIndentedString(tagFilter)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
