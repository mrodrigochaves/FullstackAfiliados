package com.mrodrigochaves.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TransactionType {

    public TransactionType() {
    }

    public TransactionType(Long typeId, String description, String nature, String sinal) {
        this.typeId = typeId;
        this.description = description;
        this.nature = nature;
        this.sinal = sinal;
    }

    @Id
    @Column(name = "type_id")
    private Long typeId;

    @Column(name = "description")
    private String description;

    @Column(name = "nature")
    private String nature;

    @Column(name = "sinal")
    private String sinal;

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getSinal() {
        return sinal;
    }

    public void setSinal(String sinal) {
        this.sinal = sinal;
    }
}
