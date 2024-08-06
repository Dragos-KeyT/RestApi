package tests;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import testdata.Booking;
import testdata.BookingDates;
import testdata.BookingId;

import static io.restassured.RestAssured.given;

public class TestRequestWithLombokBody {

	@Test
	public void testRequestLombok() {
	
		BookingDates bookingDate = new BookingDates("2024-01-01", "2024-05-05");
		Booking booking = new Booking("Ion", "Bob", 150, false, bookingDate, "Dinner");
		
		Response response = given(). 
				contentType(ContentType.JSON). 
				body(booking). 
				post("https://restful-booker.herokuapp.com/booking").
				then().extract().response();
		
		System.out.println(response.asString());
		
		BookingId bookingId = response.as(BookingId.class);
		
		System.out.println(bookingId.toString());
		
		System.out.println(booking.toString());
		System.out.println(bookingId.getBooking().toString());
		System.out.println(bookingId.getBookingid());
	}
	
	
}
