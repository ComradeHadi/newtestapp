package com.hadi.core.repository

import com.hadi.core.data.PicsTag

class PicsTagRepository(private val dataSource: PicsTagDataSource) {
    suspend fun addPicsTag(picsTag: PicsTag) = dataSource.add(picsTag)

    suspend fun getAllPicsTags() = dataSource.getAll()

}
