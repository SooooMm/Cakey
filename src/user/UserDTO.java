package user;

public class UserDTO {
	private String name;
	private String phoneNum;
	private String ID;
	private String PW;
	
	public UserDTO() {}
	public UserDTO(String name,String phoneNum,String ID,String PW) {
		this.name=name;
		this.phoneNum=phoneNum;
		this.ID=ID;
		this.PW=PW;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPW() {
		return PW;
	}
	public void setPW(String pW) {
		PW = pW;
	} 
	
	
}
