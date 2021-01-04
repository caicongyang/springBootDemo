package com.caicongyang.services;

import com.baomidou.mybatisplus.extension.service.IService;
import com.caicongyang.domain.BreakthroughPlatformStock;
import com.caicongyang.domain.TStock;
import com.caicongyang.domain.TStockHigherDTO;
import com.caicongyang.domain.VolumeGtYesterdayStockDTO;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author caicongyang
 * @since 2020-05-31
 */
public interface ITStockService extends IService<TStock> {

    /**
     * 循环统计每个股票的股票是否创新高，只统计30天以上的
     */

    public List<TStock> calculateHigherStock(String tradingDay) throws ParseException;

    public List<TStockHigherDTO> getHigherStock(String tradingDay)
        throws ParseException, IOException;

    public List<BreakthroughPlatformStock> getBreakthroughPlatform(String currentDate)
        throws ParseException, IOException;

    public List<VolumeGtYesterdayStockDTO> getVolumeGtYesterdayStock(String currentDate)
        throws IOException;
}
