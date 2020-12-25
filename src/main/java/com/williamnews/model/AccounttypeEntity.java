package com.williamnews.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "accounttype", schema = "williamnews", catalog = "")
public class AccounttypeEntity {
    private int id;
    private String type;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccounttypeEntity that = (AccounttypeEntity) o;
        return id == that.id && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type);
    }
}
