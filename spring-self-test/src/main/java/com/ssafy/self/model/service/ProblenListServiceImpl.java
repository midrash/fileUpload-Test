package com.ssafy.self.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.self.model.dto.Problem;
import com.ssafy.self.model.mapper.ProblemMapper;

@Service
public class ProblenListServiceImpl implements ProblemService {

	@Autowired ProblemMapper mapper;
	@Override
	public List<Problem> slelctProblem(){
		return mapper.selectProblem();
	}
}
