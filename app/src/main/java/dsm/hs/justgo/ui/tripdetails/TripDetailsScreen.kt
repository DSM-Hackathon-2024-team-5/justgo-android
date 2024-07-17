package dsm.hs.justgo.ui.tripdetails

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TripDetailsScreen(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier,
        containerColor = Color(0xFFF7F7F7),
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.White,
                    titleContentColor = Color.Black,
                    navigationIconContentColor = Color.Black,
                ),
                title = {
                    Text(text = "여정 보관함")
                },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Filled.KeyboardArrowLeft,
                            contentDescription = "뒤로가기"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.FavoriteBorder,
                            contentDescription = "좋아요"
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(space = 16.dp)
        ) {
            Text(
                modifier = Modifier
                    .background(
                        color = Color.White,
                    )
                    .padding(
                        start = 16.dp,
                        top = 32.dp,
                        bottom = 32.dp,
                    )
                    .fillMaxWidth(),
                text = "8개 보관중!",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 28.sp,
                ),
            )
            Column(
                modifier = Modifier
                    .background(Color.White)
            ) {
                FavoriteTravelRecords(
                    location = "dasd",
                    date = "asdf",
                    distance = "asdf"
                )
                FavoriteTravelRecords(
                    location = "dasd",
                    date = "asdf",
                    distance = "asdf"
                )
                FavoriteTravelRecords(
                    location = "dasd",
                    date = "asdf",
                    distance = "asdf"
                )
                FavoriteTravelRecords(
                    location = "dasd",
                    date = "asdf",
                    distance = "asdf"
                )
                FavoriteTravelRecords(
                    location = "dasd",
                    date = "asdf",
                    distance = "asdf"
                )
            }
        }
    }
}

@Composable
private fun FavoriteTravelRecords(
    location: String,
    date: String,
    distance: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            imageVector = Icons.Filled.Favorite,
            contentDescription = "좋아요"
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = location,
                fontSize = 16.sp,
            )
            Text(
                text = date,
                fontSize = 14.sp,
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = distance,
                fontSize = 28.sp,
            )
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.KeyboardArrowRight,
                    contentDescription = "다음으로 가기"
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun TripDetailsPreview() {
    TripDetailsScreen()
}