package codeFromLectures;

import java.util.stream.IntStream;

class StreamLoopCheck {
    public void getOutputData() {
        // for (int i = 0; i <= 10; i++) {
        //     System.out.println(i);
        // }

        IntStream.range(0,10).forEach(System.out::println);
        IntStream.rangeClosed(0, 10).forEach(System.out::println);
    }

   
}

public class Lecture2Own {
    //private static StreamLoopCheck streamLoopCheck;

    public static void main(String[] args) {
        StreamLoopCheck streamLoopCheck=new StreamLoopCheck();
        streamLoopCheck.getOutputData();
    }
}
