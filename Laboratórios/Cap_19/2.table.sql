CREATE TABLE impacta.tab_role (
    role_code INTEGER PRIMARY KEY AUTO_INCREMENT,
    role_name VARCHAR(20)
);

CREATE TABLE impacta.tab_func (
    func_code     INTEGER PRIMARY KEY AUTO_INCREMENT,
    func_name     VARCHAR(30),
    func_rmnt_val DOUBLE,
    role_code     INTEGER
);

ALTER TABLE impacta.tab_func
ADD CONSTRAINT fk_role_func
    FOREIGN KEY (role_code)
        REFERENCES tab_role (role_code);

CREATE TABLE impacta.tab_foto(
    user_code      INTEGER PRIMARY KEY AUTO_INCREMENT,
    user_name      VARCHAR(30) NOT NULL,
    user_pict      LONGBLOB,
    orig_file_name VARCHAR(50)
);

