package retrofit

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.UnstableDefault
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonBuilder
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory


fun main() {
    val retrofit = Retrofit.Builder()
        .client(OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            }).build()
        )
        .addConverterFactory(getJsonConverter())
        .baseUrl("https://httpbin.org")
        .build()

    val service = retrofit.create(GitHubService::class.java)

    service.listRepos(
        ProfileData()
    ).execute()

    service.listRepos(
        ProfileData()
    ).execute()

    service.listRepos(
        ProfileData()
    ).execute()

}

@UnstableDefault
private fun getJsonConverter(): Converter.Factory =
    Json(JsonBuilder().apply {
        ignoreUnknownKeys = true
        isLenient = true
    }.buildConfiguration()).asConverterFactory(
        "application/json".toMediaType()
    )
