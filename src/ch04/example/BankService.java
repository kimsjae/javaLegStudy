package ch04.example;

import ch04.example.model.Account;

// 트랜잭션 관리
public class BankService {

    public static void 이체(Account senderAccount, Account receiverAccount, long amount) {
        senderAccount.출금(amount);
        receiverAccount.입금(amount);
    }
}
