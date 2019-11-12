package xyz.jaybryantc.pokemon.network

import retrofit2.http.GET
import retrofit2.http.Path
import xyz.jaybryantc.pokemon.network.response.Habitat
import xyz.jaybryantc.pokemon.network.response.Pokemon
import xyz.jaybryantc.pokemon.network.response.Results

interface PokemonService {
    @GET("pokemon-habitat")
    suspend fun fetchHabitats(): Results<List<Habitat>>

    @GET("pokemon-habitat/{habitatId}")
    suspend fun fetchPokemons(@Path("habitatId") habitatId: Int): List<Pokemon>

    @GET("pokemon/{pokemonId}")
    suspend fun fetchPokemon(@Path("pokemonId") pokemonId: Int): Pokemon
}