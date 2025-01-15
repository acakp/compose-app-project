package com.example.app_test

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDefaults.contentColor
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app_test.ui.theme.ApptestTheme

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ApptestTheme {
                MainView()
            }
        }
    }
}

@Composable
fun Greeting(name: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = "How are you $name!?",
            modifier = modifier.padding(16.dp),
            fontFamily = FontFamily.Serif,
            fontSize = 50.sp,
            lineHeight = 50.sp
        )
        Text(
            text = "From $from",
            modifier = modifier.align(Alignment.End)
        )
    }
}


// bred
//@Composable
//fun NavigationBar(
//    modifier: Modifier,
//    containerColor: Color = Color.Red,
//    contentColor: Color = MaterialTheme.colorScheme.contentColorFor(Color.Red),
//    tonalElevation: Dp = NavigationBarDefaults.Elevation,
//    windowInsets: WindowInsets = NavigationBarDefaults.windowInsets,
//    content: Any
//
//){
//    NavigationBarItem(icon = Icons.Filled.Home, label = "Home", selected = true, onClick = {})
//    NavigationBarItem(icon = Icons.Filled.AccountCircle, label = "Account", selected = false, onClick = {})
//}
//
//@Composable
//fun NavigationBarItem(icon: ImageVector, label: String, selected: Any, onClick: () -> Unit) {
//    val num = 1
//}

@Composable
fun BottomAppBar(){
    BottomAppBar(
        actions = {
            IconButton(onClick = { /* do something */ }) {
                Icon(Icons.Filled.Check, contentDescription = "Localized description")
            }
            IconButton(onClick = { /* do something */ }) {
                Icon(
                    Icons.Filled.Edit,
                    contentDescription = "Localized description",
                )
            }
            IconButton(onClick = { /* do something */ }) {
                Icon(
                    Icons.Filled.AccountCircle,
                    contentDescription = "Localized description",
                )
            }
            IconButton(onClick = { /* do something */ }) {
                Icon(
                    Icons.Filled.Home,
                    contentDescription = "Localized description",
                )
            }
        }
    )
}

@Composable
fun MainView(){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            BottomAppBar()
        }
//                    bottomBar = {
//                        BottomAppBar(
//                            containerColor = MaterialTheme.colorScheme.primaryContainer,
//                            contentColor = MaterialTheme.colorScheme.primary
//                        ){
//                            NavigationBar(modifier = Modifier, content = NavigationBarItem(icon = Icons.Filled.Home, label = "Home", selected = true, onClick = {}))
//                        }
//                    }
    ) { innerPadding ->
        Greeting(
            name = "ivan",
            from = "den",
            modifier = Modifier.padding(innerPadding)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ApptestTheme {
        Greeting("Ivan", "Den")
    }
}