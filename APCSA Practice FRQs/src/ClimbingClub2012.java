import java.util.ArrayList;
import java.util.List;

public class ClimbingClub
{
	private List<ClimbInfo> climbList;
	
	public ClimbingClub()
	{
		climbList = new ArrayList<ClimbInfo>();
	}
	
	public void addClimb(String peakName, int climbTime)
	{
		climbList.add(new ClimbInfo(peakName, climbTime));
		for (int i = 0; i<climbList.size(); i++)
		{
			if (peakName.compareTo(climbList.get(i).getName) <= 0)
			{
				climbList.add(i, new ClimbInfo(peakName, climbTime));
			}
			else
			{
				climbList.add(new ClimbInfo(peakName, climbTime));
			}
		}		
	}
	
	 public int distinctPeakNames()
	 {
	 if (climbList.size() == 0)
	 {
	 return 0;
	 }
	 ClimbInfo currInfo = climbList.get(0);
	 String prevName = currInfo.getName();
	 String currName = null;
	 int numNames = 1;
	 for (int k = 1; k < climbList.size(); k++)
	 {
	 currInfo = climbList.get(k);
	 currName = currInfo.getName();
	 if (prevName.compareTo(currName) != 0)
	 {
	 numNames++;
	 prevName = currName;
	 }
	 }
	 return numNames;
	 } 
	 
	 
	 
	//Answer to c(i): No
	//Answer to c(ii): Yes