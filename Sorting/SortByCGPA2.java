import java.util.Comparator;
public class SortByCGPA2 implements Comparator<Student>
{
  public int compare(Student s1  ,Student s2)
  {
   if(s2.cgpa == s1.cgpa)
    return 0;
   else if(s2.cgpa > s1.cgpa)
    return 1;
   else
    return -1;
 }
}