package com.codeshark.sms.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "app_user_biometric_history", schema = "sms", catalog = "")
public class AppUserBiometricHistoryEntity {
    private int appUserBiometricHistoryId;
    private String path;
    private Date changeDate;

    @Id
    @Column(name = "app_user_biometric_history_id")
    public int getAppUserBiometricHistoryId() {
        return appUserBiometricHistoryId;
    }

    public void setAppUserBiometricHistoryId(int appUserBiometricHistoryId) {
        this.appUserBiometricHistoryId = appUserBiometricHistoryId;
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
    @Column(name = "change_date")
    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppUserBiometricHistoryEntity that = (AppUserBiometricHistoryEntity) o;

        if (appUserBiometricHistoryId != that.appUserBiometricHistoryId) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;
        return changeDate != null ? changeDate.equals(that.changeDate) : that.changeDate == null;
    }

    @Override
    public int hashCode() {
        int result = appUserBiometricHistoryId;
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (changeDate != null ? changeDate.hashCode() : 0);
        return result;
    }
}
