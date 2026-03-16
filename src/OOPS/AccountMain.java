package OOPS;

public class AccountMain {

    public static void main(String[] args) {
        Account acc = new Account();

        acc.setAmount(100);
        acc.setName("Nikshay");
        acc.setId(2010990499);

        System.out.println(acc.getId() + "\n" + acc.getName() + "\n" + acc.getAmount());
    }

}