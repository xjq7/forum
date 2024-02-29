package com.stu.forum.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.stu.forum.entity.Article;
import com.stu.forum.mapper.ArticleMapper;
import com.stu.forum.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Service
public class ArticleServiceImpl implements ArticleService{
    @Resource
    private ArticleMapper articleMapper;

    @Override
    public int insert(Article entity) {


        return 0;
    }

    @Override
    public int deleteById(Serializable id) {
        return 0;
    }

    @Override
    public int deleteByMap(Map<String, Object> columnMap) {
        return 0;
    }

    @Override
    public int delete(Wrapper<Article> wrapper) {
        return 0;
    }

    @Override
    public int deleteBatchIds(Collection<? extends Serializable> idList) {
        return 0;
    }

    @Override
    public int updateById(Article entity) {
        return 0;
    }

    @Override
    public int update(Article entity, Wrapper<Article> updateWrapper) {
        return 0;
    }

    @Override
    public Article selectById(Serializable id) {
        return null;
    }

    @Override
    public List<Article> selectBatchIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public List<Article> selectByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public Article selectOne(Wrapper<Article> queryWrapper) {
        return null;
    }

    @Override
    public Integer selectCount(Wrapper<Article> queryWrapper) {
        return null;
    }

    @Override
    public List<Article> selectList(Wrapper<Article> queryWrapper) {
        return articleMapper.selectList();
    }

    @Override
    public List<Map<String, Object>> selectMaps(Wrapper<Article> queryWrapper) {
        return null;
    }

    @Override
    public List<Object> selectObjs(Wrapper<Article> queryWrapper) {
        return null;
    }

    @Override
    public <E extends IPage<Article>> E selectPage(E page, Wrapper<Article> queryWrapper) {
        return null;
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E selectMapsPage(E page, Wrapper<Article> queryWrapper) {
        return null;
    }
}
