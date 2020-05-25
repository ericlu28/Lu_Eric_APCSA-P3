U5X16VUY
EAL

//a
public static int bagApples(double targetWeight, double allowedVariation)
{
	int appleCount = 0;
	double combinedWeight = 0.0;
	
	while (combinedWeight <= (targetWeight - allowedVariation))
	{
		combinedWeight += getApple();
		appleCount++;
	}
	return appleCount;
}

//b
I would instantiate a variable: private double allowedVariation in the AppleBagger class. 
Then, I would create a new method with the name: public void setVariationWeight(double v), which sets the allowedVariation variable to v.
Then, with a call to bagApples, I would set the allowedVariation variable equal to 20% of the first getApple(). 
