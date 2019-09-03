package com.huskerApplication.Season2019.repository

import com.huskerApplication.Season2019.entity.schedule
import org.springframework.data.repository.CrudRepository



interface ScheduleRepository extends CrudRepository<schedule, Integer> {

    List<schedule> findAll()

    //List<schedule> findByCategory(String category)

}

