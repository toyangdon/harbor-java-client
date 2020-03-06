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
 * Role
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-06T02:07:22.019Z")
public class Role {
  @SerializedName("role_id")
  private Integer roleId = null;

  @SerializedName("role_code")
  private String roleCode = null;

  @SerializedName("role_name")
  private String roleName = null;

  @SerializedName("role_mask")
  private String roleMask = null;

  public Role roleId(Integer roleId) {
    this.roleId = roleId;
    return this;
  }

   /**
   * ID in table.
   * @return roleId
  **/
  @ApiModelProperty(value = "ID in table.")
  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  public Role roleCode(String roleCode) {
    this.roleCode = roleCode;
    return this;
  }

   /**
   * Description of permissions for the role.
   * @return roleCode
  **/
  @ApiModelProperty(value = "Description of permissions for the role.")
  public String getRoleCode() {
    return roleCode;
  }

  public void setRoleCode(String roleCode) {
    this.roleCode = roleCode;
  }

  public Role roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * Name the the role.
   * @return roleName
  **/
  @ApiModelProperty(value = "Name the the role.")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public Role roleMask(String roleMask) {
    this.roleMask = roleMask;
    return this;
  }

   /**
   * Get roleMask
   * @return roleMask
  **/
  @ApiModelProperty(value = "")
  public String getRoleMask() {
    return roleMask;
  }

  public void setRoleMask(String roleMask) {
    this.roleMask = roleMask;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.roleId, role.roleId) &&
        Objects.equals(this.roleCode, role.roleCode) &&
        Objects.equals(this.roleName, role.roleName) &&
        Objects.equals(this.roleMask, role.roleMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleId, roleCode, roleName, roleMask);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    roleCode: ").append(toIndentedString(roleCode)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    roleMask: ").append(toIndentedString(roleMask)).append("\n");
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

