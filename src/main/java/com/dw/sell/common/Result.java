package com.dw.sell.common;

import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * FileName : Result.
 *
 * @author : dw
 * @date : 2019/08/28  11:54
 * Description :
 */
public class Result extends HashMap<String, Object> {

  private static final long serialVersionUID = 1L;

  public Result() {
    put("code", 200);
    put("msg", "");
  }

  public static Result error() {
    return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
  }

  public static Result error(String msg) {
    return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
  }

  /**
   * 错误返回数据.
   * @param code 错误编码
   * @param msg  错误信息
   * @return Result
   */
  public static Result error(int code, String msg) {
    Result r = new Result();
    r.put("code", code);
    r.put("msg", msg);

    return r;
  }

  /**
   * 正确返回数据.
   * @param msg  正确信息
   * @return Result
   */
  public static Result ok(String msg) {
    Result r = new Result();
    r.put("msg", msg);
    return r;
  }

  /**
   * 正确返回数据.
   * @param map 相关信息
   * @return Result
   */
  public static Result ok(Map<String, Object> map) {
    Result r = new Result();
    r.putAll(map);
    return r;
  }

  public static Result ok() {
    return new Result();
  }

  @Override
  public Result put(String key, Object value) {
    super.put(key, value);
    return this;
  }
}
