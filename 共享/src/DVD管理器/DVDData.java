package DVD管理器;

public class DVDData {
//DVD名字
String name;
//DVD状态，有或无
boolean state;
//DVD 借出时间
String rentaltiming;
//DVD 借出次数
int rentaltime;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isState() {
	return state;
}
public void setState(boolean state) {
	this.state = state;
}
public String getRentaltiming() {
	return rentaltiming;
}
public void setRentaltiming(String rentaltiming) {
	this.rentaltiming = rentaltiming;
}
public int getRentaltime() {
	return rentaltime;
}
public void setRentaltime(int rentaltime) {
	this.rentaltime = rentaltime;
}
public DVDData(String name, boolean state, String rentaltiming, int rentaltime) {
	super();
	this.name = name;
	this.state = state;
	this.rentaltiming = rentaltiming;
	this.rentaltime = rentaltime;
}

}

	
