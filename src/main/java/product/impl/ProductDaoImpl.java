package product.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import product.dao.ProductDao;
import product.entities.Product;

import java.util.List;


@Component("productDao")
public class ProductDaoImpl implements ProductDao {


    @Autowired
    HibernateTemplate hibernateTemplate;


    @Transactional
    public int create(Product product) {

        Integer result = (Integer) hibernateTemplate.save(product);
        return 0;
    }

    @Transactional
    public void update(Product product)
    {
       hibernateTemplate.update(product);
    }

    @Transactional
    public void delete(Product product)
    {
        hibernateTemplate.delete(product);

    }

    public Product find(int id)
    {
       Product product = hibernateTemplate.get(Product.class, id);
        return product;
    }

    public List<Product> findAll()
    {
        return hibernateTemplate.loadAll(Product.class);

    }


}
