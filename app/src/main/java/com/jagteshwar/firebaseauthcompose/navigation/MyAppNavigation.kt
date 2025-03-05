package com.jagteshwar.firebaseauthcompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jagteshwar.firebaseauthcompose.AuthViewModel
import com.jagteshwar.firebaseauthcompose.ui.auth.LoginScreen
import com.jagteshwar.firebaseauthcompose.ui.auth.SignupScreen
import com.jagteshwar.firebaseauthcompose.ui.home.HomeScreen

@Composable
fun MyAppNavigation(modifier: Modifier = Modifier, authViewModel: AuthViewModel) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login"){
            LoginScreen(modifier = modifier, navController = navController, viewModel = authViewModel)
        }
        composable("signup"){
            SignupScreen(modifier = modifier, navController = navController, viewModel = authViewModel)
        }
        composable(route = "home"){
            HomeScreen(modifier = modifier, navController = navController, viewModel = authViewModel)
        }
    }
}