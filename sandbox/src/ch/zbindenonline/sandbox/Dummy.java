package ch.zbindenonline.sandbox;

public class Dummy {
	static int sum(int... toSumValues){
		int sum=0;
		for (int toSum : toSumValues) {
			sum+=toSum;
		}
		return sum;
	}
}
