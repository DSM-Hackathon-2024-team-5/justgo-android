package dsm.hs.justgo.ui.achievement

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dsm.hs.justgo.ui.Leveling

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AchievementScreen(
    modifier: Modifier = Modifier,
) {
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
                    Text("도전과제")
                },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Filled.KeyboardArrowLeft,
                            contentDescription = "뒤로가기"
                        )
                    }
                },
            )
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(all = 16.dp),
            ) {
                Leveling(
                    modifier = Modifier.fillMaxWidth(),
                    achievedCount = 4,
                    totalCount = 5,
                )
            }
            ChallengeItemGrid()
        }
    }
}

@Composable
private fun ChallengeItemGrid() {
    val scrollState = rememberLazyGridState()
    val items = listOf(
        ChallengeItemModel(titleDescription = "asdf", mission = "asdf"),
        ChallengeItemModel(titleDescription = "asdf", mission = "asdf"),
        ChallengeItemModel(titleDescription = "asdf", mission = "asdf"),
        ChallengeItemModel(titleDescription = "asdf", mission = "asdf"),
        ChallengeItemModel(titleDescription = "asdf", mission = "asdf"),
        ChallengeItemModel(titleDescription = "asdf", mission = "asdf"),
        ChallengeItemModel(titleDescription = "asdf", mission = "asdf"),
        ChallengeItemModel(titleDescription = "asdf", mission = "asdf"),
    )
    LazyVerticalGrid(
        state = scrollState,
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.padding(16.dp),
        userScrollEnabled = true,
    ) {
        items(items) { item ->
            ChallengeItem(
                modifier = Modifier.fillMaxWidth(),
                titleDescription = item.titleDescription,
                mission = item.mission,
            )
        }
    }
}

class ChallengeItemModel(
    val titleDescription: String,
    val mission: String,
)

@Composable
private fun ChallengeItem(
    modifier: Modifier = Modifier,
    titleDescription: String,
    mission: String,
) {
    Column(
        modifier = modifier
            .background(
                color = Color.White,
                shape = RoundedCornerShape(10.dp),
            )
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(
                    color = Color.LightGray,
                    shape = CircleShape,
                )
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = titleDescription,
                textAlign = TextAlign.Center,
            )
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = mission,
                textAlign = TextAlign.Center,
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun AchievementPreview() {
    AchievementScreen()
}