package com.univeristyguide.login.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="comments")
public class Comments extends Auditable<String>{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_user",nullable=false)
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_posts",nullable=false)
	private Posts posts;
	
	@Column(name="comments_content")
	private String commentsContent;
	
	@Column(name="likes")
	private int likesCount;
	
	@Column(name="is_anonymous")
	private boolean isAnonymous;

	
	@Column(name="has_likes", nullable=false)
	private boolean likes;
	
	
	public Comments() {
		
	}




	

	public Comments(int id, User user, Posts posts, String commentsContent, int likesCount, boolean isAnonymous,
			boolean likes) {
		super();
		this.id = id;
		this.user = user;
		this.posts = posts;
		this.commentsContent = commentsContent;
		this.likesCount = likesCount;
		this.isAnonymous = isAnonymous;
		this.likes = likes;
	}






	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Posts getPosts() {
		return posts;
	}


	public void setPosts(Posts posts) {
		this.posts = posts;
	}


	public String getCommentsContent() {
		return commentsContent;
	}


	public void setCommentsContent(String commentsContent) {
		this.commentsContent = commentsContent;
	}



	public boolean isAnonymous() {
		return isAnonymous;
	}


	public void setAnonymous(boolean isAnonymous) {
		this.isAnonymous = isAnonymous;
	}


	public int getLikesCount() {
		return likesCount;
	}


	public void setLikesCount(int likesCount) {
		this.likesCount = likesCount;
	}


	public boolean isLikes() {
		return likes;
	}

	public void setLikes(boolean likes) {
		this.likes = likes;
	}






	@Override
	public String toString() {
		return "Comments [id=" + id + ", user=" + user + ", posts=" + posts + ", commentsContent=" + commentsContent
				+ ", likesCount=" + likesCount + ", isAnonymous=" + isAnonymous + ", likes=" + likes + "]";
	}


	
	
	
	
}  