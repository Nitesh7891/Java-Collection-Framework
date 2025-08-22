
import java.util.*;
import java.util.ArrayList;
import java.util.List;
//import java.util.Collection;

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
        List <Integer> list1=Arrays.asList(1,2,3,3);
        System.out.println(list1.getClass().getName());
        System.out.println(list1.get(2));
  
        //By passing an array
        Integer[] nums={1,3,3,3};
        List<Integer>list2=Arrays.asList(nums);
        System.out.println(list2.getClass().getName());
        System.out.println(list2.get(0));


        //to make it modifable
        List<Integer> list4=new ArrayList<>(Arrays.asList(11,2,33,4));

        //it is an unmodifiable list
        List<Integer>list3=List.of(11,13,12);
        System.out.println(list3.get(2));

        //to sort an arraylist
        Collections.sort(list4);
        System.out.println(list4);
       
    }

















}