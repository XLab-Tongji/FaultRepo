package com.tiandi.mongo;

import jdk.nashorn.internal.objects.annotations.Property;

/**
 * @author 谢天帝
 * @version v0.1 2017/4/17.
 */
public class Monitor {
    @Property
    public String monitorType;
    @Property
    public int monitorTime;
    @Property
    public String monitorPoint;
    @Property
    public int SLA;

//    public Monitor(String monitorType, int monitorTime, int SLA) {
//        this.monitorType = monitorType;
//        this.SLA = SLA;
//        this.monitorTime = monitorTime;
//        this.parameter = null;
//    }
    public Monitor(){}
    public Monitor(String monitorType, String monitorPoint, int monitorTime, int SLA) {
        this.monitorType = monitorType;
        this.monitorTime = monitorTime;
        this.SLA = SLA;
        this.monitorPoint = monitorPoint;
    }
}