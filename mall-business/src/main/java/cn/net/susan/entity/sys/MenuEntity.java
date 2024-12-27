package cn.net.susan.entity.sys;

import cn.net.susan.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 菜单实体 该项目是知识星球：java突击队 的内部项目
 * 
 * @author 思源
 * @date 2024-01-08 17:18:18
 */
@ApiModel("菜单实体")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MenuEntity extends BaseEntity {
	

	/**
	 * 菜单名称
	 */
	@ApiModelProperty("菜单名称")
	private String name;

	/**
	 * 上级菜单ID
	 */
	@ApiModelProperty("上级菜单ID")
	private Long pid;

	/**
	 * 排序
	 */
	@ApiModelProperty("排序")
	private Integer sort;

	/**
	 * 图标
	 */
	@ApiModelProperty("图标")
	private String icon;

	/**
	 * 路由
	 */
	@ApiModelProperty("路由")
	private String path;

	/**
	 * 是否隐藏
	 */
	@ApiModelProperty("是否隐藏")
	private Integer hidden;

	/**
	 * 是否外链 1：是 0：否
	 */
	@ApiModelProperty("是否外链 1：是 0：否")
	private Integer isLink;

	/**
	 * 类型 1：目录 2：菜单 3：按钮
	 */
	@ApiModelProperty("类型 1：目录 2：菜单 3：按钮")
	private Integer type;

	/**
	 * 功能权限
	 */
	@ApiModelProperty("功能权限")
	private String permission;

	/**
	 * url地址
	 */
	@ApiModelProperty("url地址")
	private String url;
}
