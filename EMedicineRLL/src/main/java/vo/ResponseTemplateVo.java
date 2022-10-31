package vo;

import com.example.domain.User;

public class ResponseTemplateVo {
	
	private User user;
	private Medicine medicine;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Medicine getMedicine() {
		return medicine;
	}
	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}
	
	
	public ResponseTemplateVo(User user, Medicine medicine) {
		super();
		this.user = user;
		this.medicine = medicine;
	}
	
	public ResponseTemplateVo() {
		super();
	}
	
	@Override
	public String toString() {
		return "ResponseTemplateVo [user=" + user + ", medicine=" + medicine + "]";
	}
	
	

}
