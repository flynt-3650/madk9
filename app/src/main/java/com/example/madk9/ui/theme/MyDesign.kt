package com.example.madk9.ui.theme//package com.example.madk9.ui.theme;
//
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.runtime.staticCompositionLocalOf
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.Shape
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.unit.Dp
//import androidx.compose.ui.unit.dp
//
//data class MyColorScheme (
//    val background: Color,
//    val onBackground: Color,
//    val primary: Color,
//    val onPrimary: Color,
//    val secondary: Color,
//    val onSecondary: Color
//)
//
//data class MyTypography(
//    val titleLarge: TextStyle,
//    val titleNormal: TextStyle,
//    val body: TextStyle,
//    val labelLarge: TextStyle,
//    val labelNormal: TextStyle,
//    val labelSmall: TextStyle
//)
//
//data class MyShape(
//    val container: Shape,
//    val button: Shape
//)
//
//data class MySize(
//    val large: Dp,
//    val medium: Dp,
//    val normal: Dp,
//    val small: Dp
//)
//
//val AppColorScheme = staticCompositionLocalOf {
//    MyColorScheme(
//        background = Color.Unspecified,
//        onBackground = Color.Unspecified,
//        primary = Color.Unspecified,
//        onPrimary = Color.Unspecified,
//        secondary = Color.Unspecified,
//        onSecondary = Color.Unspecified,
//    )
//}
//
//val AppTypography = staticCompositionLocalOf {
//    MyTypography(
//        titleLarge = TextStyle.Default,
//        titleNormal = TextStyle.Default,
//        body = TextStyle.Default,
//        labelLarge = TextStyle.Default,
//        labelNormal = TextStyle.Default,
//        labelSmall = TextStyle.Default
//    )
//}
//
//val AppShape = staticCompositionLocalOf {
//    MyShape(
//        container = RoundedCornerShape(8.dp),
//        button = RoundedCornerShape(16.dp)
//    )
//}
//
//val AppSize = staticCompositionLocalOf {
//    MySize(
//        large = 32.dp,
//        medium = 24.dp,
//        normal = 16.dp,
//        small = 8.dp
//    )
//}