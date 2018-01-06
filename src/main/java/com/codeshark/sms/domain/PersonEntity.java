package com.codeshark.sms.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "person", schema = "sms", catalog = "")
public class PersonEntity {
    private int personId;
    private String firstName;
    private String lastName;
    private Timestamp dob;
    private String sex;
    private String isBlocked;

    @Id
    @Column(name = "person_id")
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

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
    public Timestamp getDob() {
        return dob;
    }

    public void setDob(Timestamp dob) {
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

    @Basic
    @Column(name = "is_blocked")
    public String getIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(String isBlocked) {
        this.isBlocked = isBlocked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonEntity that = (PersonEntity) o;

        if (personId != that.personId) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (dob != null ? !dob.equals(that.dob) : that.dob != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        return isBlocked != null ? isBlocked.equals(that.isBlocked) : that.isBlocked == null;
    }

    @Override
    public int hashCode() {
        int result = personId;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (isBlocked != null ? isBlocked.hashCode() : 0);
        return result;
    }
}
