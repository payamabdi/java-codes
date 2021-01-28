

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public static void main(String[] args) {
      List<List<Set<Integer>>>  unionSet = new ArrayList<>();
      List<List<Integer>> sets=...
      double avail = 0;
      for (int i = 1; i <= sets.size(); i++) {
           List<Set<Integer>> us = new ArrayList<>();
           union(sets, us, new HashSet<>(), i, 0);
           unionSet.add(us);        
      }
}

 public static void union(List<List<Integer>> sets, List<Set<Integer>> unionSet, Set<Integer> set, int size, int index) {
    for (int i = index; i < sets.size(); i++) {
        Set temp = new HashSet(set);
        temp.addAll(sets.get(i));

        if (size != 1)
            union(sets, unionSet, temp, size - 1, i + 1);
        else
            unionSet.add(temp);
    }
}
