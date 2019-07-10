package ru.skillbranch.devintensive.extension

import ru.skillbranch.devintensive.models.User
import ru.skillbranch.devintensive.models.UserView

fun User.toUserView(): UserView {
    var status = if (lastVisit == null) "ни разу не был" else if (isOnline) "online" else "Послежний раз был двано"
    return UserView(
        id,
        fullName = "$firstName $lastName",
        lastName = lastName,
        nickName = "nope",
        avatar = "ava",
        status = status

    )
}