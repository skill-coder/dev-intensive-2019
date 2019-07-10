package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName:String?):Pair<String?,String?>{
        var fullName  = fullName?.replace(" +".toRegex()," ")?.trim()
        if (fullName.isNullOrEmpty()){
            fullName = null
        }
        val parts: List<String>? = fullName?.split(" ")
        var firstName = parts?.getOrNull(0)
        var lastName = parts?.getOrNull(1)
        return Pair(firstName, lastName)
    }
}