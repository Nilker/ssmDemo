package com.springmybatis.demo.Model;

import lombok.Data;

import java.io.Serializable;
import java.util.Arrays;

@Data
public class weiXinUserInfo implements Serializable {
    private String openId;
    private String nickName;
    private Integer gender;//值为1时是男性，值为2时是女性，值为0时是未知
    private String phoneNumber;//手机号
    private Integer[] latLon; //纬度，浮点数，范围为-90~90，负数表示南纬  经度，浮点数，范围为-180~180，负数表示西经

    @Override
    public String toString() {
        return "weiXinUserInfo{" +
                "openId='" + openId + '\'' +
                ", nickName='" + nickName + '\'' +
                ", gender=" + gender +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", latLon=" + Arrays.toString(latLon) +
                '}';
    }
}
