package com.example.dell.samplelogic1

import android.support.v4.app.Fragment

interface Communicator {
   fun addFragment(fragment: Fragment, addToStack:Boolean)
}