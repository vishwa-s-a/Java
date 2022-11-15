package edu.vit.corejava.collections_pract;
import java.util.List;
public class FunctionStream {
    public static void main(String[] args) {
        List<Integer>numbers=List.of(1,2,3,4,5,6,7);
        System.out.println(numbers.stream().filter(e->e%5==0).map(e->e*2).toList());
    }
    
}
