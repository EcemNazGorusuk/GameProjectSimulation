package Concrete;

import Entities.Gamer;

public class Management {
	 private Gamer gamer;
	 private boolean couponeCode;
	 public Management(Gamer gamer,boolean couponeCode) {
		this.gamer = gamer;
		this.couponeCode=couponeCode;
	 }
	public boolean couponeControl() {
		if(couponeCode==true) {
			return true;
		}else {
			return false;
		}
	}
	public Gamer getGamer() {
		return gamer;
	}
	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}
	 
}
