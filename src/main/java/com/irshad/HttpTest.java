package com.irshad;

public class HttpTest {

	public static void main(String[] args) {
		HttpsClientSolar http = new HttpsClientSolar();

		System.out.println("Testing 1 - Send Http GET request sendGetElectricStatusRequest");
		try {
			http.sendGetElectricStatusRequest();
			
			System.out.println("\nTesting 2 - Send Http POST request electricPermitRequest");
			http.sendPostElectricPermitRequest();
			
			System.out.println("Testing 3 - Send Http GET request sendGetStructuralStatusRequest");
			http.sendGetStructuralStatusRequest();

			System.out.println("\nTesting 4 - Send Http POST request electricPermitRequest");
			http.sendPostStructuralPermitRequest();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
