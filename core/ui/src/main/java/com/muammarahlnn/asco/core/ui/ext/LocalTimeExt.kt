package com.muammarahlnn.asco.core.ui.ext

import java.time.LocalTime

/**
 * @Author Muammar Ahlan Abimanyu
 * @File LocalTimeExt, 24/06/2024 02.30
 */
fun LocalTime.toFormattedTime() = String.format("%02d:%02d", hour, minute)