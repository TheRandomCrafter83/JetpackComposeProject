package com.coderz.f1.jetpackcomposeproject

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val Colors.ListBackground: Color
    get() {
        return Color(150,150,150)
    }

@Composable
fun MainContent2(){

    var itemsList:ArrayList<User> = ArrayList()
    itemsList.add(User("John Doe", "jdoe@gmail.com"))
    itemsList.add(User("Jane Pepper","jpepper@gmail.com"))
    Box(modifier = Modifier.fillMaxSize().background(MaterialTheme.colors.ListBackground)) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            itemsIndexed(itemsList) { _, item ->
                Card(
                    shape = RoundedCornerShape(4.dp), modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(8.dp)
                    ) {
                        Text(item.name, fontSize = 18.sp)
                        Text(item.email, fontSize = 16.sp)
                    }
                }
            }
        }
    }
}