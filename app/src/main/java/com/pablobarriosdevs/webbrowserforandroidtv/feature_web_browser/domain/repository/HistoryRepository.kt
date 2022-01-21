package com.pablobarriosdevs.webbrowserforandroidtv.feature_web_browser.domain.repository

import com.pablobarriosdevs.webbrowserforandroidtv.feature_web_browser.domain.model.WebPage
import kotlinx.coroutines.flow.Flow

interface HistoryRepository {

    fun getAllWebPage(): Flow<List<WebPage>>
    suspend fun getWebPageById(id:Int): WebPage?
    suspend fun insertWebPage(webPage: WebPage)
    suspend fun deleteWebPage(webPage: WebPage)
    suspend fun deleteAll()
    fun searchWebPages(query: String): Flow<List<WebPage>>

}