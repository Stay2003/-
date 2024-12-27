package cn.net.susan.entity.sys;

import cn.net.susan.entity.RequestPageEntity;
import lombok.Data;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 菜单查询条件实体
 * 
 * @author 思源 该项目是知识星球：java突击队 的内部项目
 * @date 2024-01-08 17:18:18
 */
@ApiModel("菜单查询条件实体")
@Data
public class MenuConditionEntity extends RequestPageEntity {
	

	/**
	 *  ID
     */
	@ApiModelProperty("ID")
	private Long id;

	/**
	 *  菜单名称
     */
	@ApiModelProperty("菜单名称")
	private String name;

	/**
	 *  上级菜单ID
     */
	@ApiModelProperty("上级菜单ID")
	private Long pid;

	/**
	 *  排序
     */
	@ApiModelProperty("排序")
	private Integer sort;

	/**
	 *  图标
     */
	@ApiModelProperty("图标")
	private String icon;

	/**
	 *  路由
     */
	@ApiModelProperty("路由")
	private String path;

	/**
	 *  是否隐藏
     */
	@ApiModelProperty("是否隐藏")
	private Integer hidden;

	/**
	 *  是否外链 1：是 0：否
     */
	@ApiModelProperty("是否外链 1：是 0：否")
	private Integer isLink;

	/**
	 *  类型 1：目录 2：菜单 3：按钮
     */
	@ApiModelProperty("类型 1：目录 2：菜单 3：按钮")
	private Integer type;

	/**
	 *  功能权限
     */
	@ApiModelProperty("功能权限")
	private String permission;

	/**
	 *  url地址
     */
	@ApiModelProperty("url地址")
	private String url;

	/**
	 *  创建人ID
     */
	@ApiModelProperty("创建人ID")
	private Long createUserId;

	/**
	 *  创建人名称
     */
	@ApiModelProperty("创建人名称")
	private String createUserName;

	/**
	 *  创建日期
     */
	@ApiModelProperty("创建日期")
	private Date createTime;

	/**
	 *  修改人ID
     */
	@ApiModelProperty("修改人ID")
	private Long updateUserId;

	/**
	 *  修改人名称
     */
	@ApiModelProperty("修改人名称")
	private String updateUserName;

	/**
	 *  修改时间
     */
	@ApiModelProperty("修改时间")
	private Date updateTime;

	/**
	 *  是否删除 1：已删除 0：未删除
     */
	@ApiModelProperty("是否删除 1：已删除 0：未删除")
	private Integer isDel;
}
