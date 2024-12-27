package cn.net.susan.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 删除枚举
 *
 * @author 思源，该项目是知识星球：java突击队 的内部项目
 * @date 2024/1/4 下午3:39
 */
@AllArgsConstructor
@Getter
public enum DelEnum {

    /**
     * 是
     */
    YES(1, "是"),

    /**
     * 否
     */
    NO(0, "否");

    private Integer value;

    private String desc;
}
