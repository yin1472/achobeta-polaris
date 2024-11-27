package com.achobeta.api;

import com.achobeta.api.dto.LoginRequestDTO;
import com.achobeta.api.dto.LoginResponseDTO;
import com.achobeta.types.Response;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * @Author: 严豪哲
 * @Description: 登录服务接口定义
 * @Date: 2024/11/9 10:07
 * @Version: 1.0
 */

public interface ILoginService {

    /**
     * 登录
     * @param loginRequestDTO 登录请求DTO
     * @return 登录响应DTO
     */
    Response<LoginResponseDTO> login(@Valid @RequestBody LoginRequestDTO loginRequestDTO, HttpServletRequest request, HttpServletResponse response);

    /**
     * 刷新 (携带refresh_token)
     * @return 登录响应DTO
     */
    Response<LoginResponseDTO> refresh(HttpServletRequest request, HttpServletResponse response);
}
