package com.sanyuan.floodprevention09.bean;

import java.io.Serializable;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/27 9:05
 */
public class AnalyzeBean implements Serializable{

    private String num;
    private String quhua;
    private String point;
    private String num1;
    private String num2;

    private String shuishen;
    private String paiganshijian;
    private String zhengzhishijian;
    private String zhengzhibiaozhun;
    private String zhengzhijindu;


    public AnalyzeBean() {
    }

    public AnalyzeBean(String num, String quhua, String point, String num1, String num2, String shuishen, String paiganshijian, String zhengzhishijian, String zhengzhibiaozhun, String zhengzhijindu) {
        this.num = num;
        this.quhua = quhua;
        this.point = point;
        this.num1 = num1;
        this.num2 = num2;
        this.shuishen = shuishen;
        this.paiganshijian = paiganshijian;
        this.zhengzhishijian = zhengzhishijian;
        this.zhengzhibiaozhun = zhengzhibiaozhun;
        this.zhengzhijindu = zhengzhijindu;
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

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
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

    public String getShuishen() {
        return shuishen;
    }

    public void setShuishen(String shuishen) {
        this.shuishen = shuishen;
    }

    public String getPaiganshijian() {
        return paiganshijian;
    }

    public void setPaiganshijian(String paiganshijian) {
        this.paiganshijian = paiganshijian;
    }

    public String getZhengzhishijian() {
        return zhengzhishijian;
    }

    public void setZhengzhishijian(String zhengzhishijian) {
        this.zhengzhishijian = zhengzhishijian;
    }

    public String getZhengzhibiaozhun() {
        return zhengzhibiaozhun;
    }

    public void setZhengzhibiaozhun(String zhengzhibiaozhun) {
        this.zhengzhibiaozhun = zhengzhibiaozhun;
    }

    public String getZhengzhijindu() {
        return zhengzhijindu;
    }

    public void setZhengzhijindu(String zhengzhijindu) {
        this.zhengzhijindu = zhengzhijindu;
    }

    @Override
    public String toString() {
        return "AnalyzeBean{" +
                "num='" + num + '\'' +
                ", quhua='" + quhua + '\'' +
                ", point='" + point + '\'' +
                ", num1='" + num1 + '\'' +
                ", num2='" + num2 + '\'' +
                ", shuishen='" + shuishen + '\'' +
                ", paiganshijian='" + paiganshijian + '\'' +
                ", zhengzhishijian='" + zhengzhishijian + '\'' +
                ", zhengzhibiaozhun='" + zhengzhibiaozhun + '\'' +
                ", zhengzhijindu='" + zhengzhijindu + '\'' +
                '}';
    }

}
