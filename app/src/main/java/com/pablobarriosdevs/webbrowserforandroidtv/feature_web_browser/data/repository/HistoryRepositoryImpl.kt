package com.pablobarriosdevs.webbrowserforandroidtv.feature_web_browser.data.repository

import com.pablobarriosdevs.webbrowserforandroidtv.feature_web_browser.data.local.data_source.HistoryDao
import com.pablobarriosdevs.webbrowserforandroidtv.feature_web_browser.domain.model.WebPage
import com.pablobarriosdevs.webbrowserforandroidtv.feature_web_browser.domain.repository.HistoryRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class HistoryRepositoryImpl@Inject constructor(
    private val dao: HistoryDao
) : HistoryRepository{

    override fun getAllWebPage(): Flow<List<WebPage>> {
        return dao.getAllWebPage()
    }

    override suspend fun getWebPageById(id: Int): WebPage? {
        return getWebPageById(id)
    }

    override suspend fun insertWebPage(webPage: WebPage) {
        dao.insertWebPage(webPage)
    }

    override suspend fun deleteWebPage(webPage: WebPage) {
        dao.deleteWebPage(webPage)
    }

    override suspend fun deleteAll() {
        dao.deleteAll()
    }

    override fun searchWebPages(query: String): Flow<List<WebPage>> {
        return dao.searchWebPages(query)
    }

}