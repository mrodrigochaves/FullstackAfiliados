package com.mrodrigochaves.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TransactionType {

    public TransactionType(String string, String string2, String string3, String string4) {
    }

    @Id
    @Column(name = "type_id")
    private String typeId;

    @Column(name = "description")
    private String description;

    @Column(name = "nature")
    private String nature;

    @Column(name = "sinal")
    private String sinal;

}
