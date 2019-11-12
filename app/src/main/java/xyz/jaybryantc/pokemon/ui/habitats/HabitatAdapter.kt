package xyz.jaybryantc.pokemon.ui.habitats

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import xyz.jaybryantc.pokemon.network.response.Habitat

class HabitatAdapter: RecyclerView.Adapter<HabitatAdapter.HabitatViewHolder>() {

    private var habitats: List<Habitat> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitatViewHolder =
        HabitatViewHolder(View.inflate(parent.context, android.R.layout.simple_list_item_1, null))

    override fun getItemCount(): Int = habitats.size

    override fun onBindViewHolder(holder: HabitatViewHolder, position: Int) {
        holder.itemView.findViewById<TextView>(android.R.id.text1).text = habitats[position].name
    }

    fun setList(habitats: List<Habitat>) {
        this.habitats = this.habitats.plus(habitats)
        notifyDataSetChanged()
    }

    inner class HabitatViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
}