package com.huskerApplication.Season2019.controller

import com.huskerApplication.Season2019.service.SpringbootService
import groovy.util.logging.Slf4j
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.ui.Model;



@RequestMapping('/api')
@RestController
@Api(description = 'Restful micro service for springboot Husker application data requests')
class SpringbootController {

    @Autowired
    SpringbootService SpringbootService

    @GetMapping(path = '/schedule', produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation('Endpoint to retrieve the schedule')
    def getSchedule() {
//        log.info('Getting schedule data')
        return SpringbootService.getFullSchedule()
    }

    @GetMapping(path = '/participants', produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation('Endpoint to retrieve the participants')
    def getParticipants() {
//        log.info('Getting participants data')
        return SpringbootService.getAllParticipants()
    }

    @GetMapping(path = '/predictions', produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation('Endpoint to retrieve the predictions')
    def getPredictions() {
//        log.info('Getting prediction data')
        return SpringbootService.getAllPredictions()
    }

    @GetMapping(path = '/predictions/{id}', produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation('Endpoint to retrieve the predictions for each person')
    def getPredictionsByPerson(@RequestParam int id) {
//        log.info('Getting prediction data')
        return SpringbootService.getAllPredictionsForParticipant(id)
    }
}