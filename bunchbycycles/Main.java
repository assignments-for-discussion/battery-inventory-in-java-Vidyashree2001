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
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});
    assert(counts.lowCount == 2);
    assert(counts.mediumCount == 3);
    assert(counts.highCount == 1);
    for(int i=0;i<counts.length;i++)
      
    {
      if(counts[i]>910)
      highCount++;
    else  if(counts[i]>=410 || counts[i]<=909)
      mediuCount++;
    else 
      lowCount++;
    System.out.println("Done counting :)\n");
  }

  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
    
  }
}
