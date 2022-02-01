package com.example.recyclerview

import android.content.Context

class DataSource(private val context: Context) {
    fun getFlowerList(): Array<String>{
        return context.resources.getStringArray(R.array.flower_array)
    }
}