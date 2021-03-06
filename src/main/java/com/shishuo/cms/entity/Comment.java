/*
 *	Copyright © 2013 Changsha Shishuo Network Technology Co., Ltd. All rights reserved.
 *	长沙市师说网络科技有限公司 版权所有
 *	http://www.shishuo.com
 */

package com.shishuo.cms.entity;

import java.util.Date;

import com.shishuo.cms.constant.CommentConstant;

/**
 * 评论实体
 * 
 * @author Administrator
 * 
 */

public class Comment {

	/**
	 * 评论Id
	 */
	private long commentId;
	/**
	 * 所属用户Id
	 */
	private long userId;
	/**
	 * 父亲Id
	 */
	private long fatherId;
	/**
	 * 评论名称
	 */
	private String name;
	/**
	 * 评论者网址
	 */
	private String url;
	/**
	 * 评论内容
	 */
	private String content;
	/**
	 * 所属Ip
	 */
	private String ip;

	/**
	 * 审核状态
	 */
	private CommentConstant.Status status;
	/**
	 * 时间
	 */
	private Date createTime;

	public long getCommentId() {
		return commentId;
	}

	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getFatherId() {
		return fatherId;
	}

	public void setFatherId(long fatherId) {
		this.fatherId = fatherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public CommentConstant.Status getStatus() {
		return status;
	}

	public void setStatus(CommentConstant.Status status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
