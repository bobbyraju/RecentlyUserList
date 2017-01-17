package com.develogical;


import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;

/**
 * Created by ape11 on 17/01/2017.
 */
public class RecentlyUsedList {
    boolean empty = true;
    ArrayList list = new ArrayList();

    public boolean isEmpty() {
        /*return empty;*/
        return list.isEmpty();
    }

    public void add(String string) {
        /*empty = false;*/
        Integer index = 0;
        if (list.contains(string)) {
            list.remove(list.indexOf(string));
        }
        list.add(0, string);
    }

    public String retrieve(String string) {
        /*empty = true;*/
        if (list.contains(string)) {
            list.remove(list.indexOf(string));
            return string;
        } else {
            return "Item does not exist!";
        }
    }

    public Object getItem(Integer i) {
        /*if (i == 0) return "abc";
        else return "def";*/
        return list.get(i);
    }

    public Integer getItemCount() {
        /*return 2;*/
        return list.size();
    }
}
