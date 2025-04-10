package com.alusa.sokomart.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.alusa.sokomart.R

@Composable
fun HomeScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize()
            .paint(painter = painterResource(R.drawable.img_9), contentScale = ContentScale.FillBounds)

    ) {

        Text(
            text = "Soko Mart",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.ExtraBold
        )



        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = "home"

        )




        Text(
            text = "An Ecommerce App",
            fontSize = 15.sp,
            fontStyle = FontStyle.Italic
        )


        Text(
            text = "Traditional Sourcing Brought Online. Find Quality Products & Contact Verified Suppliers!",
            fontSize = 15.sp

        )



        Button(
            onClick = {},
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta)

        ) {
            Text(text = "see more")
        }






    }

    }



@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(navController= rememberNavController())
}