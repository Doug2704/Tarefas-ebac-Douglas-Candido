package com.candido.products.service;

import com.candido.products.entity.Product;
import com.candido.products.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {


    private final ProductRepository repository;

    public Product create(Product product) {
        return repository.save(product);
    }

    public Product findbyId(long id) {
        Product p = repository.findById(id).get();
        return p;
    }

    public Product update(Product product, long id) {
        Product p = repository.findById(id).get();

        p.setName(p.getName());
        p.setQuantity(p.getQuantity());

        return repository.save(p);
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public void delete(long id) {
        Product p = repository.findById(id).get();
        repository.delete(p);
    }
}
