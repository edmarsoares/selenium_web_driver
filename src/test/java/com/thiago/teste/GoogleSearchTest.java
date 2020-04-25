package com.thiago.teste;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.thiago.core.InvokedMethodListener;
import com.thiago.page.PageGoogle;
import com.thiago.page.login.PageGuruLogin;
 
@Listeners(InvokedMethodListener.class)
public class GoogleSearchTest{
 
    @Test
    public void google0() throws Exception {
    	new PageGoogle().openPage(PageGoogle.class, "http://www.google.com").buscarNoGoogle("selenium");
    	new PageGoogle().buscarNoGoogle("oi");
    }

}