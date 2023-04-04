package com.example.todocompose.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val LightGray = Color(0xFFE5E5E5)
val MediumGray = Color(0xFF9E9E9E)
val DarkGray = Color(0xFF424242)

val lowPriorityColor = Color(0xFF00FF00)
val mediumPriorityColor = Color(0xFFFFFF00)
val highPriorityColor = Color(0xFFFF0000)
val nonePriorityColor = Color(0xFF272424)

val Colors.taskItemTextColor : Color
    @Composable
    get() = if (isLight) DarkGray else DarkGray

val Colors.taskItemBackgroundColor : Color
    @Composable
    get() = if (isLight) Color.White else DarkGray

val Colors.fabBackgroundColor : Color
    @Composable
    get() = if (isLight) Teal200 else Purple700

val Colors.topAppBarContentColor: Color
    @Composable
    get() = if (isLight) Color.White else LightGray

val Colors.topAppBarBackgroundColor: Color
    @Composable
    get() = if (isLight) Purple500 else Color.Black