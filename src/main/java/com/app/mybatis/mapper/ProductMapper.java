package com.app.mybatis.mapper;

import com.app.mybatis.domain.ProductVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    public void insert(ProductVO productVO);
    public ProductVO selectOne(Long id);
    public List<ProductVO> selectAll();
    public void update(ProductVO productVO);
    public void delete(Long id);
}
