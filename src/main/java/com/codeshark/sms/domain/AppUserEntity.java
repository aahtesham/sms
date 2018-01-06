package com.codeshark.sms.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "app_user", schema = "sms", catalog = "")
public class AppUserEntity {
    private int appUserId;
    private Date userDate;
    private String appUserNo;
    private String registrationDate;
    private String userNo;
    private String familyNo;
    private Integer userStatus;
    private String isActivated;

    @Id
    @Column(name = "app_user_id")
    public int getAppUserId() {
        return appUserId;
    }

    public void setAppUserId(int appUserId) {
        this.appUserId = appUserId;
    }

    @Basic
    @Column(name = "user_date")
    public Date getUserDate() {
        return userDate;
    }

    public void setUserDate(Date userDate) {
        this.userDate = userDate;
    }

    @Basic
    @Column(name = "app_user_no")
    public String getAppUserNo() {
        return appUserNo;
    }

    public void setAppUserNo(String appUserNo) {
        this.appUserNo = appUserNo;
    }

    @Basic
    @Column(name = "registration_date")
    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Basic
    @Column(name = "user_no")
    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    @Basic
    @Column(name = "family_no")
    public String getFamilyNo() {
        return familyNo;
    }

    public void setFamilyNo(String familyNo) {
        this.familyNo = familyNo;
    }

    @Basic
    @Column(name = "user_status")
    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    @Basic
    @Column(name = "is_activated")
    public String getIsActivated() {
        return isActivated;
    }

    public void setIsActivated(String isActivated) {
        this.isActivated = isActivated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppUserEntity that = (AppUserEntity) o;

        if (appUserId != that.appUserId) return false;
        if (userDate != null ? !userDate.equals(that.userDate) : that.userDate != null) return false;
        if (appUserNo != null ? !appUserNo.equals(that.appUserNo) : that.appUserNo != null) return false;
        if (registrationDate != null ? !registrationDate.equals(that.registrationDate) : that.registrationDate != null)
            return false;
        if (userNo != null ? !userNo.equals(that.userNo) : that.userNo != null) return false;
        if (familyNo != null ? !familyNo.equals(that.familyNo) : that.familyNo != null) return false;
        if (userStatus != null ? !userStatus.equals(that.userStatus) : that.userStatus != null) return false;
        return isActivated != null ? isActivated.equals(that.isActivated) : that.isActivated == null;
    }

    @Override
    public int hashCode() {
        int result = appUserId;
        result = 31 * result + (userDate != null ? userDate.hashCode() : 0);
        result = 31 * result + (appUserNo != null ? appUserNo.hashCode() : 0);
        result = 31 * result + (registrationDate != null ? registrationDate.hashCode() : 0);
        result = 31 * result + (userNo != null ? userNo.hashCode() : 0);
        result = 31 * result + (familyNo != null ? familyNo.hashCode() : 0);
        result = 31 * result + (userStatus != null ? userStatus.hashCode() : 0);
        result = 31 * result + (isActivated != null ? isActivated.hashCode() : 0);
        return result;
    }
}
