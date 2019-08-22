/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: GitHubUser
 * Author:   Cenmom
 * Date:     2019/8/15 15:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package life.majiang.community.dto;

import lombok.Data;

@Data
public class GitHubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;
}