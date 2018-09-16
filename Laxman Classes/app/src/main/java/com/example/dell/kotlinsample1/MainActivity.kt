package com.example.dell.kotlinsample1

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etAdd.setOnClickListener(this)
        etSubtact.setOnClickListener(this)
        etMultiply.setOnClickListener(this)
        etDivide.setOnClickListener(this)
        btnNextScreen.setOnClickListener(this)


        display()


    }

    private fun display() {

        var myRangeNumber = 1..20
        Log.d("Test123", "$myRangeNumber")
    }

    override fun onClick(v: View?) {
        try {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        } catch (e: Exception) {

        }
        val myMath = MyMath() //created Mymath class

        val mFirstData = etFirstData?.text.toString()
        val mSecondData = etSecondData?.text.toString()

        if (mFirstData.isEmpty()) {
            etFirstData.error = "please enter first value"
            return
        }
        if (mSecondData.isEmpty()) {
            etSecondData.error = "please enter Second value"
            return
        }
        //  tvResult.text = R.string.app_name.toString() //eventhough its string but it will consider as int

        when (v?.id) {
            R.id.etAdd -> tvResult.text = "${myMath.getTotal(mFirstData.toInt(), mSecondData.toInt())}"
            R.id.etSubtact -> tvResult.text = "${myMath.getSubtract(mFirstData.toInt(), mSecondData.toInt())}"
            R.id.etMultiply -> tvResult.text = "${myMath.getMultiply(mFirstData.toInt(), mSecondData.toInt())}"
            R.id.etDivide -> tvResult.text = "${myMath.getDivide(mFirstData.toInt(), mSecondData.toInt())}"
            R.id.btnNextScreen -> {
                startActivity(Intent(this@MainActivity, NumberCheck::class.java))
            }
        }
    }
}


/*
*
*when (v?.id) {
            R.id.etAdd -> tvResult.text = "${(mFirstData.toInt() + mSecondData.toInt())}"
            R.id.etSubtact -> tvResult.text = (mFirstData.toInt() - mSecondData.toInt()).toString()
            R.id.etMultiply -> tvResult.text = (mFirstData.toInt() * mSecondData.toInt()).toString()
            R.id.etDivide -> tvResult.text = (mFirstData.toInt() / mSecondData.toInt()).toString()
            R.id.btnNextScreen -> {
                startActivity(Intent(this@MainActivity, NumberCheck::class.java))
            }

        }
* */