package dsm.hs.justgo.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import dsm.hs.justgo.R
import dsm.hs.justgo.ui.theme.Label
import dsm.hs.justgo.ui.theme.Main
import dsm.hs.justgo.ui.theme.MainDarken
import dsm.hs.justgo.ui.theme.MainLighten
import dsm.hs.justgo.ui.theme.OnSurface
import dsm.hs.justgo.ui.theme.Surface
import dsm.hs.justgo.ui.theme.Title

@Composable
fun Leveling(
    modifier: Modifier = Modifier,
    achievedCount: Int,
    totalCount: Int,
) {
    val shape = RoundedCornerShape(10.dp)
    Column(
        modifier = modifier
            .background(
                color = Surface,

                )
            .border(
                width = 1.dp,
                shape = shape,
                color = Main,
            )
            .padding(16.dp),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                text = "JustGO와 함께\n무기력함에서 벗어나보세요",
                style = Title,
                color = OnSurface,
            )
            Image(
                modifier = Modifier.size(36.dp),
                painter = painterResource(id = R.drawable.ic_dambi_civilization),
                contentDescription = null,
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Text(
                text = "도전과제",
                style = Label,
                color = OnSurface,
            )
            Text(
                text = "$achievedCount/$totalCount",
                style = Label,
                color = Main,
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            for (index in 1..totalCount) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(8.dp)
                        .background(
                            color = if (index <= achievedCount) {
                                MainDarken
                            } else {
                                MainLighten
                            },
                            shape = RoundedCornerShape(10.dp),
                        ),
                )
            }
        }
    }
}
