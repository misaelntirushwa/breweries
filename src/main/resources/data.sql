DROP TABLE IF EXISTS brewery;

CREATE TABLE brewery (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  brewery_type VARCHAR(50) NOT NULL,
  street VARCHAR(250),
  city VARCHAR(50),
  province VARCHAR(50),
  phone VARCHAR(50),
  website_url VARCHAR(250)
);

INSERT INTO brewery (brewery_type, street, city, province, phone, website_url) VALUES
  ('Brasserie Griendel', '195 rue Saint-Vallier O', 'Quebec', 'QC', '(581) 742-2884', 'griendel.com');
INSERT INTO brewery (brewery_type, street, city, province, phone, website_url) VALUES
  ('Brasserie Générale - 18e Rue', '1165 18e Rue', 'Quebec', 'QC', '(418) 204-2031', '');
INSERT INTO brewery (brewery_type, street, city, province, phone, website_url) VALUES
  ('Brasserie la Faucheuse', '269 Rue Saint-Jean', 'Quebec', 'QC', '(581) 981-1333', '');