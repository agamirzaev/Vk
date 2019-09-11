package com.example.vkwall.data.model.Profile.FaveProfile;

import com.google.gson.annotations.SerializedName;

public class RepostsFave {
    @SerializedName("count")
    private Integer count;
    @SerializedName("user_reposted")
    private Integer userReposted;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getUserReposted() {
        return userReposted;
    }

    public void setUserReposted(Integer userReposted) {
        this.userReposted = userReposted;
    }
}
