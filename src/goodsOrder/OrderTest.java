package goodsOrder;

public class OrderTest {

	public static void main(String[] args) {
		Order orderHong = new Order();
		orderHong.setOrderNumber(201830120001L);
		orderHong.setOrderId("abc123");
		orderHong.setOrderDate("2018년 3월 12일");
		orderHong.setClientName("홍길순");
		orderHong.setOrderGoodsNumber("PD0345-12");
		orderHong.setDeliveryAdress("서울시 영등포구 여의도동 20번지");
		
		System.out.println("주문번호 : " + orderHong.getOrderNumber());
		System.out.println("주문자 아이디 : " + orderHong.getOrderId());
		System.out.println("주문날짜 : " + orderHong.getOrderDate());
		System.out.println("주문자 이름 : " + orderHong.getClientName());
		System.out.println("주문 상품번호 : " + orderHong.getOrderGoodsNumber());
		System.out.println("배송 주소 : " + orderHong.getDeliveryAdress());
		
		
	}
}
