package com.unilabs.sampleschedule.model.entity;

import com.unilabs.sampleschedule.enums.DayOfWeekEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "TB06_DAY")
public class DayOfWeek implements Serializable {
    private static final long serialVersionUID = -6409618244969338748L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TB06_DAY_ID")
    private Long id;

    @Column(name = "TB06_NAME")
    @Enumerated(EnumType.STRING)
    private DayOfWeekEnum name;
}
