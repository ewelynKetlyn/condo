package com.example.condo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.condo.adapter.CondoAdapter
import com.example.condo.data.CondoUnit
import com.example.condo.vielmodel.MainViewModel
class MainActivity : AppCompatActivity() {

    private var unitCardView: UnitCardView? = null
    private var mainViewlModel: MainViewModel? = null
    private var unitiesListRV: RecyclerView? = null
    private var unitisAdapter: CondoAdapter = CondoAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewlModel = ViewModelProvider(this)[MainViewModel::class.java]
        unitiesListRV = findViewById(R.id.unitesList)

        setViews()

    }
    private fun setViews(){
        setUpAdapter(mainViewlModel?.unitiesList.orEmpty())
    }
    private fun setUpAdapter(unitiesList:List<CondoUnit>){
        unitiesListRV?.adapter = unitisAdapter
        unitisAdapter.setUnites(unitiesList)
    }
}