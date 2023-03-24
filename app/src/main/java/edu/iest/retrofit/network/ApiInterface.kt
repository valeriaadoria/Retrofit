package edu.iest.retrofit.network

import retrofit2.Call
import edu.iest.retrofit.models.ImageRandom
import retrofit2.http.GET

interface ApiInterface {
    @GET("breeds/image/random")
    fun imagenAleatoria(): Call<ImageRandom>

}