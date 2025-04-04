package com.alusa.sokomart.ui.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.alusa.sokomart.R
import com.alusa.sokomart.navigation.ROUT_ITEM
import com.alusa.sokomart.ui.theme.Newpink

@Composable
fun StartScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = "Welcome")


        Image(
            painterResource(R.drawable.img),
            "start",
            Modifier.size(300.dp).clip(shape = CircleShape),
            contentScale = ContentScale.Crop

        )

        Text(
            text = "find your order",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Newpink,

        )
        Spacer(modifier = Modifier.height(20.dp))


        Text(
            text = "Find over 100+ of the best free grocery images. Free for commercial use ✓ No attribution required ✓ Copyright-free.",
            textAlign = TextAlign.Center
        )

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


}

@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){
    StartScreen(navController= rememberNavController())
}