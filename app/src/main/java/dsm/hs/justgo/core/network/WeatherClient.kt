package dsm.hs.justgo.core.network

import dsm.hs.justgo.core.network.weather.WeatherApiService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object WeatherClient {
    private val retrofit: Retrofit? = null

    fun getRetrofit(): Retrofit = retrofit ?: Retrofit.Builder()
        .baseUrl(WEATHER_BASE_URL)
        .client(
            OkHttpClient.Builder().apply {
                addInterceptor(
                    HttpLoggingInterceptor().apply {
                        level = HttpLoggingInterceptor.Level.BODY
                    },
                )
            }.build(),
        )
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}

private const val WEATHER_BASE_URL = "https://api.openweathermap.org/data/2.5/"
const val WEATHER_API_KEY = "1c4aa8c9519dfd1233c32c4e50a4050f"

val weatherApiService: WeatherApiService by lazy {
    WeatherClient.getRetrofit().create(WeatherApiService::class.java)
}
