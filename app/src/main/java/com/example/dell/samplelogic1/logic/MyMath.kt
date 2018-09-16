package com.example.dell.samplelogic1.logic

class MyMath : BaseLogic() {
    override fun add(a: String, b: String) = a.toInt() + b.toInt()


  /*  fun getSubtract(a: Int, b: Int) = a - b
    //you can also write both the ways
    fun getMultiply(a: Int, b: Int): Int {
        return a * b
    }

    fun getDivide(a: Int, b: Int): Int {
        return a / b
    }
*/
}
