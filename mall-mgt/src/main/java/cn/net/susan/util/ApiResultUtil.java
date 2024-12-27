package cn.net.susan.util;

/**
 * api请求响应实体处理工具类
 *
 * @author 思源，该项目是知识星球：java突击队 的内部项目
 * @date 2024/1/9 下午1:19
 */
public class ApiResultUtil {

    private ApiResultUtil() {
    }

    /**
     * 请求成功
     *
     * @param data 数据
     * @param <T>  数据类型
     * @return 接口相应实体
     */
    public static <T> ApiResult<T> success(T data) {
        return new ApiResult<>(ApiResult.OK, null, data);
    }

    /**
     * 请求成功
     *
     * @param <T> 数据类型
     * @return 接口相应实体
     */
    public static <T> ApiResult<T> success() {
        return success(null);
    }

    /**
     * 请求成功
     *
     * @param code    返回码
     * @param message 返回信息
     * @param <T>     数据类型
     * @return 接口相应实体
     */
    public static <T> ApiResult<T> error(int code, String message) {
        return new ApiResult<>(code, message, null);
    }
}
