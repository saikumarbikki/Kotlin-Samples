package com.example.dell.samplelogic1.fragments

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Toast

abstract class BaseFragment : Fragment(), View.OnClickListener {

    override fun onClick(v: View?) {
        hideKeyboard()
        var result = handleMyOperations(v?.id!!)
        Toast.makeText(context, "Result Toast : " + result, Toast.LENGTH_SHORT).show()
    }

    abstract fun layoutResource(): Int

    abstract fun handleMyOperations(id: Int): Any

    open fun setClickListeners() {

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) =
            inflater.inflate(layoutResource(), container, false)!!

    override fun onStart() {
        super.onStart()
        setClickListeners()
    }

    fun hideKeyboard() {
        try {
            val imm = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow((context as Activity).window
                    .currentFocus!!.windowToken, 0)
        } catch (e: Exception) {

        }
    }


}