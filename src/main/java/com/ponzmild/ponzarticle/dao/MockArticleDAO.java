package com.ponzmild.ponzarticle.dao;

import java.util.ArrayList;
import java.util.List;

import com.ponzmild.ponzarticle.entity.Article;

public class MockArticleDAO implements ArticleDAO {

	@Override
	public List<Article> findAll() {
		List<Article> articleList = new ArrayList<>();
		Article article1 = new Article(1L, "Micro Profile Getting Started", "Kenny Koh");
		Article article2 = new Article(2L, "Best Practice of Amazon ECS", "Emi Akasaka");
		Article article3 = new Article(3L, "What is GitOps?", "Stan Janevski");
		Article article4 = new Article(4L, "Deep Dive into Istio", "Kevin May");
		Article article5 = new Article(5L, "Thinking Apllication Network Protocol - HTTP, gRPC and GraphQL", "Luana Dondoe");
		articleList.add(article1);
		articleList.add(article2);
		articleList.add(article3);
		articleList.add(article4);
		articleList.add(article5);
		return articleList;
	}

}
