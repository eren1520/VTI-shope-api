package com.example.shoppe_api;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
    // Các phương thức truy vấn tùy chỉnh nếu cần
}

