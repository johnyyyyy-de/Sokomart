package com.alusa.sokomart.ui.screens.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.contentValuesOf
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.alusa.sokomart.R
import com.alusa.sokomart.ui.theme.Newpink
import com.alusa.sokomart.ui.theme.Newwhite
import com.alusa.sokomart.ui.theme.Newyellow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {


        //TopAppBar
        TopAppBar(
            title = { Text(text = "Item") },
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

        val remamberScrollState = null
        Column(modifier = Modifier.verticalScroll(rememberScrollState())){
            Image(
                painter = painterResource(R.drawable.img_4),
                contentDescription = "home",
                modifier = Modifier.fillMaxWidth().height(200.dp),
                contentScale = ContentScale.FillWidth

            )
            Spacer(modifier = Modifier.height(20.dp))

            //Searchbar
            var search by remember { mutableStateOf("") }
            OutlinedTextField(
                value = search,
                onValueChange = {search = it},
                modifier = Modifier.fillMaxWidth().padding(start = 20.dp,end = 20.dp),
                leadingIcon = {Icon(imageVector = Icons.Default.Search, contentDescription = "")},
                placeholder = {Text(text = "search...")}
            )


            //end of SearchBar

            Spacer(modifier = Modifier.height(10.dp))
            //ROw

            Row (modifier = Modifier.padding(start = 20.dp)){
                Image(
                    painter = painterResource(R.drawable.img_4),
                    contentDescription = "home",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth

                )
                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Text(
                        text = "Men's T-shirts",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                    )
                    Text(
                        text = "casual wear",
                        fontSize = 15.sp,
                    )
                    Text(
                        text = "Ksh.1900",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Ksh.1500",
                        fontSize = 15.sp,

                        )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            //ROw

            Row (modifier = Modifier.padding(start = 20.dp)){
                Image(
                    painter = painterResource(R.drawable.img_2),
                    contentDescription = "home",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth

                )
                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Text(
                        text = "Men's T-shirts",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                    )
                    Text(
                        text = "casual wear",
                        fontSize = 15.sp,
                    )
                    Text(
                        text = "Ksh.1900",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Ksh.1500",
                        fontSize = 15.sp,

                        )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            //ROw

            Row (modifier = Modifier.padding(start = 20.dp)){
                Image(
                    painter = painterResource(R.drawable.img_3),
                    contentDescription = "home",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth

                )
                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Text(
                        text = "Men's T-shirts",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                    )
                    Text(
                        text = "casual wear",
                        fontSize = 15.sp,
                    )
                    Text(
                        text = "Ksh.1900",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Ksh.1500",
                        fontSize = 15.sp,

                        )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                    }
                }
            }


            //End of Row
            Spacer(modifier = Modifier.height(10.dp))
            //ROw

            Row (modifier = Modifier.padding(start = 20.dp)){
                Image(
                    painter = painterResource(R.drawable.img_4),
                    contentDescription = "home",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth

                )
                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Text(
                        text = "Men's T-shirts",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                    )
                    Text(
                        text = "casual wear",
                        fontSize = 15.sp,
                    )
                    Text(
                        text = "Ksh.1900",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Ksh.1500",
                        fontSize = 15.sp,

                        )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            //ROw

            Row (modifier = Modifier.padding(start = 20.dp)){
                Image(
                    painter = painterResource(R.drawable.img_2),
                    contentDescription = "home",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth

                )
                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Text(
                        text = "Men's T-shirts",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                    )
                    Text(
                        text = "casual wear",
                        fontSize = 15.sp,
                    )
                    Text(
                        text = "Ksh.1900",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Ksh.1500",
                        fontSize = 15.sp,

                        )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Newyellow)
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            //ROw
        }

    }


}



@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen(navController= rememberNavController())
}