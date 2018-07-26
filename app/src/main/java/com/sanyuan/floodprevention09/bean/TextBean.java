package com.sanyuan.floodprevention09.bean;

import java.io.Serializable;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/27 9:05
 */
public class TextBean implements Serializable{

    private String num;
    private String quhua;
    private String duiyingjiangyuliang;
    private String shijijiangyuliang;
    private String neilaoqingkuang;

    private String yilaodianweizhi;
    private String zhilijindu ;
    private String jishuishendu;
    private String paiganshijian;

    public TextBean() {
    }

    public TextBean(String num, String quhua, String duiyingjiangyuliang, String shijijiangyuliang, String neilaoqingkuang, String yilaodianweizhi, String zhilijindu, String jishuishendu, String paiganshijian) {
        this.num = num;
        this.quhua = quhua;
        this.duiyingjiangyuliang = duiyingjiangyuliang;
        this.shijijiangyuliang = shijijiangyuliang;
        this.neilaoqingkuang = neilaoqingkuang;
        this.yilaodianweizhi = yilaodianweizhi;
        this.zhilijindu = zhilijindu;
        this.jishuishendu = jishuishendu;
        this.paiganshijian = paiganshijian;
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

    public String getDuiyingjiangyuliang() {
        return duiyingjiangyuliang;
    }

    public void setDuiyingjiangyuliang(String duiyingjiangyuliang) {
        this.duiyingjiangyuliang = duiyingjiangyuliang;
    }

    public String getShijijiangyuliang() {
        return shijijiangyuliang;
    }

    public void setShijijiangyuliang(String shijijiangyuliang) {
        this.shijijiangyuliang = shijijiangyuliang;
    }

    public String getNeilaoqingkuang() {
        return neilaoqingkuang;
    }

    public void setNeilaoqingkuang(String neilaoqingkuang) {
        this.neilaoqingkuang = neilaoqingkuang;
    }

    public String getYilaodianweizhi() {
        return yilaodianweizhi;
    }

    public void setYilaodianweizhi(String yilaodianweizhi) {
        this.yilaodianweizhi = yilaodianweizhi;
    }

    public String getZhilijindu() {
        return zhilijindu;
    }

    public void setZhilijindu(String zhilijindu) {
        this.zhilijindu = zhilijindu;
    }

    public String getJishuishendu() {
        return jishuishendu;
    }

    public void setJishuishendu(String jishuishendu) {
        this.jishuishendu = jishuishendu;
    }

    public String getPaiganshijian() {
        return paiganshijian;
    }

    public void setPaiganshijian(String paiganshijian) {
        this.paiganshijian = paiganshijian;
    }

    @Override
    public String toString() {
        return "TextBean{" +
                "num='" + num + '\'' +
                ", quhua='" + quhua + '\'' +
                ", duiyingjiangyuliang='" + duiyingjiangyuliang + '\'' +
                ", shijijiangyuliang='" + shijijiangyuliang + '\'' +
                ", neilaoqingkuang='" + neilaoqingkuang + '\'' +
                ", yilaodianweizhi='" + yilaodianweizhi + '\'' +
                ", zhilijindu='" + zhilijindu + '\'' +
                ", jishuishendu='" + jishuishendu + '\'' +
                ", paiganshijian='" + paiganshijian + '\'' +
                '}';
    }
}
