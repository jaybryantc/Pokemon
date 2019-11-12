package xyz.jaybryantc.pokemon.ui.habitats

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import xyz.jaybryantc.pokemon.network.response.Habitat
import xyz.jaybryantc.pokemon.repository.PokemonRepository

class HabitatViewModel: ViewModel() {
    private val repository: PokemonRepository = PokemonRepository()

    var habitats: LiveData<List<Habitat>> = liveData {
        emit(repository.getHabitats())
    }
}