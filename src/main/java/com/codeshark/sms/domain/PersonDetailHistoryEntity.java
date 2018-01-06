package com.codeshark.sms.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "person_detail_history", schema = "sms", catalog = "")
public class PersonDetailHistoryEntity {
    private String primaryEmail;
    private String secondaryEmail;
    private String primaryCell;
    private String secondaryCell;
    private String resPhone;
    private int personDetailHistory;
    private Integer personDetailId;
    private Date changeDate;

    @Basic
    @Column(name = "primary_email")
    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    @Basic
    @Column(name = "secondary_email")
    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }

    @Basic
    @Column(name = "primary_cell")
    public String getPrimaryCell() {
        return primaryCell;
    }

    public void setPrimaryCell(String primaryCell) {
        this.primaryCell = primaryCell;
    }

    @Basic
    @Column(name = "secondary_cell")
    public String getSecondaryCell() {
        return secondaryCell;
    }

    public void setSecondaryCell(String secondaryCell) {
        this.secondaryCell = secondaryCell;
    }

    @Basic
    @Column(name = "res_phone")
    public String getResPhone() {
        return resPhone;
    }

    public void setResPhone(String resPhone) {
        this.resPhone = resPhone;
    }

    @Id
    @Column(name = "person_detail_history")
    public int getPersonDetailHistory() {
        return personDetailHistory;
    }

    public void setPersonDetailHistory(int personDetailHistory) {
        this.personDetailHistory = personDetailHistory;
    }

    @Basic
    @Column(name = "person_detail_id")
    public Integer getPersonDetailId() {
        return personDetailId;
    }

    public void setPersonDetailId(Integer personDetailId) {
        this.personDetailId = personDetailId;
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

        PersonDetailHistoryEntity that = (PersonDetailHistoryEntity) o;

        if (personDetailHistory != that.personDetailHistory) return false;
        if (primaryEmail != null ? !primaryEmail.equals(that.primaryEmail) : that.primaryEmail != null) return false;
        if (secondaryEmail != null ? !secondaryEmail.equals(that.secondaryEmail) : that.secondaryEmail != null)
            return false;
        if (primaryCell != null ? !primaryCell.equals(that.primaryCell) : that.primaryCell != null) return false;
        if (secondaryCell != null ? !secondaryCell.equals(that.secondaryCell) : that.secondaryCell != null)
            return false;
        if (resPhone != null ? !resPhone.equals(that.resPhone) : that.resPhone != null) return false;
        if (personDetailId != null ? !personDetailId.equals(that.personDetailId) : that.personDetailId != null)
            return false;
        return changeDate != null ? changeDate.equals(that.changeDate) : that.changeDate == null;
    }

    @Override
    public int hashCode() {
        int result = primaryEmail != null ? primaryEmail.hashCode() : 0;
        result = 31 * result + (secondaryEmail != null ? secondaryEmail.hashCode() : 0);
        result = 31 * result + (primaryCell != null ? primaryCell.hashCode() : 0);
        result = 31 * result + (secondaryCell != null ? secondaryCell.hashCode() : 0);
        result = 31 * result + (resPhone != null ? resPhone.hashCode() : 0);
        result = 31 * result + personDetailHistory;
        result = 31 * result + (personDetailId != null ? personDetailId.hashCode() : 0);
        result = 31 * result + (changeDate != null ? changeDate.hashCode() : 0);
        return result;
    }
}
