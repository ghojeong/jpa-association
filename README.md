# 만들면서 배우는 JPA

## 1. 쿼리빌더

`src/main/java/persistence/sql` 패키지에 구현

### 1-1. [DDL 쿼리빌더 PR 링크](https://github.com/next-step/jpa-query-builder/pull/4)

- CREATE, DROP 쿼리를 엔티티 클래스 정보를 바탕으로 생성

### 1-2. [DML 쿼리빌더 PR 링크](https://github.com/next-step/jpa-query-builder/pull/7)

- INSERT, UPDATE, DELETE, SELECT 쿼리를 엔티티 클래스 정보를 바탕으로 생성

## 2. Entity Manager

`src/main/java/persistence/entity` 패키지에 구현

### 2-1. [영속성 컨텍스트 PR 링크](https://github.com/next-step/jpa-entity-manager/pull/4)

- EntityManager 의 find, persist, remove 기능을 구현
- 캐싱이 필요한 부분을 위해 PersistenceContext 를 구현

### 2-2. [1차캐시와 더티 체킹 PR 링크](https://github.com/next-step/jpa-entity-manager/pull/10)

- 1차 캐시에서 캐싱된 엔티티와 현재 엔티티의 비교를 통해, merge 의 동작을 트리거하는 기능을 구현

## 3. Association

`src/main/java/persistence` 패키지를 리팩토링하고 기능을 확장

### 3-1. [EntityLoader PR 링크](https://github.com/next-step/jpa-association/pull/6)

- 엔티티를 조회해오는 책임을 전담하는 EntityLoader 객체를 EntityManager 으로부터 분리

### 3-2. [OneToMany 프록시 PR 링크](https://github.com/next-step/jpa-association/pull/10)

- FetchType 이 EAGER 혹은 LAZY 이냐에 따라, JOIN 쿼리로 한꺼번에 조회하거나 프록시를 통해 lazy 하게 엔티티를 조회해오는 기능을 구현
