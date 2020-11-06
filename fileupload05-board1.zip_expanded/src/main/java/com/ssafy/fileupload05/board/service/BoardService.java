package com.ssafy.fileupload05.board.service;

import java.util.List;
import java.util.Map;

import com.ssafy.fileupload05.repository.dto.Board;

public interface BoardService {
	// 게시물 목록 가져오기
	List<Board> list();

	// 게시물 저장하기
	void write(Board board) throws Exception;

	Map<String, Object> detail(int no);
}
