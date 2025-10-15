package com.app.mybatis.domain;

import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode @ToString
public class ProductVO {
    private Long id;
    private String productName;
    private Integer productPrice;
    private Integer productStock;
}
