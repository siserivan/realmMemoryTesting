package app.dev.realmmemorytesting

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.dev.realmmemorytesting.data.LocalSource
import app.dev.realmmemorytesting.model.ComplexModel
import io.realm.kotlin.ext.copyFromRealm
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class ActivityViewModel : ViewModel() {

    val state = mutableStateOf(listOf<ComplexModel>())
    val state2 = mutableStateOf(0)

    init {
        viewModelScope.launch {
            launch {
                LocalSource.observeComplex().collect {
                    state.value = it.list.toList()
                }
            }
//            launch {
//                LocalSource.observeComplex().map { it.list.map { it.copyFromRealm() } }.collect {
//                    state2.value = it.toList()
//                }
//            }
        }
    }

    fun onClick() {
        viewModelScope.launch {
            repeat(10){
                launch {
                    LocalSource.saveComplexModel()
                }
            }
        }
    }

}