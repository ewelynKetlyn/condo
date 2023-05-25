package com.example.condo.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.core.widget.addTextChangedListener
import com.example.condo.R

class SearchBarView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {
    private var searchEditText: EditText? = null
    private var searchImageButton: ImageButton? = null
    private var onQueryChanged: ((String) -> Unit)? = null

    init {
        LayoutInflater.from(context).inflate(R.layout.activity_search_bar_view, this, false)
        searchEditText = findViewById(R.id.searchEditText)
        searchImageButton = findViewById(R.id.searchIconBotton)
    }

    fun newInstance(onQueryChanged: (String) -> Unit) {
        this.onQueryChanged = onQueryChanged
        setUpViews()
    }

    private fun setUpViews() {
        searchEditText?.addTextChangedListener { text ->
            onQueryChanged?.invoke(text.toString())
        }
    }
}