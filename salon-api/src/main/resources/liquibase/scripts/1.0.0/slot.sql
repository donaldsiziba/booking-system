--liquibase formatted sql
--changeset donald@awesomatic.co.za:slot.sql

CREATE TABLE slot (
    id bigint NOT NULL,
    confirmed_at timestamp without time zone,
    locked_at timestamp without time zone,
    slot_for timestamp without time zone,
    status integer,
    stylist_name character varying(255),
    selected_service_id bigint
);

ALTER TABLE ONLY slot ADD CONSTRAINT slot_pkey PRIMARY KEY (id);

ALTER TABLE slot ALTER COLUMN id ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME slot_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);

ALTER TABLE ONLY slot
    ADD CONSTRAINT fk5iwlk7fkxiubi08g6ql9brixt FOREIGN KEY (selected_service_id) REFERENCES salon_service_detail(id);
