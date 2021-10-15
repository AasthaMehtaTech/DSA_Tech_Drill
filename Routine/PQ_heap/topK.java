/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    
    public static List<Integer> heapTop3(List<Integer> arr) {
        List<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int x : arr) {
            if(heap.size()==3){
                if(heap.peek()<x){
                    heap.poll();
                    heap.add(x);
                }
            }
            else{
                heap.add(x);
            }
        }
        res = new ArrayList<>(heap);
        return res;
    }

    

    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<>(){{
            add(6);add(2);add(3);add(1);add(7);add(3);
        }};
        
        List<Integer> res = heapTop3(arr);
        System.out.println(res.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
