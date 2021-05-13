package com.hadi.vieaura_camer_app.framework.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.hadi.core.data.PicsTag

@Entity(tableName = "picstag")
data class PicsTagEntity(
    val tag: String,
    val image_url: String,

    @ColumnInfo(name = "creation_date")
    val creationTime: Long,

    @ColumnInfo(name = "update_time")
    val updateTime: Long,

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L
) {
    companion object {
        fun fromPicsTag(picsTag: PicsTag) = PicsTagEntity(picsTag.tag, picsTag.image_url, picsTag.creationTime, picsTag.updateTime, picsTag.id)
    }

    fun toPicsTag() = PicsTag(tag, image_url, creationTime, updateTime, id)
}
