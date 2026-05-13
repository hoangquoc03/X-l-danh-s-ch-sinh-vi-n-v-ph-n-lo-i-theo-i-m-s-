# RESTful APi Design - Task Management 
## 1. Giới thiệu

Hệ thống quản lý:
- User (Người dùng)
- Task (Công việc)

Mỗi Task thuộc về một User.

---

# 2. Quy tắc thiết kế RESTful

- Sử dụng danh từ số nhiều
- Sử dụng đúng HTTP Method
- Dùng JSON cho request/response
- Sử dụng Path Variable cho ID
- Sử dụng Query Parameter cho filter/search

---

# 3. Tài nguyên chính

## User

Thuộc tính:
- id
- name
- email
- role

---

## Task

Thuộc tính:
- id
- title
- description
- priority
- status
- userId

---

# 4. API Users

---

## 4.1 Lấy toàn bộ người dùng

### Request

```http
GET /users
