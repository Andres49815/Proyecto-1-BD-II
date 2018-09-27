SET SQLBLANKLINES ON
CREATE TABLE COUNTRY 
(
  ID INT NOT NULL 
, NAME VARCHAR2(20) NOT NULL 
, CONSTRAINT COUNTRY_PK PRIMARY KEY 
  (
    ID 
  )
  ENABLE 
) 
PCTFREE 20 
PCTUSED 70 
INITRANS 1 
STORAGE 
( 
  INITIAL 1200 
  NEXT 1200 
  MINEXTENTS 1 
  MAXEXTENTS UNLIMITED 
  PCTINCREASE 0 
);

CREATE TABLE GARMENT_SIZE 
(
  ID INT GENERATED ALWAYS AS IDENTITY INCREMENT BY 1 START WITH 0 MAXVALUE 10000000 MINVALUE 0 NOT NULL 
, GARMENT_SIZE VARCHAR2(3) NOT NULL 
, CONSTRAINT RECIPE_PK PRIMARY KEY 
  (
    ID 
  )
  ENABLE 
) 
PCTFREE 10 
PCTUSED 85 
INITRANS 1 
STORAGE 
( 
  INITIAL 21 
  NEXT 15 
  MINEXTENTS 1 
  PCTINCREASE 0 
);

CREATE TABLE PROVIDER 
(
  ID INT GENERATED ALWAYS AS IDENTITY INCREMENT BY 1 START WITH 0 MAXVALUE 1000000 MINVALUE 0 NOT NULL 
, TYPE CHAR(1) NOT NULL 
, NAME VARCHAR2(30) NOT NULL 
, DIRECTION VARCHAR2(30) NOT NULL 
, EMAIL VARCHAR2(20) NOT NULL 
, PHONE NUMBER(8) NOT NULL 
, CONTACT_NAME VARCHAR2(30) NOT NULL 
, CONSTRAINT PROVIDER_PK PRIMARY KEY 
  (
    ID 
  )
  ENABLE 
) 
PCTFREE 30 
PCTUSED 65 
INITRANS 1 
STORAGE 
( 
  INITIAL 13107200 
  NEXT 2560000 
  MINEXTENTS 1 
  MAXEXTENTS UNLIMITED 
  PCTINCREASE 0 
  FREELISTS 1 
  FREELIST GROUPS 2 
);

CREATE TABLE RAW_MATERIAL 
(
  ID INT GENERATED ALWAYS AS IDENTITY INCREMENT BY 1 START WITH 0 MAXVALUE 10000000 MINVALUE 0 NOT NULL 
, UNIT VARCHAR2(4) NOT NULL 
, MIN_QUANTITY DOUBLE PRECISION NOT NULL 
, CURRENT_EXISTENCE DOUBLE PRECISION NOT NULL 
, UNIT_COST DOUBLE PRECISION NOT NULL 
, DESCRIPTION VARCHAR2(50) NOT NULL 
, CONSTRAINT RAW_MATERIAL_PK PRIMARY KEY 
  (
    ID 
  )
  ENABLE 
) 
PCTFREE 20 
PCTUSED 70 
INITRANS 1 
STORAGE 
( 
  INITIAL 1700000 
  NEXT 1700000 
  MINEXTENTS 1 
  MAXEXTENTS UNLIMITED 
  PCTINCREASE 10 
  FREELISTS 3 
  FREELIST GROUPS 3 
);

CREATE TABLE STYLE 
(
  ID INT GENERATED ALWAYS AS IDENTITY INCREMENT BY 1 START WITH 0 MAXVALUE 1000000 MINVALUE 0 NOT NULL 
, COLOR VARCHAR2(10) NOT NULL 
, DESCRIPTION VARCHAR2(50) NOT NULL 
, CONSTRAINT STYLE_PK PRIMARY KEY 
  (
    ID 
  )
  ENABLE 
) 
PCTFREE 30 
PCTUSED 60 
INITRANS 1 
STORAGE 
( 
  INITIAL 983040 
  NEXT 983040 
  MINEXTENTS 1 
  PCTINCREASE 0 
  FREELISTS 2 
  FREELIST GROUPS 2 
);

CREATE TABLE CLIENT 
(
  ID INT GENERATED ALWAYS AS IDENTITY INCREMENT BY 1 START WITH 0 MAXVALUE 1000000 MINVALUE 0 NOT NULL 
, ID_NUMBER NUMBER(9) NOT NULL 
, COUNTRY INT NOT NULL 
, NAME VARCHAR2(20) NOT NULL 
, LASTNAME VARCHAR2(20) NOT NULL 
, DIRECTION VARCHAR2(30) NOT NULL 
, EMAIL VARCHAR2(20) NOT NULL 
, PHONE NUMBER(8) NOT NULL 
, PAYMENT_DIRECTION VARCHAR2(40) NOT NULL 
, CONSTRAINT CLIENT_PK PRIMARY KEY 
  (
    ID 
  )
  ENABLE 
) 
PCTFREE 30 
PCTUSED 60 
INITRANS 1 
STORAGE 
( 
  INITIAL 740000 
  NEXT 740000 
  MINEXTENTS 1 
  MAXEXTENTS UNLIMITED 
  PCTINCREASE 0 
  FREELISTS 2 
  FREELIST GROUPS 2 
);

CREATE TABLE FOREIGN_PROVIDER 
(
  PROVIDER INT NOT NULL 
, BANK VARCHAR2(30) NOT NULL 
, ACCOUNT NUMBER(16) NOT NULL 
, CONSTRAINT FOREIGN_PROVIDER_PK PRIMARY KEY 
  (
    PROVIDER 
  )
  ENABLE 
) 
PCTFREE 25 
PCTUSED 65 
INITRANS 1 
STORAGE 
( 
  INITIAL 4300 
  NEXT 4300 
  MINEXTENTS 1 
  PCTINCREASE 0 
);

CREATE TABLE NATIONAL_PROVIDER 
(
  ID INT NOT NULL 
, IDENTIFICATION_NUMBER NUMBER(11) NOT NULL 
, MAX_DAYS INT NOT NULL 
, CONSTRAINT NATIONAL_PROVIDER_PK PRIMARY KEY 
  (
    ID 
  )
  ENABLE 
) 
PCTFREE 7 
PCTUSED 83 
STORAGE 
( 
  INITIAL 1400 
  NEXT 1400 
  MINEXTENTS 1 
  PCTINCREASE 0 
);

CREATE TABLE PURCHASE_ORDER 
(
  ID INT GENERATED ALWAYS AS IDENTITY INCREMENT BY 1 START WITH 0 MAXVALUE 1000000 MINVALUE 0 NOT NULL 
, ORDER_DATE DATE NOT NULL 
, PROVIDER INT NOT NULL 
, CONSTRAINT PURCHASE_ORDER_PK PRIMARY KEY 
  (
    ID 
  )
  ENABLE 
) 
PCTFREE 0 
PCTUSED 90 
INITRANS 1 
STORAGE 
( 
  INITIAL 13000 
  NEXT 13000 
  MINEXTENTS 1 
  MAXEXTENTS UNLIMITED 
  PCTINCREASE 0 
  FREELISTS 3 
  FREELIST GROUPS 3 
);

CREATE TABLE RAW_MATERIAL_PRV 
(
  PROVIDER INT NOT NULL 
, RAW_MATERIAL VARCHAR2(20) NOT NULL 
, UNIT_COST DOUBLE PRECISION NOT NULL 
, QUANTITY DOUBLE PRECISION NOT NULL 
, DELIVER_TIME NUMBER(2) NOT NULL 
, CONSTRAINT RAW_MATERIAL_PRV_PK PRIMARY KEY 
  (
    RAW_MATERIAL 
  , PROVIDER 
  )
  ENABLE 
) 
PCTFREE 24 
PCTUSED 66 
STORAGE 
( 
  INITIAL 2800000 
  NEXT 2800000 
  MINEXTENTS 1 
  PCTINCREASE 0 
);

CREATE TABLE GARMENT 
(
  ID INT GENERATED ALWAYS AS IDENTITY INCREMENT BY 1 START WITH 0 MAXVALUE 100000 MINVALUE 0 NOT NULL 
, DESCRIPTION VARCHAR2(120) NOT NULL 
, UNIT_COST DOUBLE PRECISION NOT NULL 
, IMAGE BLOB NOT NULL 
, VIDEO BLOB NOT NULL 
, STYLE INT NOT NULL 
, CONSTRAINT GARMENT_PK PRIMARY KEY 
  (
    ID 
  )
  ENABLE 
) 
PCTFREE 22 
PCTUSED 70 
INITRANS 1 
STORAGE 
( 
  INITIAL 530000 
  NEXT 530000 
  MINEXTENTS 1 
  PCTINCREASE 0 
  FREELISTS 2 
  FREELIST GROUPS 2 
);

CREATE TABLE REQUEST 
(
  ID INT GENERATED ALWAYS AS IDENTITY INCREMENT BY 1 START WITH 0 MAXVALUE 1000000 MINVALUE 0 NOT NULL 
, CLIENT INT NOT NULL 
, REQUEST_DATE DATE NOT NULL 
, DELIVER_DATE DATE NOT NULL 
, CONSTRAINT REQUEST_PK PRIMARY KEY 
  (
    ID 
  )
  ENABLE 
) 
PCTFREE 0 
PCTUSED 90 
INITRANS 1 
STORAGE 
( 
  INITIAL 2640000 
  NEXT 2640000 
  MINEXTENTS 1 
  PCTINCREASE 0 
  FREELISTS 2 
  FREELIST GROUPS 2 
);

CREATE TABLE LINE_PURCHASE_ORDER 
(
  PURCHASE_ORDER INT NOT NULL 
, RAW_MATERIAL INT NOT NULL 
, QUANTITY DOUBLE PRECISION 
, CONSTRAINT LINE_PURCHASE_ORDER_PK PRIMARY KEY 
  (
    PURCHASE_ORDER 
  , RAW_MATERIAL 
  )
  ENABLE 
) 
PCTFREE 0 
PCTUSED 90 
INITRANS 1 
STORAGE 
( 
  INITIAL 75000 
  NEXT 75000 
  MINEXTENTS 1 
  MAXEXTENTS UNLIMITED 
  PCTINCREASE 0 
  FREELISTS 3 
  FREELIST GROUPS 3 
);

CREATE TABLE ORDER_QUEUE 
(
  ID INT GENERATED ALWAYS AS IDENTITY INCREMENT BY 1 START WITH 0 MAXVALUE 1000000 MINVALUE 0 NOT NULL 
, PRODUCTION_ORDER INT NOT NULL 
, QUANTITY_NEEDED DOUBLE PRECISION NOT NULL 
, CONSTRAINT ORDER_QUEUE_PK PRIMARY KEY 
  (
    ID 
  )
  ENABLE 
) 
PCTFREE 0 
PCTUSED 90 
STORAGE 
( 
  INITIAL 1350 
  NEXT 1350 
  MINEXTENTS 1 
  PCTINCREASE 0 
);

CREATE TABLE MATCH_RAW_MATERIAL 
(
  RAW_MATERIAL VARCHAR2(20) NOT NULL 
, PROVIDER INT NOT NULL 
, SYS_RAW_MATERIAL INT NOT NULL 
, CONSTRAINT MATCH_RAW_MATERIAL_PK PRIMARY KEY 
  (
    SYS_RAW_MATERIAL 
  , RAW_MATERIAL 
  , PROVIDER 
  )
  ENABLE 
) 
PCTFREE 20 
PCTUSED 70 
INITRANS 1 
STORAGE 
( 
  INITIAL 2800 
  NEXT 2800 
  MINEXTENTS 1 
  PCTINCREASE 0 
);

CREATE TABLE RECIPE_RAWMATERIAL 
(
  GARMENT INT NOT NULL 
, GARMENT_SIZE INT NOT NULL 
, RAW_MATERIAL INT NOT NULL 
, QUANTITY DOUBLE PRECISION NOT NULL 
, CONSTRAINT RECIPE_RAWMATERIAL_PK PRIMARY KEY 
  (
    RAW_MATERIAL 
  , GARMENT_SIZE 
  , GARMENT 
  )
  ENABLE 
) 
PCTFREE 5 
PCTUSED 85 
INITRANS 1 
STORAGE 
( 
  INITIAL 420000 
  NEXT 420000 
  MINEXTENTS 1 
  MAXEXTENTS UNLIMITED 
  PCTINCREASE 0 
  FREELISTS 2 
  FREELIST GROUPS 2 
);

CREATE TABLE LINE_REQUEST 
(
  REQUEST INT NOT NULL 
, LINE_ID INT NOT NULL 
, GARMENT INT NOT NULL 
, GARMENT_SIZE INT NOT NULL 
, QUANTITY INT NOT NULL 
, CONSTRAINT LINE_REQUEST_PK PRIMARY KEY 
  (
    REQUEST 
  , LINE_ID 
  )
  ENABLE 
) 
PCTFREE 10 
PCTUSED 80 
INITRANS 1 
STORAGE 
( 
  INITIAL 48000000 
  NEXT 48000000 
  MINEXTENTS 1 
  MAXEXTENTS UNLIMITED 
  PCTINCREASE 0 
  FREELISTS 5 
  FREELIST GROUPS 5 
);

CREATE TABLE PRODUCTION_ORDER 
(
  ID INT NOT NULL 
, ID_REQUEST INT NOT NULL 
, LINE_ID INT NOT NULL 
, PRDDATE DATE NOT NULL 
, UNITS INT NOT NULL 
, STATE CHAR(1) NOT NULL 
, CONSTRAINT PRODUCTION_ORDER_PK PRIMARY KEY 
  (
    ID 
  )
  ENABLE 
);

CREATE INDEX CLNT_COUNTRY_INDEX ON CLIENT (COUNTRY ASC);

CREATE INDEX RECIPE_GARMENT_INDEX ON RECIPE_RAWMATERIAL (GARMENT);

CREATE INDEX RQST_CLIENT_INDEX ON REQUEST (CLIENT);

ALTER TABLE LINE_REQUEST
ADD CONSTRAINT LINE_REQUEST_UK UNIQUE 
(
  REQUEST 
, LINE_ID 
, GARMENT 
, GARMENT_SIZE 
)
ENABLE;

ALTER TABLE NATIONAL_PROVIDER
ADD CONSTRAINT NATIONAL_PROVIDER_UK UNIQUE 
(
  IDENTIFICATION_NUMBER 
)
ENABLE;

ALTER TABLE CLIENT
ADD CONSTRAINT CLIENT_COUNTRY_FK FOREIGN KEY
(
  COUNTRY 
)
REFERENCES COUNTRY
(
  ID 
)
ENABLE;

ALTER TABLE FOREIGN_PROVIDER
ADD CONSTRAINT FOREIGN_PROVIDER_PROVIDER_FK FOREIGN KEY
(
  PROVIDER 
)
REFERENCES PROVIDER
(
  ID 
)
ENABLE;

ALTER TABLE GARMENT
ADD CONSTRAINT GARMENT_STYLE_FK FOREIGN KEY
(
  STYLE 
)
REFERENCES STYLE
(
  ID 
)
ENABLE;

ALTER TABLE LINE_PURCHASE_ORDER
ADD CONSTRAINT HEADER_LINE_PURCHASE_ORDER_FK FOREIGN KEY
(
  PURCHASE_ORDER 
)
REFERENCES PURCHASE_ORDER
(
  ID 
)
ENABLE;

ALTER TABLE LINE_PURCHASE_ORDER
ADD CONSTRAINT LINE_PURCHASE_ORDER_RM_FK FOREIGN KEY
(
  RAW_MATERIAL 
)
REFERENCES RAW_MATERIAL
(
  ID 
)
ENABLE;

ALTER TABLE LINE_REQUEST
ADD CONSTRAINT LINE_REQUEST_GARMENT_FK FOREIGN KEY
(
  GARMENT 
)
REFERENCES GARMENT
(
  ID 
)
ENABLE;

ALTER TABLE LINE_REQUEST
ADD CONSTRAINT LINE_REQUEST_GARMENT_SIZE_FK FOREIGN KEY
(
  GARMENT_SIZE 
)
REFERENCES GARMENT_SIZE
(
  ID 
)
ENABLE;

ALTER TABLE LINE_REQUEST
ADD CONSTRAINT LINE_REQUEST_REQUEST_FK FOREIGN KEY
(
  REQUEST 
)
REFERENCES REQUEST
(
  ID 
)
ENABLE;

ALTER TABLE MATCH_RAW_MATERIAL
ADD CONSTRAINT MATCH_RAW_MATERIAL_FK1 FOREIGN KEY
(
  RAW_MATERIAL 
, PROVIDER 
)
REFERENCES RAW_MATERIAL_PRV
(
  RAW_MATERIAL 
, PROVIDER 
)
ENABLE;

ALTER TABLE MATCH_RAW_MATERIAL
ADD CONSTRAINT MATCH_RAW_MATERIAL_FK2 FOREIGN KEY
(
  SYS_RAW_MATERIAL 
)
REFERENCES RAW_MATERIAL
(
  ID 
)
ENABLE;

ALTER TABLE NATIONAL_PROVIDER
ADD CONSTRAINT NATIONAL_PROVIDER_FK FOREIGN KEY
(
  ID 
)
REFERENCES PROVIDER
(
  ID 
)
ENABLE;

ALTER TABLE ORDER_QUEUE
ADD CONSTRAINT ORDER_QUEUE_FK FOREIGN KEY
(
  PRODUCTION_ORDER 
)
REFERENCES PURCHASE_ORDER
(
  ID 
)
ENABLE;

ALTER TABLE PRODUCTION_ORDER
ADD CONSTRAINT PRODUCTION_ORDER_FK FOREIGN KEY
(
  ID_REQUEST 
, LINE_ID 
)
REFERENCES LINE_REQUEST
(
  REQUEST 
, LINE_ID 
)
ENABLE;

ALTER TABLE PURCHASE_ORDER
ADD CONSTRAINT PURCHASE_ORDER_PROVIDER_FK FOREIGN KEY
(
  PROVIDER 
)
REFERENCES PROVIDER
(
  ID 
)
ENABLE;

ALTER TABLE RAW_MATERIAL_PRV
ADD CONSTRAINT RAW_MATERIAL_PRV_PROVIDER_FK FOREIGN KEY
(
  PROVIDER 
)
REFERENCES PROVIDER
(
  ID 
)
ENABLE;

ALTER TABLE RECIPE_RAWMATERIAL
ADD CONSTRAINT GARMENT_RAWMATERIAL_FK FOREIGN KEY
(
  GARMENT 
)
REFERENCES GARMENT
(
  ID 
)
ENABLE;

ALTER TABLE RECIPE_RAWMATERIAL
ADD CONSTRAINT RECIPE_RAWMATERIAL_FK FOREIGN KEY
(
  RAW_MATERIAL 
)
REFERENCES RAW_MATERIAL
(
  ID 
)
ENABLE;

ALTER TABLE RECIPE_RAWMATERIAL
ADD CONSTRAINT SIZE_RAWMATERIAL_FK FOREIGN KEY
(
  GARMENT_SIZE 
)
REFERENCES GARMENT_SIZE
(
  ID 
)
ENABLE;

ALTER TABLE REQUEST
ADD CONSTRAINT REQUEST_CLIENT_FK FOREIGN KEY
(
  CLIENT 
)
REFERENCES CLIENT
(
  ID 
)
ENABLE;

ALTER TABLE GARMENT_SIZE
ADD CONSTRAINT GARMENT_SIZE_CK CHECK 
(GARMENT_SIZE = 'S' OR GARMENT_SIZE = 'M' OR GARMENT_SIZE = 'L' OR GARMENT_SIZE = 'XXL')
ENABLE;

COMMENT ON TABLE GARMENT IS 'Tabla para representar las prendas';

COMMENT ON TABLE GARMENT_SIZE IS 'Tamano que una prenda puede tener (S, M, L, XL, XXL)';

COMMENT ON COLUMN CLIENT.ID_NUMBER IS 'Numero de cedula del cliente';

COMMENT ON COLUMN CLIENT.COUNTRY IS 'Pais del cual es residente';

COMMENT ON COLUMN CLIENT.NAME IS 'Nombre del cliente';

COMMENT ON COLUMN CLIENT.LASTNAME IS 'Apellido del cliente';

COMMENT ON COLUMN CLIENT.DIRECTION IS 'Direccion donde vive el cliente';

COMMENT ON COLUMN CLIENT.EMAIL IS 'Correo electronico del cliente';

COMMENT ON COLUMN CLIENT.PHONE IS 'Telefono del cliente';

COMMENT ON COLUMN CLIENT.PAYMENT_DIRECTION IS 'Direccion de pago del cliente';

COMMENT ON COLUMN COUNTRY.NAME IS 'Nombre del pais';

COMMENT ON COLUMN FOREIGN_PROVIDER.BANK IS 'Banco para depositar';

COMMENT ON COLUMN FOREIGN_PROVIDER.ACCOUNT IS 'Cuenta bancaria';

COMMENT ON COLUMN GARMENT.DESCRIPTION IS 'Descripcion de la prenda';

COMMENT ON COLUMN GARMENT.UNIT_COST IS 'Costo por unidad';

COMMENT ON COLUMN GARMENT.IMAGE IS 'Imagen';

COMMENT ON COLUMN GARMENT.VIDEO IS 'Video de la prenda';

COMMENT ON COLUMN GARMENT.STYLE IS 'Estilo de la prenda';

COMMENT ON COLUMN GARMENT_SIZE.GARMENT_SIZE IS 'Talla que puede ser asignada a una prenda';

COMMENT ON COLUMN LINE_REQUEST.LINE_ID IS 'Numero de linea en el request';

COMMENT ON COLUMN LINE_REQUEST.GARMENT IS 'Prenda (con estilo) solicitada';

COMMENT ON COLUMN LINE_REQUEST.GARMENT_SIZE IS 'Tamano de la prenda solicitada';

COMMENT ON COLUMN LINE_REQUEST.QUANTITY IS 'Cantidad de elementos de la prenda en la linea';

COMMENT ON COLUMN MATCH_RAW_MATERIAL.RAW_MATERIAL IS 'Nombre del material en el sistema del proveedor';

COMMENT ON COLUMN MATCH_RAW_MATERIAL.PROVIDER IS 'Proveedor que provee  el material';

COMMENT ON COLUMN MATCH_RAW_MATERIAL.SYS_RAW_MATERIAL IS 'Nombre del material en el sistema interno';

COMMENT ON COLUMN NATIONAL_PROVIDER.IDENTIFICATION_NUMBER IS 'Cedula';

COMMENT ON COLUMN NATIONAL_PROVIDER.MAX_DAYS IS 'Pais';

COMMENT ON COLUMN ORDER_QUEUE.PRODUCTION_ORDER IS 'Orden de produccion en cola';

COMMENT ON COLUMN ORDER_QUEUE.QUANTITY_NEEDED IS 'Cantidad necesaria';

COMMENT ON COLUMN PRODUCTION_ORDER.ID_REQUEST IS 'Orden de produccion a la que pertenece los datos';

COMMENT ON COLUMN PRODUCTION_ORDER.LINE_ID IS 'Numero de linea de orden a la que pertenece la orden';

COMMENT ON COLUMN PRODUCTION_ORDER.PRDDATE IS 'Fecha maxima para cuando debe ser completada la orden';

COMMENT ON COLUMN PRODUCTION_ORDER.UNITS IS 'Unidades que deben ser completadas en dicha orden';

COMMENT ON COLUMN PRODUCTION_ORDER.STATE IS 'Estado (Pendiente, Completado)';

COMMENT ON COLUMN PROVIDER.TYPE IS 'Extranjero o nacional';

COMMENT ON COLUMN PROVIDER.NAME IS 'Nombre';

COMMENT ON COLUMN PROVIDER.DIRECTION IS 'Direccion';

COMMENT ON COLUMN PROVIDER.EMAIL IS 'Correo electronico';

COMMENT ON COLUMN PROVIDER.PHONE IS 'Telefono';

COMMENT ON COLUMN PROVIDER.CONTACT_NAME IS 'Nombre del contacto';

COMMENT ON COLUMN PURCHASE_ORDER.ORDER_DATE IS 'Fecha en que se emite la orden';

COMMENT ON COLUMN PURCHASE_ORDER.PROVIDER IS 'Proveedor a quien se le compra';

COMMENT ON COLUMN RAW_MATERIAL.UNIT IS 'Unidad de medida del material';

COMMENT ON COLUMN RAW_MATERIAL.MIN_QUANTITY IS 'Minima cantidad que se puede vender';

COMMENT ON COLUMN RAW_MATERIAL.CURRENT_EXISTENCE IS 'Existencia Actual';

COMMENT ON COLUMN RAW_MATERIAL.UNIT_COST IS 'Costo por unidad';

COMMENT ON COLUMN RAW_MATERIAL.DESCRIPTION IS 'Descripcion';

COMMENT ON COLUMN RAW_MATERIAL_PRV.PROVIDER IS 'Proveedor de la materia prima';

COMMENT ON COLUMN RAW_MATERIAL_PRV.RAW_MATERIAL IS 'Materia Prima que suministra';

COMMENT ON COLUMN RAW_MATERIAL_PRV.UNIT_COST IS 'Costo por unidad de la materia';

COMMENT ON COLUMN RAW_MATERIAL_PRV.QUANTITY IS 'Cantidad minima que se le puede pedir de la materia';

COMMENT ON COLUMN RAW_MATERIAL_PRV.DELIVER_TIME IS 'Tiempo que tarda en dar la materia';

COMMENT ON COLUMN RECIPE_RAWMATERIAL.GARMENT IS 'Prenda que se esta especificando';

COMMENT ON COLUMN RECIPE_RAWMATERIAL.GARMENT_SIZE IS 'Tamano de la prenda';

COMMENT ON COLUMN RECIPE_RAWMATERIAL.RAW_MATERIAL IS 'Materia prima necesaria';

COMMENT ON COLUMN RECIPE_RAWMATERIAL.QUANTITY IS 'Cantidad de la materia prima solicitada';

COMMENT ON COLUMN REQUEST.CLIENT IS 'Cliente que realiza la solicitud';

COMMENT ON COLUMN REQUEST.REQUEST_DATE IS 'Fecha en la que la solicitud es realizada';

COMMENT ON COLUMN REQUEST.DELIVER_DATE IS 'Fecha maxima en la que se debe entregar la solicitud';

COMMENT ON COLUMN STYLE.COLOR IS 'Color de la prenda';

COMMENT ON COLUMN STYLE.DESCRIPTION IS 'Descripcion del estilo';
