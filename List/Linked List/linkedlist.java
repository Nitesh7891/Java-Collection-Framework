import java.util.*;

public class linkedlist {

public static void main(String[] args) {
    //method to create a linked list
     List<Integer> linkedlist=new LinkedList<>();
     
    //to add elements in linked list
     System.out.println("1. Adding elements to linked list:");
     linkedlist.add(1);
     linkedlist.add(2);
     linkedlist.add(3);
     
    //to iterate over linked list
     System.out.println("2. Elements of linked list:");
     for(int list:linkedlist)
     System.out.println(list);


    //remove element from linked list by index
     linkedlist.remove(1);
     System.out.println("3. After removing element at index :1");
     System.out.println(linkedlist);

    //size of linked list
     System.out.println("4. Size of linked list: " + linkedlist.size());

     //to check existence of an element
     System.out.println("5. Check existence of element 2: " + linkedlist.contains(2));
     System.out.println("6. Check existence of element 3: " + linkedlist.contains(3));

     //to access element by index
     System.out.println("7. Accessing element at index 0: " + linkedlist.get(0));
     System.out.println("7. Element at index 1: " + linkedlist.get(1));

     //to access element through value
     System.out.println("8. Accessing element through value 3: " + linkedlist.indexOf(3));

     //to replace element at index
        linkedlist.set(1, 5);
       System.out.println("9. After replacing element at index 1: " + linkedlist);


    //to add element at specific index
       linkedlist.add(1, 4);
       System.out.println("10. After adding element 4 at index 1: " + linkedlist);

    //to add at first position 
    linkedlist.addFirst(2);
    System.out.println("11. After adding element 2 at first position: " + linkedlist);

    //to add at last position
    linkedlist.addLast(6);
    System.out.println("12. After adding element 6 at last position: " + linkedlist);

    //to remove first element
    linkedlist.removeFirst();
    System.out.println("13. After removing first element: " + linkedlist);


    //to remove last element
    linkedlist.removeFirst();
    System.out.println("14. After removing last element: " + linkedlist);

    //to use removeif
    linkedlist.removeIf(x->x<3);
    System.out.println("15. After removing elements less than 3: " + linkedlist);

    //to remove elements from one list to another
    List<String> list1=new LinkedList<>(Arrays.asList("Mango","banana","Grapes"));
    System.out.println("16. before removing elements of list2 from list1: " + list1);
    List<String> list2=new LinkedList<>(Arrays.asList("banana","Grapes"));
    list1.removeAll(list2);
    System.out.println("After removing elements of list2 from list1: " + list1);


    //to add all elements of one list to another
    List<Integer>list3=new LinkedList<>(Arrays.asList(7,8,9));
    System.out.println("17. before adding all elements of list3 to list4: " + list3);
     List<Integer>list4=new LinkedList<>(Arrays.asList(10,11,12));
     System.out.println("Elements of list4 :"+list4);
     list3.addAll(list4);
    System.out.println("After adding all elements of list4 to list 3: " + list3);


    //to clear the linked list
    linkedlist.clear();
    System.out.println("18. After clearing all elements from the list");
    System.out.println(linkedlist);

    //to know about the first occurence of a element
    List<Integer> list5=new LinkedList<>(Arrays.asList(1,3,4,1,4));
    System.out.println("19. First occurrence of element 1: " + list5.indexOf(1));
    System.out.println("20. First occurrence of element 4: " + list5.indexOf(4));

    //to know about the last occurence of a element
    System.out.println("21. Last occurrence of element 1: " + list5.lastIndexOf(1));
    System.out.println("22. Last occurrence of element 4: " + list5.lastIndexOf(4));


}
}
