package com.codeshark.sms.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "app_user_file", schema = "sms", catalog = "")
public class AppUserFileEntity {
    private int appUserFileId;
    private String path;
    private String isActive;
    private Date provideDate;
    private String endDate;

    @Id
    @Column(name = "app_user_file_id")
    public int getAppUserFileId() {
        return appUserFileId;
    }

    public void setAppUserFileId(int appUserFileId) {
        this.appUserFileId = appUserFileId;
    }

    @Basic
    @Column(name = "path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Basic
    @Column(name = "is_active")
    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    @Basic
    @Column(name = "provide_date")
    public Date getProvideDate() {
        return provideDate;
    }

    public void setProvideDate(Date provideDate) {
        this.provideDate = provideDate;
    }

    @Basic
    @Column(name = "end_date")
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppUserFileEntity that = (AppUserFileEntity) o;

        if (appUserFileId != that.appUserFileId) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;
        if (isActive != null ? !isActive.equals(that.isActive) : that.isActive != null) return false;
        if (provideDate != null ? !provideDate.equals(that.provideDate) : that.provideDate != null) return false;
        return endDate != null ? endDate.equals(that.endDate) : that.endDate == null;
    }

    @Override
    public int hashCode() {
        int result = appUserFileId;
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        result = 31 * result + (provideDate != null ? provideDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        return result;
    }
}
