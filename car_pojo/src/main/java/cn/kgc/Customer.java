package cn.kgc;

import java.util.SplittableRandom;

public class Customer {
    private Integer id;
    private String cusName;
    private String phone;
    private  String carNum;
    private String carType;
    private Integer peopeleNum;
    private String registTime;
    private String IdCardNum;
    private String bookTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Integer getPeopeleNum() {
        return peopeleNum;
    }

    public void setPeopeleNum(Integer peopeleNum) {
        this.peopeleNum = peopeleNum;
    }

    public String getRegistTime() {
        return registTime;
    }

    public void setRegistTime(String registTime) {
        this.registTime = registTime;
    }

    public String getIdCardNum() {
        return IdCardNum;
    }

    public void setIdCardNum(String idCardNum) {
        IdCardNum = idCardNum;
    }

    public String getBookTime() {
        return bookTime;
    }

    public void setBookTime(String bookTime) {
        this.bookTime = bookTime;
    }
}
