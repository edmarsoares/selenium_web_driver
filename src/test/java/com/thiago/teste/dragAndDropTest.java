package com.thiago.teste;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.thiago.core.InvokedMethodListener;
import com.thiago.page.PageDragAndDrop;
import com.thiago.page.login.PageGuruSuccess;
 
@Listeners(InvokedMethodListener.class)
public class dragAndDropTest{
    @Test
    public void validateDragAndDrop() throws Exception {
    	PageDragAndDrop pageDrag = new PageDragAndDrop().openPage(PageDragAndDrop.class, "http://demo.guru99.com/test/drag_drop.html");
    	pageDrag.validateDrangAndDrop();
    }
}