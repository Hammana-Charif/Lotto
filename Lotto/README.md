# Lotto

[![Codacy Badge](https://app.codacy.com/project/badge/Grade/117676f9b4194b22899404c87ad1c003)](https://www.codacy.com/gh/Hammana-Charif/Lotto/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Hammana-Charif/Lotto&amp;utm_campaign=Badge_Grade)

This project is a little funny game for everyone.

## Project setup

*Initialize new Java Project

````bash
WorkSPace name : "Practicum"
Project name : "Lotto"
````

*Project structure

````bash
Lotto/
|
├─ src/
│   ├─ (default package)
│   ├─ controllers/
│   ├─ datalayers/
│   ├─ entities/
│   ├─ eventlisteners/
│   ├─ messages/
│   ├─ repositories/
│   ├─ Entity/
│   └─ services.builders/
|
└─ SharedProject/
````
## Eclipse setup
````bash
ECLIPSE version : 2020-09 (4.17.0)
JAVA version : 14
JCBD MySQL Server configuration : 8.0.22
PROJECT version : console
````

### SQL Commands for database
```sql
create table lotto
(
    id             int auto_increment
        primary key,
    label           text(100),
    datetime        datetime null
)
    collate = utf8mb4_unicode_ci;

create table ball
(
    ball_id       int auto_increment
        primary key,
    ball_label    varchar(10) not null,
    constraint UNIQ_8D93D649E7927C74
        unique (ball_label)
)
    collate = utf8mb4_unicode_ci;
```
