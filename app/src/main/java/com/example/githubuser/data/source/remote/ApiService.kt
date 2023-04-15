package com.example.githubuser.data.source.remote

import com.example.githubuser.data.source.remote.entity.SearchUserResponse
import com.example.githubuser.data.source.remote.entity.UsersResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("/users")
    suspend fun getAllUser(): UsersResponse

    @GET("/users")
    suspend fun searchUsers(@Query("q") username: String): SearchUserResponse
    

}