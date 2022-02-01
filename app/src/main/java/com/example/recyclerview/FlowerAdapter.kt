package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.FlowerItemBinding

class FlowerAdapter(private val flowerList: Array<String>) : RecyclerView.Adapter<FlowerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
        val itemBinding =
            FlowerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FlowerViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {
        val word = flowerList[position]
        holder.bind(word)
    }

    override fun getItemCount(): Int {
        return flowerList.size
    }
}

class FlowerViewHolder(private val itemBinding: FlowerItemBinding) :
    RecyclerView.ViewHolder(itemBinding.root) {
    fun bind(word: String) {
        itemBinding.flowerText.text = word
    }
}