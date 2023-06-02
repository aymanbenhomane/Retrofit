package com.example.retrofit;

import com.google.gson.annotations.SerializedName;

import kotlin.jvm.internal.SerializedIr;

public class CreateUserResponse {

    @SerializedName("name")
    public String name;
    @SerializedName("job")
    public String job;
    @SerializedName("createAt")
    public String createAt;
}
