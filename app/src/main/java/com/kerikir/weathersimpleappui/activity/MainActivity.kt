package com.kerikir.weathersimpleappui.activity

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.kerikir.weathersimpleappui.R
import com.kerikir.weathersimpleappui.adapter.HourlyWeatherAdapter
import com.kerikir.weathersimpleappui.databinding.ActivityMainBinding
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
    }

    private fun initRecyclerViewHourlyWeather() {

        val items: ArrayList<HourlyWeatherModel> = ArrayList()
        items.add(HourlyWeatherModel("4 pm", 21, "sunny"))
        items.add(HourlyWeatherModel("5 pm", 20, "cloudy"))
        items.add(HourlyWeatherModel("6 pm", 17, "windy"))
        items.add(HourlyWeatherModel("7 pm", 17, "cloudy_2"))
        items.add(HourlyWeatherModel("8 pm", 12, "snowy"))

        binding.recyclerHourlyWeather.layoutManager = LinearLayoutManager(
            this, LinearLayoutManager.HORIZONTAL, false
        )
        binding.recyclerHourlyWeather.adapter = HourlyWeatherAdapter(items)
    }
}