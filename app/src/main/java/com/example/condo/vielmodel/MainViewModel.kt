package com.example.condo.vielmodel

import androidx.lifecycle.ViewModel
import com.example.condo.data.CondoUnit

class MainViewModel : ViewModel() {

    private val _unitList: MutableList<CondoUnit> = condoUnitMock()
    val unitiesList: List<CondoUnit> = _unitList

    var filterOfList: List<CondoUnit> = listOf()

    fun onQueryChanged(query: String) {
        this.filterOfList = _unitList.filter { unit -> unit.nomeUnidade.contains(query) }
    }

    private fun condoUnitMock(): MutableList<CondoUnit> {
        return mutableListOf(
            CondoUnit(
                id = 1,
                nomeUnidade = "Praia",
                descricao = "Perto da praia",
                url = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTn83acqxCQfqPl7KnVL9AZU9dbG6vGzecr1g&usqp=CAU"
            ),
            CondoUnit(
                id = 2,
                nomeUnidade = "Chalé",
                descricao = "Chalé isolado ",
                url = "https://cf.bstatic.com/xdata/images/hotel/max1024x768/346811761.jpg?k=667dd138418920f1831db67e6882489c66884977d70ccd7793d3ca7fb51d61df&o=&hp=1"
            ),
            CondoUnit(
                id = 3,
                nomeUnidade = "Casa do campo",
                descricao = "Casa de campo isolada com natureza ao redor",
                url = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQIbOz2UslNJMJK_wjVx-qFYxXsg0Ym8sdE1g&usqp=CAU"
            ),
            CondoUnit(
                id = 4,
                nomeUnidade = "Casa da montanha",
                descricao = "casa que fica na montanha",
                url = "https://cf.bstatic.com/xdata/images/hotel/max1024x768/402970114.jpg?k=e6b6a3b77661e439629e5e17e4ed555ca5751b94aaad7be73f9bd21b596e733c&o=&hp=1"
            )
        )
    }
}