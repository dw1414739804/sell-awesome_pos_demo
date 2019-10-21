package com.dw.sell.service;

import com.dw.sell.entity.Goods;

import java.util.List;
import java.util.Map;

/**
 * FileName : PosService.
 *
 * @author : dw
 * @date : 2019/10/18  14:53
 * Description : TODO
 */
public interface PosService {

  List<Goods>  queryOftenGoods();
  Map<String,Object> queryTypeGoods();
  List<List<Goods>> queryTypeGoodsList();
}
