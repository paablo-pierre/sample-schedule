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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB03_ROOM")
public class Room implements Serializable {
    private static final long serialVersionUID = 7382449152224875941L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TB03_ROOM_ID")
    private Long id;

    @Column(name = "TB03_NAME")
    private String name;

    @Column(name = "TB03_DESCRIPTION")
    private String description;

    @OneToMany(mappedBy = "room")
    List<Schedule> schedules;
}
