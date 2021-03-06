package web.id.wahyou.jetpackapp.data.database.entity

import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

/**
 * Created by : wahyouwebid.
 * Email : hello@wahyou.web.id.
 * Linkedin : linkedin.com/in/wahyouwebid.
 * Instagram : instagram.com/wahyouwebid.
 * Portopolio : wahyou.web.id.
 */

@Entity(tableName = "tv_show")
@Parcelize
data class TvShowEntity(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int? = null,

    @NonNull
    @ColumnInfo(name = "tv_show_id")
    var tvShowId: Int = 0,

    @ColumnInfo(name = "name")
    var name: String? = null,

    @ColumnInfo(name = "desc")
    var desc: String? = null,

    @ColumnInfo(name = "poster")
    var poster: String? = null,

    @ColumnInfo(name = "img_preview")
    var imgPreview: String? = null,

    @NonNull
    @ColumnInfo(name = "first_air_date")
    val first_air_date: String?,

    @NonNull
    @ColumnInfo(name = "vote_average")
    val vote_average: Double,

    @NonNull
    @ColumnInfo(name = "popularity")
    val popularity: Double?,

    @NonNull
    @ColumnInfo(name = "is_favorite")
    var isFavorite: Boolean = false,

): Parcelable