package dsm.hs.justgo.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private val retrofit: Retrofit? = null

    fun getRetrofit(): Retrofit = retrofit
        ?: Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
}

const val WEB_URL = "https://justgo-ashen.vercel.app/"
const val BASE_URL = ""
