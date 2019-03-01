package product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import product.dao.ProductDao;
import product.entities.Product;

import java.util.List;

public class Test {

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ProductDao productDao = (ProductDao) context.getBean("productDao");
        //Product product = new Product();
        //product.setId(2);
        //product.setName("Pixel");
        //product.setDesc("Great");
        //product.setPrice(60000);
        //productDao.create(product);
        //productDao.update(product);
        //productDao.delete(product);

        //Product product = productDao.find(2);

        //System.out.println(product);

        List<Product> products = productDao.findAll();

        System.out.println(products);
    }
}
