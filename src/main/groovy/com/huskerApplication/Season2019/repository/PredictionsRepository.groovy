package com.huskerApplication.Season2019.repository

import com.huskerApplication.Season2019.entity.predictions
import org.springframework.data.repository.CrudRepository

interface PredictionsRepository extends CrudRepository<predictions, Integer>{

    List<predictions> findAll()

    List<predictions> findByPersonid(int id)
}