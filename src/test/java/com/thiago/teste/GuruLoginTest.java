package com.thiago.teste;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.thiago.core.InvokedMethodListener;
import com.thiago.page.PageGoogle;
import com.thiago.page.login.PageGuruLogin;
import com.thiago.page.login.PageGuruSuccess;
 
@Listeners(InvokedMethodListener.class)
public class GuruLoginTest{
    @Test
    public void google1() throws Exception {
    	PageGuruLogin openPage = new PageGuruLogin().openPage(PageGuruLogin.class, "http://demo.guru99.com/test/login.html");
    	openPage.logar("edmar@gmail" , "123");
    	
    	PageGuruSuccess pageGuruSucces = new PageGuruSuccess();
    	pageGuruSucces.validatePageSuccess();
    	pageGuruSucces.validatePageSuccess();
    	
    }
}