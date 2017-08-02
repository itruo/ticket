-- 后台管理员用户
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
	`id` int(11) NOT NULL auto_increment,
	`username` varchar(20) NOT NULL comment '用户名，使用电话号码注册',
	`password` varchar(32) NOT NULL comment '密码',
	`addtime` datetime NOT NULL comment '添加时间',
	`updatetime` datetime NOT NULL comment '更新时间',
    `enable` int(1) default 1 comment '是否可用，1：可用，0：冻结',
	`adder` int(11) NOT NULL comment '添加人',
	PRIMARY KEY (`id`),
	UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '后台管理员表';

-- 后台管理员角色
DROP TABLE IF EXISTS `admin_role`;
CREATE TABLE `admin_role` (
	`id` int(11) NOT NULL auto_increment,
	`name` varchar(20) NOT NULL comment '角色名称',
	`permissions` text comment '角色权限，json字符串',

	`addtime` datetime NOT NULL comment '添加时间',
	`updatetime` datetime NOT NULL comment '更新时间',
    `adder` int(11) NOT NULL comment '添加人',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '后台管理员角色';

-- 后台操作权限列表
DROP TABLE IF EXISTS `admin_opt`;
CREATE TABLE `admin_opt` (
	`id` int(11) NOT NULL auto_increment,
	`name` varchar(500) NOT NULL comment '操作名称',

	`addtime` datetime NOT NULL comment '添加时间',
	`updatetime` datetime NOT NULL comment '更新时间',
    `adder` int(11) NOT NULL comment '添加人',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '后台管理员角色';


-- 用户表
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
	`id` char(18) NOT NULL,
	`type` char(1) NOT NULL default 'B' comment '用户类别，B:B端用户，C:C端用户',
	`username` varchar(50) NOT NULL comment '用户名,使用手机号码注册',
	`password` varchar(50) NOT NULL comment '密码',
	`name` varchar(50) DEFAULT NULL comment '姓名',
    `sex` char(1) default 'M' comment '性别，男：M，女：F',
	`idnum` varchar(20) DEFAULT NULL comment '身份证号码',
	`idpic_front` varchar(255) DEFAULT NULL comment '身份正面图片',
	`idpic_back` varchar(255) DEFAULT NULL comment '身份背面图片',
	`province` int(6) DEFAULT NULL comment '省份',
	`city` int(6) DEFAULT NULL comment '城市',
    `address` varchar(50) DEFAULT NULL comment '详细地址',
    'balance' decimal(10,2) default 0.00 comment '余额',
    'frozen' decimal(10,2) default 0.00 comment '冻结金额',
    -- 公司信息
    `company` varchar(100) NOT NULL comment '公司名称',
	`corporation` varchar(50) DEFAULT NULL comment '公司法人',
	`phone` varchar(50) DEFAULT NULL comment '公司固定电话',
	`bus_lisence` varchar(255) DEFAULT NULL comment '公司营业执照',

    `ischeked` int(1) default 0 comment '是否审核',
    `enable` int(1) default 1 comment '是否可用，1：可用，0：冻结',
	`addtime` datetime NOT NULL comment '添加时间',
	`updatetime` datetime NOT NULL comment '更新时间',
    `del` int(1) NOT NULL default '0' comment '是否删除',
	PRIMARY KEY (`id`),
	UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '用户表';

-- 剧场表
DROP TABLE IF EXISTS `theatre`;
CREATE TABLE `theatre` (
	`id` char(18) NOT NULL,
	`name` varchar(50) NOT NULL comment '剧场名称',
	`phone` varchar(30) DEFAULT NULL comment '剧场联系电话',
	`province` int(6) DEFAULT NULL comment '省份',
	`city` int(6) DEFAULT NULL comment '城市',
    `address` varchar(50) DEFAULT NULL comment '详细地址',
    `company` varchar(100) NOT NULL comment '剧场介绍',
	`pic` text comment '场馆图片，多张图片使用json存储',

    `ischeked` int(1) default 0 comment '是否审核',
    `enable` int(1) default 1 comment '是否可用，1：可用，0：冻结',
	`addtime` datetime NOT NULL comment '添加时间',
	`updatetime` datetime NOT NULL comment '更新时间',
    `del` int(1) NOT NULL default '0' comment '是否删除',
    `adder` int(11) NOT NULL comment '添加人',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '剧场表';


-- 剧场演播厅
DROP TABLE IF EXISTS `theatre_hall`;
CREATE TABLE `theatre_hall` (
	`id` char(18) NOT NULL,
	`name` varchar(50) NOT NULL comment '厅名称',
	`type` char(2) NOT NULL comment '厅类型，B:大，M:中，S:小',
	`layer_num` int(2) DEFAULT 1 comment '大厅座位楼层数',
	`seats` int(6) DEFAULT 0 comment '大厅座位数',
    `enable` int(1) default 1 comment '是否可用，1：可用，0：冻结',
	`addtime` datetime NOT NULL comment '添加时间',
	`updatetime` datetime NOT NULL comment '更新时间',
    `del` int(1) NOT NULL default '0' comment '是否删除',
    `adder` int(11) NOT NULL comment '添加人',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '剧场演播厅';

-- 演播厅的座位表
DROP TABLE IF EXISTS `hall_seats`;
CREATE TABLE `hall_seats` (
	`id` char(18) NOT NULL,
	`name` varchar(50) NOT NULL comment '厅名称',
	`type` char(2) NOT NULL comment '厅类型，B:大，M:中，S:小（使用枚举类）',
	`layer_num` int(2) DEFAULT 1 comment '大厅座位楼层数',
	`seats_num` int(6) DEFAULT 0 comment '大厅总座位数',
    `enable` int(1) default 1 comment '是否可用，1：可用，0：冻结',
    `seats_map` text comment '排位信息映射，json字符串存储',
    
	`addtime` datetime NOT NULL comment '添加时间',
	`updatetime` datetime NOT NULL comment '更新时间',
    `del` int(1) NOT NULL default '0' comment '是否删除',
    `adder` int(11) NOT NULL comment '添加人',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '剧场演播厅';

-- 影片模板管理
DROP TABLE IF EXISTS `movies_template`;
CREATE TABLE `movies_template` (
	`id` char(18) NOT NULL,
	`name` varchar(50) NOT NULL comment '剧名',
	`type` int(6) NOT NULL comment '类型ID',
	`performers` varchar(255) DEFAULT NULL comment '演出人员',
	`duration` int(4) DEFAULT 120 comment '演出时长（单位分钟），默认120分钟',
	`summary` varchar(500) DEFAULT NULL comment '演出介绍',
    `cover` char(255) default NULL comment '封面',
    
	`addtime` datetime NOT NULL comment '添加时间',
	`updatetime` datetime NOT NULL comment '更新时间',
    `del` int(1) NOT NULL default '0' comment '是否删除',
    `adder` int(11) NOT NULL comment '添加人',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '影片模板管理';

-- 影片管理
DROP TABLE IF EXISTS `movies`;
CREATE TABLE `movies` (
	`id` char(18) NOT NULL,
	`temp_id` char(18) NOT NULL comment '影片模板ID',
	`theatre_id` char(18) NOT NULL comment '剧场ID',
    `starttime` datetime NOT NULL comment '上映周期开始时间',
	`endtime` datetime NOT NULL comment '上映周期结束时间',
	`hall_id` char(18) NOT NULL comment '演播厅ID',
	`max_price` decimal(10,2) default 0 comment '最高票价',
	`min_price` decimal(10,2) default 0 comment '最低票价',
    
	`addtime` datetime NOT NULL comment '添加时间',
	`updatetime` datetime NOT NULL comment '更新时间',
    `del` int(1) NOT NULL default '0' comment '是否删除',
    `adder` int(11) NOT NULL comment '添加人',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '影片管理';

-- 影片场次
DROP TABLE IF EXISTS `movie_times`;
CREATE TABLE `movie_times` (
	`id` char(18) NOT NULL,
	`movie_id` char(18) NOT NULL comment '影片ID',
	`temp_id` char(18) NOT NULL comment '影片模板ID',
	`theatre_id` char(18) NOT NULL comment '剧场ID',
	`hall_id` char(18) NOT NULL comment '演播厅ID',
	`starttime` datetime default NULL comment '上映时间',
	`duration` int(4) DEFAULT 120 comment '演出时长（单位分钟），默认120分钟',
	
	`addtime` datetime NOT NULL comment '添加时间',
	`updatetime` datetime NOT NULL comment '更新时间',
    `del` int(1) NOT NULL default '0' comment '是否删除',
    `adder` int(11) NOT NULL comment '添加人',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '影片场次';

-- 影票座位号(商品)
DROP TABLE IF EXISTS `movie_seats`;
CREATE TABLE `movie_seats` (
	`id` char(18) NOT NULL,
	`temp_id` char(18) NOT NULL comment '影片模板ID',
	`theatre_id` char(18) NOT NULL comment '剧场ID',
	`hall_id` char(18) NOT NULL comment '演播厅ID',
	`rows` int(10) default 1 comment '排号',
	`cols` int(10) default 1 comment '座号',
	`price` decimal(10,2) NOT NULL comment '票价',
	
	`addtime` datetime NOT NULL comment '添加时间',
	`updatetime` datetime NOT NULL comment '更新时间',
    `del` int(1) NOT NULL default '0' comment '是否删除',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '影票座位号';








