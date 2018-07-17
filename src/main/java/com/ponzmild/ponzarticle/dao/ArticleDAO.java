package com.ponzmild.ponzarticle.dao;

import java.util.List;

import com.ponzmild.ponzarticle.entity.Article;

public interface ArticleDAO {
	public List<Article> findAll();
}
