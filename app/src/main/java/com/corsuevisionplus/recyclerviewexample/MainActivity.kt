package com.corsuevisionplus.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.corsuevisionplus.recyclerviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val RestList = ArrayList<Resturant>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val lm = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = lm
        populateArray()
        val adapter = RestAdapter(this,RestList)
        binding.recyclerView.adapter = adapter
    }
    fun populateArray(){
        val r1 = Resturant(1,"Palmera","Gaza",4.8,R.drawable.ic_cofee_restant,"#ff123a")
        val r2 = Resturant(2,"Mazaj","Gaza",5.0,R.drawable.ic_cofee_restant,"#ffffff")
        val r3 = Resturant(3,"Taylandi","Gaza",4.5,R.drawable.ic_cofee_restant,"#006000")
        RestList.add(r1)
        RestList.add(r2)
        RestList.add(r3)
        RestList.add(r1)
        RestList.add(r2)
        RestList.add(r3)
        RestList.add(r1)
        RestList.add(r2)
        RestList.add(r3)


    }
}