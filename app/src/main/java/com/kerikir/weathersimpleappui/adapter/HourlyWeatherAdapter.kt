package com.kerikir.weathersimpleappui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kerikir.weathersimpleappui.databinding.ViewholderHourlyWeatherBinding
import com.kerikir.weathersimpleappui.model.HourlyWeatherModel

class HourlyWeatherAdapter(
    private val items: ArrayList<HourlyWeatherModel>
) : RecyclerView.Adapter<HourlyWeatherAdapter.ViewHolder>() {

    class ViewHolder(
        val binding: ViewholderHourlyWeatherBinding
    ) : RecyclerView.ViewHolder(binding.root)


    private lateinit var context: Context

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        context = parent.context
        val binding = ViewholderHourlyWeatherBinding
            .inflate(LayoutInflater.from(context), parent, false)
        return HourlyWeatherAdapter.ViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: HourlyWeatherAdapter.ViewHolder,
        position: Int
    ) {
        val item = items[position]
        holder.binding.apply {
            hourHourly.text = item.hour
            tempHourly.text = "${item.temperature}°"
            val drawableResourceId = holder.itemView.resources.getIdentifier(
                item.picPath,
                "drawable",
                context.packageName
            )

            Glide.with(context)
                .load(drawableResourceId)
                .into(picHourly)
        }
    }

    override fun getItemCount(): Int = items.size
}