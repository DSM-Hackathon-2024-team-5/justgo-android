package dsm.hs.justgo.ui.my

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
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
fun MyScreen(modifier: Modifier = Modifier) {
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
                    Text("내 정보")
                },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Filled.KeyboardArrowLeft,
                            contentDescription = "뒤로가기"
                        )
                    }
                }
            )
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(space = 16.dp),
        ) {
            Text(
                modifier = Modifier
                    .background(color = Color.White)
                    .fillMaxWidth()
                    .padding(vertical = 32.dp, horizontal = 16.dp),
                text = "준자보이님",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 28.sp,
                ),
            )
            Column(
                modifier = Modifier
                    .background(color = Color.Green)
                    .fillMaxWidth()
                    .height(192.dp)
                    .padding(16.dp),
            ) {
                Text(text = "레벨링")
            }
            Column(
                modifier = Modifier
                    .background(color = Color.Yellow)
                    .fillMaxWidth()
                    .height(192.dp)
                    .padding(16.dp),
            ) {
                Text(text = "도전과제")
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    text = "여행 기록",
                    fontSize = 16.sp,
                )
                Spacer(modifier = Modifier.height(8.dp))
                TravelRecords(
                    number = "1",
                    location = "보문산 보문대",
                    date = "2006.05.08",
                    distance = "24.7km"
                )
                TravelRecords(
                    number = "2",
                    location = "동해에서 솟은 태양",
                    date = "1990.01.02",
                    distance = "315.7km"
                )
                TravelRecords(
                    number = "3",
                    location = "계룡을 넘어",
                    date = "1990.01.02",
                    distance = "315.7km"
                )
            }
        }
    }
}

@Composable
private fun TravelRecords(
    number: String,
    location: String,
    date: String,
    distance: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = number,
            fontSize = 45.sp
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
private fun MyScreenPreview() {
    MyScreen()
}