package com.caicongyang.domain;

import java.io.Serializable;
import java.util.Date;

public class HighestInPeriodResult implements Serializable {

    /**
     * 前期高点与当前天数间隔
     */
    private Integer intervalDays;


    /**
     * 当前时间
     */
    private Date tradingDay;

    /**
     * 前期高点日期
     */
    private Date previousHighsDate;


    /**
     * 股票代码
     */
    private String stockCode;


    public Integer getIntervalDays() {
        return intervalDays;
    }

    public void setIntervalDays(Integer intervalDays) {
        this.intervalDays = intervalDays;
    }

    public Date getTradingDay() {
        return tradingDay;
    }

    public void setTradingDay(Date tradingDay) {
        this.tradingDay = tradingDay;
    }

    public Date getPreviousHighsDate() {
        return previousHighsDate;
    }

    public void setPreviousHighsDate(Date previousHighsDate) {
        this.previousHighsDate = previousHighsDate;
    }


    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }
}