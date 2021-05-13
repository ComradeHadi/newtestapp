package com.hadi.vieaura_camer_app.framework

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.devtides.memorynotes.framework.UseCases
import com.hadi.core.data.PicsTag
import com.hadi.vieaura_camer_app.framework.di.ApplicationModule
import com.hadi.vieaura_camer_app.framework.di.DaggerViewModelComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class PicsTagsListViewModel(application: Application): AndroidViewModel(application) {

    private val coroutineScope = CoroutineScope(Dispatchers.IO)

    @Inject
    lateinit var useCases: UseCases

    init {
        DaggerViewModelComponent.builder()
            .applicationModule(ApplicationModule((getApplication())))
            .build()
            .inject(this)
    }

    val allPicsTags = MutableLiveData<List<PicsTag>>()

    fun getAllPicsTag() {
        coroutineScope.launch {
            val picsTagList = useCases.getAllPicsTags()
            allPicsTags.postValue(picsTagList)
        }
    }

}
