package rpc.test.service;

import rpc.test.model.UserAddress;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    UserService userService;

    @Override
    public void initOrder(String userId) {
        List<UserAddress> addresses = userService.getUserAddress(userId);
        addresses.forEach((e) -> System.out.println(e.getUserAddress()));
    }

    public static void main(String[] args) {
        new OrderServiceImpl().initOrder("jiangfa");
    }
}
