package com.muammarahlnn.asco.feature.adminpracticumcreate.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.feature.adminpracticumcreate.R

/**
 * @Author Muammar Ahlan Abimanyu
 * @File FirstScreen, 20/06/2024 23.03
 */
@Composable
internal fun FirstScreen(
    subjectName: String,
    onSubjectNameChange: (String) -> Unit,
    onShowBadgeClick: () -> Unit,
    onCreateBadgeClick: () -> Unit,
    onDeleteBadgeClick: () -> Unit,
    onShowLectureContractClick: () -> Unit,
    onUploadLectureContractClick: () -> Unit,
    onDeleteLectureContractClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.padding(16.dp),
    ) {
        Text(
            text = stringResource(id = R.string.subject_name),
            style = MaterialTheme.typography.bodyMedium,
            color = DarkerPurple,
        )
        Spacer(modifier = Modifier.height(4.dp))
        SubjectNameTextField(
            subjectName = subjectName,
            onSubjectNameChange = onSubjectNameChange,
            modifier = Modifier.fillMaxWidth(),
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(id = R.string.badge),
            style = MaterialTheme.typography.bodyMedium,
            color = DarkerPurple,
        )
        Spacer(modifier = Modifier.height(4.dp))
        BadgeRow(
            onShowClick = onShowBadgeClick,
            onCreateClick = onCreateBadgeClick,
            onDeleteClick = onDeleteBadgeClick,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(id = R.string.lecture_contract),
            style = MaterialTheme.typography.bodyMedium,
            color = DarkerPurple,
        )
        Spacer(modifier = Modifier.height(4.dp))
        LectureContractRow(
            onShowClick = onShowLectureContractClick,
            onUploadClick = onUploadLectureContractClick,
            onDeleteClick = onDeleteLectureContractClick,
            modifier = Modifier.fillMaxWidth(),
        )
    }
}

@Preview
@Composable
private fun FirstScreenPreview() {
    AscoTheme {
        FirstScreen(
            subjectName = "",
            onSubjectNameChange = {},
            onShowBadgeClick = {},
            onCreateBadgeClick = {},
            onDeleteBadgeClick = {},
            onShowLectureContractClick = {},
            onUploadLectureContractClick = {},
            onDeleteLectureContractClick = {},
        )
    }
}