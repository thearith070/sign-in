package thearithtech.me.firebasesignin

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.firebase.Firebase
import com.google.firebase.auth.auth

@Composable
fun AppNavHost() {

    val auth = Firebase.auth

    val navHostController = rememberNavController()

    NavHost(
        navController = navHostController,
        startDestination = if (auth.currentUser == null) "/sign-in" else "/home"
    ) {
        composable("/sign-in") {
            SignIn(navHostController)
        }

        composable("/sign-up") {
            SignUp(navHostController)
        }

        composable("/home") {
            Home(navHostController)
        }
    }

}