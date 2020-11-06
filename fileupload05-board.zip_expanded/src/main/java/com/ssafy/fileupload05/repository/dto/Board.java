package com.ssafy.fileupload05.repository.dto;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class Board {
	private int no;
	private String title;
	private String writer;
	private String content;
	private List<MultipartFile> attach;
	
	
	//첨부파일 처리위해서
	public List<MultipartFile> getAttach() {
		return attach;
	}
	public void setAttach(List<MultipartFile> attach) {
		this.attach = attach;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
