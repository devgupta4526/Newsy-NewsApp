package com.underground.newsy.presentation.search

import androidx.paging.PagingData
import com.underground.newsy.domain.model.Article
import kotlinx.coroutines.flow.Flow

data class SearchState(
    val searchQuery: String = "",
    val articles: Flow<PagingData<Article>>? = null
)