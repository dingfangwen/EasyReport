package com.easytoolsoft.easyreport.membership.service;

import com.easytoolsoft.easyreport.data.service.ICrudService;
import com.easytoolsoft.easyreport.membership.po.User;

/**
 * 系统用户服务类
 *
 * @author Tom Deng
 */
public interface IUserService extends ICrudService<User> {
    User getUserByAccount(String account);

    void encryptPassword(User user);
}