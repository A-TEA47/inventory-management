(
                                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                          name VARCHAR(255) NOT NULL UNIQUE,
    description TEXT
    );

(
                                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                        name VARCHAR(255) NOT NULL,
    price DOUBLE NOT NULL,
    category_id BIGINT,
    FOREIGN KEY (category_id) REFERENCES categories(id)
    );

(
                                      id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                      product_id BIGINT,
                                      quantity INT NOT NULL,
                                      FOREIGN KEY (product_id) REFERENCES products(id)
    );
