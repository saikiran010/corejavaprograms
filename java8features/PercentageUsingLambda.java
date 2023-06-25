package java8features;
@FunctionalInterface
interface Calculate{
	public double percentage(double m1,double m2,double m3);
}
public class PercentageUsingLambda {

	public static void main(String[] args) {

        Calculate a1=(m1,m2,m3)->(m1+m2+m3)/3;
        
        System.out.printf("The percentage is : %.4f",a1.percentage(91, 92, 95));
	}

}
