package com.example.condo

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.bumptech.glide.Glide

class CustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
): LinearLayout(context, attrs, defStyleAttr) {

    init {
        LayoutInflater.from(context).inflate(R.layout.activity_condo_card, this, true)
    }

    fun setData(unitCard: CondoUnit){
        val txtName = findViewById<TextView>(R.id.txtNameCard)
        val descriptionCard = findViewById<TextView>(R.id.txtDescriptionCard)
        val idCard = findViewById<TextView>(R.id.idCard)
        val viewCard = findViewById<ImageView>(R.id.viewCard)

        txtName.text = unitCard.nomeUnidade
        descriptionCard.text = unitCard.descricao
        idCard.text = unitCard.id.toString()
        Glide.with(context).load(unitCard.url).into(viewCard)
    }

}