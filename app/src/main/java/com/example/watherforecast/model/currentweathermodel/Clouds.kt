package com.example.watherforecast.model.currentweathermodel

import com.google.gson.annotations.SerializedName


data class Clouds (

  @SerializedName("all" ) var all : Int? = null

)