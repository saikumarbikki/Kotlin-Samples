package com.example.dell.samplelogic1.fragments

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import com.example.dell.samplelogic1.logic.MyMath
import com.example.dell.samplelogic1.R
import kotlinx.android.synthetic.main.fragment_math.*
import kotlinx.android.synthetic.main.fragment_math.view.*

class MathFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_math, container, false)
        view.etAdd.setOnClickListener(this)
        view.etSubtact.setOnClickListener(this)
        view.etMultiply.setOnClickListener(this)
        view.etDivide.setOnClickListener(this)
        return view
    }

    override fun onClick(v: View?) {
        try {
            val imm = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow((context as Activity).window
                    .currentFocus!!.windowToken, 0)
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

       /* when (v?.id) {
            R.id.etAdd -> tvResult.text = "${myMath.getTotal(mFirstData.toInt(), mSecondData.toInt())}"
            R.id.etSubtact -> tvResult.text = "${myMath.getSubtract(mFirstData.toInt(), mSecondData.toInt())}"
            R.id.etMultiply -> tvResult.text = "${myMath.getMultiply(mFirstData.toInt(), mSecondData.toInt())}"
            R.id.etDivide -> tvResult.text = "${myMath.getDivide(mFirstData.toInt(), mSecondData.toInt())}"
        }*/
    }
}

