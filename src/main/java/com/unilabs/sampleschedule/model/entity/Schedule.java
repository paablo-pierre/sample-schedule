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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB05_SCHEDULE")
public class Schedule implements Serializable {
    private static final long serialVersionUID = 1236145783848809874L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TB05_SCHEDULE_ID")
    private Long id;

    @Column(name = "TB05_FROM_HOUR")
    private Time fromHour;

    @Column(name = "TB05_TO_HOUR")
    private Time toHour;

    @Column(name = "TB05_ACTIVE")
    private boolean isActive;

    @ManyToOne
    @JoinColumn(name = "TB06_DAY_ID")
    private DayOfWeek day;

    @ManyToOne
    @JoinColumn(name = "TB03_ROOM_ID")
    private Room room;
}
