package com.example.shoppinglistapp

import com.google.android.gms.common.api.internal.ApiKey
import com.google.android.gms.maps.model.LatLng
import retrofit2.http.GET
import retrofit2.http.Query

interface GeoCodingApiService {

    @GET("maps/api/geocode/json")
    suspend fun getAddressFromCoordinates(
        @Query("latlng") latLng: String,
        @Query("key") apiKey: String
    ): GeocodingResponse

}