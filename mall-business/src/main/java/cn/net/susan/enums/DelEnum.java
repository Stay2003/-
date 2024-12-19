package cn.net.susan.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 删除枚举
 *
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
