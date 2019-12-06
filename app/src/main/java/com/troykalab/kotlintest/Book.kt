package com.troykalab.kotlintest

open class Book(val title : String, val author: String, val year: Int) {
    private var currentPage : Int = 1

    fun bookInfo() : Pair<String, String> {
        return Pair(title, author)
    }
    open fun readPage() {
        currentPage++;
    }
}

class eBookBook(title : String,
                author: String,
                year : Int,
                format : String = "text") : Book(title, author, year) {

    private var wordCount : Int = 0;
    override fun readPage() {
        wordCount += 250;
    }
}