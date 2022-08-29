package com.ndt.musicplayer

interface OnDataLoadedCallback<T> {

    fun onDataLoaded(data: T)

    fun onDataNotAvailable(exception: Exception)
}