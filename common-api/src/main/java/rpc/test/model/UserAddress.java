package rpc.test.model;

import java.io.Serializable;

public class UserAddress implements Serializable {
    private int id;
    private String userAddress;
    private String userId;
    private String consignee;
    private String phoneNumber;

    public int getId() {
        return id;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserId() {
        return userId;
    }

    public String getConsignee() {
        return consignee;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
