package com.sanyuan.floodprevention09.bean;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/27 9:05
 */
public class CountryBean {

    private String num;
    private String quhua;
    private String yizhili;
    private String weizhili;
    private String sum;

    public CountryBean() {
    }

    public CountryBean(String num, String quhua, String yizhili, String weizhili, String sum) {
        this.num = num;
        this.quhua = quhua;
        this.yizhili = yizhili;
        this.weizhili = weizhili;
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

    public String getYizhili() {
        return yizhili;
    }

    public void setYizhili(String yizhili) {
        this.yizhili = yizhili;
    }

    public String getWeizhili() {
        return weizhili;
    }

    public void setWeizhili(String weizhili) {
        this.weizhili = weizhili;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "CountryBean{" +
                "num='" + num + '\'' +
                ", quhua='" + quhua + '\'' +
                ", yizhili='" + yizhili + '\'' +
                ", weizhili='" + weizhili + '\'' +
                ", sum='" + sum + '\'' +
                '}';
    }

}
