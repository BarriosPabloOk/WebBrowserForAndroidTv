package com.pablobarriosdevs.webbrowserforandroidtv.feature_web_browser.domain.use_cases

import com.pablobarriosdevs.webbrowserforandroidtv.feature_web_browser.domain.model.WebPage
import com.pablobarriosdevs.webbrowserforandroidtv.feature_web_browser.domain.repository.HistoryRepository
import javax.inject.Inject


class DeleteWebPageUseCase @Inject constructor(
    private val repository: HistoryRepository
) {

    suspend operator fun invoke(webPage: WebPage){
        repository.deleteWebPage(webPage)
    }
}