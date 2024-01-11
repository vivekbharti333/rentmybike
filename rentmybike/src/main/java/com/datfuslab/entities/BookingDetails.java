package com.datfuslab.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "booking_details")
public class BookingDetails {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "enquiry_source")
	private String enquirySource;
	
	@Column(name = "country_code")
	private String countryCode;
	
	@Column(name = "customer_mobile")
	private String customerMobile;
	
	@Column(name= "customer_name")
	private String customerName;
	
	@Column(name  ="booking_id")
	private String bookingId;
	
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "vehicle_owner_type")
	private String vehicleOwnnerType;
	
	@Column(name = "vehicle_owner")
	private String vehicleOwnner;

	@Column(name = "vehicle_type")
	private String vehicleType;
	
	@Column(name = "Vehicle_brand")
	private String vehicleBrand;
	
	@Column(name = "vehicle_name")
	private String vehicleName;
	
	@Column(name = "vehicle_quantity")
	private int vehicleQuantity;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "payment_mode")
	private String modeOfPayment;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "area_from")
	private String areaFrom;
	
	@Lob
	@Column(name = "area_to")
	private String areaTo;
	
	@Column(name = "vehicle_details_type")
	private String vehicleDetailsType;
	
	@Column(name = "vender_vehicle_price")
	private double venderVehiclePrice;
	
	@Column(name = "admin_vehicle_price")
	private double adminVehiclePrice;
	
	@Column(name = "booking_price")
	private double bookingPrice;
	
	@Column(name = "from_date")
	private Date fromDate;
	
	@Column(name = "to_date")
	private Date toDate;
	
	@Column(name = "delivery_time")
	private int deliveryTime;
	
	@Column(name = "pickup_time")
	private int pickupTime;
	
	@Column(name = "delivery_charges")
	private int deliveryCharges;
	
	@Column(name = "received_amount")
	private int receivedAmount;
	
	@Column(name = "balence_amount")
	private int balenceAmount;
	
	@Column(name = "total_amount")
	private int totalAmount;	
	
	@Lob
	@Column(name = "notes")
	private String notes;
	
	@Column(name = "admin_id")
	private String adminId;
	
	@Column(name = "admin_name")
	private String adminName;
	
	@Column(name = "delivery_executive_id")
	private String deliveryExecutiveId;
	
	@Column(name = "delivery_executive_name")
	private String deliveryExecutiveName;
	
	@Column(name = "re_booking_status")
	private String reBookingStatus;
	
	@Column(name = "miscellaneous")
	private double miscellaneous;
	
	@Lob
	@Column(name = "cancelation_reason")
	private String cancelationReason;
	
	@Column(name = "cancelation_for")
	private String cancelationFor;
	
	@Column(name = "cancelation_request_number")
	private String cancelationRequestNumber;
	
	@Column(name = "cancel_by")
	private String cancelBy;
	
	@Column(name = "cancel_by_name")
	private String cancelByName;
	
	@Column(name = "cancel_date")
	private Date cancelDate;
	
	@Column(name = "receipt_number")
	private String receiptNumber;
	
	@Column(name = "receipt_status")
	private String receiptStatus;
	
	@Column(name = "invoice_number")
	private String invoiceNumber;
	
	@Column(name = "invoice_status")
	private String invoiceStatus;
	
	@Column(name = "refund_date")
	private Date refundDate;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "createdby_name")
	private String createdbyName;
	
	@Column(name = "vehicle_number")
	private String vehicleNumber;
	
	@Column(name = "vehicle_receipt_image")
	private String vehicleReceiptImage;
	
	@Column(name = "vehicle_number_image")
	private String vehicleNumberImage;
	
	@Column(name = "vehicle_front_image")
	private String vehicleFrontImage;
	
	@Column(name = "vehicle_back_image")
	private String vehicleBackImage;
	
	@Column(name = "vehicle_left_image")
	private String vehicleLeftImage;
	
	@Column(name = "vehicle_right_image")
	private String vehicleRightImage;
	
	@Column(name = "created_at")
	private Date createdAt;
	
	@Column(name = "updated_at")
	private Date updatedAt;
	
	@Column(name = "security_deposit")
	private double securityDeposit;
	

	
}
