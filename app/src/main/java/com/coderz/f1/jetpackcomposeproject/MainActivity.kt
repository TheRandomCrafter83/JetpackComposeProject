package com.coderz.f1.jetpackcomposeproject

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.coderz.f1.jetpackcomposeproject.ui.theme.JetpackComposeProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeProjectTheme {
                var textToDisplay:String by remember { mutableStateOf("Hello") }
                var selIndex:Int by  remember { mutableStateOf(0) }
                //some times the import part for the remember doesnt work right in android studio. its a known bug

                Scaffold(
                    modifier=Modifier.fillMaxSize(),
                    topBar = {
                        MyTopBar()
                    },
                    content = {
                        Column(modifier=Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
//                            MainContent(textToDisplay,
//                                selIndex,
//                                modifier=Modifier.fillMaxSize(),
//                                onHomeClick = {
//                                    textToDisplay="Home"
//                                    selIndex=0
//                                },
//                                onSettingsClick = {
//                                    textToDisplay="Settings"
//                                    selIndex=1
//                                },
//                                onContactClick = {
//                                    textToDisplay="Contact"
//                                    selIndex=2
//
//                                }
//                                )
                            MainContent2()
                        }

                    }
                )
            }
        }
    }
}

