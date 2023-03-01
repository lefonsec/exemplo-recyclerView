package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycler.databinding.ActivityMainBinding
import com.example.recycler.model.Live

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterExemplo: ExemploAdapter
    private var listaExemplo: MutableList<Live> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val reciclyLista = binding.reciclyLista
        reciclyLista.layoutManager =  LinearLayoutManager(this)
        reciclyLista.setHasFixedSize(true)
        this.itensLista()
        var size = this.itensLista().size
        adapterExemplo = ExemploAdapter(listaExemplo)
        reciclyLista.adapter = adapterExemplo

    }

    private fun itensLista(): MutableList<Live> {
        listaExemplo.add(Live("leonardo",25,"programador"))
        listaExemplo.add(Live("Ambeve",32,"Industria"))
        listaExemplo.add(Live("Galvão",71,"Comentarista"))
        listaExemplo.add(Live("Neymar",31,"Jogador"))
        listaExemplo.add(Live("Ronaldinho",46,"Jogador"))
        listaExemplo.add(Live("Ellon musk",60,"Genio"))
        listaExemplo.add(Live("Bezos",70,"Genio"))
        return listaExemplo
    }

}