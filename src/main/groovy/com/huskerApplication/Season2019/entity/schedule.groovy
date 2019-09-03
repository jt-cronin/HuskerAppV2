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



@Table(name = 'T_SCHEDULE')

@Entity
@ToString
class schedule {

    @Id
    @Column(nullable = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    int GAME_ID
    String GAME_DATE
    String OPPONENT
    String LOCATION
    String GAME_TIME
    String WINNER
    Integer SPREAD
    Integer HUSKER_SCORE
    Integer OPPONENT_SCORE
    @Temporal(TemporalType.TIMESTAMP)
    Date rowCreateTsp
}
