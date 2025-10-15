package com.app.mybatis.mapper;

import com.app.mybatis.domain.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.lang.reflect.Member;
import java.util.Optional;

@Mapper
public interface MemberMapper {
    public void insert(MemberVO memberVO);
    public Optional<MemberVO> selectOne(MemberVO memberVO);
    public void update(MemberVO memberVO);
    public void delete(String id);
}
