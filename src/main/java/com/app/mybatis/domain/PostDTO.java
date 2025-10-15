package com.app.mybatis.domain;

import com.app.mybatis.enums.PostStats;
import lombok.*;

@Getter @Setter
@ToString @NoArgsConstructor @AllArgsConstructor
public class PostDTO {
    private Long id;
    private String postTitle;
    private String postContent;
    private Integer postReadCount;
    private PostStats postStats;
    private Long memberId;
    private String memberName;
    private String memberEmail;
}
