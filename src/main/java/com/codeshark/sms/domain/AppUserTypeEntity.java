package com.codeshark.sms.domain;

import javax.persistence.*;

@Entity
@Table(name = "app_user_type", schema = "sms", catalog = "")
public class AppUserTypeEntity {
    private int appUserTypeId;
    private String name;

    @Id
    @Column(name = "app_user_type_id")
    public int getAppUserTypeId() {
        return appUserTypeId;
    }

    public void setAppUserTypeId(int appUserTypeId) {
        this.appUserTypeId = appUserTypeId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppUserTypeEntity that = (AppUserTypeEntity) o;

        if (appUserTypeId != that.appUserTypeId) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = appUserTypeId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
