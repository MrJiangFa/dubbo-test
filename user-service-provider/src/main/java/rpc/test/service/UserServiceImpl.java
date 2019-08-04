package rpc.test.service;


import rpc.test.model.UserAddress;

import java.util.Arrays;
import java.util.List;

/**
 * 将服务提供者注册到注册中心
 * 1.添加dubbo依赖/zookeeper依赖
 * 2.配置服务提供者
 */
public class UserServiceImpl implements UserService {
    /**
     * 按照用户地址返回收获地址
     *
     * @param userId
     * @return
     */
    @Override
    public List<UserAddress> getUserAddress(String userId) {
        UserAddress userAddress = new UserAddress();
        userAddress.setConsignee("jiangfa");
        userAddress.setPhoneNumber("1242342");
        userAddress.setUserId(userId);
        userAddress.setUserAddress("长江西苑");
        return Arrays.asList(userAddress);
    }
}
