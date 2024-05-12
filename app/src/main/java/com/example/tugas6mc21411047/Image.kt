package com.example.tugas6mc21411047

import com.google.firebase.database.Exclude

data class Image(
    var name:String? = null,
    var imageUrl:String? = null,
    var description:String? = null,
    @get:Exclude
    @set:Exclude
    var key:String? = null
)
