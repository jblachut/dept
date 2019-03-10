INSERT INTO user(id, email, first_name, last_name, password)

VALUES (1, 'a@a.com', 'Wojciech', 'Musial', '$2a$10$AbGL32g3Qwq.VSOf5yzcpeyxiVIamtrgsoFwN.Xl7hlLU8yhYDnKq');



INSERT INTO debtor(id, email, first_name, last_name)

VALUES (1, 'zuzanna@email.com', 'Zuzanna', 'Kowalska');



INSERT INTO debt(amount, created_at, paid_off, debtor_id, lender_id) VALUES

(199.99, '2019-03-08', 0, 1, 1);