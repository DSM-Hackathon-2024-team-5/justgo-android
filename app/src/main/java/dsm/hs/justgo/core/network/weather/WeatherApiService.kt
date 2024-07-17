package dsm.hs.justgo.core.network.weather

import dsm.hs.justgo.core.network.weather.model.WeatherData
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {
    @GET("weather")
    suspend fun getWeather(
        @Query("q") city: String,
        @Query("appid") apiKey: String,
    ): WeatherData
}