package com.datfuslab.request;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class BookingRequestObject {
	
	private Long id;
	private long bookingDetailsId;
	private String userId;
//	private String vehicleImages1;
//	private String vehicleImages2;
//	private String vehicleImages3;
//	private String vehicleImages4;
	private String vehicleBrand;
	private String vehicleName;
//	private String engineNumber;
//	private String vehicleNumber;
//	private String vehicleReceiptImage;
//	private String vehicleNumberImage;
//	private String vehicleFrontImage;
//	private String vehicleBackImage;
//	private String vehicleLeftImage;
//	private String vehicleRightImage;
	private String city;
	private String areaFrom;
	private String areaTo;
	private int vehicleQuantity;
	private double venderVehiclePrice;
	private double priceLimit;
	private double adminVehiclePrice;
	private String vehicleType;
	private String urlPath;
	private String status;
	private String userRole;
	private String discription;
	private String vehicleDetailsType;
	private String bookingId;
	private double bookingPrice;
	private String memberType;
	private String type;
	
	private String customerMobile;
	private String countryCode;
	private String customerName;
	private String firstName;
	private String lastName;
	private int bookedQuantity;
	private String vehicleOwnner;
	private String deliveryExecutiveId;
	private String deliveryExecutiveName;
	private String vehicleOwnnerType;
	
	private String fromDate1;
	private Date fromDate;
	private String toDate1;
	private Date toDate;
	
	private Date startDate;
	private Date endDate;
	
	private int deliveryTime;
	private int pickupTime;

	private String requestFor;
	private String enquirySource;
	private String entryType;
	
	private int deliveryCharges;
	private int receivedAmount;
	private int balenceAmount;
	private int totalAmount;
	private double miscellaneous;
	private String refundReason;
	private Date refundDate;
	private String refundedBy;
	private String refundedByName;
	private String notes;
	
	private String cancelationFor;
	private String cancelationReason;
	private String cancelBy;
	private String cancelByName;
	
	private String adminId;
	private String adminName;
	
	private String dayBookCount;
	private String dayReceivedAmount;
	private String weekBookCount;
	private String weekBookAmount;
	private String enquiryCount;
	private String followUpCount;
	private String lostCount;
	private String modeOfPayment;
	
	private Long todaysCount;
	private Long tomorrowCount;
	private Long afterTomorrowCont;
	private Long weeklyCount;
	private Long halfMonthCount;
	private Long monthlyCount;
	
	private String receiptNumber;
	private String receiptStatus;
	private String invoiceNumber;
	private String invoiceStatus;
	
	private Date createdAt;
	private Date updatedAt;
	private String createdBy;
	private String updatedBy;
	private String createdbyName;
	private double securityDeposit;
	
	private Long startAmount;
	private Long endAmount;
	private Long bonusAmount;
	
	
	private String respMesg;
	private int respCode;
	
	

}
