package com.ponzmild.ponzarticle.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.*;

@XmlRootElement
@Entity
@Data
@NoArgsConstructor
public class Article {

	@Id
	private Long articleId;
	
	@NotNull
	private String title;

	@NotNull
	private String author;
	
	private int pages;
		
	private String description;
	
	public Article(Long articleId, String title, String author) {
		this.articleId = articleId;
		this.title = title;
		this.author = author;
		this.pages = 1;
	}
}
