package com.muammarahlnn.asco.feature.adminusercreate.component

import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.Black
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite

/**
 * @Author Muammar Ahlan Abimanyu
 * @File BatchDropdownMenu, 18/06/2024 19.21
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun BatchDropdownMenu(
    batch: String,
    onBatchChange: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    var isExpanded by rememberSaveable { mutableStateOf(false) }
    ExposedDropdownMenuBox(
        expanded = isExpanded,
        onExpandedChange = { isExpanded = it },
        modifier = modifier,
    ) {
        OutlinedTextField(
            value = batch,
            onValueChange = onBatchChange,
            trailingIcon = {
                Icon(
                    imageVector = if (!isExpanded) {
                        Icons.Rounded.ArrowDropDown
                    } else {
                        Icons.Rounded.ArrowDropUp
                    },
                    contentDescription = null,
                    tint = DarkerPurple,
                )
            },
            readOnly = true,
            shape = RoundedCornerShape(8.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = DarkerPurple,
                unfocusedBorderColor = DarkerPurple,
                focusedTextColor = Black,
                unfocusedTextColor = Black,
                focusedContainerColor = PureWhite,
                unfocusedContainerColor = PureWhite,
            ),
            modifier = Modifier
                .fillMaxWidth()
                .menuAnchor(),
        )

        ExposedDropdownMenu(
            expanded = isExpanded,
            onDismissRequest = { isExpanded = false },
            modifier = Modifier.fillMaxWidth(),
        ) {
            batches.forEach { batch ->
                DropdownMenuItem(
                    text = {
                        Text(
                            text = batch.toString(),
                            style = MaterialTheme.typography.bodySmall,
                            color = Black,
                        )
                    },
                    onClick = {
                        onBatchChange(batch.toString())
                        isExpanded = false
                    },
                    modifier = Modifier.fillMaxWidth(),
                )
            }
        }
    }
}

private val batches = 2015..2023