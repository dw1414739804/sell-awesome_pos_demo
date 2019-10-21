package com.dw.sell.entity;

import lombok.Data;

/**
 * FileName : Goods.
 *
 * @author : dw
 * @date : 2019/10/18 0018 15:08
 * Description : TODO
 */
@Data
public class Goods {
  private Long goodsId;
  private String goodsName;
  private String goodsImg;
  private Double price;
  private Short isOften;
  private Short type;
}
