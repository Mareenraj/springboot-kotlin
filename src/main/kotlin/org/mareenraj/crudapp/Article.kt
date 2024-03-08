package org.mareenraj.crudapp

import java.time.LocalDateTime

data class Article(
        val title: String,
        val description: String,
        val createdAt: LocalDateTime = LocalDateTime.now(),
        val slug: String? = title?.toSlug()
)
