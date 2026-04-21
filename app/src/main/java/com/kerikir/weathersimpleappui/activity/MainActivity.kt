package com.kerikir.weathersimpleappui.activity

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.kerikir.weathersimpleappui.R
import com.kerikir.weathersimpleappui.adapter.CityWeatherAdapter
import com.kerikir.weathersimpleappui.adapter.HourlyWeatherAdapter
import com.kerikir.weathersimpleappui.databinding.ActivityMainBinding
import com.kerikir.weathersimpleappui.model.CityWeatherModel
import com.kerikir.weathersimpleappui.model.HourlyWeatherModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(this.layoutInflater)
        setContentView(binding.root)

        binding.chipNavigator.setItemSelected(R.id.home, true)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        initRecyclerViewHourlyWeather()
        initRecyclerViewCitiesWeather()
    }


    private fun initRecyclerViewHourlyWeather() {

        val items: ArrayList<HourlyWeatherModel> = ArrayList()
        items.add(HourlyWeatherModel("Now", 21, "sunny"))
        items.add(HourlyWeatherModel("5 pm", 20, "cloudy"))
        items.add(HourlyWeatherModel("6 pm", 17, "windy"))
        items.add(HourlyWeatherModel("7 pm", 17, "cloudy_2"))
        items.add(HourlyWeatherModel("8 pm", 12, "snowy"))

        binding.recyclerHourlyWeather.layoutManager = LinearLayoutManager(
            this, LinearLayoutManager.HORIZONTAL, false
        )
        binding.recyclerHourlyWeather.adapter = HourlyWeatherAdapter(items)
    }


    private fun initRecyclerViewCitiesWeather() {

        ArrayList<CityWeatherModel>().apply {
            add(CityWeatherModel("Ivanovo", 22, "sunny", 16, 22, 10))
            add(CityWeatherModel("Moscow", 22, "cloudy", 16, 22, 10))
            add(CityWeatherModel("Belozersk", 22, "windy", 30, 15, 50))
            add(CityWeatherModel("Kazan", 25, "cloudy_2", 10, 20, 35))
            add(CityWeatherModel("Chelyabinsk", 8, "snowy", 8, 5, 7))

        }.also {
            binding.recyclerCitiesWeather.layoutManager = LinearLayoutManager(
                this, LinearLayoutManager.HORIZONTAL, false
            )
            binding.recyclerCitiesWeather.adapter = CityWeatherAdapter(it)
        }
    }
}