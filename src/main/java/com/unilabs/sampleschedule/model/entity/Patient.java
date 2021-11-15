package com.unilabs.sampleschedule.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB02_PATIENT")
public class Patient implements Serializable {
    private static final long serialVersionUID = 3630055162780791262L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TB02_PATIENT_ID")
    private Long id;

    @Column(name = "TB02_NAME")
    private String name;

    @Column(name = "TB02_DOCUMENT_IDENTIFICATION")
    private String document;

}
