package xyz.mmoral.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import xyz.mmoral.recyclerviewtest.databinding.ActivityDetailBinding
import xyz.mmoral.recyclerviewtest.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_detail)
        setContentView(binding.root)

        val albumID = intent.getIntExtra(ALBUM_ID_EXTRA, -1)
        var album = albumFromID(albumID)
        if (album != null) {
            binding.cover.setImageResource(album.cover)
            binding.title.setText(album.title)
            binding.author.setText(album.author)
            binding.description.setText(album.description)
        }
    }

    private fun albumFromID(albumID: Int): Album? {
        for(album in albumList) {
            if (album.id == albumID)
                return album
        }
        return null
    }
}