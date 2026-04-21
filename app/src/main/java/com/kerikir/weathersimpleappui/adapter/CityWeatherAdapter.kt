package com.kerikir.weathersimpleappui.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kerikir.weathersimpleappui.databinding.ViewholderCityWeatherBinding
import com.kerikir.weathersimpleappui.model.CityWeatherModel

class CityWeatherAdapter(
    private val items: ArrayList<CityWeatherModel>
) : RecyclerView.Adapter<CityWeatherAdapter.ViewHolder> {

    class ViewHolder(
        val binding: ViewholderCityWeatherBinding
    ) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CityWeatherAdapter.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CityWeatherAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}