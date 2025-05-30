public class Main {
    public static void main(String[] args){

        StackLinkedList<Integer> stack = new StackLinkedList();
        stack.push(3);
        stack.push(45);
        stack.push(3.4);
        stack.push("This is a test");
        stack.displayStack();

        /*
        ArrayList<String> stringList = new ArrayList();
        stringList.add("String");
        stringList.add("Ali");
        System.out.println(stringList);

        HashMap<String, Double> grades = new HashMap();
        grades.put("Ali", 10.0);
        grades.put("Pelin", 75.4);
        grades.put("Koray", 4.5);
        System.out.println(grades);
        grades.put("Ali", 100.0);  //key gotta be unique otherwise...
        System.out.println(grades);
        */

    }
}
