package top.fuyuaaa.brush.dyopen.api;

import lombok.Getter;
import lombok.Setter;
import top.fuyuaaa.brush.common.Request;
import top.fuyuaaa.brush.common.UrlBuilder;
import top.fuyuaaa.brush.common.error.RequestErrorException;
import top.fuyuaaa.brush.dyopen.model.UserInfoResult;
import top.fuyuaaa.brush.dyopen.constant.DyOpenApiConstants;

/**
 * 获取授权用户信息
 *
 * @author : fuyuaaa
 * @date : 2020-12-03 16:17
 */
@Getter
@Setter
public class UserInfoApi {
    private Request request;

    public UserInfoResult getUserInfo(String openId, String accessToken) throws RequestErrorException {
        String url = UrlBuilder.buildUrl(DyOpenApiConstants.USER_INFO, openId, accessToken);
        return request.get(url, UserInfoResult.class);
    }
}
