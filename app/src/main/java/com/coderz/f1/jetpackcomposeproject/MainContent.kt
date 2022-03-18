package com.coderz.f1.jetpackcomposeproject

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainContent(displayText:String, selectedItem:Int, modifier: Modifier=Modifier, onHomeClick: () -> Unit, onSettingsClick: ()->Unit, onContactClick:()->Unit ){

    Column(modifier=modifier, horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(text = displayText)
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            IconButton(onClick = {
                onHomeClick()
            }
            ) {
                Icon(
                    Icons.Filled.Home,
                    contentDescription = "",
                    tint =
                    if(selectedItem==0){
                        MaterialTheme.colors.primary
                    } else {
                        MaterialTheme.colors.onBackground
                    }
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            IconButton(onClick = {
                onSettingsClick()
            }) {
                Icon(
                    Icons.Filled.Settings,
                    contentDescription = "",
                    tint =
                    if(selectedItem==1){
                        MaterialTheme.colors.primary
                    } else {
                        MaterialTheme.colors.onBackground
                    }
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            IconButton(onClick = {
                onContactClick()
            }) {
                Icon(
                    Icons.Filled.Person,
                    contentDescription = "",
                    tint =
                    if(selectedItem==2){
                        MaterialTheme.colors.primary
                    } else {
                        MaterialTheme.colors.onBackground
                    }
                )
            }
        }
    }

}