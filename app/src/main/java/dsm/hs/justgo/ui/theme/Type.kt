package dsm.hs.justgo.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
)

val Display = TextStyle(
    fontSize = 45.sp,
)

val Headline = TextStyle(
    fontSize = 28.sp,
)

val Title = TextStyle(
    fontSize = 16.sp,
)

val Body = TextStyle(
    fontSize = 14.sp,
)

val Label = TextStyle(
    fontSize = 12.sp,
)
