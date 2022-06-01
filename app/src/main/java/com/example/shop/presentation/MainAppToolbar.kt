package com.example.shop.presentation

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.shop.databinding.ToolbarFeedBinding

class Toolbar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : LinearLayout(context, attrs, defStyleAttr) {
    val binding = ToolbarFeedBinding.inflate(LayoutInflater.from(context), this, true)

}