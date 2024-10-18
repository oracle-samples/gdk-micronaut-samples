DROP TABLE IF EXISTS book;

CREATE TABLE book (
    id   BIGINT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
   name  VARCHAR(255) NOT NULL UNIQUE,
   isbn  CHAR(13) NOT NULL UNIQUE
);

INSERT INTO book (isbn, name)
VALUES ("9781491950357", "Building Microservices"),
       ("9781680502398", "Release It!"),
       ("9780321601919", "Continuous Delivery"),
       ("9781617294549", "Microservices Patterns");
