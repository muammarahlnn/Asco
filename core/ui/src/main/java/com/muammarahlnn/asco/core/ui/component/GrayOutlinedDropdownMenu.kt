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
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.DarkBlue
import com.muammarahlnn.asco.core.designsystem.theme.Gray
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite

/**
 * @Author Muammar Ahlan Abimanyu
 * @File GrayOutlinedDropdownMenu, 22/06/2024 23.20
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GrayOutlinedDropdownMenu(
    value: String,
    isExpanded: Boolean,
    menuItems: List<String>,
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
                            tint = DarkBlue,
                        )
                    } else {
                        Icon(
                            imageVector = Icons.Rounded.ArrowDropUp,
                            contentDescription = null,
                            tint = DarkBlue,
                        )
                    }
                }
            },
            readOnly = true,
            maxLines = 1,
            shape = RoundedCornerShape(16.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = DarkBlue,
                unfocusedBorderColor = DarkBlue,
                focusedTextColor = Gray,
                unfocusedTextColor = Gray,
                focusedContainerColor = PureWhite,
                unfocusedContainerColor = PureWhite,
            ),
            modifier = Modifier.menuAnchor()
        )

        ExposedDropdownMenu(
            expanded = isExpanded,
            onDismissRequest = { onExpandedChange(false) }
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
                    }
                )
            }
        }
    }
}