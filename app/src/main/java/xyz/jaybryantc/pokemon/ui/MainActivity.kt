package xyz.jaybryantc.pokemon.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.commit
import xyz.jaybryantc.pokemon.R
import xyz.jaybryantc.pokemon.databinding.ActivityMainBinding
import xyz.jaybryantc.pokemon.ui.habitats.HabitatFragment

class MainActivity: AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        openInitialFragment()
    }

    private fun openInitialFragment() {
        supportFragmentManager.commit {
            add(binding.fragmentContainer.id, HabitatFragment.newInstance())
        }
    }

}