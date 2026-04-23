package com.kerikir.weathersimpleappui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kerikir.weathersimpleappui.R
import com.kerikir.weathersimpleappui.databinding.ViewholderCityWeatherBinding
import com.kerikir.weathersimpleappui.model.CityWeatherModel

class CityWeatherAdapter(
    private val items: ArrayList<CityWeatherModel>
) : RecyclerView.Adapter<CityWeatherAdapter.ViewHolder>() {

    private lateinit var context: Context

    class ViewHolder(
        val binding: ViewholderCityWeatherBinding
    ) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CityWeatherAdapter.ViewHolder {

        context = parent.context
        val binding = ViewholderCityWeatherBinding.inflate(
            LayoutInflater.from(context), parent, false
        )
        return ViewHolder(binding)
    }


    override fun onBindViewHolder(
        holder: CityWeatherAdapter.ViewHolder,
        position: Int
    ) {

        val item = items[position]
        holder.binding.apply {
            city.text = item.cityName
            wind.text = context.getString(R.string.value_speed, item.wind)
            humidity.text = context.getString(R.string.value_percent, item.humidity)
            rain.text = context.getString(R.string.value_percent, item.rain)
            temperatureCity.text = context.getString(R.string.value_temperature, item.temperature)

            val drawableResourceId = holder.itemView.resources.getIdentifier(
                item.picPath,
                "drawable",
                context.packageName
            )

            Glide.with(context)
                .load(drawableResourceId)
                .into(picture)
        }
    }

    override fun getItemCount(): Int = items.size
}