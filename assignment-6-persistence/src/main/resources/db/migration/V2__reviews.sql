CREATE TABLE reviews (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    comment VARCHAR(255) NOT NULL,
    product_id BIGINT,
    CONSTRAINT fk_product FOREIGN KEY (product_id) REFERENCES products(id)
);
