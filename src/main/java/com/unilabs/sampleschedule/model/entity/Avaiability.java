package com.unilabs.sampleschedule.model.entity;

import com.unilabs.sampleschedule.model.entity.Exam;
import com.unilabs.sampleschedule.model.entity.Patient;
import com.unilabs.sampleschedule.model.entity.Schedule;
import lombok.AllArgsConstructor;
import lombok.Builder;
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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "TB04_AVAIABILITY")
public class Avaiability implements Serializable {
    private static final long serialVersionUID = 533410536210463067L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TB04_AVAIABILITY_ID")
    private Long id;

    @JoinColumn(name = "TB02_PATIENT_ID")
    @ManyToOne
    private Patient patient;

    @JoinColumn(name = "TB01_EXAM_ID")
    @ManyToOne
    private Exam exam;

    @JoinColumn(name = "TB05_SCHEDULE_ID")
    @ManyToOne
    private Schedule schedule;
}
