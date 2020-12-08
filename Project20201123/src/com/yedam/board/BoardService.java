package com.yedam.board;

import java.util.List;

import com.yedam.board.BoardVO;

public interface BoardService {
	public List getBoardList(); 
	public BoardVO getBoard(int boaardNo); 
	public void insertBoard(BoardVO boardVo); 
	public void updateBoard(BoardVO boardVo);
	public void deleteBoard(int boardNo); 
}
