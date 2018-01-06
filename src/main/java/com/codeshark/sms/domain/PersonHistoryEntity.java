package com.codeshark.sms.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "person_history", schema = "sms", catalog = "")
public class PersonHistoryEntity {
    private String firstName;
    private String lastName;
    private String dob;
    private String sex;
    private int personHistoryId;
    private Integer personId;
    private Date changeDate;

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "dob")
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Id
    @Column(name = "person_history_id")
    public int getPersonHistoryId() {
        return personHistoryId;
    }

    public void setPersonHistoryId(int personHistoryId) {
        this.personHistoryId = personHistoryId;
    }

    @Basic
    @Column(name = "person_id")
    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
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

        PersonHistoryEntity that = (PersonHistoryEntity) o;

        if (personHistoryId != that.personHistoryId) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (dob != null ? !dob.equals(that.dob) : that.dob != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (personId != null ? !personId.equals(that.personId) : that.personId != null) return false;
        return changeDate != null ? changeDate.equals(that.changeDate) : that.changeDate == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + personHistoryId;
        result = 31 * result + (personId != null ? personId.hashCode() : 0);
        result = 31 * result + (changeDate != null ? changeDate.hashCode() : 0);
        return result;
    }
}
