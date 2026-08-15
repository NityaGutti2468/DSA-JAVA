import java.util.Comparator;
public class SortByBranch2 implements Comparator<Student>
{
  public int compare(Student s1  ,Student s2)
  {
   if(s2.branch.compareTo(s1.branch)== 0)
    return 0;
   else if(s2.branch.compareTo(s1.branch)> 0)
    return 1;
   else
    return -1;
 }
}