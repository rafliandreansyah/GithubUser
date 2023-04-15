package com.example.githubuser.data.source.remote.entity


import com.google.gson.annotations.SerializedName

data class SearchUserResponse(
    @SerializedName("incomplete_results")
    val incompleteResults: Boolean,
    @SerializedName("items")
    val items: List<UserData>,
    @SerializedName("total_count")
    val totalCount: Int
)