package com.codeshark.sms.domain;

import javax.persistence.*;

@Entity
@Table(name = "biometric_category", schema = "sms", catalog = "")
public class BiometricCategoryEntity {
    private int biometricCategoryId;
    private String name;

    @Id
    @Column(name = "biometric_category_id")
    public int getBiometricCategoryId() {
        return biometricCategoryId;
    }

    public void setBiometricCategoryId(int biometricCategoryId) {
        this.biometricCategoryId = biometricCategoryId;
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

        BiometricCategoryEntity that = (BiometricCategoryEntity) o;

        if (biometricCategoryId != that.biometricCategoryId) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = biometricCategoryId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
