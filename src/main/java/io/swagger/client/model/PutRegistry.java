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
 * PutRegistry
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-06T02:07:22.019Z")
public class PutRegistry {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("credential_type")
  private String credentialType = null;

  @SerializedName("access_key")
  private String accessKey = null;

  @SerializedName("access_secret")
  private String accessSecret = null;

  @SerializedName("insecure")
  private Boolean insecure = null;

  public PutRegistry name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The registry name.
   * @return name
  **/
  @ApiModelProperty(value = "The registry name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PutRegistry description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the registry.
   * @return description
  **/
  @ApiModelProperty(value = "Description of the registry.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PutRegistry url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The registry address URL string.
   * @return url
  **/
  @ApiModelProperty(value = "The registry address URL string.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PutRegistry credentialType(String credentialType) {
    this.credentialType = credentialType;
    return this;
  }

   /**
   * Credential type of the registry, e.g. &#39;basic&#39;.
   * @return credentialType
  **/
  @ApiModelProperty(value = "Credential type of the registry, e.g. 'basic'.")
  public String getCredentialType() {
    return credentialType;
  }

  public void setCredentialType(String credentialType) {
    this.credentialType = credentialType;
  }

  public PutRegistry accessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

   /**
   * The registry access key.
   * @return accessKey
  **/
  @ApiModelProperty(value = "The registry access key.")
  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  public PutRegistry accessSecret(String accessSecret) {
    this.accessSecret = accessSecret;
    return this;
  }

   /**
   * The registry access secret.
   * @return accessSecret
  **/
  @ApiModelProperty(value = "The registry access secret.")
  public String getAccessSecret() {
    return accessSecret;
  }

  public void setAccessSecret(String accessSecret) {
    this.accessSecret = accessSecret;
  }

  public PutRegistry insecure(Boolean insecure) {
    this.insecure = insecure;
    return this;
  }

   /**
   * Whether or not the certificate will be verified when Harbor tries to access the server.
   * @return insecure
  **/
  @ApiModelProperty(value = "Whether or not the certificate will be verified when Harbor tries to access the server.")
  public Boolean isInsecure() {
    return insecure;
  }

  public void setInsecure(Boolean insecure) {
    this.insecure = insecure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutRegistry putRegistry = (PutRegistry) o;
    return Objects.equals(this.name, putRegistry.name) &&
        Objects.equals(this.description, putRegistry.description) &&
        Objects.equals(this.url, putRegistry.url) &&
        Objects.equals(this.credentialType, putRegistry.credentialType) &&
        Objects.equals(this.accessKey, putRegistry.accessKey) &&
        Objects.equals(this.accessSecret, putRegistry.accessSecret) &&
        Objects.equals(this.insecure, putRegistry.insecure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, url, credentialType, accessKey, accessSecret, insecure);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutRegistry {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    credentialType: ").append(toIndentedString(credentialType)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    accessSecret: ").append(toIndentedString(accessSecret)).append("\n");
    sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
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

