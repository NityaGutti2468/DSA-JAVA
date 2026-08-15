import java.util.Comparator;
public class SortByRollNoo implements Comparator<Student>{
  public int compare(Student s1  ,Student s2)
  {
   if(s1.roll_no == s2.roll_no)
    return 0;
   else if(s1.roll_no > s2.roll_no)
    return 1;
   else
    return -1;
 }
}