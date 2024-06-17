-- auto-generated definition
create table board
(
    id        int auto_increment
        primary key,
    title     varchar(50)                        not null,
    contents  text                               not null,
    member_id int                                null,
    type      int                                not null,
    category  varchar(30)                        null,
    soldout   tinyint  default 1                 null,
    w_date    datetime default CURRENT_TIMESTAMP null,
    v_count   int      default 0                 null,
    secret    tinyint  default 0                 null,
    constraint fk_board_member
        foreign key (member_id) references member (id),
    constraint fk_board_type
        foreign key (type) references board_type (id),
    check (`category` in (_utf8mb4\'ê³¡ë¬¼\',_utf8mb4\'ê³¼ì¼\',_utf8mb4\'ì±ì\',_utf8mb4\'ì¬ë£ ìë¬¼\',_utf8mb4\'ë¹ë£ ìë¬¼\',_utf8mb4\'ìì ìë¬¼\',_utf8mb4\'ê³µì ìë¬¼\')),
	check (`soldout` in (0,1)),
	check (`secret` in (0,1))
);

-- auto-generated definition
create table board_type
(
    id   int auto_increment
        primary key,
    name varchar(20) not null
);

