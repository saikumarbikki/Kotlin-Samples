package com.example.dell.samplelogic1.fragments

import com.example.dell.samplelogic1.MyEnum
import com.example.dell.samplelogic1.logic.MyString
import com.example.dell.samplelogic1.R
import kotlinx.android.synthetic.main.fragment_string.*

class StringFragment : BaseFragment() {
    override fun handleMyOperations(id: Int): Any {
        val mFirstName = etFirstName.text.toString()
        val mSecondName = etSecondName.text.toString()

        return when (id) {
            R.id.btnAdd -> myOperations.handleMyOperations(mFirstName, mSecondName, MyEnum.ADD)
            R.id.btnEquals -> myOperations.handleMyOperations(mFirstName, mSecondName, MyEnum.EQUALS)
            else -> myOperations.handleMyOperations(operationId = MyEnum.NONE)
        }
    }

    //we need to access mystring object to get those methods// for one time initiasation
    private val myOperations by lazy { MyString() }


    override fun setClickListeners() {
        super.setClickListeners()
        btnAdd.setOnClickListener(this)
        btnEquals.setOnClickListener(this)
        btnCompare.setOnClickListener(this)
    }

    override fun layoutResource() = R.layout.fragment_string

}