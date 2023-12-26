package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

public interface ReplyMapper {

	public int insert(ReplyVO vo); // 댓글 추가
	
	public ReplyVO read(Long bno); // 특정 댓글 읽기
	
	public int delete(Long rno); // 특정 댓글 삭제
	
	public int update(ReplyVO reply); // 특정 댓글 수정
	
	public List<ReplyVO> getListWithPaging( // 댓글 페이징 처리
				@Param("cri") Criteria cri,
				@Param("bno") Long bno);
	
	public int getCountByBno(Long bno); // 댓글 숫자 파악
	
}
