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
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB01_EXAM")
public class Exam implements Serializable {
    private static final long serialVersionUID = 3722614024843376867L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TB01_EXAM_ID")
    private Long id;

    @Column(name = "TB01_NAME")
    private String name;

    @Column(name = "TB01_DESCRIPTION")
    private String description;

    @Column(name = "TB01_PRICE")
    private BigDecimal price;

}
