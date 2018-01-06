package com.codeshark.sms.domain;

import javax.persistence.*;

@Entity
@Table(name = "family_unit", schema = "sms", catalog = "")
public class FamilyUnitEntity {
    private int familyUnitId;
    private String familyNo;
    private String regDate;

    @Id
    @Column(name = "family_unit_id")
    public int getFamilyUnitId() {
        return familyUnitId;
    }

    public void setFamilyUnitId(int familyUnitId) {
        this.familyUnitId = familyUnitId;
    }

    @Basic
    @Column(name = "family_no")
    public String getFamilyNo() {
        return familyNo;
    }

    public void setFamilyNo(String familyNo) {
        this.familyNo = familyNo;
    }

    @Basic
    @Column(name = "reg_date")
    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FamilyUnitEntity that = (FamilyUnitEntity) o;

        if (familyUnitId != that.familyUnitId) return false;
        if (familyNo != null ? !familyNo.equals(that.familyNo) : that.familyNo != null) return false;
        return regDate != null ? regDate.equals(that.regDate) : that.regDate == null;
    }

    @Override
    public int hashCode() {
        int result = familyUnitId;
        result = 31 * result + (familyNo != null ? familyNo.hashCode() : 0);
        result = 31 * result + (regDate != null ? regDate.hashCode() : 0);
        return result;
    }
}
