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
public class DeliveryPrinciple {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deliveryPrincipleId;
    private String content;
    private Long sylId;

}
