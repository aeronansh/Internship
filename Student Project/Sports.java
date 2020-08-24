package day5;

public class Sports {
	
	private String spName;
	private int points;
	
	public Sports(String spName, int points) {
		super();
		this.spName = spName;
		this.points = points;
	}

	public String getSpName() {
		return spName;
	}

	public void setSpName(String spName) {
		this.spName = spName;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Sports [spName=" + spName + ", points=" + points + "]";
	}

}
