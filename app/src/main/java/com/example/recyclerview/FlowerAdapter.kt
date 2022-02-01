package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.FlowerItemBinding

class FlowerAdapter(private val flowerList: Array<String>) : RecyclerView.Adapter<FlowerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}

class FlowerViewHolder(private val itemBinding: FlowerItemBinding) :
    RecyclerView.ViewHolder(itemBinding.root) {

    fun bind(word: String) {

    }
}