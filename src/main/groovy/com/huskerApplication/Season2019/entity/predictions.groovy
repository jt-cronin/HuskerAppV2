package com.huskerApplication.Season2019.entity

import groovy.transform.ToString

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import javax.persistence.Temporal
import javax.persistence.TemporalType
import javax.persistence.Column


@Table(name = 'T_PREDICTIONS')
@Entity
@ToString
class predictions {

    @Id
    @Column(nullable = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    int PREDICTION_ID
    int GAME_ID
    int personid
    String WINNER_PREDICTED
    String SPREAD_PREDICTED
    String ACTUAL_WINNER
    Integer ACTUAL_SPREAD
    Integer POINTS_WINNER
    Integer POINTS_SPREAD
}
