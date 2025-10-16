package com.app.mybatis.mapper;

import com.app.mybatis.domain.PostDTO;
import com.app.mybatis.domain.PostVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Mapper
public interface PostMapper {
    public void insert(PostVO postVO);
    public Optional<PostDTO> selectOne(Long id);
    public void update(PostVO postVO);
    public void delete(Long id);
    public List<PostDTO> selectAll();
    public void updateReadCount(Long id);
    public List<PostDTO> selectAllWithOrder(String order);
    public List<PostDTO> selectAllWithParams(HashMap<String, Object> params);
}
