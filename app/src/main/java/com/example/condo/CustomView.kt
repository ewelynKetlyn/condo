package com.example.condo

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import coil.load

class CustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
): LinearLayout(context, attrs, defStyleAttr) {

    private var viewCard:ImageView? = null
    private var txtName:TextView? = null
    private var descriptionCard:TextView? = null
    private var condoUnit: CondoUnit? = null
    private var idCard: TextView? = null

    init {
        LayoutInflater.from(context).inflate(R.layout.activity_condo_card, this, true)
        viewCard = findViewById(R.id.viewCard)
        txtName = findViewById(R.id.txtNameCard)
        descriptionCard = findViewById(R.id.txtDescriptionCard)
        idCard = findViewById<TextView>(R.id.idCard)
    }

    fun setData(unitCard: CondoUnit){
        txtName?.text = unitCard.nomeUnidade
        descriptionCard?.text = unitCard.descricao
        idCard?.text = unitCard.id.toString()
        viewCard?.load(condoUnit?.url)
    }

}