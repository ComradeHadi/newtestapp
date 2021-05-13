package com.hadi.vieaura_camer_app.framework.di


import com.hadi.vieaura_camer_app.framework.PicsTagsListViewModel
import com.hadi.vieaura_camer_app.framework.PicsTagsViewModel
import dagger.Component

@Component(modules = [ApplicationModule::class, RepositoryModule::class, UseCasesModule::class])
interface ViewModelComponent {
    fun inject(picsTagsViewModel: PicsTagsViewModel)
    fun inject(picsTagsListViewModel: PicsTagsListViewModel)
}
