package com.wbg.springbootdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Role {
    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    @Id
    int id;
    String roleName;
    String note;

    public Role() {
    }

    public int getId() {
        return id;
    }

    public Role(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Role(int id, String roleName, String note) {
        this.id = id;
        this.roleName = roleName;
        this.note = note;
    }
}
