package com.cyquen.themis.model;

import java.util.Date;

public class BgpInfo {

    private Date detectedTime;

    private String hijackedPrefix;

    private String type;

    private Integer hijackedAS;

    public BgpInfo(Date detectedTime, String hijackedPrefix, String type, Integer hijackedAS) {
        this.detectedTime = detectedTime;
        this.hijackedPrefix = hijackedPrefix;
        this.type = type;
        this.hijackedAS = hijackedAS;
    }

    public Date getDetectedTime() {
        return detectedTime;
    }

    public void setDetectedTime(Date detectedTime) {
        this.detectedTime = detectedTime;
    }

    public String getHijackedPrefix() {
        return hijackedPrefix;
    }

    public void setHijackedPrefix(String hijackedPrefix) {
        this.hijackedPrefix = hijackedPrefix;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getHijackedAS() {
        return hijackedAS;
    }

    public void setHijackedAS(Integer hijackedAS) {
        this.hijackedAS = hijackedAS;
    }
}
