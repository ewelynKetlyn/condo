package com.example.condo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.condo.R
import com.example.condo.data.CondoUnit

class CondoAdapter : RecyclerView.Adapter<CondoAdapter.ViewHolder>() {

    private var unities: List<CondoUnit> = listOf()

    fun setUnites(unitiesList: List<CondoUnit>) {
        this.unities = unitiesList
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private var txtName: TextView = view.findViewById(R.id.txtNameCard)
        private var viewCard: ImageView = view.findViewById(R.id.viewCard)
        private var descriptionCard: TextView = view.findViewById(R.id.txtDescriptionCard)
        private var idCard: TextView = view.findViewById(R.id.idCard)

        fun bind(unit: CondoUnit) {
            txtName.text = unit.nomeUnidade
            descriptionCard.text = unit.descricao
            idCard.text = unit.id.toString()
            viewCard.load(unit.url)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_condo_card, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = unities.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = unities[position]
        holder.bind(item)
    }

}