package com.kerikir.weathersimpleappui.model

data class HourlyWeatherModel(
    val hour: String,
    val temperature: Int,
    val picPath: String
)