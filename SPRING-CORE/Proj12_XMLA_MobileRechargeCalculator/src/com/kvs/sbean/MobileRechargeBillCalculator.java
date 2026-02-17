package com.kvs.sbean;

import org.springframework.stereotype.Component;

@Component("mbc")
public class MobileRechargeBillCalculator {

    private double planAmount;
    private double extraDataUsedGB;
    private double costPerGB;

    // Setter methods
    public void setPlanAmount(double planAmount) {
        this.planAmount = planAmount;
    }

    public void setExtraDataUsedGB(double extraDataUsedGB) {
        this.extraDataUsedGB = extraDataUsedGB;
    }

    public void setCostPerGB(double costPerGB) {
        this.costPerGB = costPerGB;
    }

    public double generateRechargeBill() {
        return planAmount + (extraDataUsedGB * costPerGB);
    }
}
