package com.example.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler.databinding.ExemploListaBinding
import com.example.recycler.model.Live

class ExemploAdapter(private var items: MutableList<Live>) :
    RecyclerView.Adapter<ExemploAdapter.ViewHoler>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHoler {
        val binding =
            ExemploListaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHoler(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHoler, position: Int) {
        holder.bind(items[position])
    }


    inner class ViewHoler(binding: ExemploListaBinding) : RecyclerView.ViewHolder(binding.root) {

        //recebe os campos do lyout
        val txtNome = binding.textNome
        val txtIdade = binding.textIdade
        val txtDescricao = binding.textDescricao

        fun bind(item: Live) {
            // recebeo quetem na lista e modifica no layout.
            txtNome.text = item.nome
            txtIdade.text = item.idade.toString()
            txtDescricao.text = item.descicao


        }
    }
}
