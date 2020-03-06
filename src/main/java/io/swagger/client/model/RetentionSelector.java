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
 * RetentionSelector
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-06T02:07:22.019Z")
public class RetentionSelector {
  @SerializedName("kind")
  private String kind = null;

  @SerializedName("decoration")
  private String decoration = null;

  @SerializedName("pattern")
  private String pattern = null;

  public RetentionSelector kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @ApiModelProperty(value = "")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public RetentionSelector decoration(String decoration) {
    this.decoration = decoration;
    return this;
  }

   /**
   * Get decoration
   * @return decoration
  **/
  @ApiModelProperty(value = "")
  public String getDecoration() {
    return decoration;
  }

  public void setDecoration(String decoration) {
    this.decoration = decoration;
  }

  public RetentionSelector pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

   /**
   * Get pattern
   * @return pattern
  **/
  @ApiModelProperty(value = "")
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionSelector retentionSelector = (RetentionSelector) o;
    return Objects.equals(this.kind, retentionSelector.kind) &&
        Objects.equals(this.decoration, retentionSelector.decoration) &&
        Objects.equals(this.pattern, retentionSelector.pattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, decoration, pattern);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionSelector {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    decoration: ").append(toIndentedString(decoration)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
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

