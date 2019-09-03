package com.huskerApplication.Season2019.repository


import com.huskerApplication.Season2019.entity.participants
import org.springframework.data.repository.CrudRepository

interface ParticipantsRepository extends CrudRepository<participants, Integer>{

    List<participants> findAll()
}