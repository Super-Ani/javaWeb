package com.nizhou.servuceImpl;

import com.nizhou.DAO.userDao;
import com.nizhou.DTO.userDto;
import com.nizhou.service.userSrv;

import javax.annotation.Resource;

public class userSrvImpl implements userSrv {
    @Resource
    private userDao userDao;

    @Override
    public userDto selectUserInfo(String username){
        userDto userDto=userDao.selectUesrInfo(username);
        return userDto;
    }
}
