import java.util.Comparator;
public class SortByBranch implements Comparator<Student>
{
  public int compare(Student s1  ,Student s2)
  {
   if(s1.branch.compareTo(s2.branch)== 0)
    return 0;
   else if(s1.branch.compareTo(s2.branch)> 0)
    return 1;
   else
    return -1;
 }
}
