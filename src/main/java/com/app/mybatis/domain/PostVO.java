package com.app.mybatis.domain;

import com.app.mybatis.enums.PostStats;
import lombok.*;

@Getter
@Setter @NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode @ToString
public class PostVO {
    private Long id;
    private String postTitle;
    private String postContent;
    private Integer postReadCount;
    private PostStats postStats;
    private Long memberId;
}
