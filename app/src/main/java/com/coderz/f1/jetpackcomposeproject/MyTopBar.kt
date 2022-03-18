package com.coderz.f1.jetpackcomposeproject

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

@Composable
fun MyTopBar(){
    TopAppBar(
        modifier = Modifier.fillMaxWidth(),
        backgroundColor =
            if(isSystemInDarkTheme()){
                MaterialTheme.colors.primarySurface
            } else {
                MaterialTheme.colors.primary
            }
    ) {
        Icon(painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = ""
        )
        Text(text = stringResource(id = R.string.app_name),
            color =
                if(isSystemInDarkTheme()){
                    MaterialTheme.colors.onSurface
                } else {
                    MaterialTheme.colors.onPrimary
                }

        )
    }
}

//I actually quite like the way that view state is done in jetpack
//I am trying to think of something else to try
//I could put those icons in a bottom bar, but not sure if i would remember exactly how