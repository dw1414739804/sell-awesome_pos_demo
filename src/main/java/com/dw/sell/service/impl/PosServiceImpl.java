package com.dw.sell.service.impl;

import com.dw.sell.dao.GoodsMapper;
import com.dw.sell.entity.Goods;
import com.dw.sell.service.PosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FileName : PosServiceImpl.
 *
 * @author : dw
 * @date : 2019/10/18  14:54
 * Description : TODO
 */
@Service("PosService")
public class PosServiceImpl implements PosService {

  @Autowired
  private GoodsMapper goodsMapper;

  @Override
  public List<Goods>  queryOftenGoods() {

    return goodsMapper.oftenGoodsList();
  }

  @Override
  public Map<String, Object> queryTypeGoods() {
    Map<String, Object> typeGoods =new HashMap<String, Object>();
    typeGoods.put("count",20);
    typeGoods.put("typeGoods1",goodsMapper.typeGoodsList(1));
    typeGoods.put("typeGoods2",goodsMapper.typeGoodsList(2));
    typeGoods.put("typeGoods3",goodsMapper.typeGoodsList(3));
    typeGoods.put("typeGoods4",goodsMapper.typeGoodsList(4));

    return typeGoods;
  }

  @Override
  public List<List<Goods>> queryTypeGoodsList() {
    List<List<Goods>> list = new ArrayList<>();
    list.add(goodsMapper.typeGoodsList(1));
    list.add(goodsMapper.typeGoodsList(2));
    list.add(goodsMapper.typeGoodsList(3));
    list.add(goodsMapper.typeGoodsList(4));
    return list;
  }
}
