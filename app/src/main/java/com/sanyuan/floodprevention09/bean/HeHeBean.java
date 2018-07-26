package com.sanyuan.floodprevention09.bean;

import java.util.List;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/7/12 15:22
 */
public class HeHeBean {


    /**
     * code : 0
     * msg : 查询成功
     * data : [{"planInvestEight":92993.484,"planInvestNine":142769.2,"planInvestSeven":52312.7,"planInvestTen":186323.83,"provinceID":"130000","provinceName":"河北省","totalInvest":474399.22},{"planInvestEight":18636.139,"planInvestNine":28720.777,"planInvestSeven":10737.672,"planInvestTen":36808.406,"provinceID":"210000","provinceName":"辽宁省","totalInvest":94902.99},{"planInvestEight":12338.611,"planInvestNine":19126.98,"planInvestSeven":6895.5283,"planInvestTen":25204.201,"provinceID":"220000","provinceName":"吉林省","totalInvest":63565.32},{"planInvestEight":1703.5862,"planInvestNine":2887.1929,"planInvestSeven":1157.0308,"planInvestTen":4028.3984,"provinceID":"320000","provinceName":"河南省","totalInvest":9776.208},{"planInvestEight":79472.58,"planInvestNine":120526.4,"planInvestSeven":44724.54,"planInvestTen":155929.38,"provinceID":"320000","provinceName":"江苏省","totalInvest":400652.9},{"planInvestEight":3726.9033,"planInvestNine":5932.6685,"planInvestSeven":2148.5984,"planInvestTen":7077.7793,"provinceID":"320000","provinceName":"山西省","totalInvest":18885.95},{"planInvestEight":150326.34,"planInvestNine":235123.27,"planInvestSeven":85394.29,"planInvestTen":302310.8,"provinceID":"340000","provinceName":"安徽省","totalInvest":773154.7},{"planInvestEight":36568.066,"planInvestNine":56987.086,"planInvestSeven":20574.498,"planInvestTen":71316.33,"provinceID":"350000","provinceName":"福建省","totalInvest":185445.98},{"planInvestEight":53238.195,"planInvestNine":80808.22,"planInvestSeven":29218.383,"planInvestTen":104768.164,"provinceID":"360000","provinceName":"江西省","totalInvest":268032.97},{"planInvestEight":11731.538,"planInvestNine":17144.102,"planInvestSeven":6834.48,"planInvestTen":23629.998,"provinceID":"370000","provinceName":"山东省","totalInvest":59340.117},{"planInvestEight":134206.36,"planInvestNine":206864.19,"planInvestSeven":74980.76,"planInvestTen":268781.53,"provinceID":"420000","provinceName":"湖北省","totalInvest":684832.8},{"planInvestEight":189117.86,"planInvestNine":294351.06,"planInvestSeven":108805.33,"planInvestTen":381205.22,"provinceID":"430000","provinceName":"湖南省","totalInvest":973479.5},{"planInvestEight":15795.515,"planInvestNine":22938.748,"planInvestSeven":8712.996,"planInvestTen":30898.56,"provinceID":"440000","provinceName":"广东省","totalInvest":78345.82},{"planInvestEight":10079.078,"planInvestNine":14689.787,"planInvestSeven":5491.7627,"planInvestTen":20035.25,"provinceID":"450000","provinceName":"广西壮族自治区","totalInvest":50295.88},{"planInvestEight":5898.946,"planInvestNine":8608.073,"planInvestSeven":3260.7368,"planInvestTen":12125.389,"provinceID":"460000","provinceName":"海南省","totalInvest":29893.145},{"planInvestEight":14582.058,"planInvestNine":21485.77,"planInvestSeven":8246.447,"planInvestTen":28618.166,"provinceID":"500000","provinceName":"重庆市","totalInvest":72932.44},{"planInvestEight":45419.086,"planInvestNine":71044.74,"planInvestSeven":26231.209,"planInvestTen":92327.2,"provinceID":"510000","provinceName":"四川省","totalInvest":235022.25},{"planInvestEight":76167.086,"planInvestNine":116643.57,"planInvestSeven":43123.83,"planInvestTen":154034.89,"provinceID":"530000","provinceName":"云南省","totalInvest":389969.38}]
     */

    private int code;
    private String msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * planInvestEight : 92993.484
         * planInvestNine : 142769.2
         * planInvestSeven : 52312.7
         * planInvestTen : 186323.83
         * provinceID : 130000
         * provinceName : 河北省
         * totalInvest : 474399.22
         */

        private double planInvestEight;
        private double planInvestNine;
        private double planInvestSeven;
        private double planInvestTen;
        private String provinceID;
        private String provinceName;
        private double totalInvest;

        public double getPlanInvestEight() {
            return planInvestEight;
        }

        public void setPlanInvestEight(double planInvestEight) {
            this.planInvestEight = planInvestEight;
        }

        public double getPlanInvestNine() {
            return planInvestNine;
        }

        public void setPlanInvestNine(double planInvestNine) {
            this.planInvestNine = planInvestNine;
        }

        public double getPlanInvestSeven() {
            return planInvestSeven;
        }

        public void setPlanInvestSeven(double planInvestSeven) {
            this.planInvestSeven = planInvestSeven;
        }

        public double getPlanInvestTen() {
            return planInvestTen;
        }

        public void setPlanInvestTen(double planInvestTen) {
            this.planInvestTen = planInvestTen;
        }

        public String getProvinceID() {
            return provinceID;
        }

        public void setProvinceID(String provinceID) {
            this.provinceID = provinceID;
        }

        public String getProvinceName() {
            return provinceName;
        }

        public void setProvinceName(String provinceName) {
            this.provinceName = provinceName;
        }

        public double getTotalInvest() {
            return totalInvest;
        }

        public void setTotalInvest(double totalInvest) {
            this.totalInvest = totalInvest;
        }
    }
}
