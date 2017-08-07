
public class Deep extends Search {
	int[] curLocation;
	public int[] getCurLocation() {
		return curLocation;
	}

	public void setCurLocation(int[] curLocation) {
		this.curLocation = curLocation;
	}

	public String getCurIP() {
		return curIP;
	}

	public void setCurIP(String curIP) {
		this.curIP = curIP;
	}


	String curIP;
	
	@Override
	public boolean updateInfo() {
		checkIP();
		checkGeo();
		// TODO Auto-generated method stub
		return false;
	}
	
	String checkIP() {
		String ithurts="10.0.0.1";
		curIP = ithurts;
		return ithurts;
	}
	int[] checkGeo() {
		int coords[] = {123,144};
		curLocation = coords;
		return coords;
	}

	@Override
	public String readable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean readIn(String input) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
