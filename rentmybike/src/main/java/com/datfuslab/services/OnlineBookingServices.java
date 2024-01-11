package com.datfuslab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.datfuslab.constant.Constant;
import com.datfuslab.entities.BookingDetails;
import com.datfuslab.expections.BizException;
import com.datfuslab.helper.OnlineBookingHelper;
import com.datfuslab.request.Request;
import com.datfuslab.request.BookingRequestObject;

@Service
public class OnlineBookingServices {
	
	
	@Autowired
	private OnlineBookingHelper onlineBookingHelper;
	
	@Transactional
	public BookingRequestObject vehicleBooking(Request<BookingRequestObject> bookingRequestObject)
			throws BizException, Exception {
		BookingRequestObject bookingRequest = (BookingRequestObject) bookingRequestObject.getPayload();
		onlineBookingHelper.validateBookingRequest(bookingRequest);

		BookingDetails bookingId = onlineBookingHelper.getVehicleDetailsByBookingId(bookingRequest.getBookingId());
		if (bookingId == null) {

			BookingDetails bookingDetails = onlineBookingHelper.getVehicleDetailsByObj(bookingRequest);
			bookingDetails = onlineBookingHelper.saveBookingDetails(bookingDetails);

			bookingRequest.setRespCode(Constant.SUCCESS_CODE);
			bookingRequest.setRespMesg(Constant.REGISTERED_SUCCESS);
			return bookingRequest;
		} else {
			bookingRequest.setRespCode(Constant.BAD_REQUEST_CODE);
			bookingRequest.setRespMesg("Already Exists");
			return bookingRequest;
		}
	}

}
