# Hongik-SW

윤웅상 : search_bs() 작성, Jenkinsfile 작성

오하영 : Junit Test 작성

# Git Error
![image](https://github.com/UngSangYoon/Hongik-SW/assets/124053569/820d84eb-48aa-469e-8b63-dc0272a2082f)

Local Branch 에서 수정 후 commit 하지 않은 채 원격 repo를 pull 시도하여 발생

# Jenkins Error 1 (Build #14)
![image](https://github.com/UngSangYoon/Hongik-SW/assets/124053569/c5f71a4a-4bac-4178-9b9a-477cc5ab42fd)
![image](https://github.com/UngSangYoon/Hongik-SW/assets/124053569/4ade8d11-8cfa-4ca2-a47f-0f506a5ccfdb)
Groovy 문법에서 def 키워드를 사용하여 변수를 선언할 수 없어 오류 발생
## Solution
![image](https://github.com/UngSangYoon/Hongik-SW/assets/124053569/34c78c0c-6747-4d43-973e-56d1476b620d)
script 블록을 사용하여 변수를 선언하고 사용하여 해결

# Jenkins Error 2 (Build #18)
![image](https://github.com/UngSangYoon/Hongik-SW/assets/124053569/c342282b-4cda-4ebd-b378-6a66bd24f4c4)
![image](https://github.com/UngSangYoon/Hongik-SW/assets/124053569/db5e30fc-0366-4646-89a2-0b1d9c2108ef)
Build Stage에서 JUnit 라이브러리가 클래스패스에 포함되지 않아 오류 발생
## Solution
![image](https://github.com/UngSangYoon/Hongik-SW/assets/124053569/9ed7ea29-0e81-4479-8d75-e397acd36e3c)
![image](https://github.com/UngSangYoon/Hongik-SW/assets/124053569/0d02a7b5-4445-49b4-b649-3c73460df0e2)
JUnit 라이브러리 JAR 파일들을 다운로드하는 Setup stage를 추가하여 해결

# result (test_results.txt)
![image](https://github.com/UngSangYoon/Hongik-SW/assets/124053569/7df28072-7388-4ab7-8759-6632ba54df75)
