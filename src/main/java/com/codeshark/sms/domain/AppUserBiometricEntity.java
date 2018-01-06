package com.codeshark.sms.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "app_user_biometric", schema = "sms", catalog = "")
public class AppUserBiometricEntity {
    private int appUserBiometricId;
    private String path;
    private String isActive;
    private Date providedDate;
    private Date endDate;

    @Id
    @Column(name = "app_user_biometric_id")
    public int getAppUserBiometricId() {
        return appUserBiometricId;
    }

    public void setAppUserBiometricId(int appUserBiometricId) {
        this.appUserBiometricId = appUserBiometricId;
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
    @Column(name = "provided_date")
    public Date getProvidedDate() {
        return providedDate;
    }

    public void setProvidedDate(Date providedDate) {
        this.providedDate = providedDate;
    }

    @Basic
    @Column(name = "end_date")
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppUserBiometricEntity that = (AppUserBiometricEntity) o;

        if (appUserBiometricId != that.appUserBiometricId) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;
        if (isActive != null ? !isActive.equals(that.isActive) : that.isActive != null) return false;
        if (providedDate != null ? !providedDate.equals(that.providedDate) : that.providedDate != null) return false;
        return endDate != null ? endDate.equals(that.endDate) : that.endDate == null;
    }

    @Override
    public int hashCode() {
        int result = appUserBiometricId;
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        result = 31 * result + (providedDate != null ? providedDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        return result;
    }
}
