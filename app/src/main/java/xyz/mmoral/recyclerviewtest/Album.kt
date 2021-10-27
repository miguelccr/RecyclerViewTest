package xyz.mmoral.recyclerviewtest

var albumList = mutableListOf<Album>()

var ALBUM_ID_EXTRA = "albumExtra"

class Album(
    var cover: Int,
    var author: String,
    var title: String,
    var description: String,
    var id: Int? = albumList.size
)