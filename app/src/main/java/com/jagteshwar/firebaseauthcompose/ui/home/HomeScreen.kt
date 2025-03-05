package com.jagteshwar.firebaseauthcompose.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.jagteshwar.firebaseauthcompose.AuthState
import com.jagteshwar.firebaseauthcompose.AuthViewModel

@Composable
fun HomeScreen(modifier: Modifier, navController: NavController, viewModel: AuthViewModel) {
    val authState = viewModel.authState.observeAsState()

    LaunchedEffect(key1 = authState.value) {
        when(authState.value){
            is AuthState.Unauthenticated -> navController.navigate("login")
            else -> Unit
        }
    }

    Column(modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Home Page", fontSize = 32.sp)
        Button(onClick = {
            viewModel.signOut()
        }) {
            Text(text = "SignOut")
        }
    }

}