package com.stu.forum.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stu.forum.entity.Article;

import java.util.List;

public interface ArticleService extends BaseMapper<Article> {
    @Override
    List<Article> selectList(Wrapper<Article> queryWrapper);
}
