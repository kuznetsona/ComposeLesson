package com.example.composelesson

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ItemRow(item: ItemRowModel) {
    var isExpanded by remember {
        mutableStateOf(false)
    }
    Row(
        modifier = Modifier
            .padding(3.dp)
            .background(Color.White)
            .fillMaxWidth()
        ) {
            Image(painter = painterResource(id = item.imageId),
            contentDescription = "image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(3.dp)
                .size(60.dp)
                .clip(CircleShape))

            Column( modifier = Modifier
                .padding(10.dp)) {
                Text(text = item.title )
                Text(modifier = Modifier.clickable {
                    isExpanded = !isExpanded
                },
                   maxLines = if(isExpanded) Int.MAX_VALUE
                    else 1,
                    text = item.content)
            }



        
    }
    
    
    
}