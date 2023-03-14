package com.example.mck.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mck.model.QuoteModel
import com.example.mck.model.QuoteProvider

class QuoteVM:ViewModel() {
    val quotemodel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currenteQuote : QuoteModel = QuoteProvider.random()
        quotemodel.postValue(currenteQuote)
    }
}