package com.dw.sell.dao;

import com.dw.sell.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * FileName : GoodsMapper.
 *
 * @author : dw
 * @date : 2019/10/18 0018 15:17
 * Description : TODO
 */
@Mapper
public interface GoodsMapper {
  List<Goods> oftenGoodsList();
  List<Goods> typeGoodsList(int type);
}
