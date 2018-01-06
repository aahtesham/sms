package com.codeshark.sms.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "app_user_file_history", schema = "sms", catalog = "")
public class AppUserFileHistoryEntity {
    private String path;
    private Date changeDate;
    private String isActive;
    private int appUserFileHistory;

    @Basic
    @Column(name = "path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Basic
    @Column(name = "change_date")
    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    @Basic
    @Column(name = "is_active")
    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    @Id
    @Column(name = "app_user_file_history")
    public int getAppUserFileHistory() {
        return appUserFileHistory;
    }

    public void setAppUserFileHistory(int appUserFileHistory) {
        this.appUserFileHistory = appUserFileHistory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppUserFileHistoryEntity that = (AppUserFileHistoryEntity) o;

        if (appUserFileHistory != that.appUserFileHistory) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;
        if (changeDate != null ? !changeDate.equals(that.changeDate) : that.changeDate != null) return false;
        return isActive != null ? isActive.equals(that.isActive) : that.isActive == null;
    }

    @Override
    public int hashCode() {
        int result = path != null ? path.hashCode() : 0;
        result = 31 * result + (changeDate != null ? changeDate.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        result = 31 * result + appUserFileHistory;
        return result;
    }
}
