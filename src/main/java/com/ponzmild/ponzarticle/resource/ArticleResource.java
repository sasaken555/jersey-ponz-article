package com.ponzmild.ponzarticle.resource;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ponzmild.ponzarticle.entity.Article;
import com.ponzmild.ponzarticle.service.QueryService;

@Path("articles")
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
public class ArticleResource {
	
	@Inject
	QueryService queryService;

    @GET
    @Path("hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello() {
        return "Hello, World!!";
    }

    @GET
    public List<Article> getArticles() {
        return queryService.getArticles();
    }
}
