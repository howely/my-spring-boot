CREATE TABLE orm_user (
    id bigint generated by default as identity primary key,
    name varchar(32) not null,
    nick_name varchar(32),
    email varchar(64)
);

INSERT INTO orm_user(name, email) VALUES('test1', 'test1@gamil.com');
INSERT INTO orm_user(name, email) VALUES('test2', 'test2@gamil.com');