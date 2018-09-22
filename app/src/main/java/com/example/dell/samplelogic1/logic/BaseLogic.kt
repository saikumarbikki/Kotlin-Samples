package com.example.dell.samplelogic1.logic

import com.example.dell.samplelogic1.MyEnum

abstract class BaseLogic {

    protected abstract fun add(a: String, b: String): Any

    private fun equals(a: Any, b: Any) = a == b

    fun getSubtract(a: Int, b: Int) = a - b
    //you can also write both the ways
    fun getMultiply(a: Int, b: Int): Int {
        return a * b
    }

    fun getDivide(a: Int, b: Int): Int {
        return a / b
    }

   open fun handleMyOperations(a: String = "", b: String = "", operationId: MyEnum) =
            when (operationId) {
                MyEnum.ADD -> add(a, b)
                MyEnum.EQUALS -> equals(a, b)
                MyEnum.NONE -> "Invalid Operations"
                MyEnum.SUBTRACT -> getSubtract(a.toInt(), b.toInt())
                MyEnum.MULTIPLY -> getMultiply(a.toInt(), b.toInt())
                MyEnum.DIVIDE -> getDivide(a.toInt(),b.toInt())
            }
}