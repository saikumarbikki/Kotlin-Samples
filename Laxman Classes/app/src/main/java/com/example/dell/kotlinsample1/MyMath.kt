package com.example.dell.kotlinsample1

class MyMath {

    fun getTotal(a: Int, b: Int) = a + b

    fun getSubtract(a: Int, b: Int) = a - b
    //you can also write both the ways
    fun getMultiply(a: Int, b: Int): Int {
        return a * b
    }

    fun getDivide(a: Int, b: Int): Int {
        return a / b
    }

    /* fun getResults(firstNum: Int, secondNum: Int, viewId: Int):Int {
         when(viewId.id){
             R.id.etAdd -> tvResult.text = "${myMath.getTotal(mFirstData.toInt(), mSecondData.toInt())}"
             R.id.etSubtact -> tvResult.text = "${myMath.getSubtract(mFirstData.toInt(), mSecondData.toInt())}"
             R.id.etMultiply -> tvResult.text = "${myMath.getMultiply(mFirstData.toInt(), mSecondData.toInt())}"
             R.id.etDivide -> tvResult.text = "${myMath.getDivide(mFirstData.toInt(), mSecondData.toInt())}"
         }

     }*/
}