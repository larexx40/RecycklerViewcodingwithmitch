package com.example.recycklerview

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class TopSpacingItemDecoration (private val padding: Int): RecyclerView.ItemDecoration(){
   //press control o to call the override members to add padding to recyclerview
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
        outRect.top= padding
    }

}