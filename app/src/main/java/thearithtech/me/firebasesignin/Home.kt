package thearithtech.me.firebasesignin

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.google.firebase.Firebase
import com.google.firebase.auth.auth

@Composable
fun Home(
    navHostController: NavHostController
) {

    val auth = Firebase.auth

    Column(
        modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.spacedBy(
            space = 16.dp, alignment = Alignment.CenterVertically
        ), horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Welcome ${auth.currentUser?.email}"
        )
        Button(
            onClick = {
                Firebase.auth.signOut()
                navHostController.navigate("/sign-in")
            },
        ) {
            Text(text = "Sign out")
        }

    }

}