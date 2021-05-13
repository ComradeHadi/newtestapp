package com.hadi.vieaura_camer_app.framework.di

import android.app.Application
import com.hadi.core.repository.PicsTagRepository
import com.hadi.vieaura_camer_app.framework.RoomDataSource
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @Provides
    fun provideRepository(app: Application) = PicsTagRepository(RoomDataSource(app))
}
