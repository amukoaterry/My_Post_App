package com.akirachix.my_post_app

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PostsApiInterface {    @GET("/posts")
fun fetchPosta(): Call<List<Post>>


    @GET("/posts/{postId}")
    fun fetchPostById(@Path("postId")postId: Int): Call<Post>

    @GET("post/{postId}/comments")
    fun fetchCommentsByPostId(@Path("postId") postId: Int): Call<List<Comments>>
}