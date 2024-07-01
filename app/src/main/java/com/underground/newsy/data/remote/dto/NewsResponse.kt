package com.underground.newsy.data.remote.dto

import com.underground.newsy.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)