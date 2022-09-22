package bunchbycycles;

public class Main {
  static class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;
    public int highCount = 0;
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
    return counts;
  }

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    ArrayList<Integer> high=new ArrayList<> ();
     ArrayList<Integer> low=new ArrayList<> ();
    ArrayList<Integer> medium=new ArrayList<> ();
    
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});
    assert(counts.lowCount == 2);
    assert(counts.mediumCount == 3);
    assert(counts.highCount == 1);
    for(int i=0;i<counts.length;i++)
      
    {
      if(counts[i]>910)
      {
        high.add(counts[i]);
      highCount++;
      }
     
   
      else  if(counts[i]>=410 && counts[i]<=909)
      {
         medium.add(counts[i]);
        mediuCount++;
      }
    
      else 
      {
         low.add(counts[i]);
        lowCount++;
      }
      
    }
    for(int arr1:high)
    {
       System.out.println("The battery charged more than 910 is:" +arr1+ "and count is" +highCount);
    }
     for(int arr2:medium)
    {
         System.out.println("The battery charged between  410 and  910 is:" +arr2+ "and count is" +midCount);
    } 
    for(int arr3:low)
    {
      System.out.println("The battery charged less than 410 is:" +arr3+ "and count is" +lowCount);
    }
    
    System.out.println("Done counting :)\n");
  }

  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
    
  }
}
