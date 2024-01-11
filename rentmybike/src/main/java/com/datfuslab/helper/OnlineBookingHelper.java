package com.datfuslab.helper;

import java.text.ParseException;
import java.util.Date;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.datfuslab.constant.Constant;
import com.datfuslab.dao.BookingDetailsDao;
import com.datfuslab.entities.BookingDetails;
import com.datfuslab.expections.BizException;
import com.datfuslab.request.BookingRequestObject;

public class OnlineBookingHelper {
	
	@Autowired
	private BookingDetailsDao bookingDetailsDao;

	
	public void validateBookingRequest(BookingRequestObject vehicleRequestObject) throws BizException {
		if (vehicleRequestObject == null) {
			throw new BizException(Constant.BAD_REQUEST_CODE, "Bad Request Object Null");
		}
	}
	
	
	
	@Transactional
	public BookingDetails getVehicleDetailsByBookingId(String bookingId) {
		CriteriaBuilder criteriaBuilder = bookingDetailsDao.getSession().getCriteriaBuilder();
		CriteriaQuery<BookingDetails> criteriaQuery = criteriaBuilder.createQuery(BookingDetails.class);
		Root<BookingDetails> root = criteriaQuery.from(BookingDetails.class);
		Predicate restriction = criteriaBuilder.equal(root.get("bookingId"), bookingId);
		criteriaQuery.where(restriction);
		BookingDetails userDetails = bookingDetailsDao.getSession().createQuery(criteriaQuery).uniqueResult();
		return userDetails;
	}
	
	
	@Transactional
	public BookingDetails getVehicleDetailsByObj(BookingRequestObject vehicleRequest) throws ParseException {

		BookingDetails bookingDetails = new BookingDetails();

		bookingDetails.setEnquirySource(vehicleRequest.getEnquirySource());
		bookingDetails.setVehicleType(vehicleRequest.getVehicleType());
		bookingDetails.setVehicleBrand(vehicleRequest.getVehicleBrand());
		bookingDetails.setVehicleName(vehicleRequest.getVehicleName());
		bookingDetails.setCity(vehicleRequest.getCity());
		bookingDetails.setVehicleQuantity(vehicleRequest.getVehicleQuantity());
		bookingDetails.setAdminVehiclePrice(vehicleRequest.getAdminVehiclePrice());
		bookingDetails.setCustomerName(vehicleRequest.getFirstName() + " " + vehicleRequest.getLastName());

		bookingDetails.setCountryCode(vehicleRequest.getCountryCode());
		bookingDetails.setCustomerMobile(vehicleRequest.getCustomerMobile());
		bookingDetails.setVehicleDetailsType(vehicleRequest.getVehicleDetailsType());
		bookingDetails.setStatus(vehicleRequest.getStatus());
		bookingDetails.setReBookingStatus("OPEN");
		bookingDetails.setBookingPrice(vehicleRequest.getBookingPrice());
		bookingDetails.setMiscellaneous(vehicleRequest.getMiscellaneous());
		bookingDetails.setFromDate(vehicleRequest.getFromDate());
		bookingDetails.setToDate(vehicleRequest.getToDate());
		bookingDetails.setDeliveryTime(vehicleRequest.getDeliveryTime());
		bookingDetails.setPickupTime(vehicleRequest.getPickupTime());
		bookingDetails.setAreaFrom(vehicleRequest.getAreaFrom());
		bookingDetails.setAreaTo(vehicleRequest.getAreaTo());

		bookingDetails.setDeliveryCharges(vehicleRequest.getDeliveryCharges());
		bookingDetails.setReceivedAmount(vehicleRequest.getReceivedAmount());
		bookingDetails.setBalenceAmount(vehicleRequest.getBalenceAmount());
		bookingDetails.setTotalAmount(vehicleRequest.getTotalAmount());
		bookingDetails.setNotes(vehicleRequest.getNotes());
		bookingDetails.setSecurityDeposit(vehicleRequest.getSecurityDeposit());

		bookingDetails.setAdminId("9922957643");
		bookingDetails.setAdminName("James N");
		
		bookingDetails.setDeliveryExecutiveId("N/A");
		bookingDetails.setDeliveryExecutiveName("N/A");

		bookingDetails.setCreatedBy(vehicleRequest.getCreatedBy());
		bookingDetails.setCreatedbyName(vehicleRequest.getCreatedbyName());
		bookingDetails.setCreatedAt(new Date());
		bookingDetails.setUpdatedAt(new Date());
		return bookingDetails;
	}

	@Transactional
	public BookingDetails saveBookingDetails(BookingDetails bookingDetails) {
		bookingDetailsDao.persist(bookingDetails);
		return bookingDetails;
	}


}
