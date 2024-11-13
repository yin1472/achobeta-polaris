package com.achobeta.api;

import com.achobeta.api.dto.device.GetUserDeviceRequestDTO;
import com.achobeta.api.dto.device.GetUserDeviceResponseDTO;
import com.achobeta.types.Response;

import javax.validation.Valid;

/**
 * @author huangwenxing
 * @date 2024/11/9
 */
public interface IDeviceService {
    Response<GetUserDeviceResponseDTO> getDevices(@Valid GetUserDeviceRequestDTO getUserDeviceRequestDTO);
}
