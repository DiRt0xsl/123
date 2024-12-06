USE enjoymall;
DROP TABLE IF EXISTS `t_product`;

CREATE TABLE `t_product` (

        id INT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(255) NOT NULL,
        type VARCHAR(255) NOT NULL,
        price DOUBLE NOT NULL,
        viewCount INT DEFAULT 0,
        imgUrl VARCHAR(255),
        createBy INT,
        createTime DATETIME NOT NULL
        )ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='商品表';
