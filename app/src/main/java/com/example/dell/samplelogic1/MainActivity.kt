package com.example.dell.samplelogic1

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity(), Communicator {

    companion object {
        fun newInstance(): MainActivity {
            return MainActivity()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_screen1 -> {
                if (!myMathFragment.isVisible) {
                    addFragment(myMathFragment, false)
                }
                return true
            }
            R.id.action_screen2 -> {
                if (!myStringFragment.isVisible) {
                    addFragment(myStringFragment, false)
                }
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun addFragment(fragment: Fragment, addToStack: Boolean) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        if (addToStack) {
            fragmentTransaction.addToBackStack(MainActivity::class.java.name)
        }
        fragmentTransaction.commit()
    }

    private val myMathFragment by lazy { MathFragment() }
    private val myStringFragment by lazy { StringFragment() }


}
