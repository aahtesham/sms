package com.codeshark.sms.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "person_address", schema = "sms", catalog = "")
public class PersonAddressEntity {
    private int personAddressId;
    private String isActive;
    private Date fromDate;

    @Id
    @Column(name = "person_address_id")
    public int getPersonAddressId() {
        return personAddressId;
    }

    public void setPersonAddressId(int personAddressId) {
        this.personAddressId = personAddressId;
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
    @Column(name = "from_date")
    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonAddressEntity that = (PersonAddressEntity) o;

        if (personAddressId != that.personAddressId) return false;
        if (isActive != null ? !isActive.equals(that.isActive) : that.isActive != null) return false;
        return fromDate != null ? fromDate.equals(that.fromDate) : that.fromDate == null;
    }

    @Override
    public int hashCode() {
        int result = personAddressId;
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        result = 31 * result + (fromDate != null ? fromDate.hashCode() : 0);
        return result;
    }
}
