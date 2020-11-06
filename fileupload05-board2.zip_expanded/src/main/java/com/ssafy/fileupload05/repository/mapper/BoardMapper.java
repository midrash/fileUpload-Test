package com.ssafy.fileupload05.repository.mapper;

import java.util.List;

import com.ssafy.fileupload05.repository.dto.Board;
import com.ssafy.fileupload05.repository.dto.BoardFile;

public interface BoardMapper {
//	@Select("select * from board order by no desc")
	List<Board> selectBoard();
	
	// 게시물 저장하기
	void insertBoard(Board board);

	// 게시물 파일 저장하기
	void insertBoardFile(BoardFile bf);

	// 게시물 상세 정보
	Board selectBoardByNo(int no);

	// 게시물에 대한 첨부파일
	List<BoardFile> selectBoardFile(int no);
}






