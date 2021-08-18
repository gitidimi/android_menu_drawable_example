package com.example.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.example.dashboard.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var rootElement:ActivityMainBinding           //100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rootElement = ActivityMainBinding.inflate(layoutInflater)  //100
        val view = rootElement.root                                //100
        setContentView(view)                                       //100
        // setContentView(R.layout.activity_main)                  //100
        init()

    }
    
    private fun init() {
        //drawerLayout --> id DrawerLayout in activity_main.xml
        //toolbar --> id Toolbar in main_content.xml
        var toggle = ActionBarDrawerToggle(this, rootElement.drawerLayout, rootElement.mainContent.toolbar, R.string.open, R.string.close) //100 rootElement.[irgendwas]
        rootElement.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        rootElement.navView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when(item.itemId) {
            R.id.ad_my_ads ->{
                Toast.makeText(this, "Pressed_1", Toast.LENGTH_LONG).show()
            }

            R.id.ad_cars ->{
                Toast.makeText(this, "Pressed_2", Toast.LENGTH_LONG).show()
            }

            R.id.ad_pc ->{
                Toast.makeText(this, "Pressed_3", Toast.LENGTH_LONG).show()
            }

            R.id.ad_smartphone ->{
                Toast.makeText(this, "Pressed_4", Toast.LENGTH_LONG).show()
            }

            R.id.ad_dm ->{
                Toast.makeText(this, "Pressed_5", Toast.LENGTH_LONG).show()
            }

            R.id.ad_sign_in ->{
                Toast.makeText(this, "Pressed_6", Toast.LENGTH_LONG).show()
            }

            R.id.ad_sign_up ->{
                Toast.makeText(this, "Pressed_7", Toast.LENGTH_LONG).show()
            }

            R.id.ad_registration ->{
                Toast.makeText(this, "Pressed_8", Toast.LENGTH_LONG).show()
            }
        }

        rootElement.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

}