package com.example.pictures

class ListView_model {
    var name: String? = null
    var image_source: Int = 0

    fun getNames(): String {
        return name.toString()
    }
    fun setNames(name: String){
        this.name = name
    }


    fun getImage(): Int {
        return image_source
    }

    fun setImage(image_source: Int) {
        this.image_source = image_source
    }
}