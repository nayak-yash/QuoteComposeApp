package com.ash.quotescomposeapp.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.ash.quotescomposeapp.models.Quote

@Composable
fun QuoteList(data : Array<Quote>, onClick : (quote : Quote) -> Unit) {
    LazyColumn(content = {
        items(data) {
            QuoteListItem(quote = it, onClick)
        }
    })
}