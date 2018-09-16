package com.example.dell.kotlinsample1

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_numbercheck.*


//@SuppressLint("Registered")
class NumberCheck : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbercheck)

        btnCompare.setOnClickListener {

            try {
                val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
            } catch (e: Exception) {

            }
            val mFirstName = etFirstName.text.toString()
            val mSecondName = etSecondName.text.toString()
            when {
                mFirstName.equals(mSecondName) -> {
                    compareResult.text = "matched"
                    Toast.makeText(this, "matched", Toast.LENGTH_LONG).show()
                }
                mFirstName.contains("sai") -> compareResult.text = "Sai is matched"
                mSecondName.contains(mFirstName) -> compareResult.text = "firstname is matched"
                else -> compareResult.text = "not matched"
            }


        }

    }
}
