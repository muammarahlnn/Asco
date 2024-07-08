package com.muammarahlnn.asco.core.ui.component

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowDropDown
import androidx.compose.material.icons.rounded.ArrowDropUp
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.DarkBlue
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.Gray
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite

/**
 * @Author Muammar Ahlan Abimanyu
 * @File GrayOutlinedDropdownMenu, 22/06/2024 23.20
 */
@Composable
fun GrayOutlinedDropdownMenu(
    value: String,
    isExpanded: Boolean,
    menuItems: List<String>,
    onItemClick: (Int, String) -> Unit,
    onExpandedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
) {
    BaseOutlinedDropdownMenu(
        value = value,
        isExpanded = isExpanded,
        menuItems = menuItems,
        borderColor = DarkBlue,
        borderRadius = 16.dp,
        textColor = Gray,
        onItemClick = onItemClick,
        onExpandedChange = onExpandedChange,
        modifier = modifier,
    )
}

@Composable
fun PurpleOutlinedDropdownMenu(
    value: String,
    isExpanded: Boolean,
    menuItems: List<String>,
    onItemClick: (Int, String) -> Unit,
    onExpandedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
) {
    BaseOutlinedDropdownMenu(
        value = value,
        isExpanded = isExpanded,
        menuItems = menuItems,
        borderColor = DarkerPurple,
        borderRadius = 8.dp,
        textColor = DarkerPurple,
        onItemClick = onItemClick,
        onExpandedChange = onExpandedChange,
        modifier = modifier,
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun BaseOutlinedDropdownMenu(
    value: String,
    isExpanded: Boolean,
    menuItems: List<String>,
    borderColor: Color,
    borderRadius: Dp,
    textColor: Color,
    onItemClick: (Int, String) -> Unit,
    onExpandedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
) {
    ExposedDropdownMenuBox(
        expanded = isExpanded,
        onExpandedChange = onExpandedChange,
        modifier = modifier,
    ) {
        OutlinedTextField(
            value = value,
            onValueChange = {},
            trailingIcon = {
                AnimatedContent(
                    targetState = isExpanded,
                    label = "Dropdown icon animation"
                ) {
                    if (!it) {
                        Icon(
                            imageVector = Icons.Rounded.ArrowDropDown,
                            contentDescription = null,
                            tint = borderColor,
                        )
                    } else {
                        Icon(
                            imageVector = Icons.Rounded.ArrowDropUp,
                            contentDescription = null,
                            tint = borderColor,
                        )
                    }
                }
            },
            readOnly = true,
            maxLines = 1,
            shape = RoundedCornerShape(borderRadius),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = borderColor,
                unfocusedBorderColor = borderColor,
                focusedTextColor = textColor,
                unfocusedTextColor = textColor,
                focusedContainerColor = PureWhite,
                unfocusedContainerColor = PureWhite,
            ),
            modifier = modifier.menuAnchor()
        )

        ExposedDropdownMenu(
            expanded = isExpanded,
            onDismissRequest = { onExpandedChange(false) },
        ) {
            menuItems.forEachIndexed { index, menu ->
                DropdownMenuItem(
                    text = {
                        Text(
                            text = menu,
                            style  = MaterialTheme.typography.bodySmall,
                            color = Gray,
                        )
                    },
                    onClick = {
                        onItemClick(index, menu)
                    },
                )
            }
        }
    }
}

@Preview
@Composable
private fun GrayOutlinedDropdownMenuPreview() {
    AscoTheme {
        GrayOutlinedDropdownMenu(
            value = "A",
            isExpanded = true,
            menuItems = listOf("A", "B", "C", "D", "E"),
            onItemClick = {_, _ -> },
            onExpandedChange = {},
        )
    }
}