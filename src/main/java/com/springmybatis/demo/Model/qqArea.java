package com.springmybatis.demo.Model;

import java.io.Serializable;
import java.util.List;

public class qqArea implements Serializable {

    /**
     * id : 110000
     * name : 北京
     * fullname : 北京市
     * pinyin : ["bei","jing"]
     * location : {"lat":39.90469,"lng":116.40717}
     * cidx : [0,15]
     */

    private String id;
    private String name;
    private String fullname;
    private LocationBean location;
    private List<String> pinyin;
    private List<Integer> cidx;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public LocationBean getLocation() {
        return location;
    }

    public void setLocation(LocationBean location) {
        this.location = location;
    }

    public List<String> getPinyin() {
        return pinyin;
    }

    public void setPinyin(List<String> pinyin) {
        this.pinyin = pinyin;
    }

    public List<Integer> getCidx() {
        return cidx;
    }

    public void setCidx(List<Integer> cidx) {
        this.cidx = cidx;
    }

    public static class LocationBean {
        /**
         * lat : 39.90469
         * lng : 116.40717
         */

        private double lat;
        private double lng;

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLng() {
            return lng;
        }

        public void setLng(double lng) {
            this.lng = lng;
        }
    }
}
