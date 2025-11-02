
import java.util.*;
import java.util.ArrayList;
import java.util.List;
//import java.util.Collection;

class StringLength implements Comparator<String>
{
    public int compare(String s1,String s2)
    {
        return Integer.compare(s2.length(), s1.length());
    }
}

public class arraylist{

    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();

        //to add elements in a arraylist
        list.add(20);//0
        list.add(30);//1
        list.add(40);//2

        //for adding element between 20 and 30 first write index number then element value
        list.add(1,70);


        // to access any element it is accessed by index by get method
      // System.out.println(list.get(1));

       //to iterate over the elements use for each loop
        System.out.println("1. After adding elements ");
        for (int hi : list) {
           
            System.out.println(hi);
            
        }

        //to remove element by index
        System.out.println("2. After removing element by index");
        list.remove(1);
        System.out.println(list);

        //another method to remove element by value
        List<Integer>hello=new ArrayList<>();
        hello.add(1);
        hello.add(2);
        hello.add(1);
        System.out.println(hello);



         

        //for checking existence of any element
        System.out.println("3. for checking existence of any element");
        System.out.println(list.contains(2));
        System.out.println(list.contains(20));


        //for checking size 
        System.out.println("4. for checking size");
        System.out.println(list.size());

      // To replace any element
        System.out.println("5. To replace any element");
       list.set(1,90);
        System.out.println(list);

        //another method to declare an arraylist
        //we cannot add or remove elements from this list
        //we can replace elements from this list
        System.out.println("6. Another method to declare an arraylist");
        List <Integer> list1=Arrays.asList(1,2,3,3);
        System.out.println(list1.getClass().getName());
        System.out.println(list1.get(2));
  
        //By passing an array
        Integer[] nums={1,3,3,3};
        List<Integer>list2=Arrays.asList(nums);

        // it is not an arraylist but a fixed size list
        //it is a nested static private class inside the Arrays class
        System.out.println(list2.getClass().getName());
        System.out.println(list2.get(0));


        //to make it modifable
        //we can add,remove or replace elements from this list
        List<Integer> list4=new ArrayList<>(Arrays.asList(11,2,33,4));

        //it is an unmodifiable list
        List<Integer>list3=List.of(11,13,12);
        System.out.println(list3.get(2));

        //to sort an arraylist
        Collections.sort(list4);
        System.out.println(list4);


        //to add all elements of one list to another list
        System.out.println("7. To add all elements of one list to another list");
        List<Integer> list5=List.of(100,200);

        //since that arraylist is unmodifiable so we cannot add elements to it
        //so we create a new arraylist and add elements of list5 to it
        List<Integer>list6=new ArrayList<>(Arrays.asList(1,2,3));
        list6.addAll(list5);
        System.out.println(list6);


        //to clear an arraylist
        System.out.println("8. To clear an arraylist");
        List<Integer> list7=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("Before clearing: "+list7);
        list7.clear();
        System.out.println("After clearing: "+list7);

        //to remove element by value
        System.out.println("9. To remove element by value");
        List<Integer> list8=new ArrayList<>(Arrays.asList(1,2,3,4,5,3));
        System.out.println("Before removing: "+list8);
        list8.remove(Integer.valueOf(3));//removes first occurrence of 3
        System.out.println("After removing: "+list8);


        //comparator compares two objects of same type
        
       
    }

















}