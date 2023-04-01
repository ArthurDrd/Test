package com.example.filmstacks.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MovieEntity(
    @PrimaryKey val id: Int,
    val title: String,
    val overview: String,
    val adult: Boolean?,
    val backdrop_path: String?,
    val poster_path: String?,
    val release_date: String?,
    val vote_average: Double?,
    val genre_ids: List<Int>?
)
