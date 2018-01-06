package com.codeshark.sms.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "app_user_history", schema = "sms", catalog = "")
public class AppUserHistoryEntity {
    private int appUserHistoryId;
    private Date changeDate;

    @Id
    @Column(name = "app_user_history_id")
    public int getAppUserHistoryId() {
        return appUserHistoryId;
    }

    public void setAppUserHistoryId(int appUserHistoryId) {
        this.appUserHistoryId = appUserHistoryId;
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

        AppUserHistoryEntity that = (AppUserHistoryEntity) o;

        if (appUserHistoryId != that.appUserHistoryId) return false;
        return changeDate != null ? changeDate.equals(that.changeDate) : that.changeDate == null;
    }

    @Override
    public int hashCode() {
        int result = appUserHistoryId;
        result = 31 * result + (changeDate != null ? changeDate.hashCode() : 0);
        return result;
    }
}
