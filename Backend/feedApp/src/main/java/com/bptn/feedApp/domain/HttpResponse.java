package com.bptn.feedApp.domain;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.http.HttpStatus;

public class HttpResponse {
	Date timeStamp;
	int httpStatusCode; // 200, 201, 400, 500
	HttpStatus httpStatus;
	String reason;
	String message;
	
	 public HttpResponse(int httpStatusCode, HttpStatus httpStatus, String reason, String message) {
	        this.timeStamp = new Date();
	        this.httpStatusCode = httpStatusCode;
	        this.httpStatus = httpStatus;
	        this.reason = reason;
	        this.message = message;
	}

	 public Date getTimeStamp() {
		 return timeStamp;
	 }

	 public void setTimeStamp(Date timeStamp) {
		 this.timeStamp = timeStamp;
	 }

	 public int getHttpStatusCode() {
		 return httpStatusCode;
	 }

	 public void setHttpStatusCode(int httpStatusCode) {
		 this.httpStatusCode = httpStatusCode;
	 }

	 public HttpStatus getHttpStatus() {
		 return httpStatus;
	 }

	 public void setHttpStatus(HttpStatus httpStatus) {
		 this.httpStatus = httpStatus;
	 }

	 public String getReason() {
		 return reason;
	 }

	 public void setReason(String reason) {
		 this.reason = reason;
	 }

	 public String getMessage() {
		 return message;
	 }

	 public void setMessage(String message) {
		 this.message = message;
	 }
	 
	 @Override
	 public String toString() {
	      String timeStamp = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(this.timeStamp);
	      return "HttpResponse [timeStamp=" + timeStamp + ", httpStatusCode=" + httpStatusCode + ", httpStatus="
	              + httpStatus + ", reason=" + reason + ", message=" + message + "]";
	 }
}
