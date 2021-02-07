package goodsOrder;

public class Order {

	long orderNumber;
	String orderId;
	String orderDate;
	String clientName;
	String orderGoodsNumber;
	String deliveryAdress;
	public long getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(long orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getOrderGoodsNumber() {
		return orderGoodsNumber;
	}
	public void setOrderGoodsNumber(String orderGoodsNumber) {
		this.orderGoodsNumber = orderGoodsNumber;
	}
	public String getDeliveryAdress() {
		return deliveryAdress;
	}
	public void setDeliveryAdress(String deliveryAdress) {
		this.deliveryAdress = deliveryAdress;
	}
	

}