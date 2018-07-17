package com.ponzmild.ponzarticle.service;

import java.util.List;

import javax.ejb.Stateless;

import com.ponzmild.ponzarticle.dao.ArticleDAO;
import com.ponzmild.ponzarticle.dao.MockArticleDAO;
import com.ponzmild.ponzarticle.entity.Article;

@Stateless
public class QueryService {
	
	ArticleDAO articleDao = new MockArticleDAO();

	public List<Article> getArticles() {
		return articleDao.findAll();
	}
}
