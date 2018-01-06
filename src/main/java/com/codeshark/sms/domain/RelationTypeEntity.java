package com.codeshark.sms.domain;

import javax.persistence.*;

@Entity
@Table(name = "relation_type", schema = "sms", catalog = "")
public class RelationTypeEntity {
    private int relationTypeId;
    private String name;

    @Id
    @Column(name = "relation_type_id")
    public int getRelationTypeId() {
        return relationTypeId;
    }

    public void setRelationTypeId(int relationTypeId) {
        this.relationTypeId = relationTypeId;
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

        RelationTypeEntity that = (RelationTypeEntity) o;

        if (relationTypeId != that.relationTypeId) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = relationTypeId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
