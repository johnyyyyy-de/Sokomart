package com.alusa.sokomart.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alusa.sokomart.ui.screens.about.AboutScreen
import com.alusa.sokomart.ui.screens.home.HomeScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_START
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }

        composable(ROUT_MORE) {
            MoreScreen(navController)
        }


    }
}

@Composable
fun MoreScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}

@Composable
fun IntentScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}

@Composable
fun StartScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}

@Composable
fun ItemScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}