package com.huskerApplication.Season2019.service

import com.huskerApplication.Season2019.repository.ScheduleRepository
import com.huskerApplication.Season2019.repository.ParticipantsRepository
import com.huskerApplication.Season2019.repository.PredictionsRepository
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Slf4j
@Service

class SpringbootService{

    @Autowired
    ScheduleRepository ScheduleRepository
    @Autowired
    ParticipantsRepository ParticipantsRepository
    @Autowired
    PredictionsRepository PredictionsRepository

    def getFullSchedule() {
        log.info('Retrieving all data from database for schedule')
        def result =  ScheduleRepository.findAll()
        log.debug('Successfully returned schedule data with size: ' + result.size())
        return result
    }

    def getAllParticipants() {
        log.info('Retrieving all data from database for participants')
        def result = ParticipantsRepository.findAll()
        log.debug('Successfully returned participant data with size: ' + result.size())
        return result
    }

    def getAllPredictions() {
        log.info('Retrieving all data from database for DC')
        def result = PredictionsRepository.findAll()
        log.debug('Successfully returned prediction data with size: ' + result.size())
        return result
    }

    def getAllPredictionsForParticipant(int id){
        log.info('Retrieving all data by Participant')
        def result = PredictionsRepository.findByPersonid(id)
        return result
    }


}