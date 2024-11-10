package com.example.madk9.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.madk9.R

// Define the OpenSans font family
private val OpenSans = FontFamily(
    Font(R.font.opensans_regular, FontWeight.Normal),
    Font(R.font.opensans_semibold, FontWeight.SemiBold),
    Font(R.font.opensans_bold, FontWeight.Bold)
)

// Define data classes for the theme components
data class MyColorScheme(
    val background: Color,
    val onBackground: Color,
    val primary: Color,
    val onPrimary: Color,
    val secondary: Color,
    val onSecondary: Color
)

data class MyTypography(
    val titleLarge: TextStyle,
    val titleNormal: TextStyle,
    val body: TextStyle,
    val labelLarge: TextStyle,
    val labelNormal: TextStyle,
    val labelSmall: TextStyle
)

data class MyShape(
    val container: RoundedCornerShape,
    val button: RoundedCornerShape
)

data class MySize(
    val large: Dp,
    val medium: Dp,
    val normal: Dp,
    val small: Dp
)

// Define the dark and light color schemes
private val dark = MyColorScheme(
    background = Color.Black,
    onBackground = Color(0xFFD1C4E9), // Purple80
    primary = Color(0xFFB0BEC5), // PurpleGrey40
    onPrimary = Color(0xFFECEFF1), // PurpleGrey80
    secondary = Color(0xFFF48FB1), // Pink40
    onSecondary = Color(0xFFF8BBD0) // Pink80
)

private val light = MyColorScheme(
    background = Color.White,
    onBackground = Color(0xFF9575CD), // Purple40
    primary = Color(0xFFECEFF1), // PurpleGrey80
    onPrimary = Color(0xFFB0BEC5), // PurpleGrey40
    secondary = Color(0xFFF8BBD0), // Pink80
    onSecondary = Color(0xFFF48FB1) // Pink40
)

// Define the typography styles
private val typography = MyTypography(
    titleLarge = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    titleNormal = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    body = TextStyle(
        fontFamily = OpenSans,
        fontSize = 16.sp
    ),
    labelLarge = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    ),
    labelNormal = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp
    ),
    labelSmall = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp
    ),
)

// Define the shapes
private val shape = MyShape(
    container = RoundedCornerShape(12.dp),
    button = RoundedCornerShape(50)
)

// Define the sizes
private val size = MySize(
    large = 24.dp,
    medium = 16.dp,
    normal = 12.dp,
    small = 8.dp
)

// Define CompositionLocals to provide the theme components
val LocalMyColorScheme = staticCompositionLocalOf<MyColorScheme> {
    error("No MyColorScheme provided")
}

val LocalMyTypography = staticCompositionLocalOf<MyTypography> {
    error("No MyTypography provided")
}

val LocalMyShape = staticCompositionLocalOf<MyShape> {
    error("No MyShape provided")
}

val LocalMySize = staticCompositionLocalOf<MySize> {
    error("No MySize provided")
}

// Create the MyTheme composable function
@Composable
fun MyTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) dark else light

    CompositionLocalProvider(
        LocalMyColorScheme provides colorScheme,
        LocalMyTypography provides typography,
        LocalMyShape provides shape,
        LocalMySize provides size
    ) {
        content()
    }
}

// Provide easy access to the current theme values
object MyTheme {
    val colors: MyColorScheme
        @Composable
        get() = LocalMyColorScheme.current

    val typography: MyTypography
        @Composable
        get() = LocalMyTypography.current

    val shapes: MyShape
        @Composable
        get() = LocalMyShape.current

    val sizes: MySize
        @Composable
        get() = LocalMySize.current
}
