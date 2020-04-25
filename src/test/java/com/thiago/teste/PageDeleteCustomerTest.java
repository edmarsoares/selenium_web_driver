package com.thiago.teste;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.thiago.core.InvokedMethodListener;
import com.thiago.page.PageDeleteCustomer;
import com.thiago.page.PageGoogle;
import com.thiago.page.login.PageGuruLogin;
import com.thiago.page.login.PageGuruSuccess;
 
@Listeners(InvokedMethodListener.class)
public class PageDeleteCustomerTest{
    @Test
    public void validatePopUp() throws Exception {
    	PageDeleteCustomer openPage = new PageDeleteCustomer().openPage(PageDeleteCustomer.class, "http://demo.guru99.com/test/delete_customer.php");
    	openPage.preencherCampoDelete();
    }
}