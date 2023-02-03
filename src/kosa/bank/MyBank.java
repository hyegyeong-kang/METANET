package kosa.bank;

public class MyBank {
	private int customerNum;
	Customer[] customers = new Customer[10];
	int cnt = 0;
	
	public MyBank() {}
	
	public MyBank(int customerNum, Customer[] customers) {
		super();
		this.customerNum = customerNum;
		this.customers = customers;
	}
	
	public void addCustomer(String id, String name, long balance) {
		customers[customerNum++] = new Customer(id, name, balance);
	}
	
	public int getCustomersNum() {
		return customerNum;
	}
	
	public Customer getCustomer(String id) {
		Customer cust = null;
		for (int i = 0; i < customerNum; i++) {
			if(id.equals(customers[i].getId())) {
				return customers[i];
			}
		}
		return cust;
	}
	
	public Customer[] getAllCustomer() {
		Customer newCustomers[] = new Customer[customerNum];
		
//		for(int i = 0; i < customerNum; i++) {
//			newCustomers[i] = customers[i];
//		}
		
		System.arraycopy(customers, 0, newCustomers, 0, customerNum);
		return customers;
	}

	public int getCustomerNum() {
		return customerNum;
	}

	public void setCustomerNum(int customerNum) {
		this.customerNum = customerNum;
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}
	
	
}
