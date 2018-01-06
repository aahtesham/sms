package com.codeshark.sms.domain;

import javax.persistence.*;

@Entity
@Table(name = "person_detail", schema = "sms", catalog = "")
public class PersonDetailEntity {
    private int personDetailId;
    private String primaryEmail;
    private String secondaryEmail;
    private String primaryCell;
    private String secondaryCell;
    private String resPhone;

    @Id
    @Column(name = "person_detail_id")
    public int getPersonDetailId() {
        return personDetailId;
    }

    public void setPersonDetailId(int personDetailId) {
        this.personDetailId = personDetailId;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonDetailEntity that = (PersonDetailEntity) o;

        if (personDetailId != that.personDetailId) return false;
        if (primaryEmail != null ? !primaryEmail.equals(that.primaryEmail) : that.primaryEmail != null) return false;
        if (secondaryEmail != null ? !secondaryEmail.equals(that.secondaryEmail) : that.secondaryEmail != null)
            return false;
        if (primaryCell != null ? !primaryCell.equals(that.primaryCell) : that.primaryCell != null) return false;
        if (secondaryCell != null ? !secondaryCell.equals(that.secondaryCell) : that.secondaryCell != null)
            return false;
        return resPhone != null ? resPhone.equals(that.resPhone) : that.resPhone == null;
    }

    @Override
    public int hashCode() {
        int result = personDetailId;
        result = 31 * result + (primaryEmail != null ? primaryEmail.hashCode() : 0);
        result = 31 * result + (secondaryEmail != null ? secondaryEmail.hashCode() : 0);
        result = 31 * result + (primaryCell != null ? primaryCell.hashCode() : 0);
        result = 31 * result + (secondaryCell != null ? secondaryCell.hashCode() : 0);
        result = 31 * result + (resPhone != null ? resPhone.hashCode() : 0);
        return result;
    }
}
