package com.datfuslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.datfuslab.constant.Constant;
import com.datfuslab.expections.BizException;
import com.datfuslab.request.Request;
import com.datfuslab.request.BookingRequestObject;
import com.datfuslab.response.GenricResponse;
import com.datfuslab.response.Response;
import com.datfuslab.services.OnlineBookingServices;


@CrossOrigin(origins = "*")
@RestController
public class OnlineBookingController {

	@Autowired
	private OnlineBookingServices onlineBookingServices;
	
	
	@RequestMapping(path = "vehicleBooking", method = RequestMethod.POST)
	public Response<BookingRequestObject>vehicleBooking(@RequestBody Request<BookingRequestObject> vehicleRequestObject)
	{
		GenricResponse<BookingRequestObject> responseObj = new GenricResponse<BookingRequestObject>();
		try {
			BookingRequestObject responce =  onlineBookingServices.vehicleBooking(vehicleRequestObject);
			return responseObj.createSuccessResponse(responce, Constant.SUCCESS_CODE);
		}catch (BizException e) {
			return responseObj.createErrorResponse(Constant.BAD_REQUEST_CODE,e.getMessage());
		} 
 		catch (Exception e) {
			return responseObj.createErrorResponse(Constant.INTERNAL_SERVER_ERR, e.getMessage());
		}
	 }
}
