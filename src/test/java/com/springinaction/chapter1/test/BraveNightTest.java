package com.springinaction.chapter1.test;

import com.springinaction.chapter1.BraveKnight;
import com.springinaction.chapter1.Quest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.LinkedList;

import static org.mockito.Mockito.*;

/**
 * Created by jinguangzhou on 3/2/14.
 */
public class BraveNightTest {

    @BeforeClass(groups = {"all"})
    public void beforeTest() {
        System.out.print("Before test runs");
    }

    @Test(description = "Test BraveKnight", groups = {"all"})
    public void testBraveKnight() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight braveKnight = new BraveKnight(mockQuest);
        braveKnight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }

    @Test(description = "Test mockito", groups = {"all"})
    public void testMockito() {
        LinkedList mockLink = mock(LinkedList.class);
        mockLink.add(1);
        mockLink.remove();
        when(mockLink.get(0)).thenReturn("first");

        System.out.println(mockLink.get(0));

        //verify(mockLink).add(0);
        verify(mockLink).add(1);
        verify(mockLink).remove();
    }


}
