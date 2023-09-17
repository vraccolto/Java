package org.example.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class EntityId {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
