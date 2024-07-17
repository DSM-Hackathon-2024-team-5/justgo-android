package dsm.hs.justgo.data.model

import com.google.gson.annotations.SerializedName

data class GetRandomDestinationResponse(
    @SerializedName("id")
    val id: Long,
    @SerializedName("description")
    val description: String,
) {

}