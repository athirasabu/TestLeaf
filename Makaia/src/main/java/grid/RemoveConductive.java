package grid;

import java.util.concurrent.ConcurrentHashMap;

public class RemoveConductive {

    public static void main(String[] args) {

        String s="Google";

        String[] cvrtar=s.trim().split("");

        ConcurrentHashMap<String,Integer> hm=new ConcurrentHashMap<>();
        for(int i=0;i<cvrtar.length;i++){
            if(!hm.containsKey(cvrtar[i])){
                hm.put(cvrtar[i],1);
            }
            else{
                 hm.put(cvrtar[i],hm.get(cvrtar[i])+1);
            }
        }
        for(String ele:hm.keySet()){
            if(hm.get(ele)>1){
                hm.remove(ele);
            }
        }
        for(String key:hm.keySet()){
            System.out.print(key);
        }
    }  
}