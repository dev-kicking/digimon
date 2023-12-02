package com.devkick.base

import androidx.lifecycle.ViewModel

/**
 * @author jacob_kim
 * @email aoqnwnd@naver.com
 * @created 12/2/23
 * @desc
 **/
abstract class ComposeViewModel<UiState, UiEvent> : ViewModel() {

    abstract fun uiState(): UiState

    abstract fun onEvent(event: UiEvent)
}