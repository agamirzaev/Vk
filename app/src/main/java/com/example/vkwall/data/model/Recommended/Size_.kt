package com.example.vkwall.data.model.Recommended

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Size_ {
    @SerializedName("height")
    @Expose
    var height: Int? = null
    @SerializedName("url")
    @Expose
    var url: String? = null
    @SerializedName("type")
    @Expose
    var type: String? = null
    @SerializedName("width")
    @Expose
    var width: Int? = null
}
