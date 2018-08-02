package mycounter;
import java.util.*;

public class MyCounter {
    public static void main(String[] args) {
        SimpleParser sp=new SimpleParser();  
        sp.Parse(args);
        
        //WordCounter wc=new WordCounter(null,null);
        WordCounter wc=new WordCounter(sp.getInFile(), null);
        wc.countWords();
        
        Set<Map.Entry> eset = wc.getByValue().entrySet();
        for(Map.Entry obj : eset)
            System.out.println(obj);
    }
}
