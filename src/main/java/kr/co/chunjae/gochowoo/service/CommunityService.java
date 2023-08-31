package kr.co.chunjae.gochowoo.service;

import kr.co.chunjae.gochowoo.model.Community;

import java.util.List;

public interface CommunityService {

    List<Community> getAllBoard();
    Community write (Community write);
    Community getCommunityById(Long id);
    void saveCommunity(Community community);
/*    Community updateCommunity(Community community);*/
    void deleteCommunityById(Long id);
}
