package com.pablobarriosdevs.webbrowserforandroidtv.feature_web_browser.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class WebPage(
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val url : String,
    val favicon : String,
    val timestamp: Long
)
