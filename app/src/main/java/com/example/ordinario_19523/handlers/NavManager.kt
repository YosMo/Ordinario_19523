package com.example.ordinario_19523.handlers

import android.widget.ListView
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.ordinario_19523.views.AdivinaEdadView
import com.example.ordinario_19523.views.GatosView
import com.example.ordinario_19523.views.ListView


@ExperimentalMaterial3Api
@Composable
fun NavManager() {
    var navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "ListView") {

        composable(route = "ListView") {
            ListView(navController)
        }

        composable(route = "AdivinaEdadView") {
            AdivinaEdadView(navController)
        }

        composable(route = "GatosView") {
            GatosView()
        }


        }
    }
