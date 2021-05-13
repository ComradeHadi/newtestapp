package com.hadi.vieaura_camer_app.framework

import android.content.Context
import com.hadi.core.data.PicsTag
import com.hadi.core.repository.PicsTagDataSource
import com.hadi.vieaura_camer_app.framework.db.DatabaseService
import com.hadi.vieaura_camer_app.framework.db.PicsTagEntity

class RoomDataSource(context: Context): PicsTagDataSource {
    val picsTagDao = DatabaseService.getInstance(context).picsTagsDao()

    override suspend fun add(picsTag: PicsTag) = picsTagDao.addPicsTagEntity(PicsTagEntity.fromPicsTag(picsTag))

    override suspend fun getAll() = picsTagDao.getAllPicsTagsEntities().map { it.toPicsTag() }

}
