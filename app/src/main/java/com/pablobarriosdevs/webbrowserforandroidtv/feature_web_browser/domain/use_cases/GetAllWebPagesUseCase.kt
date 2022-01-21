package com.pablobarriosdevs.webbrowserforandroidtv.feature_web_browser.domain.use_cases

import com.pablobarriosdevs.webbrowserforandroidtv.feature_web_browser.domain.model.WebPage
import com.pablobarriosdevs.webbrowserforandroidtv.feature_web_browser.domain.repository.HistoryRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject


class GetAllWebPagesUseCase @Inject constructor(
    private val repository: HistoryRepository
) {

    suspend operator fun invoke() : Flow<List<WebPage>> {
        return repository.getAllWebPage().map {
            it.sortedByDescending { webPage -> webPage.timestamp }
        }
    }
}