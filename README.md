An extension to jOOQ
=========================================
This small jOOQ extension enables to easily generate IDs to newly created entities.

For example :
```java
User user = new User("John", "Doe");
user.getId(); // null
userDao.insert(user);
user.getId(); // 123456789 : the generated ID for this entity.
```

The ID generator is configurable so you can choose how you want the IDs to be generated.