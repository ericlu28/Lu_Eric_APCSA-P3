//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{

		int distance = 0;
		for (int i=0; i<ray.length;i++) {
			if (ray[i] % 2 == 1) {
				for (int j =1;j<ray.length;j++) {
					if (ray[j] % 2 == 0) {
						distance = j - i;
						return distance;
					}
				}
			}
			
		}
		return -1;

		
	}
}