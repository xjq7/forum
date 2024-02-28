package com.stu.forum.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stu.forum.entity.Article;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleMapper extends BaseMapper<Article> {
    List<Article> selectList();
}
