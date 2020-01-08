package com.nizhou.service;

import com.nizhou.DTO.userDto;

public interface userSrv {
    public userDto selectUserInfo(String username);
}
