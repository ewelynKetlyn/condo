package com.example.condo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

private lateinit var customView: CustomView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        customView = findViewById(R.id.condoUnitView)

        val condoUnit = CondoUnit(
            id = 1,
            nomeUnidade = "Praia",
            descricao = "Perto da praia",
            url = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTn83acqxCQfqPl7KnVL9AZU9dbG6vGzecr1g&usqp=CAU"
        )

        customView.setData(condoUnit)
    }
}