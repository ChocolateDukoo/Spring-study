package org.zerock.mapper;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
// Java Config
//@ContextConfiguration(classes = { org.zerock.config.RootConfig.class // })
@Log4j
public class ReplyMapperTests {
	
	// 테스트 전 해당 번호의 게시물이 존재하는지 반드시 확인해야 한다.
	private Long[] bnoArr = { 5500407L, 5500406L, 5500405L, 5500404L, 5500403L };

	@Setter(onMethod_ = @Autowired)
	private ReplyMapper mapper;
	
	// 등록 테스트
//	@Test
//	public void testCreate() {
//		
//		IntStream.rangeClosed(1, 10).forEach(i -> {
//			
//			ReplyVO vo = new ReplyVO();
//			
//			// 게시물의 번호
//			vo.setBno(bnoArr[i % 5]);
//			vo.setReply("댓글 테스트 " + i);
//			vo.setReplyer("replyer" + i);
//			
//			mapper.insert(vo);
//		});
//	}
	
	@Test
	public void testMapper() {
		
		log.info(mapper);
	}
	
	// 조회 테스트
	@Test
	public void testRead() {
		
		Long targetRno = 5L;
		
		ReplyVO vo = mapper.read(targetRno);
		
		log.info(vo);
		
	}
	
	// 삭제 테스트
	@Test
	public void testDelete() {

		Long targetRno = 1L;

		mapper.delete(targetRno);
	}
	
	// 수정 테스트
	@Test
	public void testUpdate() {
		
		Long targetRno = 10L;
		
		ReplyVO vo = mapper.read(targetRno);
		
		vo.setReply("Update Reply");
		
		int count = mapper.update(vo);
		
		log.info("UPDATE COUNT: " + count);
	}
	
	@Test
	public void testLIst() {
		
		Criteria cri = new Criteria();
		// 5500407L
		List<ReplyVO> replies  = mapper.getListWithPaging(cri, bnoArr[0]);
		
		replies.forEach(reply -> log.info(reply));
	}
	
	// 댓글 페이징 처리 테스트
	@Test
	public void testList2() {
		
		Criteria cri = new Criteria(2, 10);
		
		// 5500407L
		
		List<ReplyVO> replies = mapper.getListWithPaging(cri, 5500407L);
		
		replies.forEach(reply -> log.info(reply));
		
	}
}
