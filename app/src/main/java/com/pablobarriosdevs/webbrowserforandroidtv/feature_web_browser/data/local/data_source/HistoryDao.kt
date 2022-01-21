package com.pablobarriosdevs.webbrowserforandroidtv.feature_web_browser.data.local.data_source

import androidx.room.*
import com.pablobarriosdevs.webbrowserforandroidtv.feature_web_browser.domain.model.WebPage
import kotlinx.coroutines.flow.Flow

@Dao
interface HistoryDao {

    @Query("SELECT * FROM webpage")
    fun getAllWebPage(): Flow<List<WebPage>>

    @Query("SELECT * FROM webpage WHERE id = :id")
    suspend fun getWebPageById(id:Int): WebPage?

    @Insert
    suspend fun insertWebPage(webPage: WebPage)

    @Delete
    suspend fun deleteWebPage(webPage: WebPage)

    @Query("DELETE from webpage")
    suspend fun deleteAll()

    @Query("SELECT * FROM webpage WHERE url LIKE '%' || :query || '%'")
    fun searchWebPages(query: String): Flow<List<WebPage>>

}