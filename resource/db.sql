create database forum default character set utf8mb4 collate utf8mb4_unicode_ci;

use forum;

create table article
(
    id bigint auto_increment comment '主键' primary key,
    title       varchar(128)     null comment '文章标题',
    thumbnail   varchar(128)     null comment '文章缩略图',
    author_id   bigint           null comment '文章作者id',
    type        char default '0' null comment '文章类型',
    view_count  int default 1    null comment '浏览总数',
    created_at  datetime         null comment '创建时间',
    updated_at  datetime         null comment '更新时间',
    status      char default '0' null comment '文章状态',
    like_count  int  default 0   null comment '点赞总数',
) comment '文章表' collate = utf8mb4_unicode_ci;

create table user
(
    id bigint auto_increment comment '用户ID' primary key,
    account     varchar(32)      not null   comment '账号',
    password    varchar(64)      null       comment '密码',
    nickname    varchar(128)     not null   comment '昵称',
    sex         char default '0' not null   comment '性别',
    avatar      varchar(512)     null       comment '头像',
    phone       varchar(11)      null       comment '手机号',
    email       varchar(64)      null       comment '邮箱',
    status      char default '0' null       comment '状态',
    created_at  datetime         null       comment '创建时间',
    updated_at  datetime         null comment '更新时间'
) comment '用户表 ' collate = utf8mb4_unicode_ci;