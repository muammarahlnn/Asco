package com.muammarahlnn.asco.feature.adminclassmeeting.classdetails

import java.time.LocalTime

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ClassDetailsContract, 04/07/2024 00.38
 */
internal data class ClassDetailsState(
    val className: String = "Kelas A",
    val practicumName: String = "Pemrograman Mobile",
    val day: String = "Sabtu",
    val startTime: LocalTime = LocalTime.of(10, 0),
    val endTime: LocalTime = LocalTime.of(12, 30),
)