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
public class SyllabusUnitChapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sylUnitChapterId;
    private Long sylUnitId;
    private String name;
    private Long outputStandardId;
    private int duration;
    private int online; // status
    private Long deliveryTypeId;
    // private sort;
}
