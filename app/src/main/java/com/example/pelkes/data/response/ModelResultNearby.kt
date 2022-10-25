package com.example.pelkes.data.response


import com.example.pelkes.data.model.ModelResults
import com.google.gson.annotations.SerializedName

class ModelResultNearby {

    @SerializedName("results")
    val modelResults: List<ModelResults> = emptyList()
}