INSERT INTO users (name, email, password) VALUES ('kauaiAdmin', 'kauaiAdmin@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');
INSERT INTO users (name, email, password) VALUES ('kauaiUser', 'kauaiUser@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');

INSERT INTO role (role_name) VALUES ('USER');
INSERT INTO role (role_name) VALUES ('ADMIN');

INSERT INTO users_role (users_id, role_id) VALUES (1, 1);
INSERT INTO users_role (users_id, role_id) VALUES (2, 1);
INSERT INTO users_role (users_id, role_id) VALUES (2, 2);