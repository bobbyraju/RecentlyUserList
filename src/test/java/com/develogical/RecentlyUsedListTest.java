package com.develogical;

import org.hamcrest.Matcher;
import org.junit.Test;

import java.awt.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
/**
 * Created by ape11 on 17/01/2017.
 */

public class RecentlyUsedListTest {
    @Test
    public void listShouldBeEmpty() {
        RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
        assertThat(recentlyUsedList.isEmpty(), is(true));
    }

    @Test
    public void listShouldBeAddThings() {
        RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
        recentlyUsedList.add("abc");
        assertThat(recentlyUsedList.isEmpty(), is(false));
    }

    @Test
    public void listShouldRetrieveThings() {
        RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
        recentlyUsedList.add("abc");
        recentlyUsedList.retrieve("abc");
        assertThat(recentlyUsedList.isEmpty(), is(true));
        assertThat(recentlyUsedList.retrieve("def"), is("Item does not exist!"));
    }

    @Test
    public void listShouldStackThings() {
        RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
        recentlyUsedList.add("def");
        recentlyUsedList.add("abc");
        assertThat(recentlyUsedList.getItem(0), is("abc"));
    }

    @Test
    public void listShouldBeUnique() {
        RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
        recentlyUsedList.add("abc");
        recentlyUsedList.add("def");
        recentlyUsedList.add("abc");
        System.out.println(recentlyUsedList.getItem(0));
        assertThat(recentlyUsedList.getItem(0), is("abc"));
        assertThat(recentlyUsedList.getItem(1), is("def"));
        assertThat(recentlyUsedList.getItemCount(), is(2));
    }

}
