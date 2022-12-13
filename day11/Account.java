package com.kh.day11;

public class Account {

  // 속성 : 예금주 이름, 잔고, 계좌번호
  private String accountName;       // 예금주명
  private int balance;              // 잔고
  private String accountNum;        // 계좌번호

  private static int accountCount;  // 계좌번호 카운트
  private static final int ACCOUNT_NUM_SIZE =3;

  // 생성자 메소드
  public Account(String accountName) {
    this.accountName = accountName;
    accountNum = createAccountNumber();   // 계좌번호 생성
  }

  // 계좌번호 생성
  private String createAccountNumber() {

    // 계좌번호전체자리수(3) - 계좌번호 카운트 자리수 = "0"추가 갯수
    // 계좌번호 카운트 자리수
    int numOfDigit = String.valueOf(++accountCount).length(); // 3->1
    // "0" 추가할 갯수
    int numOfZero = ACCOUNT_NUM_SIZE - numOfDigit; // 3 - 1 = 2
    String str = String.valueOf(accountCount);  // str = "3"
    for (int i = 0; i < numOfZero; i++) {
      str = "0" + str;
    }
    return str;
  }

  // 기능 : 입금, 출금, 조회

  // 입금
  public void deposit(int money) {
    // 1회 입금한도는 4만원을 초과할 수 없다.
    if (money > 40_000) {
      System.out.println("1회 입금한도는 4만원을 초과할 수 없습니다.");
      return;
    }
    // 예치금액(잔고)은 10만원 이하로 제한 한다.
    if (balance + money > 100_000) {
      System.out.println("예치금액(잔고)은 10만원 이하이어야 합니다 현재 잔고 : " + balance);
      return;
    }

    balance += money; // balance = balance + money;
  }

  // 출금
  public void withdraw(int money) {
    // 1회 입금한도는 4만원을 초과할 수 없다.
    if (money > 40_000) {
      System.out.println("1회 출금한도는 4만원을 초과할 수 없습니다.");
      return;
    }
    // 마이너스 잔고는 허용하지 않는다.
    if (balance - money < 0) {
      System.out.println("마이너스 잔고는 허용하지 않습니다. 현재잔고 : " + balance);
      return;
    }
    balance -= money;
  }

  // 조회

  @Override
  public String toString() {
    return "계좌{" +
        "예금주명='" + accountName + '\'' +
        ", 잔고=" +balance +
        ", 계좌번호= " + accountNum +
        '}';
  }

  public String getAccountName() {
    return accountName;
  }

  public String getAccountNum() {
    return accountNum;
  }

  public int getBalance() {
    return balance;
  }
}
