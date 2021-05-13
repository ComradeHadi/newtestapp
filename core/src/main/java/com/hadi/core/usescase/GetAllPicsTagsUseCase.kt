package com.hadi.core.usescase

import com.hadi.core.data.PicsTag
import com.hadi.core.repository.PicsTagRepository

class GetAllPicsTagsUseCase(private val picsTagRepository: PicsTagRepository) {
    suspend operator fun invoke() = picsTagRepository.getAllPicsTags()
}
