package com.codeshark.sms.domain;

import javax.persistence.*;

@Entity
@Table(name = "address_type", schema = "sms", catalog = "")
public class AddressTypeEntity {
    private int addressTypeId;
    private String name;

    @Id
    @Column(name = "address_type_id")
    public int getAddressTypeId() {
        return addressTypeId;
    }

    public void setAddressTypeId(int addressTypeId) {
        this.addressTypeId = addressTypeId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddressTypeEntity that = (AddressTypeEntity) o;

        if (addressTypeId != that.addressTypeId) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = addressTypeId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
