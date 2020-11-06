package com.ssafy.fileupload05.board.service;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ssafy.fileupload05.repository.dto.Board;
import com.ssafy.fileupload05.repository.dto.BoardFile;
import com.ssafy.fileupload05.repository.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	
	public static void main(String[] args) {
		System.out.println(new SimpleDateFormat("/yyyy/MM/dd").format(new Date()));
	}
	
	@Autowired
	BoardMapper mapper;
	
	@Override
	public List<Board> list() {
		return mapper.selectBoard();
	}
	
	@Override
	public void write(Board board) throws Exception {
		// 게시물 저장하기
		mapper.insertBoard(board);
		
		// 게시물 첨부파일 저장하기
		/*
			private int fileNo;  -- DB
			private int no;      -- 위에서 자동 생성된 글번호 가져오기  (??)   
			private String filePath;   -- /board
			private String orgName;    -- MultipartFile
			private String systemName; -- UUID
			private int fileSize;      -- MultipartFile
			private String fileType;   -- MultipartFile
		 */
		List<MultipartFile> attachs = board.getAttach();
		for (MultipartFile mf : attachs) {
			// mapper.insertFile(file);
			if (mf.isEmpty()) continue;
			
			String orgName = mf.getOriginalFilename();
			String ext = "";
			int index = orgName.lastIndexOf(".");
			if (index != -1) {
				ext = orgName.substring(index);
			}
			// 저장할 이름
			String systemName = UUID.randomUUID().toString() + ext;

			// 저장될 경로
			String pathRoot = "C:/SSAFY/upload";
			String modulePath = "/board" + new SimpleDateFormat("/yyyy/MM/dd").format(new Date());
			File pFile = new File(pathRoot + modulePath);
			if (pFile.exists() == false) {
				pFile.mkdirs();
			}
			
			// 서버에 파일 생성하기
			mf.transferTo(new File(pFile, systemName));
			
			BoardFile bf = new BoardFile();
			bf.setNo(board.getNo());  // 게시글 번호
			bf.setFilePath(modulePath);  // 모듈별로 저장되는 경로 설정
			bf.setFileSize((int)mf.getSize());  // 파일의 크기 : byte
			bf.setFileType(mf.getContentType());  // 파일의 타입
			bf.setOrgName(orgName);  // 사용자가 선택한 파일의 이름
			bf.setSystemName(systemName);  // 실제 저장된 이름
			
			mapper.insertBoardFile(bf);
		}
	}

	@Override
	public Board detail(int no) {
		// 게시물 정보
		Board board = mapper.selectBoardByNo(no);
		// 파일 목록 정보
		board.setFileList(mapper.selectBoardFile(no));
		
		return board;
	}
}








