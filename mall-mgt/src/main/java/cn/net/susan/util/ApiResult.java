package cn.net.susan.util;

import cn.hutool.http.HttpStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * api请求响应实体
 *
 * @author 思源，该项目是知识星球：java突击队 的内部项目
 * @date 2024/1/9 下午1:20
 */
@AllArgsConstructor
@Data
public class ApiResult<T> {

    /**
     * 请求成功状态码
     */
    public static final int OK = HttpStatus.HTTP_OK;

    /**
     * 接口返回码
     */
    private int code;

    /**
     * 接口返回信息
     */
    private String message;

    /**
     * 数据
     */
    private T data;
}
