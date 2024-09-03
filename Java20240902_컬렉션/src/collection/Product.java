package collection;

import java.util.Objects;

public class Product {

	private String productID;
	private String productName;
	private String productPrice;
	
	public Product(String productID, String productName, String productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProductID() {
		return productID;
	}

	public String getProductName() {
		return productName;
	}
	
	public String getProductPrice() {
		return productPrice;
	}

	@Override
	public int hashCode() {
		return productID.hashCode();
	}

	
	/*equals() 두 문자열의 내용을 비교합니다. 두 문자열이 동일한 값을 가지고 있는지
	확인하는 메서드, 주소값이 다르더라도 문자열의 내용이 같으므로 equals()메서드를 비교하면
	true를 리턴한다.
	*/
	@Override
	public boolean equals(Object obj) {
		return this.productID.equals(((Product)obj).productID);
	}
	//(Product)obj -> Product로 형변환 시켜준 것
	
}
