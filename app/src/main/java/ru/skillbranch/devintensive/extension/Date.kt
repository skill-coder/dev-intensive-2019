package ru.skillbranch.devintensive.extension

import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

fun Date.format(pattern: String="HH:mm:ss dd.MM.yy"):String{
    val dateFormat = SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format(this)
}
/*
fun Date.add(value:Int,tu: TimeUnit):Date{
    val cal = Calendar.getInstance()
    cal.time = this
    return cal.a
}*/