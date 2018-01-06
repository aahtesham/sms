package com.codeshark.sms.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "address", schema = "sms", catalog = "")
public class AddressEntity {
    private Date fromDate;
    private Date toDate;
    private Integer countryId;
    private int addressId;
    private Integer stateId;
    private Integer cityId;
    private Integer zipCodeId;
    private String addressLineOne;
    private String addressLineTwo;
    private String fullAddress;

    @Basic
    @Column(name = "from_date")
    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Basic
    @Column(name = "to_date")
    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    @Basic
    @Column(name = "country_id")
    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    @Id
    @Column(name = "address_id")
    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "state_id")
    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    @Basic
    @Column(name = "city_id")
    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Basic
    @Column(name = "zip_code_id")
    public Integer getZipCodeId() {
        return zipCodeId;
    }

    public void setZipCodeId(Integer zipCodeId) {
        this.zipCodeId = zipCodeId;
    }

    @Basic
    @Column(name = "address_line_one")
    public String getAddressLineOne() {
        return addressLineOne;
    }

    public void setAddressLineOne(String addressLineOne) {
        this.addressLineOne = addressLineOne;
    }

    @Basic
    @Column(name = "address_line_two")
    public String getAddressLineTwo() {
        return addressLineTwo;
    }

    public void setAddressLineTwo(String addressLineTwo) {
        this.addressLineTwo = addressLineTwo;
    }

    @Basic
    @Column(name = "full_address")
    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddressEntity that = (AddressEntity) o;

        if (addressId != that.addressId) return false;
        if (fromDate != null ? !fromDate.equals(that.fromDate) : that.fromDate != null) return false;
        if (toDate != null ? !toDate.equals(that.toDate) : that.toDate != null) return false;
        if (countryId != null ? !countryId.equals(that.countryId) : that.countryId != null) return false;
        if (stateId != null ? !stateId.equals(that.stateId) : that.stateId != null) return false;
        if (cityId != null ? !cityId.equals(that.cityId) : that.cityId != null) return false;
        if (zipCodeId != null ? !zipCodeId.equals(that.zipCodeId) : that.zipCodeId != null) return false;
        if (addressLineOne != null ? !addressLineOne.equals(that.addressLineOne) : that.addressLineOne != null)
            return false;
        if (addressLineTwo != null ? !addressLineTwo.equals(that.addressLineTwo) : that.addressLineTwo != null)
            return false;
        return fullAddress != null ? fullAddress.equals(that.fullAddress) : that.fullAddress == null;
    }

    @Override
    public int hashCode() {
        int result = fromDate != null ? fromDate.hashCode() : 0;
        result = 31 * result + (toDate != null ? toDate.hashCode() : 0);
        result = 31 * result + (countryId != null ? countryId.hashCode() : 0);
        result = 31 * result + addressId;
        result = 31 * result + (stateId != null ? stateId.hashCode() : 0);
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        result = 31 * result + (zipCodeId != null ? zipCodeId.hashCode() : 0);
        result = 31 * result + (addressLineOne != null ? addressLineOne.hashCode() : 0);
        result = 31 * result + (addressLineTwo != null ? addressLineTwo.hashCode() : 0);
        result = 31 * result + (fullAddress != null ? fullAddress.hashCode() : 0);
        return result;
    }
}
