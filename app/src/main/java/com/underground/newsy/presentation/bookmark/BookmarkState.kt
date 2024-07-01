package com.underground.newsy.presentation.bookmark

import com.underground.newsy.domain.model.Article

data class BookmarkState(
    val articles: List<Article> = emptyList()
)