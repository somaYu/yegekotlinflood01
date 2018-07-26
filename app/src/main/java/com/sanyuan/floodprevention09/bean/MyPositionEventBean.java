package com.sanyuan.floodprevention09.bean;

/**
 * @author nongsini
 * @version 1.0.0
 * @since 2017-03-10 11:36
 */


public class MyPositionEventBean {

    // 经度
    double jingdu ;

    // 纬度
    double weidu ;

    // 定位精度，默认值为0.0f
    float radius ;

    // 获取经纬度坐标类型,已LocationClientOption中设置过的坐标类型为准
    String coorType;

    // 获取定位错误码
    int errorCode ;

    //获取详细地址信息
    String addr ;

    //获取国家
    String country ;

    //获取省份
    String province ;

    //获取城市
    String city ;

    //获取区县
    String district ;

    //获取街道信息
    String street ;

    public MyPositionEventBean() {
    }

    public MyPositionEventBean(double jingdu, double weidu, float radius, String coorType, int errorCode, String addr, String country, String province, String city, String district, String street) {
        this.jingdu = jingdu;
        this.weidu = weidu;
        this.radius = radius;
        this.coorType = coorType;
        this.errorCode = errorCode;
        this.addr = addr;
        this.country = country;
        this.province = province;
        this.city = city;
        this.district = district;
        this.street = street;
    }

    public double getJingdu() {
        return jingdu;
    }

    public void setJingdu(double jingdu) {
        this.jingdu = jingdu;
    }

    public double getWeidu() {
        return weidu;
    }

    public void setWeidu(double weidu) {
        this.weidu = weidu;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getCoorType() {
        return coorType;
    }

    public void setCoorType(String coorType) {
        this.coorType = coorType;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "MyPositionEventBean{" +
                "jingdu=" + jingdu +
                ", weidu=" + weidu +
                ", radius=" + radius +
                ", coorType='" + coorType + '\'' +
                ", errorCode=" + errorCode +
                ", addr='" + addr + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

}
