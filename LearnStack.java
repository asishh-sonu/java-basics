import java.util.Stack;

public class LearnStack{
    public static void main(String args[]){
        Stack<String> animals = new Stack<>();

        animals.push("Panda");
        animals.push("Cat");
        animals.push("Cow");
        animals.push("tiger");
        animals.push("Lion");

        System.out.println("Stack:" + animals); //push the elements to the stack

        System.out.println(animals.peek()); //It will show the top most element on the Stack

        animals.pop(); // It will remove the top most element from the Stack 
        System.out.println(animals.peek());

        System.out.println("Stack:" + animals);
    }
}

