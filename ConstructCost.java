import java.util.Scanner;
class ConstructCost
{
	ConstructCost(double totalarea) // totalarea = Total Area of the House
	{
		Scanner sc = new Scanner(System.in);
		double constructioncost;
		double squarefeet = totalarea*10.764; // Converting Area into Square Feet
		//"1.Standard Material 2.Above Standard Material 3.High Standard Material 4.High Standard Material and Fully Automated Home"
		int typeofhouse = sc.nextInt(); // Reading Type of House as given in above comment
		switch(typeofhouse)
		{
			case 1 : constructioncost = 1200 * squarefeet; // Construction Cost for Standard Material
					 break;
			case 2 : constructioncost = 1500 * squarefeet; // Construction Cost for Above Standard Material
					 break;
			case 3 : constructioncost = 1800 * squarefeet; // Construction Cost for High Standard Material
					 break;
			case 4 : constructioncost = 2500 * squarefeet; // Construction Cost for High Standard Material and Fully Automated Home
					 break;
			default: return;
		}
	}
}