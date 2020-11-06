package com.ssafy.fileupload05.board.controller;

import java.util.Map;

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
    
    /** 목록 이동 */
	@GetMapping("/list")
    public void list(Model model) {
		model.addAttribute("list", service.list());
    }
	
	/** 등록폼 이동 */
	@GetMapping("/write")
    public void write() {}
	
	/** 상세 페이지 이동 */
	@GetMapping("/detail")
	public void detail(int no, Model model) {
		model.addAttribute("board", service.detail(no));
	}
	
	@PostMapping("/write")
    public String write(Board board) throws Exception {
		try {
			service.write(board);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return "redirect:list";
    }
	
}












