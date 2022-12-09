package com.egorpoprotskiy.recyclerviewhw

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResultLauncher
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.egorpoprotskiy.recyclerviewhw.Data.Datasource
import com.egorpoprotskiy.recyclerviewhw.adapter.ItemAdapter
import com.egorpoprotskiy.recyclerviewhw.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    companion object {
        const val KEY_POSITION = "position_key"

    }
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var count = 0

        binding.btVertical.setOnClickListener {
            count = 1
            val i = Intent(this@MainActivity, MainActivity2::class.java)
            i.putExtra(KEY_POSITION, count)
            this.startActivity(i)
        }

        binding.btHorizontal.setOnClickListener {
            count = 2
            val i = Intent(this@MainActivity, MainActivity2::class.java)
            i.putExtra(KEY_POSITION, count)
            this.startActivity(i)
        }

        binding.btGrid.setOnClickListener {
            count = 3
            val i = Intent(this@MainActivity, MainActivity2::class.java)
            i.putExtra(KEY_POSITION, count)
            this.startActivity(i)
        }
    }
}

