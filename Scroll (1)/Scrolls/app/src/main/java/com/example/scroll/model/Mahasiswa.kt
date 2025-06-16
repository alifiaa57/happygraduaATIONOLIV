package com.example.scroll.model

import android.content.res.Resources
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Mahasiswa(
    @DrawableRes val imageResourceId: Int,
    @StringRes val nameResourceId: Int
)
