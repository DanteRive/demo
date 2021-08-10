package com.example.demo.models;

import javax.persistence.*;
import java.util.Objects;

@MappedSuperclass
public abstract class AbstractEntity {

    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity abstractEntity = (AbstractEntity) o;
        return Objects.equals(id, abstractEntity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}