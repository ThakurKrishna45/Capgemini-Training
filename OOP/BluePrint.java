package training;

public class BluePrint {
	int roll;
	public BluePrint(int roll) {
		this.roll=roll;
	}
	@Override
	public boolean equals(Object obj) {
		BluePrint bp= (BluePrint)obj;
		return this.roll==bp.roll;
	}
}
