package Stringss;

import java.util.ArrayList;
import java.util.List;

public class FindAllSubSequence {
    static List<String> findSubSequence(String str){
        List<String> result=new ArrayList<>();
        int len=1<<str.length();

        for (int i=0;i<len;i++){
            StringBuilder subSeq=new StringBuilder();
            for (int j=0;j<str.length();j++){
                if ((i & (1<<j))!=0){
                    subSeq.append(str.charAt(j));
                }
            }
            result.add(subSeq.toString());
        }
        return  result;
    }
    public static void main(String[] args) {

        String str="abc";
        List<String> result=findSubSequence(str);

        System.out.println(result);
    }

}

