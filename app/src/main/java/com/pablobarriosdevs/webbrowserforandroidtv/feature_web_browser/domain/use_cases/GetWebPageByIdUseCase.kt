package com.pablobarriosdevs.webbrowserforandroidtv.feature_web_browser.domain.use_cases

import com.pablobarriosdevs.webbrowserforandroidtv.feature_web_browser.domain.model.WebPage
import com.pablobarriosdevs.webbrowserforandroidtv.feature_web_browser.domain.repository.HistoryRepository
import javax.inject.Inject


class GetWebPageByIdUseCase @Inject constructor(
    private val repository: HistoryRepository
) {

    suspend operator fun invoke(id: Int) : WebPage ? = repository.getWebPageById(id)
}