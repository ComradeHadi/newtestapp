package com.hadi.vieaura_camer_app.framework.di


import com.devtides.memorynotes.framework.UseCases
import com.hadi.core.repository.PicsTagRepository
import com.hadi.core.usescase.AddPicsTagUseCase
import com.hadi.core.usescase.GetAllPicsTagsUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCasesModule {
    @Provides
    fun getUseCases(repository: PicsTagRepository) = UseCases(
        AddPicsTagUseCase(repository),
        GetAllPicsTagsUseCase(repository)

    )
}
