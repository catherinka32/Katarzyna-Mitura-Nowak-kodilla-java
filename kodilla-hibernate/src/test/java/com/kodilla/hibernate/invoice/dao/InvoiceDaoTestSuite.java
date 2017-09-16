package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;
    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("Yellow Bucket");
        Product product2 = new Product("Old Box");
        Product product3 = new Product("Big Wardrobe");

        Item item1 = new Item(product1, new BigDecimal(20),7,new BigDecimal(700) );
        Item item2 = new Item(product1, new BigDecimal(13), 19, new BigDecimal(590));
        Item item3 = new Item(product3, new BigDecimal(290), 6, new BigDecimal(500));
        Item item4 = new Item(product2, new BigDecimal(13), 6, new BigDecimal(900));
        Item item5 = new Item(product2, new BigDecimal(11), 6, new BigDecimal(600));


        product1.getItems().add(item1);
        product1.getItems().add(item2);
        product2.getItems().add(item4);
        product2.getItems().add(item5);
        product3.getItems().add(item3);

        item1.setProduct(product1);
        item2.setProduct(product1);
        item3.setProduct(product3);
        item4.setProduct(product2);
        item5.setProduct(product2);


        Invoice invoice = new Invoice("NKO12309O");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        invoice.getItems().add(item5);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);
        item5.setInvoice(invoice);

        //When.
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0,id );
        //CleanUp
        //taskListDao.delete(id);
    }
}
