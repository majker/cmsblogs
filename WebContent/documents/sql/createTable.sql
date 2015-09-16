/*==============================================================*/
/* Table: AUTHOR                                                */
/*==============================================================*/
create table AUTHOR 
(
   AUTHOR_PASSWORD      varchar(100)                   null,
   AUTHOR_ID            varchar(10)                    not null,
   AUTHOR_NICKNAME      varchar(20)                    null,
   AUTHOR_QQ            varchar(12)                    null,
   AUTHOR_EMAIL         varchar(50)                    null,
   AUTHOR_REGISTER_TIME time                           null,
   AUTHOR_PICTURE       varchar(20)                    null,
   AUTHOR_SAYING        varchar(100)                   null,
   constraint PK_AUTHOR primary key (AUTHOR_ID)
);

/*==============================================================*/
/* Table: BLOG                                                  */
/*==============================================================*/
create table BLOG 
(
   BLOG_ID              varchar(10)                    not null,
   BLOG_COLUMN_ALIAS    varchar(20)                    null,
   AUTHOR_ID            varchar(10)                    null,
   BLOG_TITLE           varchar(200)                   null,
   BLOG_CONTENT         long varchar                   null,
   BLOG_CREATETIME      date                           null,
   BLOG_VIEWER_CONTENT  integer                        null,
   BLOG_STICK           char(1)                        null,
   BLOGS_RECOMMEND      integer                        null,
   BLOGS_THUMBNAIL      varchar(20)                    null,
   BLOGS_ISCOMMENT      char(1)                        null,
   BLOGS_STATE          char(1)                        null,
   constraint PK_BLOG primary key (BLOG_ID)
);

/*==============================================================*/
/* Table: BLOG_COLUMN                                           */
/*==============================================================*/
create table BLOG_COLUMN 
(
   BLOG_COLUMN_ALIAS    varchar(20)                    not null,
   BLOG_COLUMN_NAME     varchar(50)                    null,
   BLOG_COLUMN_REMARK   varchar(1000)                  null,
   BLOG_COLUMN_LOGO     varchar(20)                    null,
   constraint PK_BLOG_COLUMN primary key (BLOG_COLUMN_ALIAS)
);

/*==============================================================*/
/* Table: BLOG_TAG                                              */
/*==============================================================*/
create table BLOG_TAG 
(
   TAG_ID               varchar(10)                    not null,
   TAG_NAME             varchar(20)                    null,
   constraint PK_BLOG_TAG primary key (TAG_ID)
);

/*==============================================================*/
/* Table: CATEGORY                                              */
/*==============================================================*/
create table CATEGORY 
(
   CATEGORY_ID          varchar(10)                    not null,
   CATEGORY_NAME        varchar(20)                    null,
   CATEGORY_SEQ         integer                        null,
   CATEGORY_BLOGCOUNT   integer                        null,
   CATEGORY_PARENTID    varchar(10)                    null,
   constraint PK_CATEGORY primary key (CATEGORY_ID)
);

/*==============================================================*/
/* Table: "COMMENTS"                                             */
/*==============================================================*/
create table COMMENTS
(
   COMMENT_ID           varchar(10)                    not null,
   BLOG_ID              varchar(10)                    null,
   COMMENT_TIME         time                           null,
   COMMENT_CONTENT      long varchar                   null,
   COMMENT_PERSON       varchar(100)                   null,
   COMMENT_PICTURE      varchar(100)                   null,
   CATEGORY_PARENTID    varchar(10)                    null,
   constraint PK_COMMENT primary key (COMMENT_ID)
);

/*==============================================================*/
/* Table: BLOGANDCATEGORY                                       */
/*==============================================================*/
create table BLOG_AND_CATEGORY 
(
   BLOG_ID              varchar(10)                    not null,
   CATEGORY_ID          varchar(10)                    not null,
   constraint PK_RELATIONSHIP_2 primary key clustered (BLOG_ID, CATEGORY_ID)
);

/*==============================================================*/
/* Table: BLOGADNTAG                                            */
/*==============================================================*/
create table BLOG_AND_TAG 
(
   TAG_ID               varchar(10)                    not null,
   BLOG_ID              varchar(10)                    not null,
   constraint PK_RELATIONSHIP_5 primary key clustered (TAG_ID, BLOG_ID)
);/*==============================================================*/
/* Table: AUTHOR                                                */
/*==============================================================*/
create table AUTHOR 
(
   AUTHOR_PASSWORD      varchar(100)                   null,
   AUTHOR_ID            varchar(10)                    not null,
   AUTHOR_NICKNAME      varchar(20)                    null,
   AUTHOR_QQ            varchar(12)                    null,
   AUTHOR_EMAIL         varchar(50)                    null,
   AUTHOR_REGISTER_TIME time                           null,
   AUTHOR_PICTURE       varchar(20)                    null,
   AUTHOR_SAYING        varchar(100)                   null,
   constraint PK_AUTHOR primary key (AUTHOR_ID)
);

/*==============================================================*/
/* Table: BLOG                                                  */
/*==============================================================*/
create table BLOG 
(
   BLOG_ID              varchar(10)                    not null,
   BLOG_COLUMN_ALIAS    varchar(20)                    null,
   AUTHOR_ID            varchar(10)                    null,
   BLOG_TITLE           varchar(200)                   null,
   BLOG_CONTENT         long varchar                   null,
   BLOG_CREATETIME      date                           null,
   BLOG_VIEWER_CONTENT  integer                        null,
   BLOG_STICK           char(1)                        null,
   BLOGS_RECOMMEND      integer                        null,
   BLOGS_THUMBNAIL      varchar(20)                    null,
   BLOGS_ISCOMMENT      char(1)                        null,
   BLOGS_STATE          char(1)                        null,
   constraint PK_BLOG primary key (BLOG_ID)
);

/*==============================================================*/
/* Table: BLOG_COLUMN                                           */
/*==============================================================*/
create table BLOG_COLUMN 
(
   BLOG_COLUMN_ALIAS    varchar(20)                    not null,
   BLOG_COLUMN_NAME     varchar(50)                    null,
   BLOG_COLUMN_REMARK   varchar(1000)                  null,
   BLOG_COLUMN_LOGO     varchar(20)                    null,
   constraint PK_BLOG_COLUMN primary key (BLOG_COLUMN_ALIAS)
);

/*==============================================================*/
/* Table: BLOG_TAG                                              */
/*==============================================================*/
create table BLOG_TAG 
(
   TAG_ID               varchar(10)                    not null,
   TAG_NAME             varchar(20)                    null,
   constraint PK_BLOG_TAG primary key (TAG_ID)
);

/*==============================================================*/
/* Table: CATEGORY                                              */
/*==============================================================*/
create table CATEGORY 
(
   CATEGORY_ID          varchar(10)                    not null,
   CATEGORY_NAME        varchar(20)                    null,
   CATEGORY_SEQ         integer                        null,
   CATEGORY_BLOGCOUNT   integer                        null,
   CATEGORY_PARENTID    varchar(10)                    null,
   constraint PK_CATEGORY primary key (CATEGORY_ID)
);

/*==============================================================*/
/* Table: "COMMENTS"                                             */
/*==============================================================*/
create table COMMENTS
(
   COMMENT_ID           varchar(10)                    not null,
   BLOG_ID              varchar(10)                    null,
   COMMENT_TIME         time                           null,
   COMMENT_CONTENT      long varchar                   null,
   COMMENT_PERSON       varchar(100)                   null,
   COMMENT_PICTURE      varchar(100)                   null,
   CATEGORY_PARENTID    varchar(10)                    null,
   constraint PK_COMMENT primary key (COMMENT_ID)
);

/*==============================================================*/
/* Table: BLOGANDCATEGORY                                       */
/*==============================================================*/
create table BLOG_AND_CATEGORY 
(
   BLOG_ID              varchar(10)                    not null,
   CATEGORY_ID          varchar(10)                    not null,
   constraint PK_RELATIONSHIP_2 primary key clustered (BLOG_ID, CATEGORY_ID)
);

/*==============================================================*/
/* Table: BLOGADNTAG                                            */
/*==============================================================*/
create table BLOG_AND_TAG 
(
   TAG_ID               varchar(10)                    not null,
   BLOG_ID              varchar(10)                    not null,
   constraint PK_RELATIONSHIP_5 primary key clustered (TAG_ID, BLOG_ID)
);

/*==============================================================*/
/* Table: MENU               菜单                               */
/*==============================================================*/
create table MENUDEF(
	MDF_ID 								VARCHAR(10)										NOT NULL,
	MDF_DESC VARCHAR(100)	,
	MDF_URL VARCHAR(20) ,
	MDF_PARENTiD VARCHAR(10),
	MDF_SEQ	VARCHAR(2),
	MDF_MENUCODE VARCHAR(10)
)