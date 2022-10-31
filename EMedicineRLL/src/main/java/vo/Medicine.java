package vo;

public class Medicine {

	private int rtid;
	private String rtuserId;
	private String rtname;
	private String rtbrand;
	private int rtquantity;
	private int rtprice;
	
	
	public int getRtid() {
		return rtid;
	}
	public void setRtid(int rtid) {
		this.rtid = rtid;
	}
	public String getRtuserId() {
		return rtuserId;
	}
	public void setRtuserId(String rtuserId) {
		this.rtuserId = rtuserId;
	}
	public String getRtname() {
		return rtname;
	}
	public void setRtname(String rtname) {
		this.rtname = rtname;
	}
	public String getRtbrand() {
		return rtbrand;
	}
	public void setRtbrand(String rtbrand) {
		this.rtbrand = rtbrand;
	}
	public int getRtquantity() {
		return rtquantity;
	}
	public void setRtquantity(int rtquantity) {
		this.rtquantity = rtquantity;
	}
	public int getRtprice() {
		return rtprice;
	}
	public void setRtprice(int rtprice) {
		this.rtprice = rtprice;
	}
	
	@Override
	public String toString() {
		return "Medicine [rtId=" + rtid + ", rtuserId=" + rtuserId + ", rtname=" + rtname + ", rtbrand="
				+ rtbrand + ", rtquantity=" + rtquantity + ", rtprice=" + rtprice + "]";
	}
	
	public Medicine(int rtid, String rtuserId, String rtname, String rtbrand, int rtquantity, int rtprice) {
		super();
		this.rtid = rtid;
		this.rtuserId = rtuserId;
		this.rtname = rtname;
		this.rtbrand = rtbrand;
		this.rtquantity = rtquantity;
		this.rtprice = rtprice;
	}
	
	public Medicine() {
		super();
	}
	
	
	
	
	
}
