package com.muammarahlnn.asco.core.common.contract

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ContractProvider, 15/06/2024 21.53
 */
interface ContractProvider<State, Event, Effect> {

    val state: StateFlow<State>

    val effect: Flow<Effect>

    fun event(event: Event)

    fun updateState(block: State.() -> State)

    fun updateState(state: State)

    fun CoroutineScope.emitEffect(effect: Effect)
}