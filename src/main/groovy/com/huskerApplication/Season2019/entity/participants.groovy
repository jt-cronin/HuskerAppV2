package com.huskerApplication.Season2019.entity

import groovy.transform.ToString

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import javax.persistence.Column
import javax.persistence.Temporal
import javax.persistence.TemporalType
import javax.persistence.Column

@Table(name = 'T_PARTICIPANT')
@Entity
@ToString
class participants {

    @Id
    @Column(nullable = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    int PERSONID
    String NAME
    String RECORD_PREDICTED
    float OFFENSE_PREDICTED
    @Column(nullable = true)
    Integer POINTS
}
