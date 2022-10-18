package com.group.syllabus.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SyllabusUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sylUnitId;
    private int unitNo;
    private String name;
    private int duration;
    private Long sylId;
    private Long sylSessionId;
    // private trainerId;
}
