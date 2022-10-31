package dao;

import context.Utils;
import entity.Product;
import java.util.*;
import javax.persistence.*;

public class DAO {
        EntityManager em = Utils.getEntityManager();
        EntityTransaction trans = em.getTransaction();
        public List<Product> getAllProduct(){
            String jpql="select o from Product o";
            TypedQuery<Product> query = em.createQuery(jpql,Product.class);
            List<Product> list = query.getResultList();            
            return list;
        }
        public static void main(String[] args) {
        DAO dao = new DAO();
        List<Product> list = dao.getAllProduct();
        for(Product i : list){
            System.out.println(i);
        }
    }
    }

