package com.hadi.core.repository

import com.hadi.core.data.PicsTag

interface PicsTagDataSource {

    suspend fun add(picsTag: PicsTag)

    suspend fun getAll(): List<PicsTag>

}
