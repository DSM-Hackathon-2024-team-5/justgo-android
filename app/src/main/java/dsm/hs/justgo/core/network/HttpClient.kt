package dsm.hs.justgo.core.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object HttpClient {
    private val retrofit: Retrofit? = null

    fun getRetrofit(): Retrofit = retrofit
        ?: Retrofit.Builder()
            .baseUrl(BASE_URL)
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

const val WEB_URL = "https://justgo-ashen.vercel.app/"
const val BASE_URL = ""
