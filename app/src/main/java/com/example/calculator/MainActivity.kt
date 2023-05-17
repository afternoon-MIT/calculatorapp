package com.example.calculator

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var display_result:TextView
    lateinit var first_edt:EditText
    lateinit var second_edt:EditText
    lateinit var btn_add:Button
    lateinit var btn_multiply:Button
    lateinit var btn_subtract:Button
    lateinit var btn_divide:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display_result = findViewById(R.id.txtdisplay)
        first_edt = findViewById(R.id.edtfirst)
        second_edt = findViewById(R.id.edtsecond)
        btn_add = findViewById(R.id.btnadd)
        btn_multiply = findViewById(R.id.btnmultiply)
        btn_subtract = findViewById(R.id.btnsubtract)
        btn_divide = findViewById(R.id.btndivide)


        btn_add.setOnClickListener{
            val num1 = first_edt.text.toString().trim()
            val num2 = second_edt.text.toString().trim()
            val number1 = num1.toDouble()
            val number2 =num2.toDouble()
            val total = number1 + number2
            val string_total = total.toString()
            Toast.makeText(this, "Result is $string_total", Toast.LENGTH_SHORT).show()

        }
        btn_multiply.setOnClickListener{
            val num3 = first_edt.text.toString().trim()
            val num4 = second_edt.text.toString().trim()
            val number3 = num3.toDouble()
            val number4 = num4.toDouble()
            val total = number3 * number4
            val string_total = total.toString()
            Toast.makeText(this, "Result is $string_total", Toast.LENGTH_SHORT).show()

        }
        btn_subtract.setOnClickListener{
            val num5 = first_edt.text.toString().trim()
            val num6 =second_edt.text.toString().trim()
            val number5=num5.toDouble()
            val number6 = num6.toDouble()
            val total = number5 - number6
            val string_total = total.toString()
            Toast.makeText(this, "Result is $string_total", Toast.LENGTH_SHORT).show()
        }
        btn_divide.setOnClickListener {
            val num7 = first_edt.text.toString().trim()
            val num8 = second_edt.text.toString().trim()
            val number7 = num7.toDouble()
            val number8 = num8.toDouble()
            val total = number7 / number8
            val string_total = total.toString()
            Toast.makeText(this, "Result is $string_total", Toast.LENGTH_SHORT).show()
        }
    }
}



