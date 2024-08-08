### Spring Security tạo object UserDetail
- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-security
- install jsonwebtoken: hỗ trợ tạo token
- create user model (User.java) [extends BaseEntity implements UserDetails]
- create security config (SecurityConfig.java)
- [create filters package]
### Tùy biến các hàm Jwt, Login, Register User 
1. create JwtTokenUtil.java in components package
2. In User service 
- create method createUser
- create method login

### Viết API Login và trả về Jwt Token Key

eyJhbGciOiJIUzI1NiJ9.eyJwaG9uZU51bWJlciI6IjAxMjM0NTY3ODkiLCJzdWIiOiIwMTIzNDU2Nzg5IiwiZXhwIjoxNzI1NjczMzUyfQ.nTy0bIe9KvrDUJ3WbfdcfP131WU7iz_65i8QDoDIntM

# library
https://mvnrepository.com/artifact/org.modelmapper/modelmapper/3.2.1
-> create configurations package
response package: Lưu trữ các cấu trúc dữ liệu được trả về từ server
- các giá trị trả về không cần validate

# Create fake data
- https://mvnrepository.com/artifact/com.github.javafaker/javafaker/1.0.2
- Viết phương thức tạo dữ liệu giả lập (@PostMapping("/generateFakeProducts") trong product controller

# Order
1.create order response package in response package
- create OrderDetailResponse 
- create OrderResponse
- create OrderListResponse (display total order, total money)
2.create order services
- create interface OrderService
- create class OrderServiceImpl implements OrderService
3.create order controller
- create OrderController