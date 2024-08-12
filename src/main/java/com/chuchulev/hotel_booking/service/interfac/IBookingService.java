package com.chuchulev.hotel_booking.service.interfac;

import com.chuchulev.hotel_booking.dto.Response;
import com.chuchulev.hotel_booking.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);
    Response findBookingByConfirmationCode(String confirmationCode);
    Response getAllBookings();
    Response cancelBooking(Long bookingId);
}
