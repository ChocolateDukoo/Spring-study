package org.zerock.mapper;

import java.util.List;

// import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardMapper {

	//@Select("select * from tbl_board where bno > 0")
	
	// 게시물 조회
	public List<BoardVO> getList();
	
	// 게시물 검색 조건
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	// 게시물 등록
	public void insert(BoardVO board);
	
	// 게시물 등록
	public void insertSelectKey(BoardVO board);
	
	// 특정 게시물 조회
	public BoardVO read(Long bno);
	
	// 게시물 삭제
	public int delete(Long bno);
	
	// 게시물 업데이트
	public int update(BoardVO board);
	
	// MyBatis에서 전체 데이터 개수 처리
	public int getTotalCount(Criteria cri);
	
}
