package web.id.wahyou.jetpackapp.data.model

import com.google.gson.annotations.SerializedName

/**
 * Created by : wahyouwebid.
 * Email : hello@wahyou.web.id.
 * Linkedin : linkedin.com/in/wahyouwebid.
 * Instagram : instagram.com/wahyouwebid.
 * Portopolio : wahyou.web.id.
 */

data class TvShowResponse(
    @SerializedName("id") var id: Int = 0,
    @SerializedName("name") var name: String? = null,
    @SerializedName("overview") var desc: String? = null,
    @SerializedName("poster_path") var poster: String? = null,
    @SerializedName("backdrop_path") var img_preview: String? = null,
    @SerializedName("first_air_date") val first_air_date: String?,
    @SerializedName("vote_average") val vote_average: Double,
    @SerializedName("popularity") val popularity: Double?
)