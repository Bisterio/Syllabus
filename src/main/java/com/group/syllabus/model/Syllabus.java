package com.group.syllabus.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Syllabus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    private double version;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SyllabusLevel_id")
    private SyllabusLevel syllabuslevel;

    private Long ids;
    // private attendeeNo;
    private String techReq;
    private String courseObj;
    private Long deliveryPrincipleId;
    private int days;
    private int hours;
    private int status;
    // private isTemplate;
    // private createdBy;
    private Timestamp createdDate;
    // private updatedBy;
    private Timestamp updatedDate;
}
