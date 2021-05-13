package com.hadi.vieaura_camer_app.framework.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface PicsTagDao {
    @Insert(onConflict = REPLACE)
    suspend fun addPicsTagEntity(picsTagEntity: PicsTagEntity)


    @Query("SELECT * FROM picstag")
    suspend fun getAllPicsTagsEntities(): List<PicsTagEntity>

}
