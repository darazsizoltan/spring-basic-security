INSERT INTO user (user_name, family_name, last_name, active, password) VALUES
    ('admin', 'Mr', 'admin', true, 'asd'),
    ('user', 'Mrs', 'user', true,'asd'),
    ('inactive', 'Dr', 'inactive', false, 'asd'),
    ('actuator', 'Ifj', 'actuator', true, 'asd');

INSERT INTO role (role_name) VALUES
    ('ROLE_ADMIN'),
    ('ROLE_USER'),
    ('ROLE_ACTUATOR');

INSERT INTO user_role (user_id, role_id) VALUES
    ((select id from user u where u.user_name ='admin'), (select id from role r where r.role_name = 'ROLE_ADMIN')),
    ((select id from user u where u.user_name ='user'), (select id from role r where r.role_name = 'ROLE_USER')),
    ((select id from user u where u.user_name ='inactive'), (select id from role r where r.role_name = 'ROLE_USER')),
    ((select id from user u where u.user_name ='actuator'), (select id from role r where r.role_name = 'ROLE_ACTUATOR'));
