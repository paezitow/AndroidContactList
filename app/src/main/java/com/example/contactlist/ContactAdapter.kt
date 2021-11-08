package com.example.contactlist

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter : RecyclerView.Adapter<ContactAdapter.ContactAdapterViewHolder>() {

    private val list: MutableList<Contact> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ??? {
        TODO("Not yet implemented")
    }


    //ler em cada item do array, pegar o valor e preencher na tela do celular (popular o recycler view)
    override fun onBindViewHolder(holder: ContactAdapterViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    //retorna o tamanho da lista de contatos
    override fun getItemCount(): Int {
        return list.size
    }

    class ContactAdapterViewHolder(itemView: View) :  RecyclerView.ViewHolder(itemView){

    }
}