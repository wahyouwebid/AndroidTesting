package web.id.wahyou.jetpackapp.data.model

import com.google.gson.annotations.SerializedName

/**
 * Created by : wahyouwebid.
 * Email : hello@wahyou.web.id.
 * Linkedin : linkedin.com/in/wahyouwebid.
 * Instagram : instagram.com/wahyouwebid.
 * Portopolio : wahyou.web.id.
 */

data class MovieResponse(
    @SerializedName("id") var id: Int = 0,
    @SerializedName("title") var name: String? = null,
    @SerializedName("overview") var desc: String? = null,
    @SerializedName("poster_path") var poster: String? = null,
    @SerializedName("backdrop_path") var img_preview: String? = null,
    @SerializedName("release_date") val release_date: String?,
    @SerializedName("vote_average") val vote_average: Double,
    @SerializedName("popularity") val popularity: Double?
)