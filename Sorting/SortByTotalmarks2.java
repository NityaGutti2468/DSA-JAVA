import java.util.Comparator;
public class SortByTotalmarks2 implements Comparator<Student>
{
  public int compare(Student s1  ,Student s2)
  {
   if(s2.total == s1.total)
    return 0;
   else if(s2.total > s1.total)
    return 1;
   else
    return -1;
 }
}
