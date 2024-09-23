package com.xsims.uicomposekata

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.xsims.uicomposekata.ui.theme.UIComposeKataTheme


@Composable
private fun MyScreen() {
    Column(modifier = Modifier.padding(16.dp)) {
        MyCard {
            Column(
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Box(
                    contentAlignment = Alignment.TopEnd,
                    propagateMinConstraints = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                ) {
                    CoverImage()
                    Box(
                        contentAlignment = Alignment.TopEnd,
                        modifier = Modifier.padding(8.dp),
                    ) {
                        FavoriteIcon()
                    }
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(start = 16.dp, top = 16.dp, end = 16.dp)
                        .fillMaxWidth(),
                ) {
                    Title()
                    Row {
                        RatingText()
                        StarIcon()
                    }
                }

                Column(
                    modifier = Modifier
                        .padding(start = 16.dp, top =  8.dp, end = 16.dp),
                ) {
                    Description()
                    Row(
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        SeeMoreButton()
                        AddToFavoriteButton()
                    }
                }
            }
        }
        FinalCardExample()
    }
}


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { UIComposeKataTheme { MyScreen() } }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun MyPreview() { UIComposeKataTheme { MyScreen() } }
