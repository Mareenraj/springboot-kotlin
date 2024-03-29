package org.mareenraj.crudapp

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/articles")
class ArticleController{
    val articles = mutableListOf(Article("Spring Boot 2.0", "Spring Boot 2.0 is here"))

    @GetMapping
    fun getAllArticles(): MutableList<Article>{
        return articles
    }
}