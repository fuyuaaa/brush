package top.fuyuaaa.brush.dyopen.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import top.fuyuaaa.brush.common.BaseData;

import java.io.Serializable;

/**
 * @author : fuyuaaa
 * @date : 2020-10-21 09:56
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RefreshTokenResult extends BaseData implements Serializable {

    private static final long serialVersionUID = 3956950431279515707L;

    @JSONField(name = "expires_in")
    private Integer expiresIn;

    @JSONField(name = "refresh_token")
    private String refreshToken;

}
