package com.muammarahlnn.asco.core.ui.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

/**
 * @Author Muammar Ahlan Abimanyu
 * @File BaseViewModel, 17/06/2024 00.48
 */
abstract class BaseViewModel<State>(initialState: State) : ViewModel() {

    private val _state = MutableStateFlow(initialState)
    val state: StateFlow<State> = _state.asStateFlow()

    protected fun updateState(state: State) {
        _state.update { state }
    }

    protected fun updateState(block: State.() -> State) {
        _state.update(block)
    }
}