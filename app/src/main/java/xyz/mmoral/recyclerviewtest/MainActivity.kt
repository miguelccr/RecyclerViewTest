package xyz.mmoral.recyclerviewtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import xyz.mmoral.recyclerviewtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), AlbumClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateAlbums()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = CardAdapter(albumList, mainActivity)
        }
    }

    override fun onClick(album: Album) {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(ALBUM_ID_EXTRA, album.id)
        startActivity(intent)
    }

    private fun populateAlbums() {
        val Album0 = Album(
            R.drawable.my_face,
            "Miguel Moral",
            "Recycler View Test",
            "A simple app demonstrating recycler view layout."
        )
        albumList.add(Album0)

        val Album1 = Album(
            R.drawable.grace,
            "Jeff Buckley",
            "Grace",
            "Great effing album."
        )
        albumList.add(Album1)

        val Album2 = Album(
            R.drawable.a_new_place_2_drown,
            "Archie Marshall",
            "A new Place 2 Drown",
            "Damn if it aint good"
        )
        albumList.add(Album2)

        val Album3 = Album(
            R.drawable.evil_empire,
            "RATM",
            "Evil Empire",
            "wow."
        )
        albumList.add(Album3)

        val Album4 = Album(
            R.drawable.fazon,
            "Sopwith Camel",
            "Fazon",
            "Gresdfd"
        )
        albumList.add(Album4)

        val Album5 = Album(
            R.drawable.mosaik,
            "Siriusmo",
            "Mosaik",
            "Gresdfd"
        )
        albumList.add(Album5)

        val Album6 = Album(
            R.drawable.swing_slow,
            "Harry Hosono",
            "Swing Slow",
            "Gresdfd"
        )
        albumList.add(Album6)

        val Album7 = Album(
            R.drawable.the_truth,
            "D.R. Hooker",
            "The Truth",
            "Gresdfd"
        )
        albumList.add(Album7)

        val Album8 = Album(
            R.drawable.wish_you_where_here,
            "Pink Floyd",
            "Wish You Where Here",
            "Gresdfd"
        )
        albumList.add(Album8)

        albumList.add(Album1)
        albumList.add(Album2)
        albumList.add(Album3)
        albumList.add(Album4)
        albumList.add(Album5)
        albumList.add(Album6)
        albumList.add(Album7)
        albumList.add(Album8)

    }
}