package xyz.mmoral.recyclerviewtest

import androidx.recyclerview.widget.RecyclerView
import xyz.mmoral.recyclerviewtest.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clickListener: AlbumClickListener
) : RecyclerView.ViewHolder(cardCellBinding.root)
{
    fun bindAlbum(album: Album)
    {
        cardCellBinding.cover.setImageResource(album.cover)
        cardCellBinding.title.setText(album.title)
        cardCellBinding.author.setText(album.author)

        cardCellBinding.cardView.setOnClickListener{
            clickListener.onClick(album)
        }
    }
}