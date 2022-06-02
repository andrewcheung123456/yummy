# yummy plan started

## 数据库事务特性
* 原子性
* 一致性
* 隔离性
* 持久性

## 数据库隔离级别
* 读未提交
* 读已提交
* 可重复读
* 串行化
## 数据库隔离级别对应问题
* 读未提交会出现脏读、不可重复读、幻读
* 读已提交会出现不可重复读、幻读
* 可重复读会出现幻读
* 串行化不会出现
* 读已提交会出现不可重复读，侧重修改，可重复读会出现幻读，侧重新增

## 数据库锁

### 锁的分类
* 基于锁的属性分类：共享锁、排它锁
* 基于锁的粒度分类：表锁、行锁（记录锁、间隙锁、临键锁）
* 基于锁的状态分类：意向共享锁、意向排它锁
* 死锁

### 锁的模式
* 读意向锁
* 写意向锁
* 读锁
* 写锁
* 自增锁

### 共享锁
* 共享锁通过lock in share mode实现

### 排它锁
* 排它锁通过for update实现

### 表锁与行锁
* lock table user read(write) 锁表或锁行
* unlock tables 解锁表或者解锁行

### 记录锁
* 记录锁基于主键列或者唯一索引列表，需要精确匹配
### 间隙锁
* 间隙锁锁住的是区间，不包含开始和结束位置的行
* 间隙锁基于非唯一索引
* 间隙锁是左开右开区间数据
### 临键锁
* 临键锁是一种特殊的间隙锁
* 临键锁是左开右闭区间数据
* 临键锁可以解决幻读问题
* 在根据非唯一索引对记录行进行UPDATE\FOR UPDATE\LOCK IN SHARE MODE操作时，InnoDB会获取该记录行的临键锁，并同时获取该记录行下一个区间的间隙锁。

### 死锁的出现
* 两个或者两个以上事务
* 每个事务都已经持有锁并且申请新的锁
* 锁资源同时只能被同一个事务持有或者不兼容
* 事务之间因为持有锁和申请锁导致彼此循环等待

### 死锁的预防
* innodb_lock_wait_timeout 等待锁超时回滚事务
* wait-for graph死锁检测算法

### 死锁的解决
* 等待事务超时，主动回滚。
* 进行死锁检查，主动回滚某条事务，让别的事务能继续走下去
