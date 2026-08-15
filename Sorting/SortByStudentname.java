import java.util.Comparator;
public class SortByStudentname implements Comparator<Student>
{
  public int compare(Student s1  ,Student s2)
  {
   if(s1.sname.compareTo(s2.sname)== 0)
    return 0;
   else if(s1.sname.compareTo(s2.sname) > 0)
    return 1;
   else
    return -1;
 }
}