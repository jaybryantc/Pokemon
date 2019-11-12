package xyz.jaybryantc.pokemon.network.response

data class Pokemon(
    val id: Long,
    val name: String,
    val baseExperience: Int,
    val height: Int,
    val weight: Int,
    val order: Int
)