import java.util.Comparator;
public class SortByStudentname2 implements Comparator<Student>
{
  public int compare(Student s1  ,Student s2)
  {
   if(s2.sname.compareTo(s1.sname)== 0)
    return 0;
   else if(s2.sname.compareTo(s1.sname)> 0)
    return 1;
   else
    return -1;
 }
}
