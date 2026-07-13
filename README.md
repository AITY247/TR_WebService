# Web Service Project
REST API menggunakan **Spring Boot**, **PostgreSQL**, dan **MongoDB**

---

# Tech Stack

- Java 17
- Spring Boot 3.5.x
- Maven
- PostgreSQL 18
- MongoDB Community Server
- MongoDB Compass
- pgAdmin 4
- VS Code
- Postman

---

# Persyaratan

Pastikan software berikut sudah terinstall.

| Software | Versi |
|----------|--------|
| Java JDK | 17 atau lebih baru |
| Maven Wrapper | Sudah tersedia pada project |
| PostgreSQL | 18 |
| pgAdmin 4 | Terbaru |
| MongoDB Community Server | Terbaru |
| MongoDB Compass | Terbaru |
| VS Code | Terbaru |
| Postman | Terbaru |

---

## Clone Repository

Clone project

```bash
git clone <URL_REPOSITORY>
```

Masuk ke folder project

```bash
cd <NAMA_FOLDER_PROJECT>
```

Contoh

```bash
git clone https://github.com/kelompok5/demo.git
cd demo
```

---

# Membuka Project

Buka menggunakan VS Code

```
File
    Open Folder
```

pilih folder project.

---

# Konfigurasi PostgreSQL

Buka pgAdmin.

Klik

```
Servers
    PostgreSQL
        Databases
```

Klik kanan

```
Create
    Database
```
<img width="1393" height="574" alt="image" src="https://github.com/user-attachments/assets/f8272d28-cf69-47a9-9f3d-6895ba2020e0" />


Masukkan

```
Database Name

webservice_db
```

Owner

```
postgres
```
<img width="1383" height="753" alt="image" src="https://github.com/user-attachments/assets/63163286-f482-40dc-94ff-829232c74ed4" />

Kemudian klik

```
Save
```

Sekarang database PostgreSQL telah dibuat.

---

# Konfigurasi MongoDB

Buka MongoDB Compass.

Klik

```
+
```

atau

```
Create Database
```
<img width="1829" height="650" alt="image" src="https://github.com/user-attachments/assets/7e219c17-fce6-4d77-bc9e-0538f2be5b00" />

Isi

```
Database Name

webservice_db
```

Collection pertama

```
products
```
<img width="1461" height="743" alt="image" src="https://github.com/user-attachments/assets/0c1f9444-6aad-4690-9f23-a48c5488a617" />

Kemudian klik

```
Create Database
```

---

# Konfigurasi application.properties

Buka

```
src/main/resources/application.properties
```

Isi seperti berikut.

```properties
spring.application.name=demo

########################
# PostgreSQL
########################

spring.datasource.url=jdbc:postgresql://localhost:5432/webservice_db
spring.datasource.username=postgres
spring.datasource.password=PASSWORD_POSTGRES_ANDA

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

########################
# MongoDB
########################

spring.data.mongodb.uri=mongodb://localhost:27017/webservice_db

########################
# Security
########################

spring.security.user.name=admin
spring.security.user.password=12345
```

> Ganti `PASSWORD_POSTGRES` sesuai password PostgreSQL masing-masing.

---

# Install Dependency

Project menggunakan Maven Wrapper sehingga tidak perlu menginstall Maven secara manual.

Windows

```bash
.\mvnw.cmd clean install
```

Linux / Mac

```bash
./mvnw clean install
```

---

# Menjalankan Project

Windows

```bash
.\mvnw.cmd spring-boot:run
```

Linux / Mac

```bash
./mvnw spring-boot:run
```

Apabila berhasil akan muncul log

```
Tomcat started on port 8080
Started DemoApplication
```

---

# Pengujian Koneksi

Pastikan terminal menampilkan

## PostgreSQL

```
HikariPool-1 - Start completed
```

## MongoDB

```
Monitor thread successfully connected
```

Apabila kedua log muncul berarti kedua database berhasil terkoneksi.

---

# Swagger

Buka browser

```
http://localhost:8080/swagger-ui/index.html
```

Dokumentasi API akan muncul otomatis.

---

# Pengujian API

Gunakan Postman atau Swagger UI.

Contoh endpoint

```
GET
POST
PUT
DELETE
```

---

# Struktur Project

```
src
 └── main
      ├── controller
      ├── dto
      ├── exception
      ├── model
      ├── repository
      ├── security
      ├── service
      └── resources
```

---

# Database

## PostgreSQL

Digunakan untuk

- User
- Authentication
- Data Relasional

## MongoDB

Digunakan untuk

- Product
- Data NoSQL

---

# Troubleshooting

## PostgreSQL tidak bisa connect

Periksa

```
postgresql-x64-18
```

sudah berjalan.

---

## MongoDB tidak bisa connect

Pastikan service

```
MongoDB Server
```

sudah running.

---

## Port 8080 digunakan aplikasi lain

Ubah

```properties
server.port=8081
```

---

# Anggota Kelompok

| No | Nama | Tugas |
|----|------|-------|
| 1 | Ardis Pradana W| Setup PostgreSQL & MongoDB |
| 2 | Farros Aqila | CRUD User |
| 3 | David Stepehen B| CRUD Product |
| 4 | Alam Aji P | JWT Authentication |
| 5 | Ridho Sulistyo | Authorization & Documentation |

---

# Lisensi

Project ini dibuat untuk keperluan praktikum Web Service.
