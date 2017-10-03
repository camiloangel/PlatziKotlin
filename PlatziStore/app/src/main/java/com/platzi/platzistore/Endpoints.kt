package com.platzi.platzistore

import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.GET

/**
 * @author Gorro.
 */
interface Endpoints {
    @GET("list")
    fun getList(): Call<JSONObject>
}