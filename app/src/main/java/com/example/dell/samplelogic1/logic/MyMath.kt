package com.example.dell.samplelogic1.logic

import com.example.dell.samplelogic1.MyEnum

class MyMath : BaseLogic() {
    override fun add(a: String, b: String) = a.toInt() + b.toInt()
}
