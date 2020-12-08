package com.yedam.board;

import java.util.List;
import java.util.Scanner;

import com.yedam.board.BoardService;
import com.yedam.board.BoardSerivceImpl;
import com.yedam.board.BoardVO;
import com.yedam.db2.EmployeeVO;

public class BoardMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BoardService service = new BoardSerivceImpl();
		while (true) {

			System.out.println("-------------------------------");
			System.out.println("1.리스트 2.글번 3.등록 4.삭제 5.수정");
			System.out.println("-------------------------------");
			System.out.println("선택> ");
			int selectNo = scn.nextInt();
			scn.nextLine();
			if (selectNo == 1) {
				List list = service.getBoardList();
				for (Object vo : list) {
					BoardVO board = (BoardVO) vo;
					board.showBoaInfo();
				}
			} else if (selectNo == 2) {
				System.out.println("d");

				int boardNo = scn.nextInt();
				BoardVO vo = service.getBoard(boardNo);
				vo.showBoaInfo();

			} else if (selectNo == 3) {
				System.out.println("게시물번호를 입력하세요.");
				Int noardNo = scn.nextLine();
				System.out.println("제목을 입력하세요.");
				String title = scn.nextLine();
				System.out.println("내용을 입력하세요");
				String content = scn.nextLine();
				System.out.println("작성자를 입력하세요");
				String writer = scn.nextLine();
				System.out.println("작성일을 입력하세요.");
				int creationDate = scn.nextInt();

				BoardVO vo = new BoardVO(boardNo, title, content, writer, creationDate);
				vo.setBoardNo(creationDate);
				service.insertBoard(vo);

			} else if (selectNo == 4) {
				System.out.println("수정할 게시물번호:");
				int boardNo = scn.nextInt();
				System.out.println("수정할 제목:");
				scn.nextLine();
				String title = scn.nextLine();
				System.out.println("수정할 내용:");
				String content = scn.nextLine();
				System.out.println("수정할 작성자:");
				String writer = scn.nextLine();

				

				// int salary = scn.nextInt();

				BoardVO vo = new BoardVO();
				vo.setBoardNo(boardNo);
				vo.setTitle(title);
				vo.setContent(content);
				vo.setWriter(wirter);
				// vo.setSalary(salary);
				service.updateBoard(vo);

			} else if (selectNo == 5) {
				System.out.println("삭제할 게시물의 번호를 입력하세요.");
				int boardNo = scn.nextInt();
				service.deleteBoard(boardNo);

			} else if (selectNo == 6) {
				break;
			}
		}
		System.out.println("종료합니다.");
	}
}

