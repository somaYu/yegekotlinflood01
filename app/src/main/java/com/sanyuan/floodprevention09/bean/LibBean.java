package com.sanyuan.floodprevention09.bean;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/27 10:28
 */
public class LibBean {

    private String num;
    private String quhua;
    private String s2017;
    private String s2018;
    private String s2019;
    private String s2020;
    private String sum;

    public LibBean() {
    }

    public LibBean(String num, String quhua, String s2017, String s2018, String s2019, String s2020, String sum) {
        this.num = num;
        this.quhua = quhua;
        this.s2017 = s2017;
        this.s2018 = s2018;
        this.s2019 = s2019;
        this.s2020 = s2020;
        this.sum = sum;
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

    public String getS2017() {
        return s2017;
    }

    public void setS2017(String s2017) {
        this.s2017 = s2017;
    }

    public String getS2018() {
        return s2018;
    }

    public void setS2018(String s2018) {
        this.s2018 = s2018;
    }

    public String getS2019() {
        return s2019;
    }

    public void setS2019(String s2019) {
        this.s2019 = s2019;
    }

    public String getS2020() {
        return s2020;
    }

    public void setS2020(String s2020) {
        this.s2020 = s2020;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "LibBean{" +
                "num='" + num + '\'' +
                ", quhua='" + quhua + '\'' +
                ", s2017='" + s2017 + '\'' +
                ", s2018='" + s2018 + '\'' +
                ", s2019='" + s2019 + '\'' +
                ", s2020='" + s2020 + '\'' +
                ", sum='" + sum + '\'' +
                '}';
    }

}
