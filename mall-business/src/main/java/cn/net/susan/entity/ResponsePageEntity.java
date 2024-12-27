package cn.net.susan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * 分页响应实体
 *
 * @author 思源，该项目是知识星球：java突击队 的内部项目
 * @date 2024/1/4 下午4:04
 */
@AllArgsConstructor
@Data
public class ResponsePageEntity<T> implements Serializable {

    private static final Integer ZERO = 0;

    /**
     * 页码
     */
    private Integer pageNo;

    /**
     * 每页大小
     */
    private Integer pageSize;

    /**
     * 总页数
     */
    private Integer totalPage;


    /**
     * 总记录数
     */
    private Integer totalCount;

    /**
     * 数据
     */
    private List<T> data;


    /**
     * 构建分页响应实体
     *
     * @param requestPageEntity 分页请求实体
     * @param <T>               数据类型
     * @return ResponsePageEntity实体
     */
    public static <T> ResponsePageEntity<T> buildEmpty(RequestPageEntity requestPageEntity) {
        return build(requestPageEntity, 0, null);
    }


    /**
     * 构建分页响应实体
     *
     * @param requestPageEntity 分页请求实体
     * @param totalCount        总记录数
     * @param data              数据
     * @param <T>               数据类型
     * @return ResponsePageEntity实体
     */
    public static <T> ResponsePageEntity<T> build(RequestPageEntity requestPageEntity, Integer totalCount, List<T> data) {
        Integer totalPage = getTotalPage(requestPageEntity.getPageNo(), requestPageEntity.getPageSize());
        return new ResponsePageEntity(requestPageEntity.getPageNo(), requestPageEntity.getPageSize(), totalPage, totalCount, data);
    }


    private static Integer getTotalPage(Integer pageSize, Integer totalCount) {
        if (Objects.isNull(pageSize) || Objects.isNull(totalCount)) {
            return ZERO;
        }

        if (pageSize <= 0 || totalCount <= 0) {
            return ZERO;
        }
        return totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
    }
}
