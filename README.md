# 221006-list-set-map-file

# 1. List 복습
## 1. List
- 실습-List 파일
	- students 리스트를 생성해서 값을 넣고 출력하기

## 2. List와 ArrayList차이
```java
//두 코드의 차이점?
ArrayList <Object> list = new ArrayList <>();
List <Object> list = new ArrayList <>();
```
- List는 인터페이스이고 ArrayList는 클래스이다.
- 두 코드는 같은 결과가 나오지만 List를 이용해서 ArrayList를 생성하면 유연성 효과를 볼수 있다.
- 데이터의 용도에 따라 빠른 탐색을 위해서 ArrayList를 사용할 때도 있고, 삽입/삭제를 위해 LinkedList를 사용해야 하는 경우도 있기 때문에 List를 이용한다.
- 예를 들면
```
List list = new ArrayList();
-> 도형 list = new 정사각형();
ArrayList list = new ArrayList();
-> 정사각형 list = new 정사각형();
```
이런 느낌이다.

# 2. Set
## 1. set이란?
- List와 달리 객체(데이터)를 중복해서 저장할 수 없는 컬렉션이다.
- 저장된 객체(데이터)를 인덱스로 관리하지 않기 때문에 저장 순서가 없다.
- 대표적인 클래스들로 HashSet, TreeSet등이 있다.
- List보다 많이 쓴다.
## 2. 예제로 알아보기
![](https://velog.velcdn.com/images/lyj1023/post/711dba09-f3fb-4696-9b9f-df8950da0c37/image.png)

### 예제(1)-Set 파일
- add() 연습해보기
 
### 예제(2)-Set2 파일
- random한 숫자 50개를 생성하고 출력하기

  - 예제(1)에서는 0~9사이 랜덤한 숫자 50개가 중복되어 출력된다.

### 예제(3)-Set3 파일
- random한 숫자 50개를 생성하고 중복이 되지 않은 숫자만 남겨서 출력하기

  - 예제(2)는 예제(1)과 달리 HashSet을 사용하여 중복을 제거한 0~9사이 랜덤한 숫자가 출력된다.

### 예제(4)-Set4 파일
- 알파벳 A ~ Z 까지 랜덤한 알파벳을 50개 생성하고 중복을 제거한 후 출력하기

  - 예제(3)은 예제(2)와 비슷하지만 문자형(char)을 사용해 문자도 중복을 제거해 출력할 수 있음을 보여준다.
# 3. Map
## 1. Map이란?
- Map은 Collection과 다른 방식으로 Map 인터페이스를 구현한 클래스들은 키와 값을 하나의 쌍으로 저장하는 방식을 사용한다.
- 값을 구할 때 순차적으로 구하는 방식이 아닌 key를 통해 value를 얻는 방식으로 구한다.
- key: 중복을 허용하지 않음, value: 중복을 허용함
- 대표적인 클래스들로 HashMap, TreeMap등이 있다.
- HashMap이 대부분 빨라서 자주 사용한다.

## 2. 예제로 알아보기
### 예제(1)-Map파일의 MapExercise.java
- Map선언하고 값 넣기

  - put()으로 key와 value를 넣고 get()으로 key값을 이용해 value를 출력한다.

### 예제(2)-Map파일의 MapExercise2.java
- 특정 String s에 있는 a~z까지 알파벳의 개수를 세는 알고리즘 구현하기(대소문자 구분x)

### 예제(3)-Map파일의 MapExercise3.java
- 예제(2)와 동일한 문제를 다르게 구현

- 예제(3)번은 아래 3가지를 할 수 있는지 테스트하는 문제이다.
1) String을 한글자씩 출력할 수 있어야 한다. 
    - charAt() 사용
    
2) c가 알파벳인지 check하는 알고리즘을 작성할 수 있는가? 
    - boolean isAlphabet(char c) 작성
    
3) Map에 a~z까지 등록 해놓고 cnt를 1개씩 올릴 수 있는가? 
    - for문으로 Map put하고 +1로 하나씩 올리기
    
# 4. File
## 1. 파일 읽기
- 파일을 읽는 방법으로는 FileReader, BufferedReader, Scanner, Files가 있다.
- 이 중 BufferedReader가 가장 빠르고 성능이 좋다
	- Buffer라는 임시 저장 공간에서 모았다가 한번에 보내기 때문이다
    - FileReader가 모래를 한알씩 옮기는 것이라면 BufferedReader는 모래를 모았다가 한번에 삽으로 옮기는 것과 같다.
  
## 2. 예제로 알아보기
### 예제(1)-File파일의 ReadFile.java
- 지정한 파일의 맨 앞 한글자를 읽어오는 method 만들기

### 예제(2)-File파일의 ReadFile2.java
- 지정한 파일의 맨 앞 두글자를 읽어오는 method 만들기

### 예제(3)-File파일의 ReadFile3.java
- 지정한 파일의 n글자를 읽어오는 method 만들기

### 예제(4)-File파일의 fileList.java
- 현재 디렉토리 파일 목록 출력하기

### 예제(5)-File파일의 ReadLineFile.java
- 지정한 파일의 n글자를 읽어오는 method 만들기

### 예제(6)-File파일의 ReadLineFile2.java
- 지정한 파일의 n글자를 읽어오는 method 만들기
