package com.example.coffeeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var numberOfOrders : TextView
    lateinit var creamCB: CheckBox
    lateinit var chocoCB: CheckBox
    lateinit var order_summary: TextView
    var ord: Int=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numberOfOrders = findViewById(R.id.textView3)
        creamCB=findViewById(R.id.checkBox2)
        chocoCB=findViewById(R.id.checkBox3)
        ord=Integer.parseInt(numberOfOrders.text.toString())
        order_summary=findViewById(R.id.textView5)
    }

    fun Minus(view : View){
        if(ord>0) {
            ord--
            numberOfOrders.setText(ord.toString())
        }

    }
    fun Plus(view : View){
        ord++
        numberOfOrders.text=ord.toString()
    }
    fun Order(view :View){
        var bill:Double=4.0*ord;
        var choco: String="no"
        var cream: String="no"
        if(creamCB.isChecked){
            bill+=0.5;
            cream="yes"
        }
        if (chocoCB.isChecked){
            bill+=1.0;
            choco="yes"
        }

        order_summary.text="Add Whiped Cream ?"+cream+"\nAdd Chocolate? "+choco+"\nQuantity: "+ord+"\nPrice: "+bill+"\n THANK YOU!"

    }
}