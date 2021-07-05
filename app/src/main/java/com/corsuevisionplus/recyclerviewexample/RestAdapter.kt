package com.corsuevisionplus.recyclerviewexample

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.corsuevisionplus.recyclerviewexample.databinding.RvResturantCellBinding
import java.security.AccessControlContext

class RestAdapter(var context: Context,var restList:ArrayList<Resturant>): RecyclerView.Adapter<RestAdapter.RestViewHolder>() {
        inner class RestViewHolder(val binding: RvResturantCellBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestViewHolder {
        val v = RvResturantCellBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RestViewHolder(v)
    }

    override fun onBindViewHolder(holder: RestViewHolder, position: Int) {
        holder.binding.restName.text = restList[position].name
        holder.binding.restAddress.text = restList[position].address
        holder.binding.ratingRest.text = restList[position].rating.toString()
        holder.binding.restImage.setImageResource(restList[position].image)
        holder.binding.constraintBk.setBackgroundColor(Color.parseColor(restList[position].color))
        holder.binding.restImage.setOnClickListener {
            Toast.makeText(context,"$position",Toast.LENGTH_LONG).show()
        }
        holder.binding.constraintBk.setOnClickListener {
            Toast.makeText(context,"$position",Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
            return restList.size
    }
}