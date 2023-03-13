package views;

import java.util.HashMap;

public class IDandPasswords {
HashMap<String,String> logininfo=new HashMap<String,String>();

public IDandPasswords() {
	// TODO Auto-generated constructor stub
	logininfo.put("1708222","Wipeout2048");
}

protected HashMap getlogininfo(){
	
	return logininfo;
}
}
