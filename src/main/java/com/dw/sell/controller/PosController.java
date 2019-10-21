package com.dw.sell.controller;

import com.dw.sell.common.Result;
import com.dw.sell.entity.Goods;
import com.dw.sell.service.PosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * FileName : PosController.
 *
 * @author : dw
 * @date : 2019/10/18  14:44
 * Description : CrossOrigin允许跨域访问
 */
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/pos")
public class PosController {

  @Autowired
  private PosService posService;

  @RequestMapping("/getOftenGoodsList")
  public Result getOftenGoodsList(){
    List<Goods>  goodsList = posService.queryOftenGoods();
    return Result.ok().put("oftenGoods",goodsList);
  }

  @RequestMapping("/getTypeGoodsList")
  public Result getTypeGoodsList(){
    return Result.ok().put("typeGoods",posService.queryTypeGoodsList());
  }
  @RequestMapping("/getTypeGoods")
  public Result getTypeGoods(){
    return Result.ok().put("typeGoods",posService.queryTypeGoods());
  }
}
