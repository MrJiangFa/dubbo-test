package rpc.test.service;


import rpc.test.model.UserAddress;

import java.util.List;

public interface UserService {
    /**
     * 按照用户地址返回收获地址
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddress(String userId);
}
