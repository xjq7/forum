package com.stu.forum.web.article;

import com.stu.forum.core.result.GlobalResult;
import com.stu.forum.entity.Article;
import com.stu.forum.service.ArticleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/v1/article")
public class ArticleController {
    @Resource
    private ArticleService articleService;

    @GetMapping("/list")
    public GlobalResult<Article> getList(){
        Article article = new Article();
        return GlobalResult.success(article);
    }
}
