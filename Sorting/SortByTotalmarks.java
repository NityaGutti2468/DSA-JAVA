import java.util.Comparator;
public class SortByTotalmarks implements Comparator<Student>
{
  public int compare(Student s1  ,Student s2)
  {
   if(s1.total == s2.total)
    return 0;
   else if(s1.total > s2.total)
    return 1;
   else
    return -1;
 }
}