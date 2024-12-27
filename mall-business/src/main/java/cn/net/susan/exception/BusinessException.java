package cn.net.susan.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 业务异常
 *
 * @author 思源，该项目是知识星球：java突击队 的内部项目
 * @date 2024/1/9 下午1:12
 */
@
AllArgsConstructor
@Data
public class BusinessException extends RuntimeException {

    public static final long serialVersionUID = -6735897190745766939L;

    /**
     * 异常码
     */
    private int code;

    /**
     * 具体异常信息
     */
    private String message;

    public BusinessException() {
        super();
    }
}