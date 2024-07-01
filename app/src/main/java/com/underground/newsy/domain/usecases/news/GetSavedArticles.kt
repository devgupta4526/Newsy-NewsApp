package com.underground.newsy.domain.usecases.news

import com.underground.newsy.data.local.NewsDao
import com.underground.newsy.domain.model.Article
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSavedArticles @Inject constructor(
    private val newsDao: NewsDao
) {

    operator fun invoke(): Flow<List<Article>>{
        return newsDao.getArticles()
    }

}