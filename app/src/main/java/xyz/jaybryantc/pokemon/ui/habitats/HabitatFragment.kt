package xyz.jaybryantc.pokemon.ui.habitats

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_habitat.*
import xyz.jaybryantc.pokemon.R

class HabitatFragment: Fragment() {
    companion object {
        fun newInstance(): HabitatFragment {
            return HabitatFragment()
        }
    }

    private val viewModel: HabitatViewModel by viewModels()
    private val habitatAdapter = HabitatAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_habitat, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView.apply {
            adapter = habitatAdapter
            layoutManager = LinearLayoutManager(context)
        }

        viewModel.habitats.observe(this, Observer {
            habitatAdapter.setList(it)
        })
    }
}