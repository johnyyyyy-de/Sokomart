package com.alusa.sokomart.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alusa.sokomart.data.UserDatabase
import com.alusa.sokomart.repository.UserRepository
import com.alusa.sokomart.ui.screens.about.AboutScreen
import com.alusa.sokomart.ui.screens.auth.LoginScreen
import com.alusa.sokomart.ui.screens.auth.RegisterScreen
import com.alusa.sokomart.ui.screens.contact.ContactScreen
import com.alusa.sokomart.ui.screens.dashboard.DashBoardScreen
import com.alusa.sokomart.ui.screens.home.HomeScreen
import com.alusa.sokomart.ui.screens.intent.IntentScreen
import com.alusa.sokomart.ui.screens.item.ItemScreen
import com.alusa.sokomart.ui.screens.more.MoreScreen
import com.alusa.sokomart.ui.screens.raw.AssignmentScreen
import com.alusa.sokomart.ui.screens.service.ServiceScreen
import com.alusa.sokomart.ui.screens.splash.SplashScreen
import com.alusa.sokomart.ui.screens.start.StartScreen
import com.alusa.sokomart.viewmodel.AuthViewModel

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {

    val context = LocalContext.current

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
        composable(ROUT_DASHBOARD) {
            DashBoardScreen(navController)
        }
        composable(ROUT_CONTACT) {
            ContactScreen(navController)
        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUT_ASSIGNMENT) {
            AssignmentScreen(navController)
        }
        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUT_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUT_LOGIN) {
                    popUpTo(ROUT_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUT_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUT_LOGIN) { inclusive = true }
                }
            }
        }


    }
}

