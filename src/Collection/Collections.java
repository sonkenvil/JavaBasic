/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Nguyen Hung Son
 */
public class Collections {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("C++");
        System.out.println("Các phần tử của ArrayList");
        System.out.print("\t" + arrayList + "\n");
 
        List<String> linkedList = new LinkedList<String>();
        linkedList.add("PHP");
        linkedList.add("Python");
        linkedList.add("Java");
        linkedList.add("C++");
        System.out.println("Các phần tử của LinkedList");
        System.out.print("\t" + linkedList + "\n");
 
        // new TreeSet() sẽ sắp xếp các phần tử
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("PHP");
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("Java");
        hashSet.add("C++");
        System.out.println("Các phần tử của HashSet");
        System.out.print("\t" + hashSet + "\n");
        
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("PHP");
        treeSet.add("Python");
        treeSet.add("Java");
        treeSet.add("Java");
        treeSet.add("C++");
        System.out.println("Các phần tử của TreeSet");
        System.out.print("\t" + treeSet + "\n");
 
        // new TreeMap() sẽ sắp xếp các phần tử dự vào key của chúng
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Windows", "2000");
        hashMap.put("Windows", "XP");
        hashMap.put("Language2", "Java");
        hashMap.put("Language1", ".Net");
        System.out.println("Các phần tử của Map");
        System.out.print("\t" + hashMap);
//        for (Iterator iterator = hashMap.entrySet().iterator(); iterator.hasNext();) {
//            Object next = iterator.next();
//            
//        }
        Map<String, String> treeMap = new TreeMap<String, String>();
        treeMap.put("Windows", "2000");
        treeMap.put("Windows", "XP");
        treeMap.put("Language2", "Java");
        treeMap.put("Language1", ".Net");
        System.out.println("Các phần tử của Map");
        System.out.print("\t" + treeMap);
      
    }
}
