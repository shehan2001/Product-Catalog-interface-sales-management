PGDMP     :    #                {            productCatalog    15.4    15.4     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16398    productCatalog    DATABASE     �   CREATE DATABASE "productCatalog" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';
     DROP DATABASE "productCatalog";
                postgres    false            �            1259    16399    products    TABLE     �  CREATE TABLE public.products (
    product_id bigint NOT NULL,
    customer_review character varying(255),
    product_description character varying(255),
    product_image bytea,
    product_name character varying(255),
    product_price numeric(38,2),
    product_type character varying(255),
    purchase_count numeric(38,2),
    sort_by character varying(255),
    specifications character varying(255)
);
    DROP TABLE public.products;
       public         heap    postgres    false            �          0    16399    products 
   TABLE DATA           �   COPY public.products (product_id, customer_review, product_description, product_image, product_name, product_price, product_type, purchase_count, sort_by, specifications) FROM stdin;
    public          postgres    false    214   �       �   �   x�͑=�0���>AՂ*q�ʂ`�K�+�ۓ�"@1��DOv�g�k�-l�s�]�� �a�U���4�Tb�bXfy.�5{:[�J�WW��{"#XnS}�Ag55!��2��sN�I��舨�k��� t.5g�z0�����:ό��0��>Qv���^>NuO�s6�����1)˗��~�3���:�R^����     