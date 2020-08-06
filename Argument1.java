import java.util.Arrays;
class Argument1
{
public static void main(String[] args)
{ 
System.out.println("Elements in the array are : ");
System.out.println( Arrays.toString(args) );
Arrays.sort(args);
System.out.println("sorted array elements are : ");
System.out.println( Arrays.toString(args) );
}
}

