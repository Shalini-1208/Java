import java.util.HashMap;


public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("Mythili","abc123");
        logininfo.put("Shalini","shalzss");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}