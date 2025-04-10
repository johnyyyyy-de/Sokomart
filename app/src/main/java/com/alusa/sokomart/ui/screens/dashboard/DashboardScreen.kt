package com.alusa.sokomart.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MovableContentState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.alusa.sokomart.R
import com.alusa.sokomart.navigation.ROUT_ABOUT
import com.alusa.sokomart.navigation.ROUT_CONTACT
import com.alusa.sokomart.navigation.ROUT_HOME
import com.alusa.sokomart.navigation.ROUT_INTENT
import com.alusa.sokomart.navigation.ROUT_ITEM

@Composable
fun DashBoardScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()) {
        //Card
        Card(
            modifier = Modifier.fillMaxWidth().height(300.dp),
            shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
            colors = CardDefaults.cardColors(Color.Magenta)
        ) {

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Image(
                    painter = painterResource(R.drawable.img),
                    contentDescription = "home",
                    modifier = Modifier.size(150.dp)

                )
                Text(
                    text = "sokomart",


                    )
            }


        }
        //end of Card

        Spacer(modifier = Modifier.height(40.dp))
        //Row
        Row(modifier = Modifier.padding(start = 20.dp)) {

            //card
            Card(
                modifier = Modifier.width(150.dp).height(180.dp).clickable{

                    navController.navigate(ROUT_HOME)
                },
                elevation = CardDefaults.elevatedCardElevation()
            ) {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center


                ) {
                    Image(
                        painter = painterResource(R.drawable.img_5),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp),
                        contentScale = ContentScale.FillWidth

                    )

                    Text(text ="Home" )
                }
            }
            Spacer(modifier = Modifier.width(40.dp))
            //card
            Card(
                modifier = Modifier.width(150.dp).height(180.dp).clickable{

                    navController.navigate(ROUT_ABOUT)
                },
                elevation = CardDefaults.elevatedCardElevation()
            ) {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center


                ) {
                    Image(
                        painter = painterResource(R.drawable.img_6),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp),
                        contentScale = ContentScale.FillWidth

                    )

                    Text(text ="about" )
                }
            }

        }
        //end of row
        Spacer(modifier = Modifier.height(40.dp))
        //Row
        Row(modifier = Modifier.padding(start = 20.dp)) {

            //card
            Card(
                modifier = Modifier.width(150.dp).height(180.dp).clickable{

                    navController.navigate(ROUT_CONTACT)
                },
                elevation = CardDefaults.elevatedCardElevation()
            ) {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center


                ) {
                    Image(
                        painter = painterResource(R.drawable.img_7),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp),
                        contentScale = ContentScale.FillWidth

                    )

                    Text(text ="contact" )
                }
            }
            Spacer(modifier = Modifier.width(40.dp))
            //card
            Card(
                modifier = Modifier.width(150.dp).height(180.dp).clickable{

                    navController.navigate(ROUT_ITEM)
                },
                elevation = CardDefaults.elevatedCardElevation()
            ) {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center


                ) {
                    Image(
                        painter = painterResource(R.drawable.img_8),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp),
                        contentScale = ContentScale.FillWidth

                    )

                    Text(text ="item" )
                }
            }

        }
        //end of row
        Spacer(modifier = Modifier.height(40.dp))

    }



}

@Preview(showBackground = true)
@Composable
fun DashBoardScreenPreview(){
    DashBoardScreen(navController= rememberNavController())
}