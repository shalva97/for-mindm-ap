package retrofit

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path


interface GitHubService {
    @POST("anything")
    fun listRepos(@Body user: ProfileData): Call<Unit>
}
