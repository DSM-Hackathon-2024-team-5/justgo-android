package dsm.hs.justgo.data

import dsm.hs.justgo.data.model.GetRandomDestinationResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface TravelApiService {
    @GET
    fun getRandomDestination(
        @Query("userId") userId: Long,
        @Query("latitude") latitude: Double,
        @Query("longitude") longitude: Double,
        @Query("radiusKm") radiusKm: Double
    ) : GetRandomDestinationResponse
}
