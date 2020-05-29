package com.panlei.x.framework.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "user_role", schema = "x_framework")
public class UserRole {
    private int id;
    private String username;
    private String roleCode;
    private String createUser;
    private Date createDate;
    private String updateUser;
    private Date updateDate;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "role_code")
    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    @Basic
    @Column(name = "create_user")
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "create_date")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "update_user")
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Basic
    @Column(name = "update_date")
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRole userRole = (UserRole) o;
        return id == userRole.id &&
                Objects.equals(username, userRole.username) &&
                Objects.equals(roleCode, userRole.roleCode) &&
                Objects.equals(createUser, userRole.createUser) &&
                Objects.equals(createDate, userRole.createDate) &&
                Objects.equals(updateUser, userRole.updateUser) &&
                Objects.equals(updateDate, userRole.updateDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, roleCode, createUser, createDate, updateUser, updateDate);
    }
}
