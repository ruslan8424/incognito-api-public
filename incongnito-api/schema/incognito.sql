-- auto-generated definition
create table conversation
(
    id                   bigint auto_increment
        primary key,
    participant1_user_id bigint   not null,
    participant2_user_id bigint   not null,
    created              datetime not null,
    constraint conversation_user_id_fk
        foreign key (participant1_user_id) references user (id),
    constraint conversation_user_id_fk_2
        foreign key (participant2_user_id) references user (id)
);

-- auto-generated definition
create table user
(
    id bigint auto_increment
        primary key
);

-- auto-generated definition
create table message
(
    id              bigint auto_increment
        primary key,
    conversation_id bigint          not null,
    message         text            not null,
    participant     enum ('1', '2') not null,
    created         datetime        not null,
    constraint message_conversation_id_fk
        foreign key (conversation_id) references conversation (id)
);

create index message_created_index
    on message (created);

