package com.pablobarriosdevs.webbrowserforandroidtv.feature_web_browser.data.local.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.pablobarriosdevs.webbrowserforandroidtv.feature_web_browser.domain.model.WebPage


@Database(
    entities = [WebPage::class],
    version = 1,
)
abstract class HistoryDB : RoomDatabase() {

    abstract val historyDao : HistoryDao

    companion object{
        const val DATABASE_NAME = "history_db"
    }
}