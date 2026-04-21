package com.kerikir.weathersimpleappui.model

data class CityWeatherModel(
    val cityName: String,
    val temperature: Int,
    val picPath: String,
    val wind: Int,
    val humidity: Int,
    val rain: Int
)
