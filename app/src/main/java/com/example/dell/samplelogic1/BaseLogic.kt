package com.example.dell.samplelogic1

abstract class BaseLogic {

    protected abstract fun add(a: String, b: String): Any

    private fun equals(a: Any, b: Any) = a == b

    fun handleMyOperations(a: String = "", b: String = "", operationId: MyEnum) =
            when (operationId) {
                MyEnum.ADD -> add(a, b)
                MyEnum.EQUALS -> equals(a, b)
                MyEnum.NONE -> "Invalid Operations"
            }
}