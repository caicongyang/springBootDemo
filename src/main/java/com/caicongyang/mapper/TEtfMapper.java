package com.caicongyang.mapper;

import com.caicongyang.domain.TEtf;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author caicongyang
 * @since 2020-07-08
 */
@Mapper
public interface TEtfMapper extends BaseMapper<TEtf> {

    List<Map<String, Object>> querySortEtfStockData(HashMap map);


    List<Map<String, Object>> catchTransactionStockData(HashMap map);

}
