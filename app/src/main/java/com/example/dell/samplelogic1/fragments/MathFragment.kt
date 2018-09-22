package com.example.dell.samplelogic1.fragments

import com.example.dell.samplelogic1.MyEnum
import com.example.dell.samplelogic1.R
import com.example.dell.samplelogic1.logic.MyMath
import kotlinx.android.synthetic.main.fragment_math.*

class MathFragment : BaseFragment() {
    override fun layoutResource() = R.layout.fragment_math

    override fun handleMyOperations(id: Int): Any {
        val mFirstData = etFirstData?.text.toString()
        val mSecondData = etSecondData?.text.toString()

        if (mFirstData.isEmpty()) {
            etFirstData.error = "please enter first value"
        }
        if (mSecondData.isEmpty()) {
            etSecondData.error = "please enter Second value"
        }

        return when (id) {
            R.id.etAdd -> myOperations.handleMyOperations(mFirstData, mSecondData, MyEnum.ADD)
            R.id.etSubtact -> myOperations.handleMyOperations(mFirstData, mSecondData, MyEnum.SUBTRACT)
            R.id.etMultiply -> myOperations.handleMyOperations(mFirstData, mSecondData, MyEnum.MULTIPLY)
            R.id.etDivide -> myOperations.handleMyOperations(mFirstData, mSecondData, MyEnum.DIVIDE)

            else -> "Invalid Operations"
        }

    }
    private val myOperations by lazy { MyMath() }

    override fun setClickListeners() {
        super.setClickListeners()
        etAdd.setOnClickListener(this)
        etSubtact.setOnClickListener(this)
        etMultiply.setOnClickListener(this)
        etDivide.setOnClickListener(this)

    }


}

