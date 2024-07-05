package com.muammarahlnn.asco.feature.adminclassmeeting.meetings

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingsContract, 04/07/2024 23.03
 */
internal data class MeetingsState(
    val practicumName: String = "Pemrograman Mobile",
    val searchQuery: String = "",
    val sortBy: SortBy = SortBy.ASCENDING,
)

enum class SortBy {
    ASCENDING,
    DESCENDING;

    fun toggle(): SortBy = when (this) {
        ASCENDING -> DESCENDING
        DESCENDING -> ASCENDING
    }
}

internal data class MeetingsActions(
    val onBackClick: () -> Unit = {},
    val onSearchQueryChange: (String) -> Unit = {},
    val onSortClick: () -> Unit = {},
    val onMeetingClick: () -> Unit = {},
    val onDeleteMeetingClick: () -> Unit = {},
    val onFabAddClick: () -> Unit = {},
)