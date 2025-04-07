package com.alusa.sokomart.ui.screens.intent

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.alusa.sokomart.navigation.ROUT_ITEM
import com.alusa.sokomart.ui.theme.Newpink
import com.alusa.sokomart.ui.theme.Newwhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IntentScreen(navController: NavController){
    


    Column(modifier = Modifier.fillMaxSize()) {
        //TopAppBar
        TopAppBar(
            title = { Text(text = "IN") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Newpink,
                titleContentColor = Newwhite,
                navigationIconContentColor = Newwhite
            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                }
            }
        )

    }
    //End Of TopAPPBAR
    Spacer(modifier = Modifier.height(20.dp))


    Button(
        onClick = {
            navController.navigate(ROUT_ITEM)
        },
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(Color.Magenta),

        )  {
        Text(text = "Get Started")
    }
    Spacer(modifier = Modifier.height(20.dp))


    Button(
        onClick = {
            navController.navigate(ROUT_ITEM)
        },
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(Color.Magenta),

        )  {
        Text(text = "Get Started")
    }
    Spacer(modifier = Modifier.height(20.dp))


    Button(
        onClick = {
            navController.navigate(ROUT_ITEM)
        },
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(Color.Magenta),

        )  {
        Text(text = "Get Started")
    }
    Spacer(modifier = Modifier.height(20.dp))


    Button(
        onClick = {
            navController.navigate(ROUT_ITEM)
        },
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(Color.Magenta),

        )  {
        Text(text = "Get Started")
    }


}

@Preview(showBackground = true)
@Composable
fun IntentScreenPreview(){
    IntentScreen(navController= rememberNavController())
}