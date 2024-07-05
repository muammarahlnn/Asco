package com.muammarahlnn.asco.core.ui.ext

import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.Locale

/**
 * @Author Muammar Ahlan Abimanyu
 * @File LocalTimeExt, 24/06/2024 02.30
 */
fun LocalTime.toFormattedTime(): String =
    String.format(Locale.getDefault(), "%02d:%02d", hour, minute)

fun LocalDate.toFormattedDate(): String {
    val indonesianLocale = Locale("id", "ID")
    val formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", indonesianLocale)
    return this.format(formatter)
}