package com.chuchulev.hotel_booking.service.interfac;

import com.chuchulev.hotel_booking.dto.LoginRequest;
import com.chuchulev.hotel_booking.dto.Response;
import com.chuchulev.hotel_booking.entity.User;

public interface IUserService {

    Response register(User user);
    Response login(LoginRequest loginRequest);
    Response getAllUsers();
    Response getUserBookingHistory(String userId);
    Response deleteUser(String userId);
    Response getUserById(String userId);
    Response getMyInfo(String email);
}
