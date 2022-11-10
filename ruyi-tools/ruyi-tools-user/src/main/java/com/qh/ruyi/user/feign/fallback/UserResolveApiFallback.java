package com.qh.ruyi.user.feign.fallback;

import com.qh.ruyi.base.R;
import com.qh.ruyi.user.feign.UserQuery;
import com.qh.ruyi.user.feign.UserResolveApi;
import com.qh.ruyi.user.model.SysUser;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 用户API熔断
 *
 */
@Component
@Slf4j
public class UserResolveApiFallback implements FallbackFactory<UserResolveApi> {


    @Override
    public UserResolveApi create(Throwable throwable) {
        return new UserResolveApi() {
            /**
             * 根据id 查询用户详情
             *
             * @param id
             * @param userQuery
             * @return
             */
            @Override
            public R<SysUser> getById(Long id, UserQuery userQuery) {
                log.error("通过用户名查询用户异常:{}", id, throwable);
                return R.timeout();
            }
        };
    }
}
