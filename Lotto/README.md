# Lotto

[![Codacy Badge](https://app.codacy.com/project/badge/Grade/117676f9b4194b22899404c87ad1c003)](https://www.codacy.com/gh/Hammana-Charif/Lotto/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Hammana-Charif/Lotto&amp;utm_campaign=Badge_Grade)

This project is a little funny game for everyone.

## Project setup

* Initialize new Java Project

````bash
WorkSPace name : "Practicum"
Project name : "Lotto"
````

* Project structure

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
    label           varchar(255) null,
    datetime       varchar(255) null
)
    collate = utf8mb4_unicode_ci;

create table doctrine_migration_versions
(
    version        varchar(191) not null
        primary key,
    executed_at    datetime     null,
    execution_time int          null
)
    collate = utf8_unicode_ci;

create table draw
(
    id       int auto_increment
        primary key,
    label    varchar(180) not null,
    constraint UNIQ_8D93D649E7927C74
        unique (label)
)
    collate = utf8mb4_unicode_ci;
```
