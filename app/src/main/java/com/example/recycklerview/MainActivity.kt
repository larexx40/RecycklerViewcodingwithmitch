package com.example.recycklerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycklerview.models.DataSource
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var blogAdapter: BlogRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addDataSet()

    }

    private fun addDataSet(){
        val data= DataSource.createDataSet()
        blogAdapter.submitList(data)
    }

    private fun initRecyclerView(){
        recycler_view.apply {
            layoutManager=LinearLayoutManager(this@MainActivity)
            // topspacingdecoration gives the cardview in recyclerview padding
            val topSpacingDecoration= TopSpacingItemDecoration(30)
            addItemDecoration(topSpacingDecoration)
            blogAdapter= BlogRecyclerAdapter()
            adapter=blogAdapter
        }
    }

}
