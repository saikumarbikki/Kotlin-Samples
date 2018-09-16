package com.example.dell.kotlinsample1

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MyMathTest {

    var myMath: MyMath? = null

    //for every test method this block will be executed(and myMath object will be initialized)
    @Before
    fun setUp() {
        myMath = MyMath()
        println("Before method is called")
    }

    @Test
    fun testGetSum() {
        var result = myMath?.getTotal(10, 20)
        Assert.assertEquals(30, result)
        result = myMath?.getTotal(-100, 100)
        Assert.assertEquals(0, result)
        result = myMath?.getTotal(-100, 100)
        Assert.assertNotEquals(1000, result)
    }

    @Test
    fun testGetSubtract() {
        var result = myMath?.getSubtract(20, 10)
        Assert.assertEquals(10, result)
        result = myMath?.getSubtract(100, 100)
        Assert.assertEquals(0, result)
    }

    @Test
    fun testGetMultiply() {
        var result = myMath?.getMultiply(20, 30)
        Assert.assertEquals(600, result)
        result = myMath?.getMultiply(100, 0)
        Assert.assertEquals(0, result)
    }

    @Test
    fun testGetDivideBy() {
        var result = myMath?.getDivide(500, 100)
        Assert.assertEquals(5, result)
        result = myMath?.getDivide(1000, 800)
        Assert.assertEquals(1, result)
    }

    //it will call after every Test method.It will de intilaize all the object
    @After
    fun tearDown() {
        myMath = null
        println("After method is called")
    }

}