/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: AccesstokenDTO
 * Author:   Cenmom
 * Date:     2019/8/15 11:16
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package life.majiang.community.dto;

import lombok.Data;

@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}