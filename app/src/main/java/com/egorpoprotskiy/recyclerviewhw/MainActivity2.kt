package com.egorpoprotskiy.recyclerviewhw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.egorpoprotskiy.recyclerviewhw.Data.Datasource
import com.egorpoprotskiy.recyclerviewhw.adapter.ItemAdapter
import com.egorpoprotskiy.recyclerviewhw.databinding.ActivityMain2Binding
import com.egorpoprotskiy.recyclerviewhw.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataset = Datasource().loadDataSource()
        binding.recyclerView2.adapter = ItemAdapter(this, myDataset)
        binding.recyclerView2.setHasFixedSize(true)

        val result = intent?.extras?.getInt(MainActivity.KEY_POSITION)
        binding.recyclerView2.layoutManager = when (result) {
            1 -> LinearLayoutManager(this@MainActivity2, LinearLayoutManager.VERTICAL, false)
            2 -> LinearLayoutManager(this@MainActivity2, LinearLayoutManager.HORIZONTAL, false)
            else -> GridLayoutManager(this@MainActivity2,2)
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }


}