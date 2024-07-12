package com.karsoft.effectivemobile.domain.mapper.base

interface Mapper<E, D> {
    fun mapFromEntity(from: E): D

    fun mapToEntity(from: D): E {
        throw RuntimeException("for this mapper mapping do not necessarily")
    }
}