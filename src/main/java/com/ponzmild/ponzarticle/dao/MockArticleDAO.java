package com.ponzmild.ponzarticle.dao;

import java.util.ArrayList;
import java.util.List;

import com.ponzmild.ponzarticle.entity.Article;

public class MockArticleDAO implements ArticleDAO {

	@Override
	public List<Article> findAll() {
		List<Article> articleList = new ArrayList<>();
		Article article1 = new Article(1L, "Micro Profile Getting Started", "Kenny Koh");
		Article article2 = new Article(2L, "Best Practice of Log Analysis at AWS", "Natsuko Akasaka");
		Article article3 = new Article(3L, "What is GitOps?", "Win May");
		articleList.add(article1);
		articleList.add(article2);
		articleList.add(article3);
		return articleList;
	}

}
