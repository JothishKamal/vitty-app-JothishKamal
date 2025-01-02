package com.dscvit.vitty.network.api.community

import com.dscvit.vitty.network.api.community.responses.notes.GetNoteResponse
import com.dscvit.vitty.network.api.community.responses.notes.SaveNoteResponse
import com.dscvit.vitty.network.api.community.responses.requests.RequestsResponse
import com.dscvit.vitty.network.api.community.responses.user.FriendResponse
import com.dscvit.vitty.network.api.community.responses.user.GhostResponse
import com.dscvit.vitty.network.api.community.responses.user.PostResponse
import com.dscvit.vitty.network.api.community.responses.user.SignInResponse
import com.dscvit.vitty.network.api.community.responses.user.UserResponse
import retrofit2.Call


interface RetrofitCommunitySignInListener {
    fun onSuccess(call: Call<SignInResponse>?, response: SignInResponse?)
    fun onError(call: Call<SignInResponse>?, t: Throwable?)
}

interface RetrofitSelfUserListener {
    fun onSuccess(call: Call<UserResponse>?, response: UserResponse?)
    fun onError(call: Call<UserResponse>?, t: Throwable?)
}

interface RetrofitFriendListListener {
    fun onSuccess(call: Call<FriendResponse>?, response: FriendResponse?)
    fun onError(call: Call<FriendResponse>?, t: Throwable?)
}

interface RetrofitSearchResultListener {
    fun onSuccess(call: Call<List<UserResponse>>?, response: List<UserResponse>?)
    fun onError(call: Call<List<UserResponse>>?, t: Throwable?)
}

interface RetrofitFriendRequestListener {
    fun onSuccess(call: Call<RequestsResponse>?, response: RequestsResponse?)
    fun onError(call: Call<RequestsResponse>?, t: Throwable?)
}

interface RetrofitUserActionListener {

    fun onSuccess(call: Call<PostResponse>?, response: PostResponse?)
    fun onError(call: Call<PostResponse>?, t: Throwable?)
}

interface RetrofitSaveNoteListener {

    fun onSuccess(call: Call<SaveNoteResponse>?, response: SaveNoteResponse?)
    fun onError(call: Call<SaveNoteResponse>?, t: Throwable?)
}

interface RetrofitGetNoteListener {
    fun onSuccess(response: GetNoteResponse?)
    fun onError(call: Call<*>?, throwable: Throwable?)
}

interface RetrofitGhostListener {
    fun onSuccess(call: Call<GhostResponse>?, response: GhostResponse?)
    fun onError(call: Call<GhostResponse>?, t: Throwable?)
}