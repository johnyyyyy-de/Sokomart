package com.alusa.sokomart.ui.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.alusa.sokomart.R
import com.alusa.sokomart.navigation.ROUT_DASHBOARD
import com.alusa.sokomart.navigation.ROUT_LOGIN
import com.alusa.sokomart.ui.theme.Newpink
import com.alusa.sokomart.ui.theme.Newwhite
import com.alusa.sokomart.ui.theme.Newyellow
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){
    //Navigation
    val coroutine = rememberCoroutineScope()
     coroutine.launch {
         delay(1000)
         navController.navigate(ROUT_LOGIN)

         //end of Navigation

    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Newpink),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Image(
            painter = painterResource(R.drawable.img_8),
            contentDescription = "",
            modifier = Modifier.size(300.dp),


        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Sokomart",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            color = Newwhite,


        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "best suppliers",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            color = Newwhite,


            )


    }


}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){
    SplashScreen(navController= rememberNavController())
}