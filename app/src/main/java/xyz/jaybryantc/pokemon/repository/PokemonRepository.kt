package xyz.jaybryantc.pokemon.repository

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import xyz.jaybryantc.pokemon.network.PokemonService

class PokemonRepository {

    //TODO fix gson converter factory
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://pokeapi.co/api/v2/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val pokemonService: PokemonService = retrofit.create(PokemonService::class.java)

    suspend fun getPokemon(pokemonId: Int) = pokemonService.fetchPokemon(pokemonId)

    suspend fun getHabitats() = pokemonService.fetchHabitats().results

    suspend fun getPokemons(habitatId: Int) = pokemonService.fetchPokemons(habitatId)
}