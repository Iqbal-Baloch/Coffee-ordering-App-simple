package com.example.coffeeordering

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coffeeordering.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnDec.setOnClickListener {
            var num = binding.lblCount.text.toString().toInt() ;
            num++ ;
            binding.lblCount.text = num.toString()
        }
        binding.btnInc.setOnClickListener {
            var num = binding.lblCount.text.toString().toInt() ;
            num++ ;
            binding.lblCount.text = num.toString()
        }
        binding.btnOrder.setOnClickListener {
            val num = binding.lblCount.text.toString()
            val isCream = binding.cbCream.isChecked ;
            val isChocolate = binding.cbChocolate.isChecked ;
            var price= 4.00 ;
            if (isCream)
                price +=1.00
            if (isChocolate)
                price += 0.5

            binding.lblSummary.text = "Add wipped cream? " + (if (isCream) "Yes" else "No") +
                    "\nAdd chocolate? " + (if (isChocolate) "Yes" else "No") +
                    "\nQuantity: ${num}"+
                    "\n\nPrice ${price}" +
                    "\nTHANK YOU!" ;

        }
    }
}