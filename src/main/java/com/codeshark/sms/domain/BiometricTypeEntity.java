package com.codeshark.sms.domain;

import javax.persistence.*;

@Entity
@Table(name = "biometric_type", schema = "sms", catalog = "")
public class BiometricTypeEntity {
    private int biometricTypeId;
    private String name;

    @Id
    @Column(name = "biometric_type_id")
    public int getBiometricTypeId() {
        return biometricTypeId;
    }

    public void setBiometricTypeId(int biometricTypeId) {
        this.biometricTypeId = biometricTypeId;
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

        BiometricTypeEntity that = (BiometricTypeEntity) o;

        if (biometricTypeId != that.biometricTypeId) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = biometricTypeId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
