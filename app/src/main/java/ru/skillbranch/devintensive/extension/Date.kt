package ru.skillbranch.devintensive.extension

import java.text.SimpleDateFormat
import java.util.*
enum class TimeUnits {
    SECOND, MINUTE, HOUR, DAY
}
fun Date.format(pattern: String = "HH:mm:ss dd.MM.yy"): String {
    val dateFormat = SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format(this)
}

const val SECOND = 1000L
const val MINUTE = 60 * SECOND
const val HOUR = 60 * MINUTE
const val DAY = 24 * HOUR

fun Date.add(value: Int, tu: TimeUnits = TimeUnits.SECOND): Date {
    var time = this.time
    time += when (tu) {
        TimeUnits.SECOND -> value * SECOND
        TimeUnits.MINUTE -> value * MINUTE
        TimeUnits.HOUR -> value * HOUR
        TimeUnits.DAY -> value * DAY
    }
    this.time = time
    return this
}