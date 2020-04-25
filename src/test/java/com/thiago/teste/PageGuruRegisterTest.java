package com.thiago.teste;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.thiago.core.InvokedMethodListener;
import com.thiago.page.register.PageGuruRegister;
 
@Listeners(InvokedMethodListener.class)
public class PageGuruRegisterTest{
    @Test
    public void enviarFormTest() throws Exception {
    	PageGuruRegister pageRegister = new PageGuruRegister().openPage(PageGuruRegister.class, "http://demo.guru99.com/test/newtours/register.php");
    	pageRegister.fillForm().validatePageSuccess();
    }
}