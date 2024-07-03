package com.underground.newsy.presentation.onboarding

import androidx.annotation.DrawableRes
import com.underground.newsy.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "Stay Updated",
        description = "Get the latest news from around the world delivered right to your device.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Customize Your Feed",
        description = "Personalize your news feed based on your interests and preferences.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Save and Share",
        description = "Save articles to read later and share them with friends easily.",
        image = R.drawable.onboarding3
    )
)