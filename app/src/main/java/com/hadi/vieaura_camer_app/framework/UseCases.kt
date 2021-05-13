package com.devtides.memorynotes.framework

import com.hadi.core.usescase.AddPicsTagUseCase
import com.hadi.core.usescase.GetAllPicsTagsUseCase

data class UseCases(
    val addPicsTag: AddPicsTagUseCase,
    val getAllPicsTags: GetAllPicsTagsUseCase
)
