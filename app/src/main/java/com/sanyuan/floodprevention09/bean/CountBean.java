package com.sanyuan.floodprevention09.bean;

import java.io.Serializable;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/8/29 15:32
 */
public class CountBean implements Serializable {

    private String num;
    private String quhua;
    private String time;
    private String num1;
    private String num2;

    public CountBean() {
    }

    public CountBean(String num, String quhua, String time, String num1, String num2) {
        this.num = num;
        this.quhua = quhua;
        this.time = time;
        this.num1 = num1;
        this.num2 = num2;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getQuhua() {
        return quhua;
    }

    public void setQuhua(String quhua) {
        this.quhua = quhua;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "CountBean{" +
                "num='" + num + '\'' +
                ", quhua='" + quhua + '\'' +
                ", time='" + time + '\'' +
                ", num1='" + num1 + '\'' +
                ", num2='" + num2 + '\'' +
                '}';
    }
}
