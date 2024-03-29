package com.example.vkwall.mvp.usersinfo;

import com.example.vkwall.data.model.FollowersList.ResponseFollowers;
import com.example.vkwall.data.model.ProfileWall.Wall.GroupWall;
import com.example.vkwall.data.model.ProfileWall.Wall.ItemWall;
import com.example.vkwall.data.model.ProfileWall.Wall.ProfileWall;
import com.example.vkwall.mvp.base.MvpView;

import java.util.List;

public interface ProfileFollowersView extends MvpView {
    void showFollowers(ResponseFollowers responseFollowers);

    void showWallProfile(List<ItemWall> itemWalls, List<ProfileWall> profileWalls, List<GroupWall> groupWalls);

    void showProgress();

    void hideProgress();

    void showNoInternet();
}
