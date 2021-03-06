package xyz.mmoral.recyclerviewtest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import xyz.mmoral.recyclerviewtest.databinding.CardCellBinding

class CardAdapter(
    private val albums: List<Album>,
    private val clickListener: AlbumClickListener
    )
    : RecyclerView.Adapter<CardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from, parent, false)
        return  CardViewHolder(binding, clickListener)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindAlbum(albums[position])
    }

    override fun getItemCount(): Int = albums.size

}