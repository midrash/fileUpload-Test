package com.ssafy.fileupload05.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssafy.fileupload05.board.service.BoardService;
import com.ssafy.fileupload05.repository.dto.Board;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService service;
	
	@GetMapping("/list")
	public void list(Model model) {
		model.addAttribute("list",service.list());
	}
	
	@GetMapping("/write")
	public void write() {
		
	}
	@PostMapping("/write")
	public String write(Board board) throws Exception {
		
		service.write(board);
		// 게시물 저장하기
		
		// 게시물 첨부파일 저장하기
		
		return "redirect:list";
	}
	/** 상세 페이지 이동 */
	@GetMapping("/detail")
	public void detail(int no) {
		service.detail(no);
	}
	
}
