package dsm.hs.justgo.ui.home

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import dsm.hs.justgo.R
import dsm.hs.justgo.ui.Leveling
import dsm.hs.justgo.ui.theme.Background
import dsm.hs.justgo.ui.theme.Body
import dsm.hs.justgo.ui.theme.Headline
import dsm.hs.justgo.ui.theme.Label
import dsm.hs.justgo.ui.theme.Main
import dsm.hs.justgo.ui.theme.MainDarken
import dsm.hs.justgo.ui.theme.MainLighten
import dsm.hs.justgo.ui.theme.OnBackground
import dsm.hs.justgo.ui.theme.OnSurface
import dsm.hs.justgo.ui.theme.Surface
import dsm.hs.justgo.ui.theme.Title

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
) {
    Scaffold(
        containerColor = Background,
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Background,
                    titleContentColor = OnBackground,
                    actionIconContentColor = OnBackground,
                ),
                title = {
                    Icon(
                        painter = painterResource(id = R.drawable.app_logo),
                        tint = Main,
                        contentDescription = null,
                    )
                },
                actions = {
                    IconButton(
                        onClick = { /*TODO*/ },
                    ) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "내 정보",
                        )
                    }
                },
            )
        },
        modifier = modifier,
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            NotificationList(
                modifier = Modifier.fillMaxWidth(),
                notificationItems = listOf(
                    NotificationItem(
                        leadingText = "\uD83D\uDCAF",
                        title = "JustGO 사용 방법",
                        onClick = {

                        },
                    ),
                    NotificationItem(
                        leadingText = "\uD83D\uDCE2",
                        title = "새로운 공지사항",
                        onClick = {

                        },
                    ),
                ),
            )
            Spacer(modifier = Modifier.height(16.dp))
            Divider(
                modifier = Modifier.width(300.dp),
                color = Main,
            )
            Spacer(modifier = Modifier.height(16.dp))
            Leveling(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = 16.dp,
                    ),
                achievedCount = 4,
                totalCount = 5,
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(
                        horizontal = 16.dp,
                    ),
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .clip(
                            shape = RoundedCornerShape(10.dp),
                        ),
                ) {
                    Image(
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(
                                shape = RoundedCornerShape(10.dp),
                            ),
                        painter = painterResource(id = R.drawable.temp_img_map),
                        contentDescription = null,
                    )
                    Column(
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                            .padding(
                                all = 12.dp,
                            ),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Text(
                            text = "무작위로",
                            style = Label,
                        )
                        Text(
                            text = "여행 시작하기",
                            style = Body,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
                Spacer(modifier = Modifier.width(8.dp))
                Column(
                    modifier = Modifier
                        .background(
                            color = Surface,
                            shape = RoundedCornerShape(10.dp),
                        )
                        .weight(1f)
                        .clip(
                            shape = RoundedCornerShape(10.dp),
                        ),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Icon(
                        modifier = Modifier
                            .weight(1f)
                            .size(80.dp),
                        painter = painterResource(id = R.drawable.ic_race),
                        contentDescription = null,
                    )
                    Column(
                        modifier = Modifier.padding(
                            bottom = 12.dp,
                        ),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Text(
                            text = "내 입맛대로",
                            style = Label,
                        )
                        Text(
                            text = "처음부터 시작하기",
                            style = Body,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = modifier
                    .padding(
                        horizontal = 16.dp,
                    )
                    .background(
                        color = Main,
                        shape = RoundedCornerShape(10.dp),
                    )
                    .padding(
                        horizontal = 12.dp,
                        vertical = 4.dp,
                    ),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "\uD83C\uDF24\uFE0F",
                    style = Headline,
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = "조금 흐림 · 26℃",
                    color = Surface,
                    style = Title,
                )
                Spacer(modifier = Modifier.weight(1f))
                IconButton(
                    onClick = { /*TODO*/ },
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowRight,
                        tint = Surface,
                        contentDescription = "details",
                    )
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = 16.dp,
                    ),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                Column(
                    modifier = Modifier
                        .background(
                            color = MainDarken,
                            shape = RoundedCornerShape(10.dp),
                        )
                        .weight(1f)
                        .height(120.dp)
                        .padding(8.dp),
                    verticalArrangement = Arrangement.SpaceBetween,
                ) {
                    Text(
                        text = "지난 여정",
                        style = Title,
                        color = Surface,
                    )
                    Icon(
                        modifier = Modifier
                            .align(Alignment.End)
                            .size(32.dp),
                        painter = painterResource(id = R.drawable.ic_walk),
                        tint = Surface,
                        contentDescription = null,
                    )
                }
                Column(
                    modifier = Modifier
                        .background(
                            color = MainDarken,
                            shape = RoundedCornerShape(10.dp),
                        )
                        .weight(1f)
                        .height(120.dp)
                        .padding(8.dp),
                    verticalArrangement = Arrangement.SpaceBetween,
                ) {
                    Text(
                        text = "여정 보관함",
                        style = Title,
                        color = Surface,
                    )
                    Icon(
                        modifier = Modifier
                            .align(Alignment.End)
                            .size(32.dp),
                        painter = painterResource(id = R.drawable.ic_heart),
                        tint = Surface,
                        contentDescription = null,
                    )
                }
            }
        }
    }
}

data class NotificationItem(
    val leadingText: String,
    val title: String,
    val onClick: () -> Unit,
)

@Composable
private fun NotificationList(
    modifier: Modifier = Modifier,
    notificationItems: List<NotificationItem>,
) {
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(notificationItems) { item ->
            Notification(
                modifier = Modifier.padding(horizontal = 16.dp),
                notificationItem = item,
            )
        }
    }
}

@Composable
private fun Notification(
    modifier: Modifier = Modifier,
    notificationItem: NotificationItem,
) {
    val containerShape = RoundedCornerShape(10.dp)
    Row(
        modifier = modifier
            .background(
                color = MainLighten,
                shape = containerShape,
            )
            .padding(
                horizontal = 12.dp,
                vertical = 4.dp,
            ),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = notificationItem.leadingText,
            style = Headline,
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = notificationItem.title,
            color = OnSurface,
            style = Title,
        )
        Spacer(modifier = Modifier.weight(1f))
        IconButton(
            onClick = { /*TODO*/ },
        ) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                tint = OnSurface,
                contentDescription = "details",
            )
        }
    }
}
