package com.underground.newsy.domain.usecases.news

import com.underground.newsy.data.local.NewsDao
import com.underground.newsy.domain.model.Article
import javax.inject.Inject

class GetSavedArticle @Inject constructor(
    private val newsDao: NewsDao
) {

    suspend operator fun invoke(url: String): Article?{
        return newsDao.getArticle(url = url)
    }

}