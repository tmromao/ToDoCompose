package com.example.todocompose.data.models

import android.graphics.Color
import com.example.todocompose.ui.theme.highPriorityColor
import com.example.todocompose.ui.theme.lowPriorityColor
import com.example.todocompose.ui.theme.mediumPriorityColor
import com.example.todocompose.ui.theme.nonePriorityColor

enum class Priority(
    val color : Color
) {
    HIGH(highPriorityColor),
    MEDIUM(mediumPriorityColor),
    LOW(lowPriorityColor),
    NONE(nonePriorityColor)
}