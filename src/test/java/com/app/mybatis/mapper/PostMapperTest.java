package com.app.mybatis.mapper;

import com.app.mybatis.domain.MemberVO;
import com.app.mybatis.domain.PostDTO;
import com.app.mybatis.domain.PostVO;
import com.app.mybatis.enums.PostStats;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class PostMapperTest {

    @Autowired
    private PostMapper postMapper;
    @Autowired
    private MemberMapper memberMapper;

    @Test
    public void testInsert() {

        MemberVO memberVO = new MemberVO();
        memberVO.setMemberEmail("test123@gmail.com");
        memberVO.setMemberPassword("1234");
        memberMapper.selectOne(memberVO)
                .map(MemberVO::getId)
                .ifPresent(memberId -> {
                    PostVO postVO = new PostVO();
                    postVO.setPostTitle("나");
                    postVO.setPostContent("그렇게 힘든데");
                    postVO.setPostStats("PRIVATE".equals("PUBLIC") ? PostStats.Public : PostStats.Private);
                    postVO.setMemberId(memberId);
                    postMapper.insert(postVO);
                });

//        postVO.setPostTitle("testPost");
//        postVO.setPostContent("testContent");
//        postVO.setPostStats("PUBLIC".equals("PUBLIC") ? PostStats.Public : PostStats.Private);
//        postVO.setMemberId(1L);

    }

    @Test
    public void testSelectOne() {
        postMapper.selectOne(2L).map(PostDTO::toString).ifPresent(log::info);
    }

    @Test
    public void testSelectAll() {
        log.info("postVO: {}", postMapper.selectAll());
    }

    @Test
    public void testUpdate() {
        MemberVO memberVO = new MemberVO();
        memberVO.setMemberEmail("test123@gmail.com");
        memberVO.setMemberPassword("1234");
        memberMapper.selectOne(memberVO)
                .map(MemberVO::getId)
                .ifPresent(memberId -> {
                    PostVO postVO = new PostVO();
                    postVO.setId(1L);
                    postVO.setPostTitle("테스트 글");
                    postVO.setPostContent("테스트 내용");
                    postVO.setPostStats("PUBLIC".equals("PUBLIC") ? PostStats.Public : PostStats.Private);
                    postVO.setMemberId(memberId);
                });

    }
    @Test
    public void testDelete(){
        postMapper.delete(1L);
    }
}
