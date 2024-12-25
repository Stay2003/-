CREATE TABLE `sys_dept` (
                            `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
                            `name` varchar(30) NOT NULL COMMENT '名称',
                            `pid` bigint NOT NULL COMMENT '上级部门ID',
                            `valid_status` tinyint(1) NOT NULL DEFAULT 1 COMMENT '有效状态 1:有效 0:无效',
                            `create_user_id` bigint NOT NULL COMMENT '创建人ID',
                            `create_user_name` varchar(30) NOT NULL COMMENT '创建人名称',
                            `create_time` datetime(3) DEFAULT NULL COMMENT '创建日期',
                            `update_user_id` bigint DEFAULT NULL COMMENT '修改人ID',
                            `update_user_name` varchar(30) DEFAULT NULL COMMENT '修改人名称',
                            `update_time` datetime(3) DEFAULT NULL COMMENT '修改时间',
                            `is_del` tinyint(1) DEFAULT 0 COMMENT '是否删除 1：已删除 0：未删除',
                            PRIMARY KEY (`id`) USING BTREE,
                            KEY `index_pid` (`pid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='部门';

CREATE TABLE `sys_job` (
                           `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
                           `name` varchar(30) NOT NULL COMMENT '岗位名称',
                           `sort` int(3) NOT NULL COMMENT '岗位排序',
                           `dept_id` bigint NOT NULL COMMENT '部门ID',
                           `valid_status` tinyint(1) NOT NULL DEFAULT 1 COMMENT '有效状态 1:有效 0:无效',
                           `create_user_id` bigint NOT NULL COMMENT '创建人ID',
                           `create_user_name` varchar(30) NOT NULL COMMENT '创建人名称',
                           `create_time` datetime(3) DEFAULT NULL COMMENT '创建日期',
                           `update_user_id` bigint DEFAULT NULL COMMENT '修改人ID',
                           `update_user_name` varchar(30) DEFAULT NULL COMMENT '修改人名称',
                           `update_time` datetime(3) DEFAULT NULL COMMENT '修改时间',
                           `is_del` tinyint(1) DEFAULT 0 COMMENT '是否删除 1：已删除 0：未删除',
                           PRIMARY KEY (`id`) USING BTREE,
                           KEY `index_dept_id` (`dept_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='岗位';

CREATE TABLE `sys_menu` (
                            `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
                            `name` varchar(255) DEFAULT NULL COMMENT '菜单名称',
                            `pid` bigint NOT NULL COMMENT '上级菜单ID',
                            `sort` int(3) NOT NULL COMMENT '排序',
                            `icon` varchar(30) DEFAULT NULL COMMENT '图标',
                            `path` varchar(255) DEFAULT NULL COMMENT '路由',
                            `hidden` tinyint(1) DEFAULT 0 COMMENT '是否隐藏',
                            `is_link` tinyint(1) DEFAULT 0 COMMENT '是否外链 1：是 0：否',
                            `type` int(2) DEFAULT NULL COMMENT '类型 1：目录 2：菜单 3：按钮',
                            `permission` varchar(255) DEFAULT NULL COMMENT '功能权限',
                            `url` varchar(255) DEFAULT NULL COMMENT 'URL地址',
                            `create_user_id` bigint NOT NULL COMMENT '创建人ID',
                            `create_user_name` varchar(30) NOT NULL COMMENT '创建人名称',
                            `create_time` datetime(3) DEFAULT NULL COMMENT '创建日期',
                            `update_user_id` bigint DEFAULT NULL COMMENT '修改人ID',
                            `update_user_name` varchar(30) DEFAULT NULL COMMENT '修改人名称',
                            `update_time` datetime(3) DEFAULT NULL COMMENT '修改时间',
                            `is_del` tinyint(1) DEFAULT 0 COMMENT '是否删除 1：已删除 0：未删除',
                            PRIMARY KEY (`id`) USING BTREE,
                            KEY `index_pid` (`pid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='菜单';

CREATE TABLE `sys_role` (
                            `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
                            `name` varchar(30) NOT NULL COMMENT '名称',
                            `remark` varchar(255) DEFAULT NULL COMMENT '备注',
                            `data_scope` varchar(255) DEFAULT NULL COMMENT '数据权限',
                            `level` int DEFAULT NULL COMMENT '角色级别',
                            `permission` varchar(255) DEFAULT NULL COMMENT '功能权限',
                            `create_user_id` bigint NOT NULL COMMENT '创建人ID',
                            `create_user_name` varchar(30) NOT NULL COMMENT '创建人名称',
                            `create_time` datetime(3) DEFAULT NULL COMMENT '创建日期',
                            `update_user_id` bigint DEFAULT NULL COMMENT '修改人ID',
                            `update_user_name` varchar(30) DEFAULT NULL COMMENT '修改人名称',
                            `update_time` datetime(3) DEFAULT NULL COMMENT '修改时间',
                            `is_del` tinyint(1) DEFAULT 0 COMMENT '是否删除 1：已删除 0：未删除',
                            PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='角色表';

CREATE TABLE `sys_role_menu` (
                                 `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
                                 `role_id` bigint NOT NULL COMMENT '角色ID',
                                 `menu_id` bigint NOT NULL COMMENT '菜单ID',
                                 PRIMARY KEY (`id`) USING BTREE,
                                 KEY `index_role_id` (`role_id`) USING BTREE,
                                 KEY `index_menu_id` (`menu_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='角色菜单关联';

CREATE TABLE `sys_role_dept` (
                                 `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
                                 `role_id` bigint NOT NULL COMMENT '角色ID',
                                 `dept_id` bigint NOT NULL COMMENT '部门ID',
                                 PRIMARY KEY (`id`) USING BTREE,
                                 KEY `index_role_id` (`role_id`) USING BTREE,
                                 KEY `index_dept_id` (`dept_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='角色部门关联';

CREATE TABLE `sys_user` (
                            `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
                            `avatar_id` bigint DEFAULT NULL COMMENT '头像ID',
                            `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
                            `password` varchar(255) DEFAULT NULL COMMENT '密码',
                            `user_name` varchar(30) NOT NULL COMMENT '用户名',
                            `dept_id` bigint DEFAULT NULL COMMENT '部门ID',
                            `phone` varchar(20) DEFAULT NULL COMMENT '手机号码',
                            `job_id` bigint DEFAULT NULL COMMENT '岗位ID',
                            `last_change_password_time` datetime(3) DEFAULT NULL COMMENT '最后修改密码的时间',
                            `nick_name` varchar(30) DEFAULT NULL COMMENT '别名',
                            `sex` tinyint(2) DEFAULT NULL COMMENT '性别 1：男 2：女',
                            `valid_status` tinyint(1) NOT NULL DEFAULT 1 COMMENT '有效状态 1:有效 0:无效',
                            `create_user_id` bigint NOT NULL COMMENT '创建人ID',
                            `create_user_name` varchar(30) NOT NULL COMMENT '创建人名称',
                            `create_time` datetime(3) DEFAULT NULL COMMENT '创建日期',
                            `update_user_id` bigint DEFAULT NULL COMMENT '修改人ID',
                            `update_user_name` varchar(30) DEFAULT NULL COMMENT '修改人名称',
                            `update_time` datetime(3) DEFAULT NULL COMMENT '修改时间',
                            `is_del` tinyint(1) DEFAULT 0 COMMENT '是否删除 1：已删除 0：未删除',
                            PRIMARY KEY (`id`) USING BTREE,
                            UNIQUE KEY `uk_user_name` (`user_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='用户';

CREATE TABLE `sys_user_avatar` (
                                   `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
                                   `file_name` varchar(255) DEFAULT NULL COMMENT '文件名',
                                   `path` varchar(255) DEFAULT NULL COMMENT '路径',
                                   `file_size` varchar(10) DEFAULT NULL COMMENT '文件大小',
                                   `create_user_id` bigint NOT NULL COMMENT '创建人ID',
                                   `create_user_name` varchar(30) NOT NULL COMMENT '创建人名称',
                                   `create_time` datetime(3) DEFAULT NULL COMMENT '创建日期',
                                   `update_user_id` bigint DEFAULT NULL COMMENT '修改人ID',
                                   `update_user_name` varchar(30) DEFAULT NULL COMMENT '修改人名称',
                                   `update_time` datetime(3) DEFAULT NULL COMMENT '修改时间',
                                   `is_del` tinyint(1) DEFAULT 0 COMMENT '是否删除 1：已删除 0：未删除',
                                   PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='用户头像';

CREATE TABLE `sys_user_role` (
                                 `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
                                 `user_id` bigint NOT NULL COMMENT '用户ID',
                                 `role_id` bigint NOT NULL COMMENT '角色ID',
                                 PRIMARY KEY (`id`) USING BTREE,
                                 KEY `index_user_id` (`user_id`) USING BTREE,
                                 KEY `index_role_id` (`role_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='用户角色关联';
