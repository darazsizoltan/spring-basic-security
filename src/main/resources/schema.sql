create sequence user_id_seq;
create sequence role_id_seq;
CREATE TABLE user (
    id BIGINT default user_id_seq.nextval PRIMARY KEY,
    user_name VARCHAR(64) NOT NULL,
    family_name VARCHAR(64) NOT NULL,
    last_name VARCHAR(64) NOT NULL,
    password VARCHAR(64) NOT NULL,
    active BOOLEAN);

CREATE TABLE role (
    id BIGINT default role_id_seq.nextval PRIMARY KEY,
    role_name VARCHAR(64) NOT NULL
);

CREATE TABLE user_role (
    user_id BIGINT NOT NULL,
    role_id BIGINT NOT NULL
);