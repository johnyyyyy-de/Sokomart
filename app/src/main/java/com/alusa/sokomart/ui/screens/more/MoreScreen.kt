package com.alusa.sokomart.ui.screens.more

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
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
import androidx.compose.ui.graphics.vector.ImageVector
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
import com.alusa.sokomart.ui.theme.Newpink
import com.alusa.sokomart.ui.theme.Newwhite
import javax.sql.RowSetWriter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize()){
        //TopAppBar
        TopAppBar(
            title = { Text(text = "More items") },
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

    //Searchbar
    var search by remember { mutableStateOf("") }
    OutlinedTextField(
        value = search,
        onValueChange = {search = it},
        modifier = Modifier.fillMaxWidth().padding(start = 20.dp,end = 20.dp),
        leadingIcon = {Icon(imageVector = Icons.Default.Search, contentDescription = "")},
        placeholder = {Text(text = "search more products")}
    )


    //end of SearchBar
    Spacer(modifier = Modifier.height(20.dp))

    //box

    Box(
        modifier = Modifier.fillMaxWidth().height(200.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = "home",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillWidth

        )

    }

    //end of box
    Spacer(modifier = Modifier.height(20.dp))
    Text(text ="popular types of cars",
        fontSize = 20.sp,
        fontWeight = FontWeight.ExtraBold,
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth()

    )
    Spacer(modifier = Modifier.height(20.dp))

    //row
    Row(modifier = Modifier.padding(start = 20.dp)) {  }

    }


@Preview(showBackground = true)
@Composable
fun AboutScreenPreview(){
    AboutScreen(navController= rememberNavController())
}