package com.app.mybatis.mapper;

import com.app.mybatis.domain.MemberVO;
import com.app.mybatis.domain.ProductVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MemberMapperTests {
    @Autowired
    private MemberMapper memberMapper;
    @Autowired
    private ProductMapper productMapper;

    @Test
    public void test() {
        MemberVO memberVO = new MemberVO();
        memberVO.setMemberName("vb");
        memberVO.setMemberPassword("1234");
        memberVO.setMemberEmail("fpqk33@naver.com");
        memberMapper.insert(memberVO);
    }
    @Test
    public void testSelectOne() {

        MemberVO inputMemberVO = new MemberVO();

        inputMemberVO.setMemberEmail("fpqk33@naver.com");
        inputMemberVO.setMemberPassword("1234");
        memberMapper.selectOne(inputMemberVO).ifPresent(resultVO -> {
            log.info("memberVO: {}", resultVO);
        });
    }

    @Test
    public void testUpdate() {
        MemberVO inputMember = new MemberVO();
        inputMember.setMemberName("보자기");
        inputMember.setMemberPassword("3424");
        inputMember.setMemberEmail("ourneko033@gmail.com");
        inputMember.setId(1L);

        memberMapper.update(inputMember);
    }

    @Test
    public void testDelete() {
        memberMapper.delete("1");
    }

    @Test
    public void testProductInsert(){
        ProductVO productVO = new ProductVO();
        productVO.setProductName("vovo");
        productVO.setProductPrice(50000);
        productVO.setProductStock(50);

        productMapper.insert(productVO);
    }
    @Test
    public void testProductSelectOne(){
        ProductVO productVO = productMapper.selectOne(1L);
        log.info("productVO: {}", productVO);
    }

    @Test
    public void testProductSelectAll(){
        productMapper.selectAll().forEach(productVO -> log.info("productVO: {}", productVO));
    }

    @Test
    public void testProductUpdate(){
        ProductVO productVO = new ProductVO();
        productVO.setId(1L);
        productVO.setProductName("vovo2");
        productVO.setProductPrice(50000);
        productVO.setProductStock(50);

        productMapper.update(productVO);
    }
    @Test
    public void testProductDelete(){
        productMapper.delete(1L);
    }

}
